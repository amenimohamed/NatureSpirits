package org.esprit.naturespirits.service;



import java.util.List;

import javax.ejb.Remote;
import org.esprit.naturespirits.domain.User;

@Remote
public interface NatureSpiritsRemote {
	/**
	 * 
	 * @param agent
	 */
	public void addUser(User user);
    public void updateUser(User user);
    public List<User> findAll();
    public User findBYid(int id_user);
	public List<User> findBYval(boolean validation_j);
	public void validateUser(boolean validation_j);
	public void disableUser(boolean validation_j);


}
