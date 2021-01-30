package com.github.ngyewch.leafletfx;

/**
 * Popup options.
 */
public class PopupOptions
    extends DivOverlayOptions {

  private Number maxWidth;
  private Number minWidth;
  private Number maxHeight;
  private Boolean autoPan;
  private Point autoPanPaddingTopLeft;
  private Point autoPanPaddingBottomRight;
  private Point autoPanPadding;
  private Boolean keepInView;
  private Boolean closeButton;
  private Boolean autoClose;
  private Boolean closeOnEscapeKey;
  private Boolean closeOnClick;

  /**
   * Gets the max width of the popup (pixels).
   *
   * @return The max width of the popup (pixels).
   */
  public Number getMaxWidth() {
    return maxWidth;
  }

  /**
   * Sets the max width of the popup (pixels).
   *
   * @param maxWidth The max width of the popup (pixels).
   */
  public void setMaxWidth(Number maxWidth) {
    this.maxWidth = maxWidth;
  }

  /**
   * Gets the min width of the popup (pixels).
   *
   * @return The min width of the popup (pixels).
   */
  public Number getMinWidth() {
    return minWidth;
  }

  /**
   * Sets the min width of the popup (pixels).
   *
   * @param minWidth The min width of the popup (pixels).
   */
  public void setMinWidth(Number minWidth) {
    this.minWidth = minWidth;
  }

  /**
   * Gets the max height of the popup (pixels).
   *
   * @return The max height of the popup (pixels).
   */
  public Number getMaxHeight() {
    return maxHeight;
  }

  /**
   * Sets the max height of the popup (pixels).
   *
   * @param maxHeight The max height of the popup (pixels).
   */
  public void setMaxHeight(Number maxHeight) {
    this.maxHeight = maxHeight;
  }

  /**
   * Gets the auto pan flag.
   *
   * @return Auto pan flag.
   */
  public Boolean getAutoPan() {
    return autoPan;
  }

  /**
   * Sets the auto pan flag.
   *
   * @param autoPan Auto pan flag.
   */
  public void setAutoPan(Boolean autoPan) {
    this.autoPan = autoPan;
  }

  /**
   * Gets the margin between the popup and the top left corner of the map view after autopanning was performed.
   *
   * @return The margin between the popup and the top left corner of the map view after autopanning was performed.
   */
  public Point getAutoPanPaddingTopLeft() {
    return autoPanPaddingTopLeft;
  }

  /**
   * Sets the margin between the popup and the top left corner of the map view after autopanning was performed.
   *
   * @param autoPanPaddingTopLeft The margin between the popup and the top left corner of the map view after
   *                              autopanning was performed.
   */
  public void setAutoPanPaddingTopLeft(Point autoPanPaddingTopLeft) {
    this.autoPanPaddingTopLeft = autoPanPaddingTopLeft;
  }

  /**
   * Gets the margin between the popup and the bottom right corner of the map view after autopanning was performed.
   *
   * @return The margin between the popup and the bottom right corner of the map view after autopanning was performed.
   */
  public Point getAutoPanPaddingBottomRight() {
    return autoPanPaddingBottomRight;
  }

  /**
   * Sets the margin between the popup and the bottom right corner of the map view after autopanning was performed.
   *
   * @param autoPanPaddingBottomRight The margin between the popup and the bottom right corner of the map view after
   *                                  autopanning was performed.
   */
  public void setAutoPanPaddingBottomRight(Point autoPanPaddingBottomRight) {
    this.autoPanPaddingBottomRight = autoPanPaddingBottomRight;
  }

  /**
   * Gets the margin between the popup and the top left corner and the bottom right corner of the map view after
   * autopanning was performed.
   *
   * @return The margin between the popup and the top left corner and the bottom right corner of the map view after
   * autopanning was performed.
   */
  public Point getAutoPanPadding() {
    return autoPanPadding;
  }

  /**
   * Sets the margin between the popup and the top left corner and the bottom right corner of the map view after
   * autopanning was performed.
   *
   * @param autoPanPadding The margin between the popup and the top left corner and the bottom right corner of the map
   *                       view after autopanning was performed.
   */
  public void setAutoPanPadding(Point autoPanPadding) {
    this.autoPanPadding = autoPanPadding;
  }

  /**
   * Gets the keep in view flag.
   *
   * @return true to prevent users from panning the popup off of the screen while it is open.
   */
  public Boolean getKeepInView() {
    return keepInView;
  }

  /**
   * Sets the keep in view flag.
   *
   * @param keepInView true to prevent users from panning the popup off of the screen while it is open.
   */
  public void setKeepInView(Boolean keepInView) {
    this.keepInView = keepInView;
  }

  /**
   * Gets whether a close button is included in the popup.
   *
   * @return true if a close button is included in the popup.
   */
  public Boolean getCloseButton() {
    return closeButton;
  }

  /**
   * Sets whether a close button is included in the popup.
   *
   * @param closeButton true if a close button is included in the popup.
   */
  public void setCloseButton(Boolean closeButton) {
    this.closeButton = closeButton;
  }

  /**
   * Gets the auto close flag.
   *
   * @return false to override the default behavior of the popup closing when another popup is opened.
   */
  public Boolean getAutoClose() {
    return autoClose;
  }

  /**
   * Sets the auto close flag.
   *
   * @param autoClose false to override the default behavior of the popup closing when another popup is opened.
   */
  public void setAutoClose(Boolean autoClose) {
    this.autoClose = autoClose;
  }

  /**
   * Gets the close on escape key flag.
   *
   * @return false to override the default behavior of the ESC key for closing of the popup.
   */
  public Boolean getCloseOnEscapeKey() {
    return closeOnEscapeKey;
  }

  /**
   * Sets the close on escape key flag.
   *
   * @param closeOnEscapeKey false to override the default behavior of the ESC key for closing of the popup.
   */
  public void setCloseOnEscapeKey(Boolean closeOnEscapeKey) {
    this.closeOnEscapeKey = closeOnEscapeKey;
  }

  /**
   * Gets the close on click flag.
   *
   * @return Close on click flag.
   */
  public Boolean getCloseOnClick() {
    return closeOnClick;
  }

  /**
   * Sets the close on click flag.
   *
   * @param closeOnClick Close on click flag.
   */
  public void setCloseOnClick(Boolean closeOnClick) {
    this.closeOnClick = closeOnClick;
  }
}
