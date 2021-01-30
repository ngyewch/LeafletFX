package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.LatLng;
import com.github.ngyewch.leafletfx.Polyline;
import netscape.javascript.JSObject;

import java.util.List;

public class PolylineImpl
    extends PathImpl
    implements Polyline {

  public PolylineImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
  }

  @Override
  public void setLatLngs(List<LatLng> latLngs) {
    call("setLatLngs", latLngs);
  }

  @Override
  public void addLatLng(LatLng latLng) {
    call("addLatLng", latLng);
  }
}
