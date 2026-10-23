package com.laura.Controle_de_Gastos.repository;

import com.laura.Controle_de_Gastos.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
