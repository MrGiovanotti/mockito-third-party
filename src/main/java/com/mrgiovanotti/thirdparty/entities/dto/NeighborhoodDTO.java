package com.mrgiovanotti.thirdparty.entities.dto;

import java.io.Serializable;

import com.mrgiovanotti.thirdparty.entities.Neighborhood;
import com.mrgiovanotti.thirdparty.enums.CitySector;

public class NeighborhoodDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Long id;
	String name;
	CitySector citySector;

	public NeighborhoodDTO(Neighborhood neighborhood) {
		id = neighborhood.getId();
		name = neighborhood.getName();
		citySector = neighborhood.getCitySector();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CitySector getCitySector() {
		return citySector;
	}

	public void setCitySector(CitySector citySector) {
		this.citySector = citySector;
	}

	@Override
	public String toString() {
		return "NeighborhoodDTO [id=" + id + ", name=" + name + ", citySector=" + citySector + "]";
	}

}
