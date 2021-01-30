package com.github.ngyewch.leafletfx;

/**
 * Layer options.
 */
public class LayerOptions {

  private String pane;
  private String attribution;

  /**
   * Gets the pane that the layer will be placed on.
   *
   * @return The pane that the layer will be placed on.
   */
  public String getPane() {
    return pane;
  }

  /**
   * Sets the pane that the layer will be placed on.
   *
   * @param pane The pane that the layer will be placed on.
   */
  public void setPane(String pane) {
    this.pane = pane;
  }

  /**
   * Gets the string to be shown in the attribution control.
   *
   * @return The string to be shown in the attribution control.
   */
  public String getAttribution() {
    return attribution;
  }

  /**
   * Sets the string to be shown in the attribution control.
   *
   * @param attribution The string to be shown in the attribution control.
   */
  public void setAttribution(String attribution) {
    this.attribution = attribution;
  }
}
