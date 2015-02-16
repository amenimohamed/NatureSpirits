package org.esprit.naturespirits.service;

import java.util.List;

import javax.ejb.Remote;

import org.esprit.naturespirits.domain.Journalist;

@Remote
public interface JournalistServiceRemote {
	

	public List<Journalist> findAll();

	public Journalist findBYid(int id_Journalist);

	public void disableJournalist(Journalist journalist);

}
