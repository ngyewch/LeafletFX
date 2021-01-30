package com.github.ngyewch.leafletfx;

/**
 * Tile layer.
 */
public interface TileLayer
    extends GridLayer {

  /**
   * Updates the layer's URL template and redraws it.
   *
   * @param url URL template.
   */
  void setUrl(String url);

  /**
   * Updates the layer's URL template and redraws it (unless noRedraw is set to true).
   * If the URL does not change, the layer will not be redrawn unless the noRedraw parameter is set to false.
   *
   * @param url      URL template.
   * @param noRedraw true to skip redraw.
   */
  void setUrl(String url, boolean noRedraw);
}
