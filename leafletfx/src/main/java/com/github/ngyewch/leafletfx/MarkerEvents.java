package com.github.ngyewch.leafletfx;

/**
 * Marker events.
 */
public class MarkerEvents
    extends InteractiveLayerEvents {

  /**
   * Fired when the marker is moved via setLatLng or by dragging. Old and new coordinates are included in event arguments as oldLatLng, latlng.
   */
  public static final String MOVE = "move";

  /**
   * Fired when the user starts dragging the marker.
   */
  public static final String DRAG_START = "dragstart";

  /**
   * Fired when the marker starts moving (because of dragging).
   */
  public static final String MOVE_START = "movestart";

  /**
   * Fired repeatedly while the user drags the marker.
   */
  public static final String DRAG = "drag";

  /**
   * Fired when the user stops dragging the marker.
   */
  public static final String DRAG_END = "dragend";

  /**
   * Fired when the marker stops moving (because of dragging).
   */
  public static final String MOVE_END = "moveend";
}
