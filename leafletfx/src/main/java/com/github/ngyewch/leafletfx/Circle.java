package com.github.ngyewch.leafletfx;

/**
 * A class for drawing circle overlays on a map.
 *
 * It's an approximation and starts to diverge from a real circle closer to poles (due to projection distortion).
 */
public interface Circle
    extends Path {

  /**
   * Sets the radius of a circle. Units are in meters.
   *
   * @param radius Radius in meters.
   */
  void setRadius(Number radius);
}
