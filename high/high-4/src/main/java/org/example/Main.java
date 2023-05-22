package org.example;

import org.example.dao.BankDAO;
import org.example.dao.PersonDAO;
import org.example.service.BankService;
import org.example.service.PersonService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        var configFile = "application.properties";
        var personDAO = new PersonDAO(configFile);
        var personService = new PersonService(personDAO);
        var persons = personService.getAllPersons();
        for (var person :persons){
            System.out.println(person.getFullName());
        }

        var bankDAO = new BankDAO(configFile);
        BankService bankService = new BankService(bankDAO);
        var name = "Aльфа Банк";
        bankService.updateBankNames(name);

    }
}