package com.rp4.consumoservice.dto;


import com.rp4.consumoservice.model.Produto;

import java.util.Date;

public class ConsumoDTO {
    private Long id;
    private Date data;
    private Produto produto;
    private double valorConsumo;

    public ConsumoDTO() {
    }

    public ConsumoDTO(Long id, Date data, Produto produto, double valorConsumo) {
        this.id = id;
        this.data = data;
        this.produto = produto;
        this.valorConsumo = valorConsumo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getValorConsumo() {
        return valorConsumo;
    }

    public void setValorConsumo(double valorConsumo) {
        this.valorConsumo = valorConsumo;
    }
}
