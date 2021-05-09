package com.rp4.reservaPasseioTuristico.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Turismo {

    @Id
    private Long idTurismo;

    public Turismo(){

    }

    public Turismo(Long idTurismo) {
        this.idTurismo = idTurismo;
    }

    public Long getIdTurismo() {
        return idTurismo;
    }

    public void setIdTurismo(Long idTurismo) {
        this.idTurismo = idTurismo;
    }
}
