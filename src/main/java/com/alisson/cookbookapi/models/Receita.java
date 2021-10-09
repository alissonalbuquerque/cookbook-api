package com.alisson.cookbookapi.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="receitas")
public class Receita {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String titulo;
    
    @Column
    private String ingredientes;
    
    @Column
    private String preparo;
    
    @Column
    @Temporal(TemporalType.TIME)
    @JsonFormat(pattern = "hh:mm")
    private Date tempo_preparo;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Receita() {

    }

    public Receita(Long id, String titulo, String ingredientes, String preparo, Date tempo_preparo, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.preparo = preparo;
        this.tempo_preparo = tempo_preparo;
        this.categoria = categoria;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIngredientes() {
        return this.ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparo() {
        return this.preparo;
    }

    public void setPreparo(String preparo) {
        this.preparo = preparo;
    }

    public Date getTempoPreparo() {
        return this.tempo_preparo;
    }

    public void setTempoPreparo(Date tempo_preparo) {
        this.tempo_preparo = tempo_preparo;
    }
    
    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
}
