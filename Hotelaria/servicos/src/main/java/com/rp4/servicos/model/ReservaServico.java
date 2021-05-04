package com.rp4.servicos.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "serviços_solicitados")
public class ReservaServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Long id;

    @DateTimeFormat(pattern = "MM/dd/yyy")
    @Column(name = "data", nullable = false)
    private Date data;

     @ManyToOne
    private Usuario usuario;

    @OneToOne
    private Servico servico;

    @Column(name = "valorReserva", nullable = false)
    private double valorReserva;

    public ReservaServico() {
    }

    public ReservaServico(Long id, Date data, Usuario usuario, double valorReserva) {
        this.id = id;
        this.data = data;
        this.usuario = usuario;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(double valorReserva) {
        this.valorReserva = valorReserva;
    }
}
