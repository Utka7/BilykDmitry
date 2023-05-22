package org.example.service;

import org.example.DTO.PersonDTO;
import org.example.dao.PersonDAO;

import java.sql.SQLException;
import java.util.List;

public class PersonService {
    private PersonDAO personDAO;

    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public List<PersonDTO>  getAllPersons() throws SQLException {
        return personDAO.getAllPersons();
    }

}
