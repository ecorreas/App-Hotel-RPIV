package com.rp4.hotelaria.model;

import com.rp4.hotelaria.Enuns.Status;

import javax.persistence.*;

@Entity
@Table(name = "tbl_registro_manutancao")
public class Manutencao {

    @Id
    @Column(name = "id_manutencao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_manutencao;

    @Column(name = "data")
    private String data;



    public Manutencao(){

    }

    public Manutencao(Long id_manutencao, String data ){

    }

    public Long getId_manutencao() {
        return id_manutencao;
    }

    public void setId_manutencao(Long id_manutencao) {
        this.id_manutencao = id_manutencao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
