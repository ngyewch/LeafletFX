package com.github.ngyewch.leafletfx.demo;

import com.github.ngyewch.leafletfx.LatLng;

public class Utils {

  private Utils() {
    super();
  }

  public static String toString(LatLng latLng) {
    return String.format("(%.1f, %.1f)", latLng.getLat(), latLng.getLng());
  }
}
