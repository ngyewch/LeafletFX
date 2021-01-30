package com.github.ngyewch.leafletfx;

public class InteractiveLayerOptions
    extends LayerOptions {

  private Boolean interactive;
  private Boolean bubblingMouseEvents;

  /**
   * Gets the interactive flag.
   *
   * @return The interactive flag.
   */
  public Boolean getInteractive() {
    return interactive;
  }

  /**
   * Sets the interactive flag.
   *
   * @param interactive The interactive flag.
   */
  public void setInteractive(Boolean interactive) {
    this.interactive = interactive;
  }

  /**
   * Gets the bubbling mouse events flag.
   *
   * @return The bubbling mouse events flag.
   */
  public Boolean getBubblingMouseEvents() {
    return bubblingMouseEvents;
  }

  /**
   * Sets the bubbling mouse events flag.
   *
   * @param bubblingMouseEvents The bubbling mouse events flag.
   */
  public void setBubblingMouseEvents(Boolean bubblingMouseEvents) {
    this.bubblingMouseEvents = bubblingMouseEvents;
  }
}
