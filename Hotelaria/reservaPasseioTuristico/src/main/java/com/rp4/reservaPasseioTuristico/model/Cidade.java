package com.rp4.reservaPasseioTuristico.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cidade {

    @Id
    private Long id;

    @Column(name = "nome")
    private String nome;


    public Cidade(String nome) {
        this.nome = nome;
    }

    public Cidade() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
