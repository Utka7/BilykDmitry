package com.example.high6;

import com.example.high6.service.BankService;
import com.example.high6.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class High6Application implements CommandLineRunner {
    private final PersonService personService;
    private final BankService bankService;

    public High6Application(PersonService personService, BankService bankService) {
        this.personService = personService;
        this.bankService = bankService;
    }

    public static void main(String[] args) {

        SpringApplication.run(High6Application.class, args);

    }

    @Override
    public void run(String... args) {
        var persons = personService.findAll();
        for (var person : persons) {
            System.out.println(person.getFullName());
        }
        var newName = "Сбербанк";
        bankService.updateBankNames(newName);
    }

}
