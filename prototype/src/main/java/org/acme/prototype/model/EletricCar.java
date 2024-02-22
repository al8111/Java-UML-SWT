package org.acme.prototype.model;

import java.util.List;

/**
 * @author joaof
 * @version 1.0
 * @created 22-fev-2024 19:17:52
 */
public class EletricCar extends Car {



	public EletricCar(String engine, int id, String interior, String trimLevel,
			List<Equipment> m_Equipment, VehicleType m_VehicleType, VehicleBrand m_VehicleBrand) {

		super("eletric", engine, id, interior, trimLevel, m_Equipment, m_VehicleType, m_VehicleBrand);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end EletricCar