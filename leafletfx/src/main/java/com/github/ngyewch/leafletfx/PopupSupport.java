package com.github.ngyewch.leafletfx;

/**
 * Popup support methods.
 */
public interface PopupSupport {

  /**
   * Binds a popup to the layer with the passed content and sets up the necessary event listeners.
   *
   * @param content      Text content.
   * @param popupOptions Popup options.
   */
  void bindPopup(String content, PopupOptions popupOptions);

  /**
   * Removes the popup previously bound with bindPopup.
   */
  void unbindPopup();

  /**
   * Opens the bound popup at the specified latlng or at the default popup anchor if no latlng is passed.
   *
   * @param latLng Geographic location.
   */
  void openPopup(LatLng latLng);

  /**
   * Closes the popup bound to this layer if it is open.
   */
  void closePopup();

  /**
   * Opens or closes the popup bound to this layer depending on its current state.
   */
  void togglePopup();

  /**
   * Returns true if the popup bound to this layer is currently open.
   *
   * @return true if the popup bound to this layer is currently open.
   */
  boolean isPopupOpen();

  /**
   * Sets the content of the popup bound to this layer.
   *
   * @param content Text content.
   */
  void setPopupContent(String content);
}
