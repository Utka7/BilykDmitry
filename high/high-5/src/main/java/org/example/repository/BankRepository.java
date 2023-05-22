package org.example.repository;

import lombok.AllArgsConstructor;
import lombok.var;
import org.example.entity.Bank;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

@AllArgsConstructor
public class BankRepository {
    SessionFactory sessionFactory;

    public void updateBankNames(String newName) {

        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            String hql = "FROM Bank";
            List<Bank> banks = session.createQuery(hql, Bank.class).list();

            for (var bank : banks) {
                bank.setName(newName);
                session.update(bank);
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
