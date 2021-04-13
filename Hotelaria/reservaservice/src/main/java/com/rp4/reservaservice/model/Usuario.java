package com.rp4.reservaservice.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Usuario {
    @Id
    private Long id;

    @Column(name = "nome")
    private String nome;

//    @OneToOne
//    private List<Quarto> quartos;

    public Usuario(String nome){
        this.nome = nome;
    }

    public Usuario() {
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
