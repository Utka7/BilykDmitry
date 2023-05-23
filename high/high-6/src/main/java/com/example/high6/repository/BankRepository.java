package com.example.high6.repository;

import com.example.high6.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

    @Modifying
    @Query("UPDATE Bank b SET b.name = :newName")
    void updateBankNames(@Param("newName") String newName);
}
