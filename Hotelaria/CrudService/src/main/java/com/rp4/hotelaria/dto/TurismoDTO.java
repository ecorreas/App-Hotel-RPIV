package com.rp4.hotelaria.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rp4.hotelaria.model.Hotel;

import java.util.Date;

public class TurismoDTO {

    private Long idTurismo;
    private Hotel hotel;
    private Date data;
    private String hora;

    public TurismoDTO(){

    }

    public TurismoDTO(Long idTurismo, Hotel hotel, Date data, String hora){
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

    public void setDataReserva(Date dataReserva) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

}
