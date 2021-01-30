package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.Circle;
import netscape.javascript.JSObject;

public class CircleImpl
    extends PathImpl
    implements Circle {

  public CircleImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
  }

  @Override
  public void setRadius(Number radius) {
    call("setRadius", radius);
  }
}
