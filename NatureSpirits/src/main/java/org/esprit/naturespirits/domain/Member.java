package org.esprit.naturespirits.domain;

import java.io.Serializable;
import javax.persistence.*;
import org.esprit.naturespirits.domain.User;

/**
 * Entity implementation class for Entity: Member
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Member extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Member() {
		super();
	}
   
}
