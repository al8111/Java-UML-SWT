package org.acme.prototype.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.acme.prototype.model.Car;
import org.acme.prototype.view.App;

import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

public class HomeController implements Initializable {

	@FXML
	public void onGetCarListClick(Event event) throws IOException {
		
		App.setRoot("primary");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
}
