package com.alisson.cookbookapi.services;

import java.util.List;

import com.alisson.cookbookapi.models.Categoria;
import com.alisson.cookbookapi.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> getAll() {
        return categoriaRepository.findAll();
    }

    public Categoria findById(Long id) {
        return categoriaRepository.findById(id).get();
    }

    public Categoria create(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria update(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria delete(Long id) {
        Categoria categoria = categoriaRepository.findById(id).get();
        categoriaRepository.deleteById(id);
        return categoria;
    }

}
