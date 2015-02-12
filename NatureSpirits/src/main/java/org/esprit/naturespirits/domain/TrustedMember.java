package org.esprit.naturespirits.domain;

import java.io.Serializable;
import javax.persistence.*;
import org.esprit.naturespirits.domain.Member;

/**
 * Entity implementation class for Entity: TrustedMember
 *
 */
@Entity

public class TrustedMember extends Member implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Location location;
	@ManyToOne
	private Admin admin;

	public TrustedMember() {
		super();
	}
   
}
