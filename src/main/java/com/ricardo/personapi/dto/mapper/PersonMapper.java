package com.ricardo.personapi.dto.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ricardo.personapi.dto.request.PersonDTO;
import com.ricardo.personapi.entities.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}