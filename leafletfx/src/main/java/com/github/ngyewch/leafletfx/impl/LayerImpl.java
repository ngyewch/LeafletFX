package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.*;
import netscape.javascript.JSObject;

public class LayerImpl
    extends AbstractEvented
    implements Layer {

  public LayerImpl(JSContext jsContext, JSObject jsObject) {
    super(jsContext, jsObject);
  }

  @Override
  public void addTo(LeafletMap map) {
    call("addTo", map);
  }

  @Override
  public void addTo(LayerGroup layerGroup) {
    call("addTo", layerGroup);
  }

  @Override
  public void remove() {
    call("remove");
  }

  @Override
  public void removeFrom(LeafletMap map) {
    call("removeFrom", map);
  }

  @Override
  public void removeFrom(LayerGroup layerGroup) {
    call("removeFrom", layerGroup);
  }

  // ----

  @Override
  public void bindPopup(String content, PopupOptions popupOptions) {
    call("bindPopup", content, popupOptions);
  }

  @Override
  public void unbindPopup() {
    call("unbindPopup");
  }

  @Override
  public void openPopup(LatLng latLng) {
    call("openPopup", latLng);
  }

  @Override
  public void closePopup() {
    call("closePopup");
  }

  @Override
  public void togglePopup() {
    call("togglePopup");
  }

  @Override
  public boolean isPopupOpen() {
    final Object result = call("isPopupOpen");
    if (result instanceof Boolean) {
      return (Boolean) result;
    }
    return false;
  }

  @Override
  public void setPopupContent(String content) {
    call("setPopupContent", content);
  }

  @Override
  public void bindTooltip(String content, TooltipOptions tooltipOptions) {
    call("bindTooltip", content, tooltipOptions);
  }

  @Override
  public void unbindTooltip() {
    call("unbindTooltip");
  }

  @Override
  public void openTooltip(LatLng latLng) {
    call("openTooltip", latLng);
  }

  @Override
  public void closeTooltip() {
    call("closeTooltip");
  }

  @Override
  public void toggleTooltip() {
    call("toggleTooltip");
  }

  @Override
  public boolean isTooltipOpen() {
    final Object result = call("isTooltipOpen");
    if (result instanceof Boolean) {
      return (Boolean) result;
    }
    return false;
  }

  @Override
  public void setTooltipContent(String content) {
    call("setTooltipContent", content);
  }
}
