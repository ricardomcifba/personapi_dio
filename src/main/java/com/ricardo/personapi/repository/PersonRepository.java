package com.ricardo.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ricardo.personapi.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
