package org.esprit.naturespirits.domain;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Invitation
 *
 */
@Entity
@IdClass(InvitationId.class)
public class Invitation implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int id_member;
	@Id
	private int id_alert;
	@ManyToOne
	//@JoinColumn(name="id_member",insertable=false,updatable=false)
	private Member member;
	@ManyToOne 
	//@JoinColumn(name="id_invitation",insertable=false,updatable=false)
	private Alert alert;
	public Invitation() {
		super();
	}
   
}
