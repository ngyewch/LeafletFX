package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.InteractiveLayer;
import netscape.javascript.JSObject;

public class InteractiveLayerImpl
    extends LayerImpl
    implements InteractiveLayer {

  public InteractiveLayerImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
  }
}
