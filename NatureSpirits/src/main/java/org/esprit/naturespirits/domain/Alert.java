package org.esprit.naturespirits.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Alert
 *
 */
@Entity

public class Alert implements Serializable {

	   
	@Id
	private int id_alert;
	private boolean public_alert;
	private boolean action;
	private String text;
	@Enumerated(EnumType.STRING)
	private AlertType alertype;
	private static final long serialVersionUID = 1L;
	@ManyToOne@JoinColumn(name="id_agent",insertable=false,updatable=false)
	private Agent agent;
	@OneToMany(mappedBy="member",cascade=CascadeType.ALL)
	private List<CommentAlert> commentalerts = new ArrayList<CommentAlert>();
	@ManyToOne@JoinColumn(name="id_member",insertable=false,updatable=false)
	private Member member;
	@OneToMany(mappedBy="member",cascade=CascadeType.ALL)
	private List<Invitation> invitations = new ArrayList<Invitation>();
	@OneToOne
	private Location location;

	public Alert() {
		super();
	}   
	public int getId_alert() {
		return this.id_alert;
	}

	public void setId_alert(int id_alert) {
		this.id_alert = id_alert;
	}   
	public boolean getPublic_alert() {
		return this.public_alert;
	}

	public void setPublic_alert(boolean public_alert) {
		this.public_alert = public_alert;
	}   
	public boolean getAction() {
		return this.action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}   
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}
   
}
