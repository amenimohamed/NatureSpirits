package org.esprit.naturespirits.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.esprit.naturespirits.domain.User;

/**
 * Entity implementation class for Entity: Agent
 *
 */
@Entity

public class Agent extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="agent",cascade=CascadeType.ALL)
	private List<NewsEntry> newsentries = new ArrayList<NewsEntry>();
	@OneToMany(mappedBy="agent",cascade=CascadeType.ALL)
	private List<Alert> alerts = new ArrayList<Alert>();
	@ManyToOne
	@JoinColumn(name="id_admin",insertable=false,updatable=false)
	/*
	@JoinColumns({
		@JoinColumn(name="id_admin",insertable=false,updatable=false,referencedColumnName = "id_user"),
		@JoinColumn(name="admin_log",insertable=false,updatable=false,referencedColumnName = "login")
		})
	*/
	private Admin admin;
	public Agent() {
		super();
	}
   
}
