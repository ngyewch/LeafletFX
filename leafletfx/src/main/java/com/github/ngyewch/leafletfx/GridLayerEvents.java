package com.github.ngyewch.leafletfx;

/**
 * GridLayer events.
 */
public class GridLayerEvents
    extends LayerEvents {

  /**
   * Fired when the grid layer starts loading tiles.
   */
  public static final String LOADING = "loading";

  /**
   * Fired when a tile is removed (e.g. when a tile goes off the screen).
   */
  public static final String TILE_UNLOAD = "tileunload";

  /**
   * Fired when a tile is requested and starts loading.
   */
  public static final String TILE_LOAD_START = "tileloadstart";

  /**
   * Fired when there is an error loading a tile.
   */
  public static final String TILE_ERROR = "tileerror";

  /**
   * Fired when a tile loads.
   */
  public static final String TILE_LOAD = "tileload";

  /**
   * Fired when the grid layer loaded all visible tiles.
   */
  public static final String LOAD = "load";
}
