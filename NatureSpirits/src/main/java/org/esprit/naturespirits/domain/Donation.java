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
	@ManyToOne
	@JoinColumn(name="id_member",insertable=false,updatable=false)

	/*
	@JoinColumns({
		@JoinColumn(name="id_member",insertable=false,updatable=false,referencedColumnName = "id_user"),
		@JoinColumn(name="member_log",insertable=false,updatable=false,referencedColumnName = "login")
		})
	*/
	private Member member;

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
