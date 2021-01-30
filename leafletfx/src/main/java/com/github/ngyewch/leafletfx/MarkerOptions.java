package com.github.ngyewch.leafletfx;

public class MarkerOptions
    extends InteractiveLayerOptions {

  private Boolean keyboard;
  private String title;
  private String alt;
  private Number zIndexOffset;
  private Number opacity;
  private Boolean riseOnHover;
  private Number riseOffset;
  private String shadowPane;
  private Boolean draggable;
  private Boolean autoPan;
  private Point autoPanPadding;
  private Number autoPanSeed;

  /**
   * Gets whether the marker can be tabbed to with a keyboard and clicked by pressing enter.
   *
   * @return true if the marker can be tabbed to with a keyboard and clicked by pressing enter.
   */
  public Boolean getKeyboard() {
    return keyboard;
  }

  /**
   * Sets whether the marker can be tabbed to with a keyboard and clicked by pressing enter.
   *
   * @param keyboard true if the marker can be tabbed to with a keyboard and clicked by pressing enter.
   */
  public void setKeyboard(Boolean keyboard) {
    this.keyboard = keyboard;
  }

  /**
   * Gets the text for the browser tooltip that appear on marker hover (no tooltip by default).
   *
   * @return Text for the browser tooltip that appear on marker hover.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the text for the browser tooltip that appear on marker hover (no tooltip by default).
   *
   * @param title Text for the browser tooltip that appear on marker hover.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Gets the text for the alt attribute of the icon image (useful for accessibility).
   *
   * @return Text for the alt attribute of the icon image (useful for accessibility).
   */
  public String getAlt() {
    return alt;
  }

  /**
   * Sets the text for the alt attribute of the icon image (useful for accessibility).
   *
   * @param alt Text for the alt attribute of the icon image (useful for accessibility).
   */
  public void setAlt(String alt) {
    this.alt = alt;
  }

  /**
   * Gets the z-index offset.
   *
   * @return The z-index offset.
   */
  public Number getzIndexOffset() {
    return zIndexOffset;
  }

  /**
   * Sets the z-index offset.
   *
   * @param zIndexOffset The z-index offset.
   */
  public void setzIndexOffset(Number zIndexOffset) {
    this.zIndexOffset = zIndexOffset;
  }

  /**
   * Gets the opacity of the marker.
   *
   * @return The opacity of the marker.
   */
  public Number getOpacity() {
    return opacity;
  }

  /**
   * Sets the opacity of the marker.
   *
   * @param opacity The opacity of the marker.
   */
  public void setOpacity(Number opacity) {
    this.opacity = opacity;
  }

  /**
   * Gets whether the marker will get on top of others when you hover the mouse over it.
   *
   * @return true if the marker will get on top of others when you hover the mouse over it.
   */
  public Boolean getRiseOnHover() {
    return riseOnHover;
  }

  /**
   * Sets whether the marker will get on top of others when you hover the mouse over it.
   *
   * @param riseOnHover true if the marker will get on top of others when you hover the mouse over it.
   */
  public void setRiseOnHover(Boolean riseOnHover) {
    this.riseOnHover = riseOnHover;
  }

  /**
   * Gets the z-index offset used for the riseOnHover feature.
   *
   * @return The z-index offset used for the riseOnHover feature.
   */
  public Number getRiseOffset() {
    return riseOffset;
  }

  /**
   * Sets the z-index offset used for the riseOnHover feature.
   *
   * @param riseOffset The z-index offset used for the riseOnHover feature.
   */
  public void setRiseOffset(Number riseOffset) {
    this.riseOffset = riseOffset;
  }

  /**
   * Gets the map pane where the markers shadow will be added.
   *
   * @return The map pane where the markers shadow will be added.
   */
  public String getShadowPane() {
    return shadowPane;
  }

  /**
   * Sets the map pane where the markers shadow will be added.
   *
   * @param shadowPane The map pane where the markers shadow will be added.
   */
  public void setShadowPane(String shadowPane) {
    this.shadowPane = shadowPane;
  }

  /**
   * Gets whether the marker is draggable with mouse/touch or not.
   *
   * @return true if the marker is draggable with mouse/touch or not.
   */
  public Boolean getDraggable() {
    return draggable;
  }

  /**
   * Sets whether the marker is draggable with mouse/touch or not.
   *
   * @param draggable true if the marker is draggable with mouse/touch or not.
   */
  public void setDraggable(Boolean draggable) {
    this.draggable = draggable;
  }

  /**
   * Gets whether to pan the map when dragging this marker near its edge or not.
   *
   * @return Whether to pan the map when dragging this marker near its edge or not.
   */
  public Boolean getAutoPan() {
    return autoPan;
  }

  /**
   * Sets whether to pan the map when dragging this marker near its edge or not.
   *
   * @param autoPan Whether to pan the map when dragging this marker near its edge or not.
   */
  public void setAutoPan(Boolean autoPan) {
    this.autoPan = autoPan;
  }

  /**
   * Gets the distance (in pixels to the left/right and to the top/bottom) of the map edge to start panning the map.
   *
   * @return Distance (in pixels to the left/right and to the top/bottom) of the map edge to start panning the map.
   */
  public Point getAutoPanPadding() {
    return autoPanPadding;
  }

  /**
   * Sets the distance (in pixels to the left/right and to the top/bottom) of the map edge to start panning the map.
   *
   * @param autoPanPadding Distance (in pixels to the left/right and to the top/bottom) of the map edge to start panning the map.
   */
  public void setAutoPanPadding(Point autoPanPadding) {
    this.autoPanPadding = autoPanPadding;
  }

  /**
   * Gets the number of pixels the map should pan by.
   *
   * @return Number of pixels the map should pan by.
   */
  public Number getAutoPanSeed() {
    return autoPanSeed;
  }

  /**
   * Sets the number of pixels the map should pan by.
   *
   * @param autoPanSeed Number of pixels the map should pan by.
   */
  public void setAutoPanSeed(Number autoPanSeed) {
    this.autoPanSeed = autoPanSeed;
  }
}
