package com.rp4.hotelaria.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_registro_turismo")
public class Turismo {

    @Id
    @Column(name = "id_turismo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTurismo;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_hotel", referencedColumnName = "id_hotel", nullable = false)
    private Hotel hotel;

    @Column(name = "data")
    private Date data;

    @Column(name = "hora")
    private String hora;

    public Turismo(){
    }

    public Turismo(Long idTurismo, Hotel hotel, Date data, String hora){
        this.idTurismo = idTurismo;
        this.hotel = hotel;
        this.data = data;
        this.hora = hora;
    }
    public Long getIdTurismo() {
        return idTurismo;
    }

    public void setIdTurismo(Long idTurismo) {
        this.idTurismo = idTurismo;
    }


    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
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
}
