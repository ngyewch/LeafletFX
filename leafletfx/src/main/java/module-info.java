module com.github.ngyewch.leafletfx {
  requires javafx.graphics;
  requires javafx.web;
  requires jdk.jsobject;
  requires com.fasterxml.jackson.databind;
  requires org.apache.commons.lang3;

  exports com.github.ngyewch.leafletfx;
  exports com.github.ngyewch.leafletfx.impl;
}
