package com.rp4.servicos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Usuario {
    @Id
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToMany
    private List<ReservaServico> solicitarServico;

    public Usuario(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Usuario() {
    }

    public List<ReservaServico> getSolicitarServico() {
        return solicitarServico;
    }

    public void setSolicitarServico(List<ReservaServico> solicitarServico) {
        this.solicitarServico = solicitarServico;
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
