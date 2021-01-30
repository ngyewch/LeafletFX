package com.github.ngyewch.leafletfx.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.scene.web.WebEngine;
import netscape.javascript.JSObject;

import java.io.IOException;

public class JSContext {

  private final ObjectMapper objectMapper = new ObjectMapper();

  private final WebEngine engine;
  private final JSObject window;
  private final JSObject json;

  public JSContext(WebEngine engine) {
    super();

    this.engine = engine;

    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

    window = (JSObject) this.engine.executeScript("window");
    json = (JSObject) this.engine.executeScript("JSON");
  }

  public WebEngine getEngine() {
    return engine;
  }

  public JSObject getWindow() {
    return window;
  }

  public Object toJSObject(Object o) {
    if (o == null) {
      return null;
    }
    try {
      return json.call("parse", objectMapper.writeValueAsString(o));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
