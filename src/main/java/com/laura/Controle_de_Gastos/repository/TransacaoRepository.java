package com.laura.Controle_de_Gastos.repository;

import com.laura.Controle_de_Gastos.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
