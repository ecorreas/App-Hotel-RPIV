package com.rp4.reservaPasseioTuristico.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {
    @Id
    private Long id;

    public Hotel() {
    }

    public Hotel(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
