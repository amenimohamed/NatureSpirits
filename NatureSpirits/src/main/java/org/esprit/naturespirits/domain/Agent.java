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
	@OneToMany
	private List<NewsEntry> newsentries = new ArrayList<NewsEntry>();
	@OneToMany
	private List<Alert> alerts = new ArrayList<Alert>();
	@ManyToOne
	private Admin admin;
	public Agent() {
		super();
	}
   
}
