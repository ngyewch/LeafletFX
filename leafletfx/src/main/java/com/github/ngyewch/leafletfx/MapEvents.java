package com.github.ngyewch.leafletfx;

/**
 * Map events.
 */
public class MapEvents {

  /**
   * Fired when the base layer is changed through the layers control.
   */
  public static final String BASE_LAYER_CHANGE = "baselayerchange";

  /**
   * Fired when an overlay is selected through the layers control.
   */
  public static final String OVERLAY_ADD = "overlayadd";

  /**
   * Fired when an overlay is deselected through the layers control.
   */
  public static final String OVERLAY_REMOVE = "overlayremove";

  /**
   * Fired when a new layer is added to the map.
   */
  public static final String LAYER_ADD = "layeradd";

  /**
   * Fired when some layer is removed from the map.
   */
  public static final String LAYER_REMOVE = "layerremove";

  /**
   * Fired when the number of zoomlevels on the map is changed due to adding or removing a layer.
   */
  public static final String ZOOM_LEVELS_CHANGE = "zoomlevelschange";

  /**
   * Fired when the map is resized.
   */
  public static final String RESIZE = "resize";

  /**
   * Fired when the map is destroyed with remove method.
   */
  public static final String UNLOAD = "unload";

  /**
   * Fired when the map needs to redraw its content (this usually happens on map zoom or load).
   */
  public static final String VIEW_RESET = "viewreset";

  /**
   * Fired when the map is initialized (when its center and zoom are set for the first time).
   */
  public static final String LOAD = "load";

  /**
   * Fired when the map zoom is about to change (e.g. before zoom animation).
   */
  public static final String ZOOM_START = "zoomstart";

  /**
   * Fired when the view of the map starts changing (e.g. user starts dragging the map).
   */
  public static final String MOVE_START = "movestart";

  /**
   * Fired repeatedly during any change in zoom level, including zoom and fly animations.
   */
  public static final String ZOOM = "zoom";

  /**
   * Fired repeatedly during any movement of the map, including pan and fly animations.
   */
  public static final String MOVE = "move";

  /**
   * Fired when the map has changed, after any animations.
   */
  public static final String ZOOM_END = "zoomend";

  /**
   * Fired when the center of the map stops changing (e.g. user stopped dragging the map).
   */
  public static final String MOVE_END = "moveend";

  /**
   * Fired when a popup is opened in the map.
   */
  public static final String POPUP_OPEN = "popupopen";

  /**
   * Fired when a popup in the map is closed.
   */
  public static final String POPUP_CLOSE = "popupclose";

  /**
   * Fired when the map starts autopanning when opening a popup.
   */
  public static final String AUTO_PAN_START = "autopanstart";

  /**
   * Fired when a tooltip is opened in the map.
   */
  public static final String TOOLTIP_OPEN = "tooltipopen";

  /**
   * Fired when a tooltip in the map is closed.
   */
  public static final String TOOLTIP_CLOSE = "tooltipclose";

  /**
   * Fired when geolocation (using the locate method) failed.
   */
  public static final String LOCATION_ERROR = "locationerror";

  /**
   * Fired when geolocation (using the locate method) went successfully.
   */
  public static final String LOCATION_FOUND = "locationfound";

  /**
   * Fired when the user clicks (or taps) the map.
   */
  public static final String CLICK = "click";

  /**
   * Fired when the user double-clicks (or double-taps) the map.
   */
  public static final String DOUBLE_CLICK = "dblclick";

  /**
   * Fired when the user pushes the mouse button on the map.
   */
  public static final String MOUSE_DOWN = "mousedown";

  /**
   * Fired when the user releases the mouse button on the map.
   */
  public static final String MOUSE_UP = "mouseup";

  /**
   * Fired when the mouse enters the map.
   */
  public static final String MOUSE_OVER = "mouseover";

  /**
   * Fired when the mouse leaves the map.
   */
  public static final String MOUSE_OUT = "mouseout";

  /**
   * Fired while the mouse moves over the map.
   */
  public static final String MOUSE_MOVE = "mousemove";

  /**
   * Fired when the user pushes the right mouse button on the map, prevents default browser context menu from showing if there are listeners on this event. Also fired on mobile when the user holds a single touch for a second (also called long press).
   */
  public static final String CONTEXT_MENU = "contextmenu";

  /**
   * Fired when the user presses a key from the keyboard that produces a character value while the map is focused.
   */
  public static final String KEY_PRESS = "keypress";

  /**
   * Fired when the user presses a key from the keyboard while the map is focused. Unlike the keypress event, the keydown event is fired for keys that produce a character value and for keys that do not produce a character value.
   */
  public static final String KEY_DOWN = "keydown";

  /**
   * Fired when the user releases a key from the keyboard while the map is focused.
   */
  public static final String KEY_UP = "keyup";

  /**
   * Fired before mouse click on the map (sometimes useful when you want something to happen on click before any existing click handlers start running).
   */
  public static final String PRE_CLICK = "preclick";

  /**
   * Fired at least once per zoom animation. For continuous zoom, like pinch zooming, fired once per frame during zoom.
   */
  public static final String ZOOM_ANIM = "zoomanim";
}