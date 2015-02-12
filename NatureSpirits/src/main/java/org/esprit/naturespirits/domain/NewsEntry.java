package org.esprit.naturespirits.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: NewsEntry
 *
 */
@Entity

public class NewsEntry implements Serializable {

	   
	@Id
	private int id_news;
	@ManyToOne
	private Agent agent;
	@OneToMany
	//(mappedBy="newsentry",cascade=CascadeType.ALL)
	private List<Media> medias = new ArrayList<Media>();
	private static final long serialVersionUID = 1L;
	@Enumerated
	private NewsCategory newscategory;

	public NewsEntry() {
		super();
	}   
	public int getId_news() {
		return this.id_news;
	}

	public void setId_news(int id_news) {
		this.id_news = id_news;
	}
   
}
