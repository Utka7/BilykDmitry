package org.example;

import org.example.dao.PersonDAO;
import org.example.models.Person;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        var configFile = "application.properties";
        var personDAO = new PersonDAO(configFile);
        List<Person> persons = personDAO.getAllPersons();
        for (var person :persons){
            System.out.println(person.getFullName());
        }
    }
}