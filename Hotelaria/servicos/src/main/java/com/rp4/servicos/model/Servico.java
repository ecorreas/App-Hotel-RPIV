package com.rp4.servicos.model;

import javax.persistence.*;

@Entity
public class Servico {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_serviço")
    private String servico;

    @Column(name = "valor")
    private double valor;

    @ManyToOne
    private Hotel hotel;



    public Long getId() {
        return id;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
