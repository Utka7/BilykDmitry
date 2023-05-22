package org.example.service;

import org.example.DTO.BankDTO;
import org.example.DTO.PersonDTO;
import org.example.dao.BankDAO;
import org.example.dao.PersonDAO;

import java.sql.SQLException;
import java.util.List;

public class BankService {
    private BankDAO bankDAO;

    public BankService(BankDAO bankDAO) {
        this.bankDAO = bankDAO;
    }

    public void updateBankNames(String Name) throws SQLException {
        bankDAO.updateBankNames(Name);
    }
}
