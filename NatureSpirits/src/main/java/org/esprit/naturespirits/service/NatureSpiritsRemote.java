package org.esprit.naturespirits.service;



import javax.ejb.Remote;

import org.esprit.naturespirits.domain.User;

@Remote
public interface NatureSpiritsRemote {
	/**
	 * 
	 * @param agent
	 */
	public void addUser(User user);


}
