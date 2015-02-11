package org.esprit.naturespirits.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: NewsEntry
 *
 */
@Entity

public class NewsEntry implements Serializable {

	   
	@Id
	private int id_news;
	private static final long serialVersionUID = 1L;

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
