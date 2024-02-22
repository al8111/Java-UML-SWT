package org.acme.prototype.model;


/**
 * @author joaof
 * @version 1.0
 * @created 22-fev-2024 19:17:52
 */
public class VehicleBrand {

	private String description;
	private int id;

	public VehicleBrand(int id, String description) {
		
		this.id = id;
		
		this.description = description;
	}

	public void finalize() throws Throwable {

	}
}//end VehicleBrand