package com.alisson.cookbookapi.controllers;

import java.util.List;

import com.alisson.cookbookapi.models.Receita;
import com.alisson.cookbookapi.services.ReceitaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/receita")
public class ReceitaController {
    
    @Autowired
    private ReceitaService receitaService;

    @GetMapping("/all")
    public List<Receita> getAll() {
        return receitaService.getAll();
    }

    @GetMapping("/{id}")
    public Receita findById(@PathVariable Long id) {
        return receitaService.findById(id);
    }

    @GetMapping("lista/categoria/{id}")
    public List<Receita> filterByCategoria(@PathVariable Long id) {
        return receitaService.filterByCategoria(id);
    }

    @PostMapping("/create")
    public Receita create(@RequestBody Receita receita) {
        return receitaService.create(receita);
    }

    @PutMapping("/update")
    public Receita update(@RequestBody Receita receita) {
        return receitaService.update(receita);
    }

    @DeleteMapping("/delete/{id}")
    public Receita delete(@PathVariable Long id) {
        return receitaService.delete(id);
    }

}
