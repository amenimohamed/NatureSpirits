package org.esprit.naturespirits.domain;

import java.io.Serializable;
import javax.persistence.*;
import org.esprit.naturespirits.domain.User;

/**
 * Entity implementation class for Entity: Journalist
 *
 */
@Entity

public class Journalist extends User implements Serializable {

	   
	
	private static final long serialVersionUID = 1L;

	public Journalist() {
		super();
	}   
	
   
}
