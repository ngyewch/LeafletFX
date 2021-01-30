package com.github.ngyewch.leafletfx;

/**
 * Path layer.
 */
public interface Path
    extends InteractiveLayer {

  /**
   * Redraws the layer. Sometimes useful after you changed the coordinates that the path uses.
   */
  void redraw();

  /**
   * Changes the appearance of a Path based on the options in the Path options object.
   *
   * @param pathOptions Path options.
   */
  void setStyle(PathOptions pathOptions);

  /**
   * Brings the layer to the top of all path layers.
   */
  void bringToFront();

  /**
   * Brings the layer to the bottom of all path layers.
   */
  void bringToBack();
}
