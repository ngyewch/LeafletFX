package com.github.ngyewch.leafletfx;

/**
 * DivOverlay options.
 */
public class DivOverlayOptions
    extends LayerOptions {

  private Point offset;
  private String className;

  /**
   * Gets the offset of the popup position.
   *
   * @return Offset of the popup position.
   */
  public Point getOffset() {
    return offset;
  }

  /**
   * Sets the offset of the popup position.
   *
   * @param offset Offset of the popup position.
   */
  public void setOffset(Point offset) {
    this.offset = offset;
  }

  /**
   * Gets the custom CSS class name to assign to the popup.
   *
   * @return The custom CSS class name to assign to the popup.
   */
  public String getClassName() {
    return className;
  }

  /**
   * Sets the custom CSS class name to assign to the popup.
   *
   * @param className The custom CSS class name to assign to the popup.
   */
  public void setClassName(String className) {
    this.className = className;
  }
}
