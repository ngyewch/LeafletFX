package com.github.ngyewch.leafletfx.demo;

import com.github.ngyewch.leafletfx.*;
import javafx.application.Platform;
import javafx.concurrent.Worker;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Controller {

  @FXML
  private LeafletMapView leafletMapView;

  @FXML
  private Label locationLabel;

  private final List<LatLng> polygonLatLngs = new ArrayList<>();
  private Polygon polygon;

  public Controller() {
    super();

    polygonLatLngs.add(new LatLng(1.3452981374864612f, 103.83517266343526f));
    polygonLatLngs.add(new LatLng(1.4183998854758437f, 103.78903443197225f));
    polygonLatLngs.add(new LatLng(1.3228011722307773f, 103.70646481256105f));
  }

  @FXML
  private void initialize() {
    final MapOptions mapOptions = new MapOptions();
    mapOptions.setCenter(new LatLng(1.3521f, 103.8198f));
    mapOptions.setZoom(12f);

    final CompletableFuture<Worker.State> initFuture = leafletMapView.init(mapOptions,
        o -> System.out.format("*** console.log(): %s\n", o));
    initFuture.thenAccept(state -> {
      if (state == Worker.State.SUCCEEDED) {
        leafletMapView.getMap().on(MapEvents.CLICK, e -> System.out.println("map click!"));

        final Leaflet L = leafletMapView.getLeaflet();

        {
          final TileLayerOptions tileLayerOptions = new TileLayerOptions();
          tileLayerOptions.setMinZoom(1f);
          tileLayerOptions.setMaxZoom(20f);
          tileLayerOptions.setMaxNativeZoom(19f);
          tileLayerOptions.setAttribution("&copy; <a href=\"http://osm.org/copyright\">OpenStreetMap</a> contributors");
          final TileLayer tileLayer = L.tileLayer("https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png",
              tileLayerOptions);
          tileLayer.addTo(leafletMapView.getMap());
        }

        {
          final IconOptions iconOptions = new IconOptions();
          iconOptions.setIconUrl("https://static.thenounproject.com/png/2283137-200.png");
          iconOptions.setIconAnchor(new Point(20, 20));
          iconOptions.setIconSize(new Point(40, 40));
          final Icon icon = L.icon(iconOptions);

          final MarkerOptions markerOptions = new MarkerOptions();
          markerOptions.setTitle("I am a marker!");
          final Marker marker = L.marker(new LatLng(1.3521f, 103.8198f), markerOptions);
          marker.addTo(leafletMapView.getMap());
          marker.setIcon(icon);
          final PopupOptions popupOptions = new PopupOptions();
          marker.bindPopup("I am a popup!", popupOptions);
        }

        {
          final CircleMarkerOptions circleMarkerOptions = new CircleMarkerOptions();
          circleMarkerOptions.setRadius(10);
          final CircleMarker circleMarker = L.circleMarker(new LatLng(1.3521f, 103.8198f), circleMarkerOptions);
          circleMarker.addTo(leafletMapView.getMap());
          circleMarker.on(CircleMarkerEvents.CLICK, e -> System.out.println("circleMarker click!"));
          circleMarker.on(CircleMarkerEvents.DOUBLE_CLICK, e -> System.out.println("circleMarker dblclick!"));
          circleMarker.on(CircleMarkerEvents.MOUSE_DOWN, e -> System.out.println("circleMarker mousedown!"));
          circleMarker.on(CircleMarkerEvents.MOUSE_OVER, e -> System.out.println("circleMarker mouseover!"));
          circleMarker.on(CircleMarkerEvents.MOUSE_OUT, e -> System.out.println("circleMarker mouseout!"));
          circleMarker.on(CircleMarkerEvents.CONTEXT_MENU, e -> System.out.println("circleMarker contextmenu!"));
        }

        polygon = L.polygon(polygonLatLngs);
        polygon.addTo(leafletMapView.getMap());

        leafletMapView.getMap().on(MapEvents.MOUSE_MOVE, e ->
            Platform.runLater(() ->
                locationLabel.setText(String.format("%.6f, %.6f", e.getLatlng().getLat(), e.getLatlng().getLng()))));
      }
    });
  }

  private PolyEditor polyEditor = null;

  @FXML
  private void onStart() {
    if (polyEditor != null) {
      return;
    }
    polyEditor = new PolyEditor(leafletMapView.getLeaflet(), leafletMapView.getMap(), polygonLatLngs,
        (index, latLng) -> {
          polygonLatLngs.set(index, latLng);
          polygon.setLatLngs(polygonLatLngs);
        });
    polyEditor.start();
  }

  @FXML
  private void onFinish() {
    if (polyEditor == null) {
      return;
    }
    polyEditor.stop();
    polyEditor = null;
  }
}
