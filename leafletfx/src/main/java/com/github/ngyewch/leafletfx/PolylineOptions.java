package com.github.ngyewch.leafletfx;

/**
 * Polyline options.
 */
public class PolylineOptions
    extends PathOptions {

  private Number smoothFactor;
  private Boolean noClip;

  /**
   * Gets the smooth factor. How much to simplify the polyline on each zoom level. More means better performance and
   * smoother look, and less means more accurate representation.
   *
   * @return Smooth factor.
   */
  public Number getSmoothFactor() {
    return smoothFactor;
  }

  /**
   * Sets the smooth factor. How much to simplify the polyline on each zoom level. More means better performance and
   * smoother look, and less means more accurate representation.
   *
   * @param smoothFactor Smooth factor.
   */
  public void setSmoothFactor(Number smoothFactor) {
    this.smoothFactor = smoothFactor;
  }

  /**
   * Gets the no clip flag.
   *
   * @return No clip flag.
   */
  public Boolean getNoClip() {
    return noClip;
  }

  /**
   * Sets the no clip flag.
   *
   * @param noClip No clip flag.
   */
  public void setNoClip(Boolean noClip) {
    this.noClip = noClip;
  }
}
