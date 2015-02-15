package org.esprit.naturespirits.domain;

import java.io.Serializable;

import javax.persistence.*;

import org.esprit.naturespirits.domain.Member;

/**
 * Entity implementation class for Entity: TrustedMember
 *
 */
@Entity

public class TrustedMember extends Member implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="location_fk",insertable=false, updatable=false)
	private Location location;
	@ManyToOne
	@JoinColumn(name="id_admin",insertable=false,updatable=false)
	/*
	@JoinColumns({
		@JoinColumn(name="id_admin",insertable=false,updatable=false,referencedColumnName = "id_user"),
		@JoinColumn(name="admin_log",insertable=false,updatable=false,referencedColumnName = "login")
		})
	*/
	private Admin admin;

	public TrustedMember() {
		super();
	}
   
}
