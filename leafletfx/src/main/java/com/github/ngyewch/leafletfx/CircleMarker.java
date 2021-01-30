package com.github.ngyewch.leafletfx;

/**
 * A circle of a fixed size with radius specified in pixels.
 */
public interface CircleMarker
    extends Path {

  /**
   * Sets the position of a circle marker to a new location.
   *
   * @param latLng The new location.
   */
  void setLatLng(LatLng latLng);

  /**
   * Sets the radius of a circle marker. Units are in pixels.
   *
   * @param radius Radius in pixels.
   */
  void setRadius(Number radius);
}
