package com.github.ngyewch.leafletfx;

/**
 * GridLayer options.
 */
public class GridLayerOptions
    extends LayerOptions {

  private Number tileSize;
  private Number opacity;
  private Boolean updateWhenIdle;
  private Boolean updateWhenZooming;
  private Number updateInterval;
  private Number zIndex;
  // TODO bounds
  private Number maxNativeZoom;
  private Number minNativeZoom;
  private Boolean noWrap;
  private String className;
  private Integer keepBuffer;

  /**
   * Gets the width and height of tiles in the grid.
   *
   * @return Width and height of tiles in the grid.
   */
  public Number getTileSize() {
    return tileSize;
  }

  /**
   * Sets the width and height of tiles in the grid.
   *
   * @param tileSize Width and height of tiles in the grid.
   */
  public void setTileSize(Number tileSize) {
    this.tileSize = tileSize;
  }

  /**
   * Gets the opacity of the tiles.
   *
   * @return Opacity of the tiles.
   */
  public Number getOpacity() {
    return opacity;
  }

  /**
   * Sets the opacity of the tiles.
   *
   * @param opacity Opacity of the tiles.
   */
  public void setOpacity(Number opacity) {
    this.opacity = opacity;
  }

  /**
   * Returns update when idle flag.
   *
   * @return true if tiles are loaded only when panning ends.
   */
  public Boolean getUpdateWhenIdle() {
    return updateWhenIdle;
  }

  /**
   * Sets update when idle flag.
   *
   * @param updateWhenIdle true if tiles are loaded only panning ends.
   */
  public void setUpdateWhenIdle(Boolean updateWhenIdle) {
    this.updateWhenIdle = updateWhenIdle;
  }

  /**
   * Gets update when zooming flag.
   *
   * @return false if the grid layer is updated only when the smooth animation ends.
   */
  public Boolean getUpdateWhenZooming() {
    return updateWhenZooming;
  }

  /**
   * Sets update when zooming flag.
   *
   * @param updateWhenZooming false if the grid layer is updated only when the smooth animation ends.
   */
  public void setUpdateWhenZooming(Boolean updateWhenZooming) {
    this.updateWhenZooming = updateWhenZooming;
  }

  /**
   * Gets the update interval (ms).
   *
   * @return Update interval (ms).
   */
  public Number getUpdateInterval() {
    return updateInterval;
  }

  /**
   * Sets the update interval (ms).
   *
   * @param updateInterval Update interval (ms).
   */
  public void setUpdateInterval(Number updateInterval) {
    this.updateInterval = updateInterval;
  }

  /**
   * Gets the z-index.
   *
   * @return z-index.
   */
  public Number getzIndex() {
    return zIndex;
  }

  /**
   * Sets the z-index.
   *
   * @param zIndex z-index.
   */
  public void setzIndex(Number zIndex) {
    this.zIndex = zIndex;
  }

  /**
   * Gets the max native zoom.
   *
   * @return Max native zoom.
   */
  public Number getMaxNativeZoom() {
    return maxNativeZoom;
  }

  /**
   * Sets the max native zoom.
   *
   * @param maxNativeZoom Max native zoom.
   */
  public void setMaxNativeZoom(Number maxNativeZoom) {
    this.maxNativeZoom = maxNativeZoom;
  }

  /**
   * Gets the min native zoom.
   *
   * @return Min native zoom.
   */
  public Number getMinNativeZoom() {
    return minNativeZoom;
  }

  /**
   * Sets the min native zoom.
   *
   * @param minNativeZoom Min native zoom.
   */
  public void setMinNativeZoom(Number minNativeZoom) {
    this.minNativeZoom = minNativeZoom;
  }

  /**
   * Gets the no wrap flag.
   *
   * @return No wrap flag.
   */
  public Boolean getNoWrap() {
    return noWrap;
  }

  /**
   * Sets the no wrap flag.
   *
   * @param noWrap No wrap flag.
   */
  public void setNoWrap(Boolean noWrap) {
    this.noWrap = noWrap;
  }

  /**
   * Gets the custom CSS class name.
   *
   * @return Custom CSS class name.
   */
  public String getClassName() {
    return className;
  }

  /**
   * Sets the custom CSS class name.
   *
   * @param className Custom CSS class name.
   */
  public void setClassName(String className) {
    this.className = className;
  }

  /**
   * Gets keep buffer size.
   * When panning, keep this many rows and columns of tiles before unloading them.
   *
   * @return Keep buffer size.
   */
  public Integer getKeepBuffer() {
    return keepBuffer;
  }

  /**
   * Sets keep buffer size.
   * When panning, keep this many rows and columns of tiles before unloading them.
   *
   * @param keepBuffer Keep buffer size.
   */
  public void setKeepBuffer(Integer keepBuffer) {
    this.keepBuffer = keepBuffer;
  }
}
