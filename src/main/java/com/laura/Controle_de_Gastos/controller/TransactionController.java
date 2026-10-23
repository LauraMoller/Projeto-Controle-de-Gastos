package com.laura.Controle_de_Gastos.controller;

import com.laura.Controle_de_Gastos.service.TransactionService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TransactionController {
    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @GetMapping("/transactions")
    public String showTransactions(Model model) {
        model.addAttribute("transactions", service.getAll());
        return "transactions/list";
    }
}
