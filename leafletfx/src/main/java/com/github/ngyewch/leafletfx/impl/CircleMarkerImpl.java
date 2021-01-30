package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.CircleMarker;
import com.github.ngyewch.leafletfx.LatLng;
import netscape.javascript.JSObject;

public class CircleMarkerImpl
    extends PathImpl
    implements CircleMarker {

  public CircleMarkerImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
  }

  @Override
  public void setLatLng(LatLng latLng) {
    call("setLatLng", latLng);
  }

  @Override
  public void setRadius(Number radius) {
    call("setRadius", radius);
  }
}
