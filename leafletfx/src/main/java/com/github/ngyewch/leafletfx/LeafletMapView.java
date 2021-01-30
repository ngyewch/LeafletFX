package com.github.ngyewch.leafletfx;

import com.github.ngyewch.leafletfx.impl.JSContext;
import com.github.ngyewch.leafletfx.impl.LeafletImpl;
import javafx.concurrent.Worker;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import netscape.javascript.JSObject;

import java.net.URL;
import java.util.concurrent.CompletableFuture;

/**
 * Leaflet map view.
 */
public class LeafletMapView
    extends StackPane {

  private final WebView webView = new WebView();

  private Leaflet leaflet;
  private LeafletMap map;

  /**
   * Constructs a new LeafletMapView.
   */
  public LeafletMapView() {
    super();

    this.getChildren().add(webView);
  }

  /**
   * Gets the Leaflet method factory.
   *
   * @return Leaflet method factory.
   */
  public Leaflet getLeaflet() {
    return leaflet;
  }

  /**
   * Gets the map.
   *
   * @return Map.
   */
  public LeafletMap getMap() {
    return map;
  }

  /**
   * Initializes the map view.
   *
   * @param mapOptions      Map options.
   * @param consoleListener Console listener.
   * @return Completable future.
   */
  public CompletableFuture<Worker.State> init(MapOptions mapOptions, ConsoleListener consoleListener) {
    final CompletableFuture<Worker.State> stateCompletableFuture = new CompletableFuture<>();
    final URL url = getClass().getResource("/com/github/ngyewch/leafletfx/index.html");
    webView.getEngine().getLoadWorker().stateProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue == Worker.State.SUCCEEDED) {
        final JSContext jsContext = new JSContext(webView.getEngine());

        final JSObject window = jsContext.getWindow();
        window.setMember("console", new Console(consoleListener));
        window.eval("console.log('LeafletMapView initialized.')");

        leaflet = new LeafletImpl(jsContext);
        map = leaflet.map("map", mapOptions);
      }

      if ((newValue == Worker.State.SUCCEEDED) || (newValue == Worker.State.FAILED)) {
        stateCompletableFuture.complete(newValue);
      }
    });
    webView.getEngine().load(url.toExternalForm());

    return stateCompletableFuture;
  }

  public static class Console {

    private final ConsoleListener consoleListener;

    private Console(ConsoleListener consoleListener) {
      super();

      this.consoleListener = consoleListener;
    }

    public void log(Object o) {
      if (consoleListener != null) {
        consoleListener.log(o);
      }
    }
  }
}
