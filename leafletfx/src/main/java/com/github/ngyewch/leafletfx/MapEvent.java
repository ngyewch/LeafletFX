package com.github.ngyewch.leafletfx;

import com.fasterxml.jackson.annotation.JsonProperty;

// TODO
public class MapEvent {

  private OriginalEvent originalEvent;
  private Point containerPoint;
  private Point layerPoint;
  private LatLng latlng;
  private String type;

  public OriginalEvent getOriginalEvent() {
    return originalEvent;
  }

  public void setOriginalEvent(OriginalEvent originalEvent) {
    this.originalEvent = originalEvent;
  }

  public Point getContainerPoint() {
    return containerPoint;
  }

  public void setContainerPoint(Point containerPoint) {
    this.containerPoint = containerPoint;
  }

  public Point getLayerPoint() {
    return layerPoint;
  }

  public void setLayerPoint(Point layerPoint) {
    this.layerPoint = layerPoint;
  }

  public LatLng getLatlng() {
    return latlng;
  }

  public void setLatlng(LatLng latlng) {
    this.latlng = latlng;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public static class OriginalEvent {

    @JsonProperty("isTrusted")
    private Boolean trusted;

    public Boolean getTrusted() {
      return trusted;
    }

    public void setTrusted(Boolean trusted) {
      this.trusted = trusted;
    }
  }
}
