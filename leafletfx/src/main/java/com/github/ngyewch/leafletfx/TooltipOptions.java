package com.github.ngyewch.leafletfx;

public class TooltipOptions
    extends DivOverlayOptions {

  private String direction;
  private Boolean permanent;
  private Boolean sticky;
  private Boolean interactive;
  private Number opacity;

  /**
   * Gets the tooltip direction.
   * Direction where to open the tooltip. Possible values are: right, left, top, bottom, center, auto.
   * auto will dynamically switch between right and left according to the tooltip position on the map.
   *
   * @return Tooltip direction.
   */
  public String getDirection() {
    return direction;
  }

  /**
   * Sets the tooltip direction.
   * Direction where to open the tooltip. Possible values are: right, left, top, bottom, center, auto.
   * auto will dynamically switch between right and left according to the tooltip position on the map.
   *
   * @param direction Tooltip direction.
   */
  public void setDirection(String direction) {
    this.direction = direction;
  }

  /**
   * Gets the permanent flag.
   *
   * @return true to open the tooltip permanently, false only on mouseover.
   */
  public Boolean getPermanent() {
    return permanent;
  }

  /**
   * Sets the permanent flag.
   *
   * @param permanent true to open the tooltip permanently, false only on mouseover.
   */
  public void setPermanent(Boolean permanent) {
    this.permanent = permanent;
  }

  /**
   * Gets the sticky flag.
   *
   * @return If true, the tooltip will follow the mouse instead of being fixed at the feature center.
   */
  public Boolean getSticky() {
    return sticky;
  }

  /**
   * Sets the sticky flag.
   *
   * @param sticky If true, the tooltip will follow the mouse instead of being fixed at the feature center.
   */
  public void setSticky(Boolean sticky) {
    this.sticky = sticky;
  }

  /**
   * Gets the interactive flag.
   *
   * @return Interactive flag.
   */
  public Boolean getInteractive() {
    return interactive;
  }

  /**
   * Sets the interactive flag.
   *
   * @param interactive Interactive flag.
   */
  public void setInteractive(Boolean interactive) {
    this.interactive = interactive;
  }

  /**
   * Gets the tooltip container opacity.
   *
   * @return Tooltip container opacity.
   */
  public Number getOpacity() {
    return opacity;
  }

  /**
   * Sets the tooltip container opacity.
   *
   * @param opacity Tooltip container opacity.
   */
  public void setOpacity(Number opacity) {
    this.opacity = opacity;
  }
}
