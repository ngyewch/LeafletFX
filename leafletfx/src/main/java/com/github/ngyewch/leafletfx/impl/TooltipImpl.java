package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.Tooltip;
import netscape.javascript.JSObject;

public class TooltipImpl
    extends LayerImpl
    implements Tooltip {

  public TooltipImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
  }
}
