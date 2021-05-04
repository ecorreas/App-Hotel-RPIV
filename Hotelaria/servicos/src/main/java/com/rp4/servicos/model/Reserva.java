package com.rp4.servicos.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Reserva_Serviços")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Long id;

    @DateTimeFormat(pattern = "MM/dd/yyy")
    @Column(name = "data", nullable = false)
    private Date data;

    @OneToMany
    private List<Servico> servicos;

    @Column(name = "valorReserva", nullable = false)
    private double valorReserva;

    public Reserva() {
    }

    public Reserva(Long id, Date data, List<Servico> servicos, double valorReserva) {
        this.id = id;
        this.data = data;
        this.servicos = servicos;
        this.valorReserva = valorReserva;
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

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public double getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(double valorReserva) {
        this.valorReserva = valorReserva;
    }
}
