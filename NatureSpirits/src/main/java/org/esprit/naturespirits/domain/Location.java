package org.esprit.naturespirits.domain;

import java.io.Serializable;
import java.lang.Float;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Location
 *
 */
@Entity

public class Location implements Serializable {

	   
	@Id
	private int id_location;
	private Float altitude;
	private Float longitude;
	private static final long serialVersionUID = 1L;

	public Location() {
		super();
	}   
	public int getId_location() {
		return this.id_location;
	}

	public void setId_location(int id_location) {
		this.id_location = id_location;
	}   
	public Float getAltitude() {
		return this.altitude;
	}

	public void setAltitude(Float altitude) {
		this.altitude = altitude;
	}   
	public Float getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
   
}
