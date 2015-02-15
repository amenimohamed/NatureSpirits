package org.esprit.naturespirits.domain;

import java.io.Serializable;

import javax.persistence.*;



/**
 * Entity implementation class for Entity: CommentSub
 *
 */
@Entity
@IdClass(SubjectId.class)
public class CommentSub implements Serializable {

	@Id
	private int id_member;
	@Id
	private int id_subject;
	@ManyToOne@JoinColumn(name="id_member",insertable=false,updatable=false)
	private Member member;
	@ManyToOne@JoinColumn(name="id_subject",insertable=false,updatable=false)
	private Subject subject;
	private static final long serialVersionUID = 1L;

	public CommentSub() {
		super();
	}   
	public int getId_member() {
		return this.id_member;
	}

	public void setId_member(int id_member) {
		this.id_member = id_member;
	}
	public int getId_subject() {
		return id_subject;
	}
	public void setId_subject(int id_subject) {
		this.id_subject = id_subject;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
   
}
