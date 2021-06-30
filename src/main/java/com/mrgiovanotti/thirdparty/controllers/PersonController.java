package com.mrgiovanotti.thirdparty.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrgiovanotti.thirdparty.entities.dto.PersonDTO;
import com.mrgiovanotti.thirdparty.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonService personService;

	@GetMapping("/view/id/{id}")
	public PersonDTO findPersonById(@PathVariable Long id) {
		return personService.findById(id);
	}

	@GetMapping("/view/identification/{identificationNumber}")
	public PersonDTO findPersonByIdentificationNumber(@PathVariable String identificationNumber) {
		return personService.findByIdentificationNumber(identificationNumber);
	}

	@GetMapping("/list")
	public List<PersonDTO> findAllPersons() {
		return personService.findAll();
	}

}
