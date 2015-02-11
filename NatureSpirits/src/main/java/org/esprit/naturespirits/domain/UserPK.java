package org.esprit.naturespirits.domain;

import java.io.Serializable;
import java.lang.String;

/**
 * ID class for entity: User
 *
 */ 
public class UserPK  implements Serializable {   
   
	         
	private int id_user;         
	private String login;
	private static final long serialVersionUID = 1L;

	public UserPK() {}

	

	public int getId_user() {
		return this.id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof UserPK)) {
			return false;
		}
		UserPK other = (UserPK) o;
		return true
			&& getId_user() == other.getId_user()
			&& (getLogin() == null ? other.getLogin() == null : getLogin().equals(other.getLogin()));
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getId_user();
		result = prime * result + (getLogin() == null ? 0 : getLogin().hashCode());
		return result;
	}
   
   
}
