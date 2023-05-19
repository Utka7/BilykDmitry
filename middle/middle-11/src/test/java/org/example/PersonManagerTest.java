package org.example;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class PersonManagerTest {

    @Test
    void getAddressesOfPersonsOlderThan_PersonsWithCorrectAdresses_ExpectedResult() {
        var persons = new ArrayList<Person>();

        var person1 = new Person(15);
        person1.setAddress("Address 1");
        persons.add(person1);

        var person2 = new Person(15);
        person1.setAddress("Address 2");
        persons.add(person1);

        var personManager = new PersonManager();
        var age = 14;
        var result = personManager.getAddressesOfPersonsOlderThan(age, persons);

        var expectedResult = 2;
        var actualResult = result.size();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getAddressesOfPersonsOlderThan_PersonsWithNullAdresses_ExpectedResult() {
        var persons = new ArrayList<Person>();

        var person1 = new Person(15);
        person1.setAddress(null);
        persons.add(person1);

        var person2 = new Person(15);
        person1.setAddress(null);
        persons.add(person1);

        var personManager = new PersonManager();
        var age = 14;
        var result = personManager.getAddressesOfPersonsOlderThan(age, persons);

        var expectedResult = 0;
        var actualResult = result.size();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getAddressesOfPersonsOlderThan_NullList_ExpectedResult() {
        var persons = new ArrayList<Person>();

        persons.add(null);
        persons.add(null);
        persons.add(null);

        var personManager = new PersonManager();
        var age = 14;
        var result = personManager.getAddressesOfPersonsOlderThan(age, persons);

        var expectedResult = 0;
        var actualResult = result.size();

        Assert.assertEquals(expectedResult, actualResult);
    }
}