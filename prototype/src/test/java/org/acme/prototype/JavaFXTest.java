package org.acme.prototype;

import org.testfx.framework.junit.ApplicationTest;

import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.acme.prototype.model.Car;
import org.junit.Test;

public class JavaFXTest extends ApplicationTest {

	private App app;
	
	@Override
	public void start(Stage stage) throws Exception {
		app = new App();
		app.start(stage);
		stage.setScene(app.getScene());
		stage.show();
		stage.toFront();
	}
	
	@Test
	public void applicationTitleIsCorrectTest() {
		
		Parent rootNode = app.getScene().getRoot();
		Label label = from(rootNode).lookup(".label").query();
	    assertEquals("Turbo Speed System", label.getText());
	}
}
