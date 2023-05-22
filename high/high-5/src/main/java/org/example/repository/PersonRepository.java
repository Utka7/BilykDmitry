package org.example.repository;

import lombok.AllArgsConstructor;
import lombok.var;
import org.example.dto.PersonDTO;
import org.example.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class PersonRepository {
    SessionFactory sessionFactory;


    public List<PersonDTO> getAllPersons() {
        var persons = new ArrayList<PersonDTO>();
        Session session = null;

        try {
            session = sessionFactory.openSession();
            String hql = "FROM Person";
            List<Person> entities = session.createQuery(hql, Person.class).list();

            for (Person entity : entities) {
                PersonDTO dto = new PersonDTO(entity.getId(), entity.getFullName());
                persons.add(dto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return persons;
    }
}
