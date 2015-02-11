package org.esprit.naturespirits.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Donation
 *
 */
@Entity

public class Donation implements Serializable {

	   
	@Id
	private int id_donation;
	private String donator;
	private int amount;
	private static final long serialVersionUID = 1L;

	public Donation() {
		super();
	}   
	public int getId_donation() {
		return this.id_donation;
	}

	public void setId_donation(int id_donation) {
		this.id_donation = id_donation;
	}   
	public String getDonator() {
		return this.donator;
	}

	public void setDonator(String donator) {
		this.donator = donator;
	}   
	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
   
}
