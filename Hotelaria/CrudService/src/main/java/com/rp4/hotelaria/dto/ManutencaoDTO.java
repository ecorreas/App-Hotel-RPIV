package com.rp4.hotelaria.dto;

import com.rp4.hotelaria.Enuns.Status;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.xml.crypto.Data;

public class ManutencaoDTO {

    private Long id_manutencao;
    private Data data;
    private Status status;


    public ManutencaoDTO(){

    }

    public ManutencaoDTO(Long id_manutencao, Data data, Status status){
        this.id_manutencao = id_manutencao;
        this.data = data;
        this.status = status;
    }

    public Long getId_Manu() {
        return id_manutencao;
    }

    public void setId_Manu(Long id_manutencao) {
        this.id_manutencao = id_manutencao;
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
