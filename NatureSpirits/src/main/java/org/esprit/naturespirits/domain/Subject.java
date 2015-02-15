package org.esprit.naturespirits.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Subject
 *
 */
@Entity

public class Subject implements Serializable {

	   
	@Id
	private int id_subject;
	private String text_subject;
	@OneToMany(mappedBy="subject",cascade=CascadeType.ALL)
	private List<CommentSub> commentsubs = new ArrayList<CommentSub>();
	private static final long serialVersionUID = 1L;

	public Subject() {
		super();
	}   
	public int getId_subject() {
		return this.id_subject;
	}

	public void setId_subject(int id_subject) {
		this.id_subject = id_subject;
	}   
	public String getText_subject() {
		return this.text_subject;
	}

	public void setText_subject(String text_subject) {
		this.text_subject = text_subject;
	}
   
}
