package com.alisson.cookbookapi.services;

import java.util.List;
import java.util.stream.Collectors;

import com.alisson.cookbookapi.models.Receita;
import com.alisson.cookbookapi.repository.ReceitaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceitaService {
    
    @Autowired
    private ReceitaRepository receitaRepository;

    public List<Receita> getAll() {
        return receitaRepository.findAll();
    }

    public Receita findById(Long id) {
        return receitaRepository.findById(id).get();
    }

    public List<Receita> filterByCategoria(Long id) {
        return
            receitaRepository.findAll()
            .stream()
            .filter(receita -> receita.getCategoria().getId().equals(id))
            .collect(Collectors.toList());
    }

    public Receita create(Receita receita) {
        return receitaRepository.save(receita);
    }

    public Receita update(Receita receita) {
        return receitaRepository.save(receita);
    }

    public Receita delete(Long id) {
        Receita receita = receitaRepository.findById(id).get();
        receitaRepository.deleteById(id);
        return receita;
    }
    
}
