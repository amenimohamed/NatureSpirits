package org.esprit.naturespirits.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


import org.esprit.naturespirits.domain.User;



/**
 * Entity implementation class for Entity: Journalist
 *
 */
@Entity

public class Journalist extends User implements Serializable {

	   
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy="journalist",cascade=CascadeType.ALL)
	private List<Article> articles = new ArrayList<Article>();
	@ManyToOne
	@JoinColumn(name="id_admin",insertable=false,updatable=false)

	/*
	@JoinColumns({
		@JoinColumn(name="id_admin",insertable=false,updatable=false,referencedColumnName = "id_user"),
		@JoinColumn(name="admin_log",insertable=false,updatable=false,referencedColumnName = "login")
		})
		*/
	private Admin admin;
	public Journalist() {
		super();
	} 
	
   
}
