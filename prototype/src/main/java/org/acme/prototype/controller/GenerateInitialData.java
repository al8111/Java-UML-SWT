package org.acme.prototype.controller;

import java.util.ArrayList;
import java.util.List;

import org.acme.prototype.model.Car;
import org.acme.prototype.model.EletricCar;
import org.acme.prototype.model.Equipment;
import org.acme.prototype.model.SUVCar;
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
		
		equipaments = new ArrayList<>();
		
		vehicleType = new VehicleType(2, "Compact Sedan");
		
		vehicleBrand = new VehicleBrand(2, "Hyundai");
		
		car = new SedanCar("W engine", 2, "vinyl", "DX", equipaments, vehicleType, vehicleBrand);
		
		Car.all.add(car);
		
		equipaments = new ArrayList<>();
		
		equipaments.add(new Equipment(1, "DVD Player"));
		
		vehicleType = new VehicleType(3, "Hybrid Eletrical Vehicle");
		
		vehicleBrand = new VehicleBrand(5, "Jeep");
		
		car = new EletricCar("AC", 3, "nylon", "GT", equipaments, vehicleType, vehicleBrand);
		
		Car.all.add(car);
		
		equipaments = new ArrayList<>();
		
		equipaments.add(new Equipment(1, "Radio"));
		
		equipaments.add(new Equipment(2, "DVD Player"));
		
		vehicleType = new VehicleType(4, "Model Y");
		
		vehicleBrand = new VehicleBrand(4, "Tesla");
		
		car = new EletricCar("DC", 4, "vinyl", "LS", equipaments, vehicleType, vehicleBrand);
		
		Car.all.add(car);
		
		equipaments = new ArrayList<>();
		
		equipaments.add(new Equipment(1, "Radio"));
		
		vehicleType = new VehicleType(5, "Compact Crossover");
		
		vehicleBrand = new VehicleBrand(5, "Jeep");
		
		car = new SUVCar("V6", 5, "leather", "DX", equipaments, vehicleType, vehicleBrand);
		
		Car.all.add(car);
		
		equipaments = new ArrayList<>();
		
		vehicleType = new VehicleType(2, "Compact Sedan");
		
		vehicleBrand = new VehicleBrand(1, "Toyta");
		
		car = new SedanCar("V engine", 1, "leather", "SE", equipaments, vehicleType, vehicleBrand);
		
		Car.all.add(car);
		
		equipaments = new ArrayList<>();
		
		vehicleType = new VehicleType(2, "Compact Sedan");
		
		vehicleBrand = new VehicleBrand(3, "Denso");
		
		car = new SedanCar("W engine", 2, "vinyl", "DX", equipaments, vehicleType, vehicleBrand);
		
		Car.all.add(car);
		
		equipaments = new ArrayList<>();
		
		equipaments.add(new Equipment(1, "DVD Player"));
		
		vehicleType = new VehicleType(3, "Hybrid Eletrical Vehicle");
		
		vehicleBrand = new VehicleBrand(3, "Denso");
		
		car = new EletricCar("AC", 3, "nylon", "GT", equipaments, vehicleType, vehicleBrand);
		
		Car.all.add(car);
		
		equipaments = new ArrayList<>();
		
		vehicleType = new VehicleType(4, "Model Y");
		
		vehicleBrand = new VehicleBrand(3, "Denso");
		
		car = new EletricCar("DC", 4, "vinyl", "LS", equipaments, vehicleType, vehicleBrand);
		
		Car.all.add(car);
		
		equipaments = new ArrayList<>();
		
		vehicleType = new VehicleType(5, "Compact Crossover");
		
		vehicleBrand = new VehicleBrand(5, "Jeep");
		
		car = new SUVCar("V6", 5, "leather", "DX", equipaments, vehicleType, vehicleBrand);
		
		Car.all.add(car);
	}
}
