package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.Polygon;
import netscape.javascript.JSObject;

public class PolygonImpl
    extends PolylineImpl
    implements Polygon {

  public PolygonImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
  }
}
