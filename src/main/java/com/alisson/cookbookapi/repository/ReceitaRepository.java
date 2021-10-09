package com.alisson.cookbookapi.repository;

import com.alisson.cookbookapi.models.Receita;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita, Long>{
    
}
