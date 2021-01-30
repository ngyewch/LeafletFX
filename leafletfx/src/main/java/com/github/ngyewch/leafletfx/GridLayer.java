package com.github.ngyewch.leafletfx;

/**
 * Generic class for handling a tiled grid of HTML elements.
 */
public interface GridLayer
    extends Layer {

  /**
   * Brings the tile layer to the top of all tile layers.
   */
  void bringToFront();

  /**
   * Brings the tile layer to the bottom of all tile layers.
   */
  void bringToBack();

  /**
   * Changes the opacity of the grid layer.
   *
   * @param opacity Opacity (0 to 1).
   */
  void setOpacity(Number opacity);

  /**
   * Changes the zIndex of the grid layer.
   *
   * @param zIndex z-index.
   */
  void setZIndex(Number zIndex);

  /**
   * Returns true if any tile in the grid layer has not finished loading.
   *
   * @return true if any tile in the grid layer has not finished loading.
   */
  boolean isLoading();

  /**
   * Causes the layer to clear all the tiles and request them again.
   */
  void redraw();
}
