package com.github.ngyewch.leafletfx;

/**
 * Circle options.
 */
public class CircleOptions
    extends PathOptions {

  private Number radius;

  /**
   * Gets the radius of the circle marker.
   *
   * @return Radius in meters.
   */
  public Number getRadius() {
    return radius;
  }

  /**
   * Sets the radius of the circle marker.
   *
   * @param radius Radius in meters.
   */
  public void setRadius(Number radius) {
    this.radius = radius;
  }
}
