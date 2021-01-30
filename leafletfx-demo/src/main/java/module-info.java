module com.github.ngyewch.leafletfx.demo {
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.graphics;

  requires com.github.ngyewch.leafletfx;

  opens com.github.ngyewch.leafletfx.demo to javafx.fxml, javafx.graphics;
}
