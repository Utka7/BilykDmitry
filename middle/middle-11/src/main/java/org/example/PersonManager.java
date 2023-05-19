package org.example;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PersonManager {

    public List<String> getAddressesOfPersonsOlderThan(int age, List<Person> list){
        var adresses = list.stream()
                .filter(Objects::nonNull)
                .filter(person -> person.getAge() > age)
                .map(Person::getAddress)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        return adresses;
    }
}
