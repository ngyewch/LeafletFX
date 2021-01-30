package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.LatLng;
import com.github.ngyewch.leafletfx.LeafletMap;
import com.github.ngyewch.leafletfx.Popup;
import netscape.javascript.JSObject;

public class PopupImpl
    extends LayerImpl
    implements Popup {

  public PopupImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
  }

  @Override
  public void setLatLng(LatLng latLng) {
    call("setLatLng", latLng);
  }

  @Override
  public void setContent(String content) {
    call("setContent", content);
  }

  @Override
  public void update() {
    call("update");
  }

  @Override
  public boolean isOpen() {
    final Object result = call("isOpen");
    if (result instanceof Boolean) {
      return (Boolean) result;
    }
    return false;
  }

  @Override
  public void bringToFront() {
    call("bringToFront");
  }

  @Override
  public void bringToBack() {
    call("bringToBack");
  }

  @Override
  public void openOn(LeafletMap map) {
    call("openOn", map);
  }
}
