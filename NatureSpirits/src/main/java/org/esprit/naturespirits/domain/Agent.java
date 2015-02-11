package org.esprit.naturespirits.domain;

import java.io.Serializable;
import javax.persistence.*;
import org.esprit.naturespirits.domain.User;

/**
 * Entity implementation class for Entity: Agent
 *
 */
@Entity

public class Agent extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Agent() {
		super();
	}
   
}
