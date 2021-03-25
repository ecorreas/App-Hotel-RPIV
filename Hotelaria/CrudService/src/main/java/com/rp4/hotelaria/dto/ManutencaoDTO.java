package com.rp4.hotelaria.dto;

import com.rp4.hotelaria.Enuns.Status;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.xml.crypto.Data;

public class ManutencaoDTO {

    private Long id_Manu;
    private Data data;
    private Status status;


    public ManutencaoDTO(){

    }

    public ManutencaoDTO(Long id_Manu, Data data, Status status){
        this.id_Manu = id_Manu;
        this.data = data;
        this.status = status;
    }

    public Long getId_Manu() {
        return id_Manu;
    }

    public void setId_Manu(Long id_Manu) {
        this.id_Manu = id_Manu;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
