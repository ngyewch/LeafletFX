package com.github.ngyewch.leafletfx;

public class PathOptions
    extends InteractiveLayerOptions {

  private Boolean stroke;
  private String color;
  private Number weight;
  private Number opacity;
  private String lineCap;
  private String lineJoin;
  private String dashArray;
  private String dashOffset;
  private Boolean fill;
  private String fillColor;
  private Number fillOpacity;
  private String fillRule;
  private String className;

  /**
   * Gets whether to draw stroke along the path.
   *
   * @return true if borders are drawn on polygons or circles.
   */
  public Boolean getStroke() {
    return stroke;
  }

  /**
   * Sets whether to draw stroke along the path.
   *
   * @param stroke true if borders are drawn on polygons or circles.
   */
  public void setStroke(Boolean stroke) {
    this.stroke = stroke;
  }

  /**
   * Gets the stroke color.
   *
   * @return Stroke color.
   */
  public String getColor() {
    return color;
  }

  /**
   * Sets the stroke color.
   *
   * @param color Stroke color.
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Gets the stroke width (pixels).
   *
   * @return Stroke width (pixels).
   */
  public Number getWeight() {
    return weight;
  }

  /**
   * Sets the stroke width (pixels).
   *
   * @param weight Stroke width (pixels).
   */
  public void setWeight(Number weight) {
    this.weight = weight;
  }

  /**
   * Gets the stroke opacity.
   *
   * @return Stroke opacity.
   */
  public Number getOpacity() {
    return opacity;
  }

  /**
   * Sets the stroke opacity.
   *
   * @param opacity Stroke opacity.
   */
  public void setOpacity(Number opacity) {
    this.opacity = opacity;
  }

  /**
   * Gets the line cap.
   *
   * @return Line cap.
   */
  public String getLineCap() {
    return lineCap;
  }

  /**
   * Sets the line cap.
   *
   * @param lineCap Line cap.
   */
  public void setLineCap(String lineCap) {
    this.lineCap = lineCap;
  }

  /**
   * Gets the line join.
   *
   * @return Line join.
   */
  public String getLineJoin() {
    return lineJoin;
  }

  /**
   * Sets the line join.
   *
   * @param lineJoin Line join.
   */
  public void setLineJoin(String lineJoin) {
    this.lineJoin = lineJoin;
  }

  /**
   * Gets the dash pattern.
   *
   * @return Dash pattern.
   */
  public String getDashArray() {
    return dashArray;
  }

  /**
   * Sets the dash pattern.
   *
   * @param dashArray Dash pattern.
   */
  public void setDashArray(String dashArray) {
    this.dashArray = dashArray;
  }

  /**
   * Gets the dash offset.
   *
   * @return Dash offset.
   */
  public String getDashOffset() {
    return dashOffset;
  }

  /**
   * Sets the dash offset.
   *
   * @param dashOffset Dash offset.
   */
  public void setDashOffset(String dashOffset) {
    this.dashOffset = dashOffset;
  }

  /**
   * Gets whether to fill the path with color. Set it to false to disable filling on polygons or circles.
   *
   * @return true to fill the path with color.
   */
  public Boolean getFill() {
    return fill;
  }

  /**
   * Sets whether to fill the path with color. Set it to false to disable filling on polygons or circles.
   *
   * @param fill true to fill the path with color.
   */
  public void setFill(Boolean fill) {
    this.fill = fill;
  }

  /**
   * Gets the fill color.
   *
   * @return Fill color.
   */
  public String getFillColor() {
    return fillColor;
  }

  /**
   * Sets the fill color.
   *
   * @param fillColor Fill color.
   */
  public void setFillColor(String fillColor) {
    this.fillColor = fillColor;
  }

  /**
   * Gets the fill opacity.
   *
   * @return Fill opacity.
   */
  public Number getFillOpacity() {
    return fillOpacity;
  }

  /**
   * Sets the fill opacity.
   *
   * @param fillOpacity Fill opacity.
   */
  public void setFillOpacity(Number fillOpacity) {
    this.fillOpacity = fillOpacity;
  }

  /**
   * Gets the fill rule.
   *
   * @return Fill rule.
   */
  public String getFillRule() {
    return fillRule;
  }

  /**
   * Sets the fill rule.
   *
   * @param fillRule Fill rule.
   */
  public void setFillRule(String fillRule) {
    this.fillRule = fillRule;
  }

  /**
   * Gets the custom class name.
   *
   * @return Custom class name.
   */
  public String getClassName() {
    return className;
  }

  /**
   * Sets the custom class name.
   *
   * @param className Custom class name.
   */
  public void setClassName(String className) {
    this.className = className;
  }
}
