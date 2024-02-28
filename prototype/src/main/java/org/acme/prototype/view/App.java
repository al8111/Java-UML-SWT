package org.acme.prototype.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import org.acme.prototype.controller.GenerateInitialData;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    public Scene getScene() {
		return scene;
	}

	@Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(View.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
    	
    	GenerateInitialData generateInitialData = new GenerateInitialData();
    	
    	generateInitialData.generate();
    	
        launch();
    }

}