package org.acme.prototype;

import java.util.ArrayList;
import java.util.List;

import org.acme.prototype.model.Car;
import org.acme.prototype.model.Equipment;
import org.acme.prototype.model.SedanCar;
import org.acme.prototype.model.VehicleBrand;
import org.acme.prototype.model.VehicleType;

public class GenerateInitialData {

	public void generate() {
		
		List<Equipment> equipaments = new ArrayList<>();
		
		VehicleType vehicleType = new VehicleType(1, "Convertible Sedan");
		
		VehicleBrand vehicleBrand = new VehicleBrand(1, "Toyta");
		
		Car car = new SedanCar("V engine", 1, "leather", "SE", equipaments, vehicleType, vehicleBrand);
		
		Car.all.add(car);
	}
}
