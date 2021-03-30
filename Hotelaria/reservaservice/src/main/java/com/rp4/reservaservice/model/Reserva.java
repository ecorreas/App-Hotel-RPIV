package com.rp4.reservaservice.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Reserva {

    @Id
    private long id;

    @DateTimeFormat(pattern = "MM/dd/yyy")
    @Column(name = "dataInicio", nullable = false)
    private Date dataInicio;

    @DateTimeFormat(pattern = "MM/dd/yyy")
    @Column(name = "dataFinal", nullable = false)
    private Date dataFinal;

    @OneToOne(cascade = CascadeType.ALL)
    private Quarto quarto;

    @Column(name = "valorReserva", nullable = false)
    private double valorReserva;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public double getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(double valorReserva) {
        this.valorReserva = valorReserva;
    }
}
