package com.laura.Controle_de_Gastos.service;

import com.laura.Controle_de_Gastos.model.Transaction;
import com.laura.Controle_de_Gastos.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public List<Transaction> getAll() {
        return repository.findAll();
    }

    public Transaction searchById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Transação não encontrada"));
    }

    public void save(Transaction transaction) {
        repository.save(transaction);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
