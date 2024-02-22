package org.acme.prototype.model;


/**
 * @author joaof
 * @version 1.0
 * @created 22-fev-2024 18:56:57
 */
public class Finance extends Invoice {

	public int numberOfInstallments;
	public FinancingAdvisor m_FinancingAdvisor;
	public Bank m_Bank;

	public Finance(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Finance