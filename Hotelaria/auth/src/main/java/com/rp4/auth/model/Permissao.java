package com.rp4.auth.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "permissao")
public class Permissao implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    public Permissao() {
    }

    public Permissao(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public String getAuthority() {
        return this.descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
