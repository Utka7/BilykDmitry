package com.example.high6.service;

import com.example.high6.repository.BankRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.verify;

@SpringBootTest
public class BankServiceTest {
    private BankService bankService;

    @Mock
    private BankRepository bankRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        bankService = new BankService(bankRepository);
    }

    @Test
    void testUpdateBankNames() {
        String newName = "Сбер";

        bankService.updateBankNames(newName);

        verify(bankRepository).updateBankNames(newName);
    }
}
