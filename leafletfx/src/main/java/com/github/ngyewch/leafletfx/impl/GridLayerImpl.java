package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.GridLayer;
import netscape.javascript.JSObject;

public class GridLayerImpl
    extends LayerImpl
    implements GridLayer {

  public GridLayerImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
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
  public void setOpacity(Number opacity) {
    call("setOpacity", opacity);
  }

  @Override
  public void setZIndex(Number zIndex) {
    call("setZIndex", zIndex);
  }

  @Override
  public boolean isLoading() {
    final Object result = call("isLoading");
    if (result instanceof Boolean) {
      return (Boolean) result;
    }
    return false;
  }

  @Override
  public void redraw() {
    call("redraw");
  }
}
