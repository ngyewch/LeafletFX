package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.Icon;
import netscape.javascript.JSObject;

public class IconImpl
    extends JSAdapter
    implements Icon {

  public IconImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
  }
}
