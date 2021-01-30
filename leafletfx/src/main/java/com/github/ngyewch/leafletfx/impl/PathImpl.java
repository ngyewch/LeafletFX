package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.Path;
import com.github.ngyewch.leafletfx.PathOptions;
import netscape.javascript.JSObject;

public class PathImpl
    extends InteractiveLayerImpl
    implements Path {

  public PathImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
  }

  @Override
  public void redraw() {
    call("redraw");
  }

  @Override
  public void setStyle(PathOptions pathOptions) {
    call("setStyle", pathOptions);
  }

  @Override
  public void bringToFront() {
    call("bringToFront");
  }

  @Override
  public void bringToBack() {
    call("bringToBack");
  }
}
