package org.esprit.naturespirits.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.faces.FacesException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.esprit.naturespirits.domain.Journalist;

/**
 * Session Bean implementation class JournalistService
 */
@Stateless
@LocalBean
public class JournalistService implements JournalistServiceRemote {
	
	@PersistenceContext
	EntityManager em;
    private Journalist journalist;
    /**
     * Default constructor. 
     * @return 
     */
    public JournalistService() {
    	 // TODO Auto-generated constructor stub

    }
    
    	@Override
    	public List<Journalist> findAll() {
    		return em.createQuery("Select p from Journalist p ",Journalist.class).getResultList();
    	
    	}

    	@Override
    	public Journalist findBYid(int id_Journalist) {
    		
    		
    		
    		String jour="Select p from Journaliste p where p.id_Journalist =:param";
    		Query query =em.createQuery(jour);
    		query.setParameter("param", id_Journalist);
    		
    		return (Journalist) query.getSingleResult();
    		
    	}

    	@Override
    	public void disableJournalist(Journalist journalist) {
    		em.detach(em.find(Journalist.class, journalist.getId_user()));
    		
    	}
		

	
		}



