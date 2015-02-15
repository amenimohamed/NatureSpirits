package org.esprit.naturespirits.domain;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Article
 *
 */
@Entity

public class Article implements Serializable {

	   
	@Id
	private int id_article;
	private String title;
	private static final long serialVersionUID = 1L;
	@ManyToOne@JoinColumn(name="id_journalist",insertable=false,updatable=false)
	private Journalist journalist;
	
	public Article() {
		super();
	}   
	public int getId_article() {
		return this.id_article;
	}

	public void setId_article(int id_article) {
		this.id_article = id_article;
	}   
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
   
}
