package org.esprit.naturespirits.domain;

import java.io.Serializable;

import javax.persistence.*;

import org.esprit.naturespirits.domain.User;

/**
 * Entity implementation class for Entity: OwnerShip
 *
 */
@Entity

public class OwnerShip extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="id_admin",insertable=false,updatable=false)
/*-
	@JoinColumns({
		@JoinColumn(name="id_admin",insertable=false,updatable=false,referencedColumnName = "id_user"),
		@JoinColumn(name="admin_log",insertable=false,updatable=false,referencedColumnName = "login")
		})
		*/
	private Admin admin;
	@OneToOne
	private Location location;

	public OwnerShip() {
		super();
	}
   
}
