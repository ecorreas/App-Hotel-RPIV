package com.rp4.servicos.dto;

import java.util.Date;

public class ReservaDTO {
    private Long id;

    private Date data;

    private double valorReserva;

    public ReservaDTO() {
    }

    public ReservaDTO(Long id, Date data, double valorReserva) {
        this.id = id;
        this.data = data;
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

    public double getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(double valorReserva) {
        this.valorReserva = valorReserva;
    }
}
