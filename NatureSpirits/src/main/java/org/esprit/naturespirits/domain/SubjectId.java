/**
 * 
 */
package org.esprit.naturespirits.domain;

import java.io.Serializable;




/**
 * @author Mohamed
 *
 */

public class SubjectId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id_member;
	private int id_subject;
	
	public int getId_member() {
		return id_member;
	}
	public void setId_member(int id_member) {
		this.id_member = id_member;
	}
	public int getId_subject() {
		return id_subject;
	}
	public void setId_subject(int id_subject) {
		this.id_subject = id_subject;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_member;
		result = prime * result + id_subject;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubjectId other = (SubjectId) obj;
		if (id_member != other.id_member)
			return false;
		if (id_subject != other.id_subject)
			return false;
		return true;
	}
	
	
}
