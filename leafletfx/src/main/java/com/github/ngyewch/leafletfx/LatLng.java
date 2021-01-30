package com.github.ngyewch.leafletfx;

/**
 * Represents a geographical point with a certain latitude and longitude.
 */
public class LatLng {

  private float lat;
  private float lng;
  private Float alt;

  /**
   * Constructs a new LatLng object.
   */
  public LatLng() {
    super();
  }

  /**
   * Constructs a new LatLng object.
   *
   * @param lat Latitude.
   * @param lng Longitude.
   */
  public LatLng(float lat, float lng) {
    super();

    this.lat = lat;
    this.lng = lng;
  }

  /**
   * Constructs a new LatLng object.
   *
   * @param lat Latitude.
   * @param lng Longitude.
   * @param alt Altitude.
   */
  public LatLng(float lat, float lng, float alt) {
    super();

    this.lat = lat;
    this.lng = lng;
    this.alt = alt;
  }

  /**
   * Gets the latitude.
   *
   * @return The latitude.
   */
  public float getLat() {
    return lat;
  }

  /**
   * Sets the latitude.
   *
   * @param lat The latitude.
   */
  public void setLat(float lat) {
    this.lat = lat;
  }

  /**
   * Gets the longitude.
   *
   * @return The longitude.
   */
  public float getLng() {
    return lng;
  }

  /**
   * Sets the longitude.
   *
   * @param lng The longitude.
   */
  public void setLng(float lng) {
    this.lng = lng;
  }

  /**
   * Gets the altitude.
   *
   * @return The altitude.
   */
  public Float getAlt() {
    return alt;
  }

  /**
   * Sets the altitude.
   *
   * @param alt The altitude.
   */
  public void setAlt(Float alt) {
    this.alt = alt;
  }
}
