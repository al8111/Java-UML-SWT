package org.acme.prototype.model;


/**
 * @author joaof
 * @version 1.0
 * @created 22-fev-2024 19:17:53
 */
public class VehicleType {

	public String description;
	public int id;

	public VehicleType(){

	}

	public VehicleType(int id, String description) {
		
		this.id = id;
		
		this.description = description;
	}

	public void finalize() throws Throwable {

	}
}//end VehicleType