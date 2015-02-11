package org.esprit.naturespirits.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Media
 *
 */
@Entity

public class Media implements Serializable {

	   
	@Id
	private int id_media;
	private static final long serialVersionUID = 1L;

	public Media() {
		super();
	}   
	public int getId_media() {
		return this.id_media;
	}

	public void setId_media(int id_media) {
		this.id_media = id_media;
	}
   
}
