package com.github.ngyewch.leafletfx;

/**
 * Map options.
 */
public class MapOptions {

  private Boolean preferCanvas;
  private Boolean attributionControl;
  private Boolean zoomControl;
  private Boolean closePopupOnClick;
  private Number zoomSnap;
  private Number zoomDelta;
  private Boolean trackResize;
  private Boolean boxZoom;
  private Boolean doubleClickZoom;
  private Boolean dragging;
  // TODO CRS crs
  private LatLng center;
  private Number zoom;
  private Number minZoom;
  private Number maxZoom;
  // TODO Layer[] layers
  // TODO LatLngBounds maxBounds
  // TODO Renderer renderer
  private Boolean zoomAnimation;
  private Number zoomAnimationThreshold;
  private Boolean fadeAnimation;
  private Boolean markerZoomAnimation;
  private Number transform3DLimit;
  private Boolean inertia;
  private Number inertiaDeceleration;
  private Number inertiaMaxSpeed;
  private Number easeLinearity;
  private Boolean worldCopyJump;
  private Number maxBoundsViscosity;
  private Boolean keyboard;
  private Number keyboardPanDelta;
  private String scrollWheelZoom;
  private Number wheelDebounceTime;
  private Number wheelPxPerZoomLevel;
  private Boolean tap;
  private Number tapTolerance;
  private String touchZoom;
  private Boolean boundAtZoomLimits;

  /**
   * Gets whether Paths should be rendered on a Canvas renderer. By default, all Paths are rendered in a SVG renderer.
   *
   * @return true if Paths should be rendered on a Canvas renderer.
   */
  public Boolean getPreferCanvas() {
    return preferCanvas;
  }

  /**
   * Sets whether Paths should be rendered on a Canvas renderer. By default, all Paths are rendered in a SVG renderer.
   *
   * @param preferCanvas true if Paths should be rendered on a Canvas renderer.
   */
  public void setPreferCanvas(Boolean preferCanvas) {
    this.preferCanvas = preferCanvas;
  }

  /**
   * Gets whether a attribution control is added to the map by default.
   *
   * @return true if a attribution control is added to the map by default.
   */
  public Boolean getAttributionControl() {
    return attributionControl;
  }

  /**
   * Sets whether a attribution control is added to the map by default.
   *
   * @param attributionControl true if a attribution control is added to the map by default.
   */
  public void setAttributionControl(Boolean attributionControl) {
    this.attributionControl = attributionControl;
  }

  /**
   * Gets whether a zoom control is added to the map by default.
   *
   * @return true if a zoom control is added to the map by default.
   */
  public Boolean getZoomControl() {
    return zoomControl;
  }

  /**
   * Sets whether a zoom control is added to the map by default.
   *
   * @param zoomControl true if a zoom control is added to the map by default.
   */
  public void setZoomControl(Boolean zoomControl) {
    this.zoomControl = zoomControl;
  }

  /**
   * Gets whether popups close when the user clicks the maps.
   *
   * @return true if popups close when the user clicks the map.
   */
  public Boolean getClosePopupOnClick() {
    return closePopupOnClick;
  }

  /**
   * Sets whether popups close when the user clicks the maps.
   *
   * @param closePopupOnClick true if popups close when the user clicks the map.
   */
  public void setClosePopupOnClick(Boolean closePopupOnClick) {
    this.closePopupOnClick = closePopupOnClick;
  }

  /**
   * Gets the zoom snap. The map's zoom level to always be a multiple of this.
   *
   * @return The zoom snap.
   */
  public Number getZoomSnap() {
    return zoomSnap;
  }

  /**
   * Sets the zoom snap. The map's zoom level to always be a multiple of this.
   *
   * @param zoomSnap The zoom snap.
   */
  public void setZoomSnap(Number zoomSnap) {
    this.zoomSnap = zoomSnap;
  }

  /**
   * Gets the zoom delta. Controls how much the map's zoom level will change after a zoomIn(), zoomOut(), pressing + or - on the keyboard, or using the zoom controls. Values smaller than 1 (e.g. 0.5) allow for greater granularity.
   *
   * @return The zoom delta.
   */
  public Number getZoomDelta() {
    return zoomDelta;
  }

  /**
   * Sets the zoom delta. Controls how much the map's zoom level will change after a zoomIn(), zoomOut(), pressing + or - on the keyboard, or using the zoom controls. Values smaller than 1 (e.g. 0.5) allow for greater granularity.
   *
   * @param zoomDelta The zoom delta.
   */
  public void setZoomDelta(Number zoomDelta) {
    this.zoomDelta = zoomDelta;
  }

  /**
   * Gets whether the map automatically handles browser window resize to update itself.
   *
   * @return true if the map automatically handles browser window resize to update itself.
   */
  public Boolean getTrackResize() {
    return trackResize;
  }

  /**
   * Sets whether the map automatically handles browser window resize to update itself.
   *
   * @param trackResize true if the map automatically handles browser window resize to update itself.
   */
  public void setTrackResize(Boolean trackResize) {
    this.trackResize = trackResize;
  }

  /**
   * Gets whether the map can be zoomed to a rectangular area specified by dragging the mouse while pressing the shift key.
   *
   * @return true if the map can be zoomed to a rectangular area specified by dragging the mouse while pressing the shift key.
   */
  public Boolean getBoxZoom() {
    return boxZoom;
  }

  /**
   * Sets whether the map can be zoomed to a rectangular area specified by dragging the mouse while pressing the shift key.
   *
   * @param boxZoom true if the map can be zoomed to a rectangular area specified by dragging the mouse while pressing the shift key.
   */
  public void setBoxZoom(Boolean boxZoom) {
    this.boxZoom = boxZoom;
  }

  /**
   * Gets whether the map can be zoomed in by double clicking on it and zoomed out by double clicking while holding shift. If passed 'center', double-click zoom will zoom to the center of the view regardless of where the mouse was.
   *
   * @return true if the map can be zoomed in by double clicking on it and zoomed out by double clicking while holding shift.
   */
  public Boolean getDoubleClickZoom() {
    return doubleClickZoom;
  }

  /**
   * Sets whether the map can be zoomed in by double clicking on it and zoomed out by double clicking while holding shift. If passed 'center', double-click zoom will zoom to the center of the view regardless of where the mouse was.
   *
   * @param doubleClickZoom true if the map can be zoomed in by double clicking on it and zoomed out by double clicking while holding shift.
   */
  public void setDoubleClickZoom(Boolean doubleClickZoom) {
    this.doubleClickZoom = doubleClickZoom;
  }

  /**
   * Gets whether the map be draggable with mouse/touch or not.
   *
   * @return true if the map be draggable with mouse/touch or not.
   */
  public Boolean getDragging() {
    return dragging;
  }

  /**
   * Sets whether the map be draggable with mouse/touch or not.
   *
   * @param dragging true if the map be draggable with mouse/touch or not.
   */
  public void setDragging(Boolean dragging) {
    this.dragging = dragging;
  }

  /**
   * Gets the initial geographic center of the map.
   *
   * @return The initial geographic center of the map.
   */
  public LatLng getCenter() {
    return center;
  }

  /**
   * Sets the initial geographic center of the map.
   *
   * @param center The initial geographic center of the map.
   */
  public void setCenter(LatLng center) {
    this.center = center;
  }

  /**
   * Gets the initial map zoom level.
   *
   * @return The initial map zoom level.
   */
  public Number getZoom() {
    return zoom;
  }

  /**
   * Sets the initial map zoom level.
   *
   * @param zoom The initial map zoom level.
   */
  public void setZoom(Number zoom) {
    this.zoom = zoom;
  }

  /**
   * Gets the minimum zoom level of the map. If not specified and at least one GridLayer or TileLayer is in the map, the lowest of their minZoom options will be used instead.
   *
   * @return The minimum zoom level of the map.
   */
  public Number getMinZoom() {
    return minZoom;
  }

  /**
   * Sets the minimum zoom level of the map. If not specified and at least one GridLayer or TileLayer is in the map, the lowest of their minZoom options will be used instead.
   *
   * @param minZoom The minimum zoom level of the map.
   */
  public void setMinZoom(Number minZoom) {
    this.minZoom = minZoom;
  }

  /**
   * Gets the maximum zoom level of the map. If not specified and at least one GridLayer or TileLayer is in the map, the highest of their maxZoom options will be used instead.
   *
   * @return The maximum zoom level of the map.
   */
  public Number getMaxZoom() {
    return maxZoom;
  }

  /**
   * Sets the maximum zoom level of the map. If not specified and at least one GridLayer or TileLayer is in the map, the highest of their maxZoom options will be used instead.
   *
   * @param maxZoom The maximum zoom level of the map.
   */
  public void setMaxZoom(Number maxZoom) {
    this.maxZoom = maxZoom;
  }

  /**
   * Gets whether the map zoom animation is enabled. By default it's enabled in all browsers that support CSS3 Transitions except Android.
   *
   * @return true if the map zoom animation is enabled.
   */
  public Boolean getZoomAnimation() {
    return zoomAnimation;
  }

  /**
   * Sets whether the map zoom animation is enabled. By default it's enabled in all browsers that support CSS3 Transitions except Android.
   *
   * @param zoomAnimation true if the map zoom animation is enabled.
   */
  public void setZoomAnimation(Boolean zoomAnimation) {
    this.zoomAnimation = zoomAnimation;
  }

  /**
   * Gets the zoom animation threshold. Won't animate zoom if the zoom difference exceeds this value.
   *
   * @return The zoom animation threshold.
   */
  public Number getZoomAnimationThreshold() {
    return zoomAnimationThreshold;
  }

  /**
   * Sets the zoom animation threshold. Won't animate zoom if the zoom difference exceeds this value.
   *
   * @param zoomAnimationThreshold The zoom animation threshold.
   */
  public void setZoomAnimationThreshold(Number zoomAnimationThreshold) {
    this.zoomAnimationThreshold = zoomAnimationThreshold;
  }

  /**
   * Gets whether the tile fade animation is enabled. By default it's enabled in all browsers that support CSS3 Transitions except Android.
   *
   * @return true if the tile fade animation is enabled.
   */
  public Boolean getFadeAnimation() {
    return fadeAnimation;
  }

  /**
   * Sets whether the tile fade animation is enabled. By default it's enabled in all browsers that support CSS3 Transitions except Android.
   *
   * @param fadeAnimation true if the tile fade animation is enabled.
   */
  public void setFadeAnimation(Boolean fadeAnimation) {
    this.fadeAnimation = fadeAnimation;
  }

  /**
   * Gets whether markers animate their zoom with the zoom animation, if disabled they will disappear for the length of the animation. By default it's enabled in all browsers that support CSS3 Transitions except Android.
   *
   * @return true if markers animate their zoom with the zoom animation.
   */
  public Boolean getMarkerZoomAnimation() {
    return markerZoomAnimation;
  }

  /**
   * Sets whether markers animate their zoom with the zoom animation, if disabled they will disappear for the length of the animation. By default it's enabled in all browsers that support CSS3 Transitions except Android.
   *
   * @param markerZoomAnimation true if markers animate their zoom with the zoom animation.
   */
  public void setMarkerZoomAnimation(Boolean markerZoomAnimation) {
    this.markerZoomAnimation = markerZoomAnimation;
  }

  /**
   * Gets the maximum size of a CSS translation transform. The default value should not be changed unless a web browser positions layers in the wrong place after doing a large panBy.
   *
   * @return The maximum size of a CSS translation transform.
   */
  public Number getTransform3DLimit() {
    return transform3DLimit;
  }

  /**
   * Sets the maximum size of a CSS translation transform. The default value should not be changed unless a web browser positions layers in the wrong place after doing a large panBy.
   *
   * @param transform3DLimit The maximum size of a CSS translation transform.
   */
  public void setTransform3DLimit(Number transform3DLimit) {
    this.transform3DLimit = transform3DLimit;
  }

  /**
   * Gets whether panning of the map will have an inertia effect.
   *
   * @return true if panning of the map will have an inertia effect.
   */
  public Boolean getInertia() {
    return inertia;
  }

  /**
   * Sets whether panning of the map will have an inertia effect.
   *
   * @param inertia true if panning of the map will have an inertia effect.
   */
  public void setInertia(Boolean inertia) {
    this.inertia = inertia;
  }

  /**
   * Gets the rate with which the inertial movement slows down, in pixels/second².
   *
   * @return The rate with which the inertial movement slows down, in pixels/second².
   */
  public Number getInertiaDeceleration() {
    return inertiaDeceleration;
  }

  /**
   * Sets the rate with which the inertial movement slows down, in pixels/second².
   *
   * @param inertiaDeceleration The rate with which the inertial movement slows down, in pixels/second².
   */
  public void setInertiaDeceleration(Number inertiaDeceleration) {
    this.inertiaDeceleration = inertiaDeceleration;
  }

  /**
   * Gets the max speed of the inertial movement, in pixels/second.
   *
   * @return The max speed of the inertial movement, in pixels/second.
   */
  public Number getInertiaMaxSpeed() {
    return inertiaMaxSpeed;
  }

  /**
   * Sets the max speed of the inertial movement, in pixels/second.
   *
   * @param inertiaMaxSpeed The max speed of the inertial movement, in pixels/second.
   */
  public void setInertiaMaxSpeed(Number inertiaMaxSpeed) {
    this.inertiaMaxSpeed = inertiaMaxSpeed;
  }

  public Number getEaseLinearity() {
    return easeLinearity;
  }

  public void setEaseLinearity(Number easeLinearity) {
    this.easeLinearity = easeLinearity;
  }

  /**
   * Gets the world copy jump flag.
   *
   * @return The world copy jump flag.
   */
  public Boolean getWorldCopyJump() {
    return worldCopyJump;
  }

  /**
   * Sets the world copy jump flag.
   *
   * @param worldCopyJump The world copy jump flag.
   */
  public void setWorldCopyJump(Boolean worldCopyJump) {
    this.worldCopyJump = worldCopyJump;
  }

  /**
   * Gets the max bounds viscosity. If maxBounds is set, this option will control how solid the bounds are when dragging the map around. The default value of 0.0 allows the user to drag outside the bounds at normal speed, higher values will slow down map dragging outside bounds, and 1.0 makes the bounds fully solid, preventing the user from dragging outside the bounds.
   *
   * @return The max bounds viscosity.
   */
  public Number getMaxBoundsViscosity() {
    return maxBoundsViscosity;
  }

  /**
   * Sets the max bounds viscosity. If maxBounds is set, this option will control how solid the bounds are when dragging the map around. The default value of 0.0 allows the user to drag outside the bounds at normal speed, higher values will slow down map dragging outside bounds, and 1.0 makes the bounds fully solid, preventing the user from dragging outside the bounds.
   *
   * @param maxBoundsViscosity The max bounds viscosity.
   */
  public void setMaxBoundsViscosity(Number maxBoundsViscosity) {
    this.maxBoundsViscosity = maxBoundsViscosity;
  }

  /**
   * Gets whether the map is focusable and allows users to navigate the map with keyboard arrows and +/- keys.
   *
   * @return true if the map is focusable and allows users to navigate the map with keyboard arrows and +/- keys.
   */
  public Boolean getKeyboard() {
    return keyboard;
  }

  /**
   * Sets whether the map is focusable and allows users to navigate the map with keyboard arrows and +/- keys.
   *
   * @param keyboard true if the map is focusable and allows users to navigate the map with keyboard arrows and +/- keys.
   */
  public void setKeyboard(Boolean keyboard) {
    this.keyboard = keyboard;
  }

  /**
   * Gets the amount of pixels to pan when pressing an arrow key.
   *
   * @return Amount of pixels to pan when pressing an arrow key.
   */
  public Number getKeyboardPanDelta() {
    return keyboardPanDelta;
  }

  /**
   * Sets the amount of pixels to pan when pressing an arrow key.
   *
   * @param keyboardPanDelta Amount of pixels to pan when pressing an arrow key.
   */
  public void setKeyboardPanDelta(Number keyboardPanDelta) {
    this.keyboardPanDelta = keyboardPanDelta;
  }

  /**
   * Gets whether the map can be zoomed by using the mouse wheel. If passed 'center', it will zoom to the center of the view regardless of where the mouse was.
   *
   * @return true if the map can be zoomed by using the mouse wheel.
   */
  public String getScrollWheelZoom() {
    return scrollWheelZoom;
  }

  /**
   * Sets whether the map can be zoomed by using the mouse wheel. If passed 'center', it will zoom to the center of the view regardless of where the mouse was.
   *
   * @param scrollWheelZoom true if the map can be zoomed by using the mouse wheel.
   */
  public void setScrollWheelZoom(String scrollWheelZoom) {
    this.scrollWheelZoom = scrollWheelZoom;
  }

  /**
   * Gets the wheel debounce time (ms).
   *
   * @return The wheel debounce time (ms).
   */
  public Number getWheelDebounceTime() {
    return wheelDebounceTime;
  }

  /**
   * Sets the wheel debounce time (ms).
   *
   * @param wheelDebounceTime The wheel debounce time (ms).
   */
  public void setWheelDebounceTime(Number wheelDebounceTime) {
    this.wheelDebounceTime = wheelDebounceTime;
  }

  /**
   * Gets the number of scroll pixels that mean a change of one zoom level.
   *
   * @return The number of scroll pixels that mean a change of one zoom level.
   */
  public Number getWheelPxPerZoomLevel() {
    return wheelPxPerZoomLevel;
  }

  /**
   * Sets the number of scroll pixels that mean a change of one zoom level.
   *
   * @param wheelPxPerZoomLevel The number of scroll pixels that mean a change of one zoom level.
   */
  public void setWheelPxPerZoomLevel(Number wheelPxPerZoomLevel) {
    this.wheelPxPerZoomLevel = wheelPxPerZoomLevel;
  }

  /**
   * Gets whether mobile hacks for supporting instant taps (fixing 200ms click delay on iOS/Android) and touch holds (fired as contextmenu events) are enabled.
   *
   * @return true if mobile hacks for supporting instant taps (fixing 200ms click delay on iOS/Android) and touch holds (fired as contextmenu events) are enabled.
   */
  public Boolean getTap() {
    return tap;
  }

  /**
   * Sets whether mobile hacks for supporting instant taps (fixing 200ms click delay on iOS/Android) and touch holds (fired as contextmenu events) are enabled.
   *
   * @param tap true if mobile hacks for supporting instant taps (fixing 200ms click delay on iOS/Android) and touch holds (fired as contextmenu events) are enabled.
   */
  public void setTap(Boolean tap) {
    this.tap = tap;
  }

  /**
   * Gets the max number of pixels a user can shift his finger during touch for it to be considered a valid tap.
   *
   * @return The max number of pixels a user can shift his finger during touch for it to be considered a valid tap.
   */
  public Number getTapTolerance() {
    return tapTolerance;
  }

  /**
   * Sets the max number of pixels a user can shift his finger during touch for it to be considered a valid tap.
   *
   * @param tapTolerance The max number of pixels a user can shift his finger during touch for it to be considered a valid tap.
   */
  public void setTapTolerance(Number tapTolerance) {
    this.tapTolerance = tapTolerance;
  }

  /**
   * Gets whether the map can be zoomed by touch-dragging with two fingers. If passed 'center', it will zoom to the center of the view regardless of where the touch events (fingers) were. Enabled for touch-capable web browsers except for old Androids.
   *
   * @return true if the map can be zoomed by touch-dragging with two fingers.
   */
  public String getTouchZoom() {
    return touchZoom;
  }

  /**
   * Sets whether the map can be zoomed by touch-dragging with two fingers. If passed 'center', it will zoom to the center of the view regardless of where the touch events (fingers) were. Enabled for touch-capable web browsers except for old Androids.
   *
   * @param touchZoom true if the map can be zoomed by touch-dragging with two fingers.
   */
  public void setTouchZoom(String touchZoom) {
    this.touchZoom = touchZoom;
  }

  /**
   * Gets the bounce at zoom limits flag.
   *
   * @return The bounce at zoom limits flag.
   */
  public Boolean getBoundAtZoomLimits() {
    return boundAtZoomLimits;
  }

  /**
   * Sets the bounce at zoom limits flag.
   *
   * @param boundAtZoomLimits The bounce at zoom limits flag.
   */
  public void setBoundAtZoomLimits(Boolean boundAtZoomLimits) {
    this.boundAtZoomLimits = boundAtZoomLimits;
  }
}
