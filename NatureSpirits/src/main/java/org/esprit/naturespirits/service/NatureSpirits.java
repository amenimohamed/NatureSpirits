package org.esprit.naturespirits.service;

import java.util.List;

import javax.ejb.Stateless;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.esprit.naturespirits.domain.User;

/**
 * Session Bean implementation class NatureSpirits
 */
@Stateless

public class NatureSpirits implements NatureSpiritsRemote{

    /**
     * Default constructor. 
     */
	@PersistenceContext(unitName="NatureSpirits")
	EntityManager em;
    public NatureSpirits() {
        // TODO Auto-generated constructor stub
    }

	
	@Override
	public void addUser(User user) {
		
		em.persist(user);
	}


	@Override
	public void updateUser(User user) {
		em.merge(user);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		return em.createNativeQuery("select u from User u", User.class).getResultList();
		
	}


	@Override
	public User findBYid(int id_user) {
		User  u = em.find(User.class,id_user);
		return u;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findBYval(boolean validation_j) {
		return em.createNativeQuery("Select u from User u where u.validation_j =:false",User.class).getResultList();
		
	}

   @Override
	public void validateUser(User user) {
		user.setValidation(true);
		em.merge(user);
   }
	@Override
	public void disableUser(User user) {
		user.setValidation(false);
		em.merge(user);
	}
 
}
