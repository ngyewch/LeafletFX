package com.github.ngyewch.leafletfx.impl;

import com.github.ngyewch.leafletfx.*;
import netscape.javascript.JSObject;

import java.util.List;

public class LeafletImpl
    extends JSAdapter
    implements Leaflet {

  public LeafletImpl(JSContext jsContext) {
    super(jsContext, (JSObject) jsContext.getEngine().executeScript("L"));
  }

  @Override
  public LeafletMap map(String id) {
    final JSObject o = (JSObject) call("map", id);
    return new LeafletMapImpl(getJsContext(), o);
  }

  @Override
  public LeafletMap map(String id, MapOptions mapOptions) {
    final JSObject o = (JSObject) call("map", id, mapOptions);
    return new LeafletMapImpl(getJsContext(), o);
  }

  @Override
  public TileLayer tileLayer(String url) {
    final JSObject o = (JSObject) call("tileLayer", url);
    return new TileLayerImpl(getJsContext(), o);
  }

  @Override
  public TileLayer tileLayer(String url, TileLayerOptions tileLayerOptions) {
    final JSObject o = (JSObject) call("tileLayer", url, tileLayerOptions);
    return new TileLayerImpl(getJsContext(), o);
  }

  @Override
  public Marker marker(LatLng latLng) {
    final JSObject o = (JSObject) call("marker", latLng);
    return new MarkerImpl(getJsContext(), o);
  }

  @Override
  public Marker marker(LatLng latLng, MarkerOptions markerOptions) {
    final JSObject o = (JSObject) call("marker", latLng, markerOptions);
    return new MarkerImpl(getJsContext(), o);
  }

  @Override
  public Polyline polyline(List<LatLng> latLngs) {
    final JSObject o = (JSObject) call("polyline", latLngs);
    return new PolylineImpl(getJsContext(), o);
  }

  @Override
  public Polyline polyline(List<LatLng> latLngs, PolylineOptions polylineOptions) {
    final JSObject o = (JSObject) call("polyline", latLngs, polylineOptions);
    return new PolylineImpl(getJsContext(), o);
  }

  @Override
  public Polygon polygon(List<LatLng> latLngs) {
    final JSObject o = (JSObject) call("polygon", latLngs);
    return new PolygonImpl(getJsContext(), o);
  }

  @Override
  public Polygon polygon(List<LatLng> latLngs, PolygonOptions polygonOptions) {
    final JSObject o = (JSObject) call("polygon", latLngs, polygonOptions);
    return new PolygonImpl(getJsContext(), o);
  }

  @Override
  public Circle circle(LatLng latLng) {
    final JSObject o = (JSObject) call("circle", latLng);
    return new CircleImpl(getJsContext(), o);
  }

  @Override
  public Circle circle(LatLng latLng, CircleOptions circleOptions) {
    final JSObject o = (JSObject) call("circle", latLng);
    return new CircleImpl(getJsContext(), o);
  }

  @Override
  public CircleMarker circleMarker(LatLng latLng) {
    final JSObject o = (JSObject) call("circleMarker", latLng);
    return new CircleMarkerImpl(getJsContext(), o);
  }

  @Override
  public CircleMarker circleMarker(LatLng latLng, CircleMarkerOptions circleMarkerOptions) {
    final JSObject o = (JSObject) call("circleMarker", latLng, circleMarkerOptions);
    return new CircleMarkerImpl(getJsContext(), o);
  }

  @Override
  public Icon icon(IconOptions iconOptions) {
    final JSObject o = (JSObject) call("icon", iconOptions);
    return new IconImpl(getJsContext(), o);
  }

  @Override
  public Popup popup() {
    final JSObject o = (JSObject) call("popup");
    return new PopupImpl(getJsContext(), o);
  }

  @Override
  public Popup popup(PopupOptions popupOptions) {
    final JSObject o = (JSObject) call("popup", popupOptions);
    return new PopupImpl(getJsContext(), o);
  }

  @Override
  public Popup popup(PopupOptions popupOptions, Layer layer) {
    final JSObject o = (JSObject) call("popup", popupOptions, layer);
    return new PopupImpl(getJsContext(), o);
  }

  @Override
  public Tooltip tooltip() {
    final JSObject o = (JSObject) call("tooltip");
    return new TooltipImpl(getJsContext(), o);
  }

  @Override
  public Tooltip tooltip(TooltipOptions tooltipOptions) {
    final JSObject o = (JSObject) call("tooltip", tooltipOptions);
    return new TooltipImpl(getJsContext(), o);
  }

  @Override
  public Tooltip tooltip(TooltipOptions tooltipOptions, Layer layer) {
    final JSObject o = (JSObject) call("tooltip", tooltipOptions, layer);
    return new TooltipImpl(getJsContext(), o);
  }

  @Override
  public LayerGroup layerGroup() {
    final JSObject o = (JSObject) call("layerGroup");
    return new LayerGroupImpl(getJsContext(), o);
  }
}
