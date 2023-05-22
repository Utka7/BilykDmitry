package org.example.service;

import org.example.dao.BankDAO;

import java.sql.SQLException;

public class BankService {
    private BankDAO bankDAO;

    public BankService(BankDAO bankDAO) {
        this.bankDAO = bankDAO;
    }

    public void updateBankNames(String Name) throws SQLException {
        bankDAO.updateBankNames(Name);
    }
}
