package com.rp4.reservaPasseioTuristico.dto;

import com.rp4.reservaPasseioTuristico.model.Turismo;

import java.util.Date;

public class ReservaDTO {
    private Long id;

    private Date data;

    private String hora;

    private Turismo turismo;

    public ReservaDTO() {
    }

    public ReservaDTO(Long id, Date data, String hora, Turismo turismo) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.turismo = turismo;
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Turismo getTurismo() {
        return turismo;
    }

    public void setTurismo(Turismo turismo) {
        this.turismo = turismo;
    }
}
