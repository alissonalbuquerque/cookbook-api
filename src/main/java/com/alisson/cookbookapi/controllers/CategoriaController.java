package com.alisson.cookbookapi.controllers;

import java.util.List;

import com.alisson.cookbookapi.models.Categoria;
import com.alisson.cookbookapi.services.CategoriaService;

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
@RequestMapping(value = "/api/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/all")
    public List<Categoria> getAll() {
        return categoriaService.getAll();
    }

    @GetMapping("/{id}")
    public Categoria findById(@PathVariable Long id) {
        return categoriaService.findById(id);
    }

    @PostMapping("/create")
    public Categoria create(@RequestBody Categoria categoria) {
        return categoriaService.create(categoria);
    }

    @PutMapping("/update")
    public Categoria update(@RequestBody Categoria categoria) {
        return categoriaService.update(categoria);
    }

    @DeleteMapping("/delete/{id}")
    public Categoria delete(@PathVariable Long id) {
        return categoriaService.delete(id);
    }

}
