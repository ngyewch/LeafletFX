package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.TileLayer;
import netscape.javascript.JSObject;

public class TileLayerImpl
    extends GridLayerImpl
    implements TileLayer {

  public TileLayerImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
  }

  @Override
  public void setUrl(String url) {
    call("setUrl", url);
  }

  @Override
  public void setUrl(String url, boolean noRedraw) {
    call("setUrl", url, noRedraw);
  }
}
