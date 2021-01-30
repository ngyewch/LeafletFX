package com.github.ngyewch.leafletfx;

/**
 * Tooltip support methods.
 */
public interface TooltipSupport {

  /**
   * Binds a tooltip to the layer with the passed content and sets up the necessary event listeners.
   *
   * @param content        Text content.
   * @param tooltipOptions Tooltip options.
   */
  void bindTooltip(String content, TooltipOptions tooltipOptions);

  /**
   * Removes the tooltip previously bound with bindTooltip.
   */
  void unbindTooltip();

  /**
   * Opens the bound tooltip at the specified latlng or at the default tooltip anchor if no latlng is passed.
   *
   * @param latLng Geographic location.
   */
  void openTooltip(LatLng latLng);

  /**
   * Closes the tooltip bound to this layer if it is open.
   */
  void closeTooltip();

  /**
   * Opens or closes the tooltip bound to this layer depending on its current state.
   */
  void toggleTooltip();

  /**
   * Returns true if the tooltip bound to this layer is currently open.
   *
   * @return true if the tooltip bound to this layer is currently open.
   */
  boolean isTooltipOpen();

  /**
   * Sets the content of the tooltip bound to this layer.
   *
   * @param content Text content.
   */
  void setTooltipContent(String content);
}
