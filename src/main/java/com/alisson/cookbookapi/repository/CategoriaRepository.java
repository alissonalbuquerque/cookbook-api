package com.alisson.cookbookapi.repository;

import com.alisson.cookbookapi.models.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}
