package com.github.ngyewch.leafletfx;

/**
 * Tile layer options.
 */
public class TileLayerOptions
    extends GridLayerOptions {

  private Number minZoom;
  private Number maxZoom;
  private String[] subdomains;
  private String errorTileUrl;
  private Number zoomOffset;
  private Boolean tms;
  private Boolean zoomReverse;
  private Boolean detectRetina;
  private String crossOrigin;

  /**
   * Gets the minimum zoom level down to which this layer will be displayed (inclusive).
   *
   * @return The minimum zoom level down to which this layer will be displayed (inclusive).
   */
  public Number getMinZoom() {
    return minZoom;
  }

  /**
   * Sets the minimum zoom level down to which this layer will be displayed (inclusive).
   *
   * @param minZoom The minimum zoom level down to which this layer will be displayed (inclusive).
   */
  public void setMinZoom(Number minZoom) {
    this.minZoom = minZoom;
  }

  /**
   * Gets the maximum zoom level up to which this layer will be displayed (inclusive).
   *
   * @return The maximum zoom level up to which this layer will be displayed (inclusive).
   */
  public Number getMaxZoom() {
    return maxZoom;
  }

  /**
   * Sets the maximum zoom level up to which this layer will be displayed (inclusive).
   *
   * @param maxZoom The maximum zoom level up to which this layer will be displayed (inclusive).
   */
  public void setMaxZoom(Number maxZoom) {
    this.maxZoom = maxZoom;
  }

  /**
   * Gets the subdomains of the tile service.
   *
   * @return Subdomains of the tile service.
   */
  public String[] getSubdomains() {
    return subdomains;
  }

  /**
   * Sets the subdomains of the tile service.
   *
   * @param subdomains Subdomains of the tile service.
   */
  public void setSubdomains(String[] subdomains) {
    this.subdomains = subdomains;
  }

  /**
   * Gets the URL to the tile image to show in place of the tile that failed to load.
   *
   * @return URL to the tile image to show in place of the tile that failed to load.
   */
  public String getErrorTileUrl() {
    return errorTileUrl;
  }

  /**
   * Sets the URL to the tile image to show in place of the tile that failed to load.
   *
   * @param errorTileUrl URL to the tile image to show in place of the tile that failed to load.
   */
  public void setErrorTileUrl(String errorTileUrl) {
    this.errorTileUrl = errorTileUrl;
  }

  /**
   * Gets the zoom number used in tile URLs will be offset with this value.
   *
   * @return The zoom number used in tile URLs will be offset with this value.
   */
  public Number getZoomOffset() {
    return zoomOffset;
  }

  /**
   * Sets the zoom number used in tile URLs will be offset with this value.
   *
   * @param zoomOffset The zoom number used in tile URLs will be offset with this value.
   */
  public void setZoomOffset(Number zoomOffset) {
    this.zoomOffset = zoomOffset;
  }

  /**
   * Gets the TMS flag. If true, inverses Y axis numbering for tiles (turn this on for TMS services).
   *
   * @return TMS flag.
   */
  public Boolean getTms() {
    return tms;
  }

  /**
   * Sets the TMS flag. If true, inverses Y axis numbering for tiles (turn this on for TMS services).
   *
   * @param tms TMS flag.
   */
  public void setTms(Boolean tms) {
    this.tms = tms;
  }

  /**
   * Gets the zoom reverse flag.
   * If set to true, the zoom number used in tile URLs will be reversed (maxZoom - zoom instead of zoom)
   *
   * @return The zoom reverse flag.
   */
  public Boolean getZoomReverse() {
    return zoomReverse;
  }

  /**
   * Sets the zoom reverse flag.
   * If set to true, the zoom number used in tile URLs will be reversed (maxZoom - zoom instead of zoom)
   *
   * @param zoomReverse The zoom reverse flag.
   */
  public void setZoomReverse(Boolean zoomReverse) {
    this.zoomReverse = zoomReverse;
  }

  /**
   * Gets the detect retina flag.
   * If true and user is on a retina display, it will request four tiles of half the specified size and a bigger zoom
   * level in place of one to utilize the high resolution.
   *
   * @return The detect retina flag.
   */
  public Boolean getDetectRetina() {
    return detectRetina;
  }

  /**
   * Sets the detect retina flag.
   * If true and user is on a retina display, it will request four tiles of half the specified size and a bigger zoom
   * level in place of one to utilize the high resolution.
   *
   * @param detectRetina The detect retina flag.
   */
  public void setDetectRetina(Boolean detectRetina) {
    this.detectRetina = detectRetina;
  }

  /**
   * Gets the crossOrigin attribute.
   *
   * @return crossOrigin attribute.
   */
  public String getCrossOrigin() {
    return crossOrigin;
  }

  /**
   * Sets the crossOrigin attribute.
   *
   * @param crossOrigin crossOrigin attribute.
   */
  public void setCrossOrigin(String crossOrigin) {
    this.crossOrigin = crossOrigin;
  }
}
