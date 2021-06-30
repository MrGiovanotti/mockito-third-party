package com.mrgiovanotti.thirdparty.services;

import java.util.List;

import com.mrgiovanotti.thirdparty.entities.dto.PersonDTO;

public interface PersonService {

	PersonDTO findById(Long id);
	PersonDTO findByIdentificationNumber(String identificationNumber);
	List<PersonDTO> findAll();

}
