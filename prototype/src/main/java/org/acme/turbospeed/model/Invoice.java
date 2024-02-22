package main.java.org.acme.turbospeed.model;


/**
 * @author joaof
 * @version 1.0
 * @created 22-fev-2024 18:15:40
 */
public class Invoice {

	public int contractNum;
	public double price;
	public Booking m_Booking;
	public Customer m_Customer;
	public SalesAdvisor m_SalesAdvisor;

	public Invoice(){

	}

	public void finalize() throws Throwable {

	}
}//end Invoice