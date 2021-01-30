package com.github.ngyewch.leafletfx.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main
    extends Application {

  public static void main(String[] args) {
    Application.launch(Main.class, args);
  }

  @Override
  public void start(Stage primaryStage)
      throws Exception {
    final FXMLLoader fxmlLoader = new FXMLLoader(getClass()
        .getResource("/com/github/ngyewch/leafletfx/demo/demo.fxml"));
    final Parent root = fxmlLoader.load();
    final Controller controller = fxmlLoader.getController();
    primaryStage.setTitle("LeafletFX Demo");
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
  }
}
