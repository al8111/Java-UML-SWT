package org.acme.prototype.model;

import java.util.List;

/**
 * @author joaof
 * @version 1.0
 * @created 22-fev-2024 19:17:52
 */
public class Car {

	public String body;
	public String engine;
	public int id;
	public String interior;
	public String trimLevel;
	public List<Equipment> m_Equipment;
	public VehicleType m_VehicleType;
	public VehicleBrand m_VehicleBrand;
	
	public static List<Car> all;

	public Car(String body, String engine, int id, String interior, String trimLevel, List<Equipment> m_Equipment,
			VehicleType m_VehicleType, VehicleBrand m_VehicleBrand) {
		super();
		this.body = body;
		this.engine = engine;
		this.id = id;
		this.interior = interior;
		this.trimLevel = trimLevel;
		this.m_Equipment = m_Equipment;
		this.m_VehicleType = m_VehicleType;
		this.m_VehicleBrand = m_VehicleBrand;
	}
	
	public void finalize() throws Throwable {

	}
	public void buy(){

	}

	public void finance(){

	}

	public void lease(){

	}

	public void search(){

	}

	public void sort(){

	}
}//end Car