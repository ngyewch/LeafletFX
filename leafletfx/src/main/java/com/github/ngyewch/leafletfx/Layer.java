package com.github.ngyewch.leafletfx;

/**
 * Layer.
 */
public interface Layer
    extends Evented, PopupSupport, TooltipSupport {

  /**
   * Adds the layer to the given map.
   *
   * @param map Map.
   */
  void addTo(LeafletMap map);

  /**
   * Adds the layer to the given layer group.
   *
   * @param layerGroup Layer group.
   */
  void addTo(LayerGroup layerGroup);

  /**
   * Removes the layer from the map it is currently active on.
   */
  void remove();

  /**
   * Removes the layer from the given map.
   *
   * @param map Map.
   */
  void removeFrom(LeafletMap map);

  /**
   * Removes the layer from the given layer group.
   *
   * @param layerGroup Layer group.
   */
  void removeFrom(LayerGroup layerGroup);
}
