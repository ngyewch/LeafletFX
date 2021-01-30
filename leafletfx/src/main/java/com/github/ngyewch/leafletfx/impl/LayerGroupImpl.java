package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.Layer;
import com.github.ngyewch.leafletfx.LayerGroup;
import netscape.javascript.JSObject;

public class LayerGroupImpl
    extends LayerImpl
    implements LayerGroup {

  public LayerGroupImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
  }

  @Override
  public void addLayer(Layer layer) {
    call("addLayer", layer);
  }

  @Override
  public void removeLayer(Layer layer) {
    call("removeLayer", layer);
  }

  @Override
  public boolean hasLayer(Layer layer) {
    final Object result = call("hasLayer", layer);
    if (result instanceof Boolean) {
      return (Boolean) result;
    }
    return false;
  }

  @Override
  public void clearLayers() {
    call("clearLayers");
  }

  @Override
  public void setZIndex(Number zIndex) {
    call("setZIndex", zIndex);
  }
}
