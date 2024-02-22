

/**
 * @author joaof
 * @version 1.0
 * @created 22-fev-2024 17:46:53
 */
public class Invoice {

	private int contractNum;
	private double price;
	public Booking m_Booking;
	public Customer m_Customer;
	public SalesAdvisor m_SalesAdvisor;

	public Invoice(){

	}

	public void finalize() throws Throwable {

	}
}//end Invoice