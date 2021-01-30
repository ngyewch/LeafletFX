package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.Handler;
import com.github.ngyewch.leafletfx.LeafletMap;
import netscape.javascript.JSObject;

public class LeafletMapImpl
    extends AbstractEvented
    implements LeafletMap {

  public LeafletMapImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
  }

  @Override
  public Handler getBoxZoom() {
    return new HandlerImpl(getJsContext(), (JSObject) getJsObject().getMember("boxZoom"));
  }

  @Override
  public Handler getDoubleClickZoom() {
    return new HandlerImpl(getJsContext(), (JSObject) getJsObject().getMember("doubleClickZoom"));
  }

  @Override
  public Handler getDragging() {
    return new HandlerImpl(getJsContext(), (JSObject) getJsObject().getMember("dragging"));
  }

  @Override
  public Handler getKeyboard() {
    return new HandlerImpl(getJsContext(), (JSObject) getJsObject().getMember("keyboard"));
  }

  @Override
  public Handler getScrollWheelZoom() {
    return new HandlerImpl(getJsContext(), (JSObject) getJsObject().getMember("scrollWheelZoom"));
  }

  @Override
  public Handler getTap() {
    return new HandlerImpl(getJsContext(), (JSObject) getJsObject().getMember("tap"));
  }

  @Override
  public Handler getTouchZoom() {
    return new HandlerImpl(getJsContext(), (JSObject) getJsObject().getMember("touchZoom"));
  }
}
