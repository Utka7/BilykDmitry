package org.example;

import org.example.dao.PersonDAO;
import org.example.models.Person;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        var personDAO = new PersonDAO();
        List<Person> persons = personDAO.getAllPersons();
        for (var person :persons){
            System.out.println(person.getFullName());
        }
    }
}