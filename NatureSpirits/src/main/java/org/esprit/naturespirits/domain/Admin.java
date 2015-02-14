package org.esprit.naturespirits.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.esprit.naturespirits.domain.User;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity

public class Admin extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@OneToMany
	private List<Journalist> journalists = new ArrayList<Journalist>();
	@OneToMany
	private List<Agent> agents = new ArrayList<Agent>();
	@OneToMany
	private List<OwnerShip> ownerships = new ArrayList<OwnerShip>();
	@OneToMany(mappedBy="admin", cascade=CascadeType.ALL)
	private List<TrustedMember> trustedmembers = new ArrayList<TrustedMember>();
	@OneToMany
	private List<Member> members = new ArrayList<Member>();
	public Admin() {
		super();
	}
   
}
