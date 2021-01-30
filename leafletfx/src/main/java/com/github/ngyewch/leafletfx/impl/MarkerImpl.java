package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.Icon;
import com.github.ngyewch.leafletfx.LatLng;
import com.github.ngyewch.leafletfx.Marker;
import netscape.javascript.JSObject;

public class MarkerImpl
    extends LayerImpl
    implements Marker {

  public MarkerImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
  }

  @Override
  public void setLatLng(LatLng latLng) {
    call("setLatLng", latLng);
  }

  @Override
  public void setZIndexOffset(Number offset) {
    call("setZIndexOffset", offset);
  }

  @Override
  public void setIcon(Icon icon) {
    call("setIcon", icon);
  }

  @Override
  public void setOpacity(Number opacity) {
    call("setOpacity", opacity);
  }
}
