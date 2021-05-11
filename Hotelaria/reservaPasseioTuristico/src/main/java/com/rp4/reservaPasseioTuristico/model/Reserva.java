package com.rp4.reservaPasseioTuristico.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @DateTimeFormat(pattern = "MM/dd/yyy")
    @Column(name = "data", nullable = false)
    private Date data;

    @Column(name = "hora")
    private String hora;

    @OneToOne(cascade = CascadeType.ALL)
    private Turismo turismo;

    public Reserva() {

    }

    public Reserva(long id, Date data, Turismo turismo) {
        this.id = id;
        this.data = data;
        this.turismo = turismo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date dataInicio) {
        this.data = data;
    }

    public Turismo getTurismo() {
        return turismo;
    }

    public void setTurismo(Turismo turismo) {
        this.turismo = turismo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
