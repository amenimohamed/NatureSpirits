package org.esprit.naturespirits.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


import org.esprit.naturespirits.domain.User;

/**
 * Session Bean implementation class NatureSpirits
 */
@Stateless
@LocalBean
public class NatureSpirits implements NatureSpiritsRemote, NatureSpiritsLocal {

    /**
     * Default constructor. 
     */
    public NatureSpirits() {
        // TODO Auto-generated constructor stub
    }

	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
