package com.laura.Controle_de_Gastos.service;

import com.laura.Controle_de_Gastos.model.Transaction;
import com.laura.Controle_de_Gastos.repository.TransacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransacaoService {
    private final TransacaoRepository repository;

    public TransacaoService(TransacaoRepository repository) {
        this.repository = repository;
    }

    public List<Transaction> getAll() {
        return repository.findAll();
    }

    public Transaction searchById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Transação não encontrada"));
    }

    public void save(Transaction transacao) {
        repository.save(transacao);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
