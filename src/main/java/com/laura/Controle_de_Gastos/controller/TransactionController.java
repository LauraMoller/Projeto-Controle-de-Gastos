package com.laura.Controle_de_Gastos.controller;

import com.laura.Controle_de_Gastos.model.Transaction;
import com.laura.Controle_de_Gastos.service.TransactionService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/transactions/new")
    public String showForm(Model model) {
        model.addAttribute("transaction", new Transaction());
        return "transactions/form";
    }

    @PostMapping("/transactions")
    public String saveTransaction(@ModelAttribute Transaction transaction) {
        service.save(transaction);
        return "redirect:/transactions";
    }

    @PostMapping("/transactions/{id}/delete")
    public String deleteTransaction(@PathVariable Long id){
        service.delete(id);
        return "redirect:/transactions";
    }
}
