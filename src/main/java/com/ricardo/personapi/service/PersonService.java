package com.ricardo.personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardo.personapi.dto.mapper.PersonMapper;
import com.ricardo.personapi.dto.request.PersonDTO;
import com.ricardo.personapi.dto.response.MessageResponseDTO;
import com.ricardo.personapi.entities.Person;
import com.ricardo.personapi.repository.PersonRepository;

@Service
public class PersonService {

	private PersonRepository personRepository;
	
	private final PersonMapper personMapper = PersonMapper.INSTANCE;

	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}	
	
	public MessageResponseDTO createPerson(PersonDTO personDTO) {				
		Person personToSave = personMapper.toModel(personDTO);
		Person savedPerson = personRepository.save(personToSave);		
		return MessageResponseDTO
				.builder()
				.message("Created person with ID " + savedPerson.getId())
				.build();
	}
	
	public List<PersonDTO> listALl(){
		
		
	}
		
}
