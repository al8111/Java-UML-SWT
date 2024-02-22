package org.acme.prototype.model;


/**
 * @author joaof
 * @version 1.0
 * @created 22-fev-2024 18:56:19
 */
public class Customer extends Person {

	public Customer(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Customer