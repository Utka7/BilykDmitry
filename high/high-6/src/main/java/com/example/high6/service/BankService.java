package com.example.high6.service;

import com.example.high6.repository.BankRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BankService {

    private final BankRepository bankRepository;

    @Transactional
    public void updateBankNames(String newName) {
        bankRepository.updateBankNames(newName);
    }
}