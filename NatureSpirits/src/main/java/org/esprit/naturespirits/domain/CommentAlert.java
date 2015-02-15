package org.esprit.naturespirits.domain;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CommentAlert
 *
 */
@Entity
@IdClass(MemberAlertId.class)
public class CommentAlert implements Serializable {

	
	@Id
	private int id_member;
	@Id
	private int id_alert;
	@ManyToOne@JoinColumn(name="id_member",insertable=false,updatable=false)
	private Member member;
	@ManyToOne@JoinColumn(name="id_alert",insertable=false,updatable=false)
	private Alert alert;
	private int rate;
	private static final long serialVersionUID = 1L;

	public CommentAlert() {
		super();
	}   
	public int getRate() {
		return this.rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
   
}
