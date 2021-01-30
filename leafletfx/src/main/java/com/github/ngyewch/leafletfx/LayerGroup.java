package com.github.ngyewch.leafletfx;

/**
 * Layer group. Used to group several layers and handle them as one.
 */
public interface LayerGroup
    extends Layer {

  /**
   * Adds the given layer to the group.
   *
   * @param layer Layer.
   */
  void addLayer(Layer layer);

  /**
   * Removes the given layer from the group.
   *
   * @param layer Layer.
   */
  void removeLayer(Layer layer);

  /**
   * Returns true if the given layer is currently added to the group.
   *
   * @param layer Layer.
   * @return true if the given layer is currently added to the group.
   */
  boolean hasLayer(Layer layer);

  /**
   * Removes all the layers from the group.
   */
  void clearLayers();

  /**
   * Calls setZIndex on every layer contained in this group, passing the z-index.
   *
   * @param zIndex z-index.
   */
  void setZIndex(Number zIndex);
}
