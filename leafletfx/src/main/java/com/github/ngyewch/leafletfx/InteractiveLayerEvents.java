package com.github.ngyewch.leafletfx;

/**
 * Interactive layer events.
 */
public class InteractiveLayerEvents
    extends LayerEvents {

  /**
   * Fired when the user clicks (or taps) the layer.
   */
  public static final String CLICK = "click";

  /**
   * Fired when the user double-clicks (or double-taps) the layer.
   */
  public static final String DOUBLE_CLICK = "dblclick";

  /**
   * Fired when the user pushes the mouse button on the layer.
   */
  public static final String MOUSE_DOWN = "mousedown";

  /**
   * Fired when the user releases the mouse button pushed on the layer.
   */
  public static final String MOUSE_UP = "mouseup";

  /**
   * Fired when the mouse enters the layer.
   */
  public static final String MOUSE_OVER = "mouseover";

  /**
   * Fired when the mouse leaves the layer.
   */
  public static final String MOUSE_OUT = "mouseout";

  /**
   * Fired when the user right-clicks on the layer, prevents default browser context menu from showing if there are
   * listeners on this event. Also fired on mobile when the user holds a single touch for a second (also called long
   * press).
   */
  public static final String CONTEXT_MENU = "contextmenu";
}
