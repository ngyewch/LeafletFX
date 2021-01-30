package com.github.ngyewch.leafletfx;

import java.util.List;

/**
 * Polyline layer.
 */
public interface Polyline
    extends Path {

  /**
   * Replaces all the points in the polyline with the given array of geographical points.
   *
   * @param latLngs Array of geographical points.
   */
  void setLatLngs(List<LatLng> latLngs);

  /**
   * Adds a given point to the polyline.
   *
   * @param latLng Geographical point.
   */
  void addLatLng(LatLng latLng);
}
