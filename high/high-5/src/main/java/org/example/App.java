package org.example;

import lombok.var;
import org.example.dto.PersonDTO;
import org.example.entity.Person;
import org.example.service.PersonService;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Person.class);
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            PersonService personService = new PersonService(sessionFactory);
            List<PersonDTO> persons = personService.getAllPersons();

            for (var person : persons) {
                System.out.println(person.getFullName());
            }
        }

    }
}
