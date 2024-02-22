package org.acme.prototype.model;

import java.util.List;

/**
 * @author joaof
 * @version 1.0
 * @created 22-fev-2024 19:17:52
 */
public class Invoice {

	public int contractNum;
	public double price;
	public List<Booking> m_Booking;
	public Customer m_Customer;
	public SalesAdvisor m_SalesAdvisor;

	public Invoice(){

	}

	public void finalize() throws Throwable {

	}
}//end Invoice