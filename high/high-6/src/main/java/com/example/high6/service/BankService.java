package com.example.high6.service;

import com.example.high6.repository.BankRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    private final BankRepository bankRepository;

    @Autowired
    public BankService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @Transactional
    public void updateBankNames(String newName) {
        bankRepository.updateBankNames(newName);
    }
}