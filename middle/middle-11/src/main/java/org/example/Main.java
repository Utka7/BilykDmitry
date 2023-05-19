package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var persons = new ArrayList<Person>();
        for (var i = 0; i < 100; i++) {
            persons.add(PersonCreator.createPerson(10));
        }
        var personManager = new PersonManager();
        var adresses = personManager.getAddressesOfPersonsOlderThan(14, persons);
        adresses.forEach(System.out::println);
    }
}