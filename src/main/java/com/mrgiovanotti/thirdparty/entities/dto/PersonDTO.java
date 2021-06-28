package com.mrgiovanotti.thirdparty.entities.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.mrgiovanotti.thirdparty.entities.Person;

public class PersonDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String identificationNumber;
	private String name;
	private LocalDate birthDate;
	private boolean vaccinated;
	private NeighborhoodDTO neighborhood;

	public PersonDTO(Person person) {
		id = person.getId();
		identificationNumber = person.getIdentificationNumber();
		name = person.getName();
		birthDate = person.getBirthDate();
		vaccinated = person.isVaccinated();
		neighborhood = new NeighborhoodDTO(person.getNeighborhood());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isVaccinated() {
		return vaccinated;
	}

	public void setVaccinated(boolean vaccinated) {
		this.vaccinated = vaccinated;
	}

	public NeighborhoodDTO getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(NeighborhoodDTO neighborhood) {
		this.neighborhood = neighborhood;
	}

	@Override
	public String toString() {
		return "PersonDTO [id=" + id + ", identificationNumber=" + identificationNumber + ", name="
				+ name + ", birthDate=" + birthDate + ", vaccinated=" + vaccinated
				+ ", neighborhood=" + neighborhood + "]";
	}

}
