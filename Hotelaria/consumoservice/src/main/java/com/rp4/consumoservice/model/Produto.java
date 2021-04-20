package com.rp4.consumoservice.model;

import javax.persistence.*;

@Entity
public class Produto {
    @Id
    @Column(name = "id_produto")
    private Long id;

    @Column(name = "preco")
    private double preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
