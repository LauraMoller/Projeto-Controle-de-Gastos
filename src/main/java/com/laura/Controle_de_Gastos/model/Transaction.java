package com.laura.Controle_de_Gastos.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Transaction {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private BigDecimal value;
    private LocalDate data;
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    private String category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getData() {
        return data;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setDescricao(String description) {
        this.description = description;
    }
}
