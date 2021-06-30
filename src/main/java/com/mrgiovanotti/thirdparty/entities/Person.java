package com.mrgiovanotti.thirdparty.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.mrgiovanotti.thirdparty.entities.dto.PersonDTO;

@Entity
@Table(name = "persons")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "identification_number", unique = true)
	private String identificationNumber;

	private String name;

	@Column(name = "birth_date")
	private LocalDate birthDate;

	private boolean vaccinated;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Neighborhood neighborhood;

	public Person() {

	}

	public Person(PersonDTO personDTO) {
		id = personDTO.getId();
		identificationNumber = personDTO.getIdentificationNumber();
		name = personDTO.getName();
		birthDate = personDTO.getBirthDate();
		vaccinated = personDTO.isVaccinated();
		neighborhood = new Neighborhood(personDTO.getNeighborhood());
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

	public Neighborhood getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(Neighborhood neighborhood) {
		this.neighborhood = neighborhood;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", identificationNumber=" + identificationNumber + ", name="
				+ name + ", birthDate=" + birthDate + ", vaccinated=" + vaccinated
				+ ", neighborhood=" + neighborhood + "]";
	}

}
