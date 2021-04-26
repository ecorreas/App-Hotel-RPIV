package com.rp4.hotelaria.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "tbl_cidade")

    public class Cidade {

    @Id
    @Column(name = "id_cidade")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCidade;

    @Column(name = "nome")
    private String nome;

    @Column(name = "estado")
    private String estado;

    @Column(name = "regiao")
    private String regiao;

    @Column(name = "pais")
    private String pais;

    @Column(name = "ddd")
    private String ddd;

    @OneToMany
    @JoinColumn(name = "id_hotel")
    private List<Hotel> hoteis;

    public Cidade(){

    }

    public Cidade(Long idCidade, String nome, String estado, String regiao,
                  String pais, String ddd){
        this.idCidade = idCidade;
        this.nome = nome;
        this.estado = estado;
        this.regiao = regiao;
        this.pais = pais;
        this.ddd = ddd;

    }

    public Long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public List<Hotel> getHoteis() {
        return hoteis;
    }
}
