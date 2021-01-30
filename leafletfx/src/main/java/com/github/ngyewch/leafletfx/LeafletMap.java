package com.github.ngyewch.leafletfx;

/**
 * Map.
 */
public interface LeafletMap
    extends Evented {

  /**
   * Gets the box zoom handler.
   *
   * @return Box zoom handler.
   */
  Handler getBoxZoom();

  /**
   * Gets the double click zoom handler.
   *
   * @return Double click zoom hander.
   */
  Handler getDoubleClickZoom();

  /**
   * Gets the dragging handler.
   *
   * @return Dragging handler.
   */
  Handler getDragging();

  /**
   * Gets the keyboard handler.
   *
   * @return Keyboard handler.
   */
  Handler getKeyboard();

  /**
   * Gets the scroll wheel zoom handler.
   *
   * @return Scroll wheel zoom handler.
   */
  Handler getScrollWheelZoom();

  /**
   * Gets the tap handler.
   *
   * @return Tap handler.
   */
  Handler getTap();

  /**
   * Gets the touch zoom handler.
   *
   * @return Touch zoom handler.
   */
  Handler getTouchZoom();
}
