package org.esprit.naturespirits.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.esprit.naturespirits.domain.User;

/**
 * Entity implementation class for Entity: Member
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Member extends User implements Serializable {

	@OneToOne(cascade = CascadeType.ALL)
	private Blog blog;
	@OneToMany(mappedBy="member",cascade=CascadeType.ALL)
	private List<Alert> alerts = new ArrayList<Alert>();
	@OneToMany(mappedBy="member",cascade=CascadeType.ALL)
	private List<CommentSub> commentsub = new ArrayList<CommentSub>();
	@OneToMany(mappedBy="member",cascade=CascadeType.ALL)
	private List<Donation> donations = new ArrayList<Donation>();
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="member",cascade=CascadeType.ALL)
	private List<Invitation> invitations = new ArrayList<Invitation>();
	@OneToMany(mappedBy="member",cascade=CascadeType.ALL)
	private List<Alert> alertcomm = new ArrayList<Alert>(); 
	@ManyToOne
	@JoinColumn(name="id_admin",insertable=false,updatable=false)
	/*
	@JoinColumns({
	@JoinColumn(name="id_admin",insertable=false,updatable=false,referencedColumnName = "id_user"),
	@JoinColumn(name="admin_log",insertable=false,updatable=false,referencedColumnName = "login")
	})
	*/
	private Admin admin;
	
	
	Member() {
		super();
	}
   
}
