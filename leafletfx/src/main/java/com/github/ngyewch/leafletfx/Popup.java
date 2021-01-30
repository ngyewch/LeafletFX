package com.github.ngyewch.leafletfx;

/**
 * Popup layer.
 */
public interface Popup
    extends Layer {

  /**
   * Sets the geographical point where the popup will open.
   *
   * @param latLng Geographical point where the popup will open.
   */
  void setLatLng(LatLng latLng);

  /**
   * Sets the text content of the popup.
   *
   * @param content Text content of the popup.
   */
  void setContent(String content);

  /**
   * Updates the popup content, layout and position.
   * Useful for updating the popup after something inside changed, e.g. image loaded.
   */
  void update();

  /**
   * Returns true when the popup is visible on the map.
   *
   * @return true when the popup is visible on the map.
   */
  boolean isOpen();

  /**
   * Brings this popup in front of other popups (in the same map pane).
   */
  void bringToFront();

  /**
   * Brings this popup to the back of other popups (in the same map pane).
   */
  void bringToBack();

  /**
   * Adds the popup to the map and closes the previous one.
   *
   * @param map Map to add the popup to.
   */
  void openOn(LeafletMap map);
}
