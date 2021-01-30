package com.github.ngyewch.leafletfx;

/**
 * Icon options.
 */
public class IconOptions {

  private String iconUrl;
  private String iconRetinaUrl;
  private Point iconSize;
  private Point iconAnchor;
  private Point popupAnchor;
  private Point tooltipAnchor;
  private String shadowUrl;
  private String shadowRetinaUrl;
  private Point shadowSize;
  private Point shadowAnchor;
  private String className;

  /**
   * Gets the URL to the icon image.
   *
   * @return The URL to the icon image.
   */
  public String getIconUrl() {
    return iconUrl;
  }

  /**
   * Sets the URL to the icon image.
   *
   * @param iconUrl The URL to the icon image.
   */
  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  /**
   * Gets the URL to the retina sized version of the icon image.
   *
   * @return The URL to the retina sized version of the icon image.
   */
  public String getIconRetinaUrl() {
    return iconRetinaUrl;
  }

  /**
   * Sets the URL to the retina sized version of the icon image.
   *
   * @param iconRetinaUrl The URL to the retina sized version of the icon image.
   */
  public void setIconRetinaUrl(String iconRetinaUrl) {
    this.iconRetinaUrl = iconRetinaUrl;
  }

  /**
   * Gets the size of the icon image in pixels.
   *
   * @return The size of the icon image in pixels.
   */
  public Point getIconSize() {
    return iconSize;
  }

  /**
   * Sets the size of the icon image in pixels.
   *
   * @param iconSize The size of the icon image in pixels.
   */
  public void setIconSize(Point iconSize) {
    this.iconSize = iconSize;
  }

  /**
   * Gets the icon anchor.
   *
   * @return The icon anchor.
   */
  public Point getIconAnchor() {
    return iconAnchor;
  }

  /**
   * Sets the icon anchor.
   *
   * @param iconAnchor The icon anchor.
   */
  public void setIconAnchor(Point iconAnchor) {
    this.iconAnchor = iconAnchor;
  }

  /**
   * Gets the popup anchor.
   *
   * @return The popup anchor.
   */
  public Point getPopupAnchor() {
    return popupAnchor;
  }

  /**
   * Sets the popup anchor.
   *
   * @param popupAnchor The popup anchor.
   */
  public void setPopupAnchor(Point popupAnchor) {
    this.popupAnchor = popupAnchor;
  }

  /**
   * Gets the tooltip anchor.
   *
   * @return The tooltip anchor.
   */
  public Point getTooltipAnchor() {
    return tooltipAnchor;
  }

  /**
   * Sets the tooltip anchor.
   *
   * @param tooltipAnchor The tooltip anchor.
   */
  public void setTooltipAnchor(Point tooltipAnchor) {
    this.tooltipAnchor = tooltipAnchor;
  }

  /**
   * Gets the URL to the icon shadow image.
   *
   * @return The URL to the icon shadow image.
   */
  public String getShadowUrl() {
    return shadowUrl;
  }

  /**
   * Sets the URL to the icon shadow image.
   *
   * @param shadowUrl The URL to the icon shadow image.
   */
  public void setShadowUrl(String shadowUrl) {
    this.shadowUrl = shadowUrl;
  }

  /**
   * Gets the URL to the retina sized version of the icon shadow image.
   *
   * @return The URL to the retina sized version of the icon shadow image.
   */
  public String getShadowRetinaUrl() {
    return shadowRetinaUrl;
  }

  /**
   * Sets the URL to the retina sized version of the icon shadow image.
   *
   * @param shadowRetinaUrl The URL to the retina sized version of the icon shadow image.
   */
  public void setShadowRetinaUrl(String shadowRetinaUrl) {
    this.shadowRetinaUrl = shadowRetinaUrl;
  }

  /**
   * Gets the size of the icon shadow image in pixels.
   *
   * @return The size of the icon shadow image in pixels.
   */
  public Point getShadowSize() {
    return shadowSize;
  }

  /**
   * Sets the size of the icon shadow image in pixels.
   *
   * @param shadowSize The size of the icon shadow image in pixels.
   */
  public void setShadowSize(Point shadowSize) {
    this.shadowSize = shadowSize;
  }

  /**
   * Gets the icon shadow anchor.
   *
   * @return The icon shadow anchor.
   */
  public Point getShadowAnchor() {
    return shadowAnchor;
  }

  /**
   * Sets the icon shadow anchor.
   *
   * @param shadowAnchor The icon shadow anchor.
   */
  public void setShadowAnchor(Point shadowAnchor) {
    this.shadowAnchor = shadowAnchor;
  }

  /**
   * Gets the custom CSS class name.
   *
   * @return The custom CSS class name.
   */
  public String getClassName() {
    return className;
  }

  /**
   * Sets the custom CSS class name.
   *
   * @param className The custom CSS class name.
   */
  public void setClassName(String className) {
    this.className = className;
  }
}
