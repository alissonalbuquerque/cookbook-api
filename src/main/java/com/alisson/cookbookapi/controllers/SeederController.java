package com.alisson.cookbookapi.controllers;

import com.alisson.cookbookapi.seeds.CategoriaSeeder;
import com.alisson.cookbookapi.seeds.ReceitaSeeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/seeder")
public class SeederController {

    @Autowired
    private CategoriaSeeder categoriaSeeder;

    @Autowired
    private ReceitaSeeder receitaSeeder;

    @GetMapping("/categoria")
    public String seedCategoria() {
        return categoriaSeeder.run();
    }

    @GetMapping("/receita")
    public String seedReceita() {
        return receitaSeeder.run();
    }
}
