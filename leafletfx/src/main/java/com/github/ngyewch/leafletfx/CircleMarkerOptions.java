package com.github.ngyewch.leafletfx;

/**
 * CircleMarker options.
 */
public class CircleMarkerOptions
    extends PathOptions {

  private Number radius;

  /**
   * Gets the radius of the circle marker.
   *
   * @return Radius in pixels.
   */
  public Number getRadius() {
    return radius;
  }

  /**
   * Sets the radius of the circle marker.
   *
   * @param radius Radius in pixels.
   */
  public void setRadius(Number radius) {
    this.radius = radius;
  }
}
