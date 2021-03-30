package com.rp4.hotelaria.dto;

import com.rp4.hotelaria.Enuns.Status;
import com.rp4.hotelaria.model.Quarto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.xml.crypto.Data;

public class ManutencaoDTO {

    private Long id_manutencao;
    private String data;
    private double valorConserto;
    private String consertos;
    private Quarto quarto;
    //private Status status;


    public ManutencaoDTO(){

    }

    public ManutencaoDTO(Long id_manutencao, String data, double valorConserto, String consertos,
                         Quarto quarto, Status status){
        this.id_manutencao = id_manutencao;
        this.data = data;
        this.valorConserto = valorConserto;
        this.consertos = consertos;
        this.quarto = quarto;
       // this.status = status;
    }

    public Long getId_Manu() {
        return id_manutencao;
    }

    public void setId_Manu(Long id_manutencao) {
        this.id_manutencao = id_manutencao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValorConserto() { return valorConserto; }

    public void setValorConserto(double valorConserto) { this.valorConserto = valorConserto; }

    public String getConsertos() { return consertos; }

    public void setConsertos(String consertos) { this.consertos = consertos; }

    public com.rp4.hotelaria.model.Quarto getQuarto() { return quarto; }

    public void setQuarto(Quarto quarto) { this.quarto = quarto; }

    /*public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }*/
}
