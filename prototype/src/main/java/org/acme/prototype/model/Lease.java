package org.acme.prototype.model;


/**
 * @author joaof
 * @version 1.0
 * @created 22-fev-2024 18:58:00
 */
public class Lease extends Invoice {

	public int days;

	public Lease(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Lease