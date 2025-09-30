package com.mohan.banking_app.repository;

import com.mohan.banking_app.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountIdOrderByTimeStampDesc(Long accountId);
}
