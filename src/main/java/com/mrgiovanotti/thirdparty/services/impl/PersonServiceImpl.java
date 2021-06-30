package com.mrgiovanotti.thirdparty.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mrgiovanotti.thirdparty.entities.Person;
import com.mrgiovanotti.thirdparty.entities.dto.PersonDTO;
import com.mrgiovanotti.thirdparty.repositories.PersonRepository;
import com.mrgiovanotti.thirdparty.services.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepository personRepository;

	@Override
	@Transactional(readOnly = true)
	public PersonDTO findById(Long id) {
		Optional<Person> person = personRepository.findById(id);
		if (person.isPresent()) {
			return new PersonDTO(person.get());
		}
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public PersonDTO findByIdentificationNumber(String identificationNumber) {
		Optional<Person> person = personRepository.findByIdentificationNumber(identificationNumber);
		if (person.isPresent()) {
			return new PersonDTO(person.get());
		}
		return null;
	}

	@Override
	public List<PersonDTO> findAll() {
		List<Person> persons = personRepository.findAll();
		return persons.stream().map(PersonDTO::new).collect(Collectors.toList());
	}

}
