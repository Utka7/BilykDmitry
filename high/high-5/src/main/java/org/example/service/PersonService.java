package org.example.service;

import org.example.dto.PersonDTO;
import org.example.repository.PersonRepository;
import org.hibernate.SessionFactory;

import java.util.List;

public class PersonService {
    private PersonRepository personRepository;

    public PersonService(SessionFactory sessionFactory) {
        this.personRepository = new PersonRepository(sessionFactory);
    }

    public List<PersonDTO> getAllPersons() {
        return personRepository.getAllPersons();
    }

}

