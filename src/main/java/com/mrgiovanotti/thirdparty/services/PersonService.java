package com.mrgiovanotti.thirdparty.services;

import com.mrgiovanotti.thirdparty.entities.dto.PersonDTO;

public interface PersonService {

	PersonDTO findById(Long id);
	PersonDTO findByIdentificationNumber(String identificationNumber);

}
