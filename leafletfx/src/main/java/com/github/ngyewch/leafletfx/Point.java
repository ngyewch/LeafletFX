package com.github.ngyewch.leafletfx;

/**
 * Point.
 */
public class Point {

  private double x;
  private double y;

  /**
   * Constructs a new Point object.
   */
  public Point() {
    super();
  }

  /**
   * Constructs a new Point object.
   *
   * @param x x-coordinate (pixels).
   * @param y y-coordinate (pixels).
   */
  public Point(double x, double y) {
    super();

    this.x = x;
    this.y = y;
  }

  /**
   * Returns the x-coordinate (pixels).
   *
   * @return x-coordinate (pixels).
   */
  public double getX() {
    return x;
  }

  /**
   * Sets the x-coordinate (pixels).
   *
   * @param x x-coordinate (pixels).
   */
  public void setX(double x) {
    this.x = x;
  }

  /**
   * Returns the y-coordinate (pixels).
   *
   * @return y-coordinate (pixels).
   */
  public double getY() {
    return y;
  }

  /**
   * Sets the y-coordinate (pixels).
   *
   * @param y y-coordinate (pixels).
   */
  public void setY(double y) {
    this.y = y;
  }
}
