package org.example.service;

import org.example.repository.BankRepository;
import org.hibernate.SessionFactory;

public class BankService {
    BankRepository bankRepository;

    public BankService(SessionFactory sessionFactory) {
        this.bankRepository = new BankRepository(sessionFactory);
    }

    public void updateBankNames(String name) {
        bankRepository.updateBankNames(name);
    }
}
