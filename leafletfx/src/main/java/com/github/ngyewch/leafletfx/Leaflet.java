package com.github.ngyewch.leafletfx;

import java.util.List;

/**
 * Leaflet factory methods.
 */
public interface Leaflet {

  /**
   * Instantiates a map.
   *
   * @param id DOM ID of a div element.
   * @return Map.
   */
  LeafletMap map(String id);

  /**
   * Instantiates a map.
   *
   * @param id         DOM ID of a div element.
   * @param mapOptions Map options.
   * @return Map.
   */
  LeafletMap map(String id, MapOptions mapOptions);

  /**
   * Instantiates a tile layer.
   *
   * @param url URL template.
   * @return Tile layer.
   */
  TileLayer tileLayer(String url);

  /**
   * Instantiates a tile layer.
   *
   * @param url              URL template.
   * @param tileLayerOptions Tile layer options.
   * @return Tile layer.
   */
  TileLayer tileLayer(String url, TileLayerOptions tileLayerOptions);

  /**
   * Instantiates a marker.
   *
   * @param latLng Geographical point.
   * @return Marker.
   */
  Marker marker(LatLng latLng);

  /**
   * Instantiates a marker.
   *
   * @param latLng        Geographical point.
   * @param markerOptions Marker options.
   * @return Marker.
   */
  Marker marker(LatLng latLng, MarkerOptions markerOptions);

  /**
   * Instantiates a polyline.
   *
   * @param latLngs Geographical points.
   * @return Polyline.
   */
  Polyline polyline(List<LatLng> latLngs);

  /**
   * Instantiates a polyline.
   *
   * @param latLngs         Geographical points.
   * @param polylineOptions Polyline options.
   * @return Polyline.
   */
  Polyline polyline(List<LatLng> latLngs, PolylineOptions polylineOptions);

  /**
   * Instantiates a polygon.
   *
   * @param latLngs Geographical points.
   * @return Polygon.
   */
  Polygon polygon(List<LatLng> latLngs);

  /**
   * Instantiates a polygon.
   *
   * @param latLngs        Geographical points.
   * @param polygonOptions Polygon options.
   * @return Polygon.
   */
  Polygon polygon(List<LatLng> latLngs, PolygonOptions polygonOptions);

  /**
   * Instantiates a circle.
   *
   * @param latLng Geographical point.
   * @return Circle.
   */
  Circle circle(LatLng latLng);

  /**
   * Instantiates a circle.
   *
   * @param latLng        Geographical point.
   * @param circleOptions Circle options.
   * @return Circle.
   */
  Circle circle(LatLng latLng, CircleOptions circleOptions);

  /**
   * Instantiates a circle marker.
   *
   * @param latLng Geographical point.
   * @return Circle marker.
   */
  CircleMarker circleMarker(LatLng latLng);

  /**
   * Instantiates a circle marker.
   *
   * @param latLng              Geographical marker.
   * @param circleMarkerOptions Circle marker options.
   * @return Circle marker.
   */
  CircleMarker circleMarker(LatLng latLng, CircleMarkerOptions circleMarkerOptions);

  /**
   * Instantiates an icon.
   *
   * @param iconOptions Icon options.
   * @return Icon.
   */
  Icon icon(IconOptions iconOptions);

  /**
   * Instantiates a popup.
   *
   * @return Popup.
   */
  Popup popup();

  /**
   * Instantiates a popup.
   *
   * @param popupOptions Popup options.
   * @return Popup.
   */
  Popup popup(PopupOptions popupOptions);

  /**
   * Instantiates a popup.
   *
   * @param popupOptions Popup options.
   * @param layer        Layer.
   * @return Popup.
   */
  Popup popup(PopupOptions popupOptions, Layer layer);

  /**
   * Instantiates a tooltip.
   *
   * @return Tooltip.
   */
  Tooltip tooltip();

  /**
   * Instantiates a tooltip.
   *
   * @param tooltipOptions Tooltip options.
   * @return Tooltip.
   */
  Tooltip tooltip(TooltipOptions tooltipOptions);

  /**
   * Instantiates a tooltip.
   *
   * @param tooltipOptions Tooltip options.
   * @param layer          Layer.
   * @return Tooltip.
   */
  Tooltip tooltip(TooltipOptions tooltipOptions, Layer layer);

  /**
   * Instantiates a layer group.
   *
   * @return Layer group.
   */
  LayerGroup layerGroup();
}
