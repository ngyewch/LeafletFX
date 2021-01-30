package com.github.ngyewch.leafletfx.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.ngyewch.leafletfx.Evented;
import com.github.ngyewch.leafletfx.MapEvent;
import netscape.javascript.JSObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public abstract class AbstractEvented
    extends JSAdapter
    implements Evented {

  private static final Map<String, Consumer<MapEvent>> CONSUMER_MAP = new HashMap<>();
  private static final Callback callback = new Callback();
  private static final ObjectMapper objectMapper = new ObjectMapper();

  static {
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
  }

  private final JSObject evented;
  private final Map<CallbackKey, String> callbackKeyIdMap = new HashMap<>();

  protected AbstractEvented(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);

    final JSObject window = getJsContext().getWindow();
    evented = (JSObject) window.getMember("__evented");
    if (!isDefined(evented, "javaCallback")) {
      evented.setMember("javaCallback", callback);
    }
  }

  private void addEventConsumer(String methodName, String type, Consumer<MapEvent> consumer) {
    final CallbackKey callbackKey = new CallbackKey(type, consumer);
    if (callbackKeyIdMap.containsKey(callbackKey)) {
      System.out.println("skipped adding " + type + " / " + consumer);
    } else {
      try {
        final String id = UUID.randomUUID().toString();
        final JSObject jsCallback = (JSObject) evented.call("newCallback", id);
        call(methodName, type, jsCallback);
        callbackKeyIdMap.put(callbackKey, id);
        CONSUMER_MAP.put(id, consumer);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public void on(String type, Consumer<MapEvent> consumer) {
    addEventConsumer("on", type, consumer);
  }

  private void removeEventConsumer(String id, String type, Consumer<MapEvent> consumer) {
    final JSObject jsCallback = (JSObject) evented.call("deleteCallback", id);
    call("off", type, jsCallback);
    callbackKeyIdMap.remove(new CallbackKey(type, consumer));
    CONSUMER_MAP.remove(id);
  }

  @Override
  public void off(String type, Consumer<MapEvent> consumer) {
    final CallbackKey callbackKey = new CallbackKey(type, consumer);
    if (!callbackKeyIdMap.containsKey(callbackKey)) {
      return;
    }
    final String id = callbackKeyIdMap.get(callbackKey);
    removeEventConsumer(id, type, consumer);
  }

  @Override
  public void off(String type) {
    final List<CallbackKey> callbackKeys = callbackKeyIdMap.keySet().stream()
        .filter(key -> StringUtils.equals(key.getType(), type))
        .collect(Collectors.toList());
    callbackKeys.forEach(callbackKey -> {
      final String id = callbackKeyIdMap.get(callbackKey);
      if (id != null) {
        removeEventConsumer(id, callbackKey.getType(), callbackKey.getConsumer());
      }
    });
  }

  @Override
  public void off() {
    final List<CallbackKey> callbackKeys = new ArrayList<>(callbackKeyIdMap.keySet());
    callbackKeys.forEach(callbackKey -> {
      final String id = callbackKeyIdMap.get(callbackKey);
      if (id != null) {
        removeEventConsumer(id, callbackKey.getType(), callbackKey.getConsumer());
      }
    });
  }

  @Override
  public void once(String type, Consumer<MapEvent> consumer) {
    addEventConsumer("once", type, consumer);
  }

  public static class Callback {

    public void onEvent(String id, String eventJson) {
      try {
        final MapEvent mapEvent = objectMapper.readValue(eventJson, MapEvent.class);
        final Consumer<MapEvent> consumer = CONSUMER_MAP.get(id);
        if (consumer != null) {
          consumer.accept(mapEvent);
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  public static class CallbackKey {

    private final String type;
    private final Consumer<MapEvent> consumer;

    public CallbackKey(String type, Consumer<MapEvent> consumer) {
      super();

      this.type = type;
      this.consumer = consumer;
    }

    public String getType() {
      return type;
    }

    public Consumer<MapEvent> getConsumer() {
      return consumer;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if ((o == null) || (getClass() != o.getClass())) {
        return false;
      }
      final CallbackKey that = (CallbackKey) o;
      return new EqualsBuilder()
          .append(type, that.type)
          .append(consumer, that.consumer)
          .isEquals();
    }

    @Override
    public int hashCode() {
      return new HashCodeBuilder(17, 37)
          .append(type)
          .append(consumer)
          .toHashCode();
    }
  }
}
