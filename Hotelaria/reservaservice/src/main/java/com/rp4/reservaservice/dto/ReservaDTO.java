package com.rp4.reservaservice.dto;

import com.rp4.reservaservice.model.Quarto;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import java.util.Date;

public class ReservaDTO {
    private Long id;

    private Date dataInicio;

    private Date dataFinal;

    private Quarto quarto;

    private double valorReserva;


    public ReservaDTO() {
    }

    public ReservaDTO(Long id, Date dataInicio, Date dataFinal, Quarto quarto, double valorReserva) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.quarto = quarto;
        this.valorReserva = valorReserva;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
