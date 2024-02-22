package org.acme.prototype.model;


/**
 * @author joaof
 * @version 1.0
 * @created 22-fev-2024 19:17:52
 */
public class Customer extends Person {

	public Customer(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Customer