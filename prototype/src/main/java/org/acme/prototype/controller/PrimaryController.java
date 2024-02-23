package org.acme.prototype.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.acme.prototype.model.Car;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

public class PrimaryController implements Initializable {

	@FXML private TableView<Car> tableView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		ObservableList<Car> data = tableView.getItems();
		
		for (Car car : Car.all) {
		
			data.add(car);	
		}
		
	}
}
