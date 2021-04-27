package com.rp4.reservaPasseioTuristico.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Turismo {

    @Id
    private Long id;

    public Turismo(){

    }

    public Turismo(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
