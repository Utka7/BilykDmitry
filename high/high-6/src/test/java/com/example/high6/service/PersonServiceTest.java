package com.example.high6.service;

import com.example.high6.entity.Person;
import com.example.high6.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class PersonServiceTest {
    private PersonService personService;

    @Mock
    private PersonRepository personRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        personService = new PersonService(personRepository);
    }

    @Test
    void testFindAll_UsualList_ReturnExpectedResult() {
        var expectedPersons = new ArrayList<Person>();
        expectedPersons.add(new Person(1L, "John Doe"));
        expectedPersons.add(new Person(2L, "Jane Smith"));

        when(personRepository.findAll()).thenReturn(expectedPersons);

        List<Person> actualPersons = personService.findAll();

        assertEquals(expectedPersons.size(), actualPersons.size());
        for (var i = 0; i < expectedPersons.size(); i++) {
            var expectedPerson = expectedPersons.get(i);
            var actualPerson = actualPersons.get(i);
            assertEquals(expectedPerson.getId(), actualPerson.getId());
            assertEquals(expectedPerson.getFullName(), actualPerson.getFullName());
        }
    }
}