package com.ricardo.personapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.personapi.dto.response.MessageResponseDTO;
import com.ricardo.personapi.entities.Person;
import com.ricardo.personapi.repository.PersonRepository;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
	
	
	private PersonRepository personRepository;
	
	@Autowired
	public PersonController(PersonRepository personRepository) {
		
		this.personRepository = personRepository;
		
	}
	
	
	@PostMapping
	public MessageResponseDTO createPerson(@RequestBody Person person) {
		Person savedPerson = personRepository.save(person);
		
		return MessageResponseDTO
				.builder()
				.message("Created perso with ID " + savedPerson.getId())
				.build();
		
	
	}
	
}
