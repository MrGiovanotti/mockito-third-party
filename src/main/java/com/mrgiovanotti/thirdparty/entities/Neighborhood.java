package com.mrgiovanotti.thirdparty.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mrgiovanotti.thirdparty.entities.dto.NeighborhoodDTO;
import com.mrgiovanotti.thirdparty.enums.CitySector;

@Entity
@Table(name = "neighborhoods")
public class Neighborhood {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	String name;

	@Column(name = "city_sector")
	CitySector citySector;

	public Neighborhood() {

	}

	public Neighborhood(NeighborhoodDTO neighborhoodDTO) {
		id = neighborhoodDTO.getId();
		name = neighborhoodDTO.getName();
		citySector = neighborhoodDTO.getCitySector();
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
		return "Neighborhood [id=" + id + ", name=" + name + ", citySector=" + citySector + "]";
	}

}
