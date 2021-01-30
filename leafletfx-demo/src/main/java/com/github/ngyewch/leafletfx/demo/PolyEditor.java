package com.github.ngyewch.leafletfx.demo;

import com.github.ngyewch.leafletfx.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class PolyEditor {

  private final Leaflet leaflet;
  private final LeafletMap map;
  private final List<LatLng> latLngs;
  private final Listener listener;

  private LayerGroup layerGroup = null;
  private CircleMarker highlightLayer = null;
  private CircleMarker selectedLayer = null;
  private Integer selectedIndex = null;

  private final Consumer<MapEvent> mapMouseMoveHandler = e -> {
    PolyEditor.this.handleOnMove(selectedIndex, e.getLatlng());
  };
  private final Consumer<MapEvent> mapClickHandler = e -> {
    PolyEditor.this.handleOnCommit(selectedIndex, e.getLatlng());
  };

  private final CircleMarkerOptions circleMarkerOptions = new CircleMarkerOptions();
  private final CircleMarkerOptions highlightCircleMarkerOptions = new CircleMarkerOptions();

  public PolyEditor(Leaflet leaflet, LeafletMap map, List<LatLng> latLngs, Listener listener) {
    super();

    this.leaflet = leaflet;
    this.map = map;
    this.latLngs = new ArrayList<>(latLngs);
    this.listener = listener;

    circleMarkerOptions.setColor("#3388ff");
    circleMarkerOptions.setRadius(3.0);
    circleMarkerOptions.setFill(true);
    circleMarkerOptions.setFillOpacity(1.0);
    circleMarkerOptions.setBubblingMouseEvents(false);

    highlightCircleMarkerOptions.setColor("#3388ff");
    highlightCircleMarkerOptions.setRadius(8.0);
    highlightCircleMarkerOptions.setWeight(2.0);
    highlightCircleMarkerOptions.setFill(false);
    highlightCircleMarkerOptions.setBubblingMouseEvents(false);
  }

  public void start() {
    map.on(MapEvents.MOUSE_MOVE, mapMouseMoveHandler);
    map.on(MapEvents.CLICK, mapClickHandler);
    layerGroup = leaflet.layerGroup();
    for (int i = 0; i < latLngs.size(); i++) {
      final LatLng latLng = latLngs.get(i);
      final CircleMarker circleMarker = leaflet.circleMarker(latLng, circleMarkerOptions);
      final int index = i;
      circleMarker.on("mouseover", e -> {
        if (highlightLayer != null) {
          layerGroup.removeLayer(highlightLayer);
          highlightLayer = null;
        }
        if (Objects.equals(selectedIndex, index)) {
          return;
        }
        final LatLng latLng1 = latLngs.get(index);
        final CircleMarker highlightCircleMarker = leaflet.circleMarker(latLng1, highlightCircleMarkerOptions);
        highlightCircleMarker.bindPopup("Click to select for moving", new PopupOptions());
        highlightLayer = highlightCircleMarker;
        layerGroup.addLayer(highlightLayer);
        highlightCircleMarker.togglePopup();
      });
      circleMarker.on(CircleMarkerEvents.MOUSE_OUT, e -> {
        if (highlightLayer != null) {
          layerGroup.removeLayer(highlightLayer);
          highlightLayer = null;
        }
      });
      circleMarker.on(CircleMarkerEvents.CLICK, e -> {
        if (Objects.equals(selectedIndex, index)) {
          PolyEditor.this.handleOnCommit(selectedIndex, e.getLatlng());
          return;
        }
        if (highlightLayer != null) {
          layerGroup.removeLayer(highlightLayer);
          highlightLayer = null;
        }
        select(index, circleMarker);
      });
      layerGroup.addLayer(circleMarker);
    }
    layerGroup.addTo(map);
  }

  public void stop() {
    map.off(MapEvents.MOUSE_MOVE, mapMouseMoveHandler);
    map.off(MapEvents.CLICK, mapClickHandler);
    layerGroup.removeFrom(map);
    layerGroup = null;
  }

  private void select(int index, CircleMarker circleMarker) {
    selectedIndex = index;
    selectedLayer = circleMarker;
  }

  private void clearSelection() {
    selectedIndex = null;
    selectedLayer = null;
  }

  private void handleOnMove(Integer index, LatLng latLng) {
    if (selectedIndex == null) {
      return;
    }
    if (highlightLayer != null) {
      highlightLayer.setLatLng(latLng);
    }
    if (selectedLayer != null) {
      selectedLayer.setLatLng(latLng);
    }
    fireOnMove(index, latLng);
  }

  private void handleOnCommit(Integer index, LatLng latLng) {
    if (selectedIndex == null) {
      return;
    }
    handleOnMove(index, latLng);
    latLngs.set(index, latLng);
    clearSelection();
  }

  private void fireOnMove(int index, LatLng latLng) {
    if (listener == null) {
      return;
    }
    listener.onMove(index, latLng);
  }

  interface Listener {

    void onMove(int index, LatLng latLng);
  }
}
