package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.Handler;
import netscape.javascript.JSObject;

public class HandlerImpl
    extends JSAdapter
    implements Handler {

  public HandlerImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
  }

  @Override
  public void enable() {
    call("enable");
  }

  @Override
  public void disable() {
    call("disable");
  }

  @Override
  public boolean enabled() {
    final Object result = call("enabled");
    if (result instanceof Boolean) {
      return (Boolean) result;
    }
    return false;
  }
}
