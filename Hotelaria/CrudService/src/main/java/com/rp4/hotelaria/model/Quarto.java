package com.rp4.hotelaria.model;

import com.rp4.hotelaria.Enuns.Status;

import javax.persistence.*;

@Entity
@Table(name = "tbl_registro_quarto")
public class Quarto {

    @Id
    @Column(name = "id_quarto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuarto;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Hotel", referencedColumnName = "id_hotel", nullable = false)
    private Hotel hotel;

    @Column(name = "numeroDoQuarto")
    private int numeroDoQuarto;

    @Column(name = "preco")
    private double preco;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "adicionalDoQuarto")
    private String adicionalDoQuarto;

    @Enumerated(EnumType.STRING)
    private Status status;


    public Quarto() {
    }

    public Quarto(Long idQuarto, Hotel hotel, int numeroDoQuarto, double preco, String descricao, String adicionalDoQuarto, Status status) {
        this.idQuarto = idQuarto;
        this.hotel = hotel;
        this.numeroDoQuarto = numeroDoQuarto;
        this.preco = preco;
        this.descricao = descricao;
        this.adicionalDoQuarto = adicionalDoQuarto;
        this.status = status;
    }

    public Long getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(Long idQuarto) {
        this.idQuarto = idQuarto;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(int numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAdicionalDoQuarto() {
        return adicionalDoQuarto;
    }

    public void setAdicionalDoQuarto(String adicionalDoQuarto) {
        this.adicionalDoQuarto = adicionalDoQuarto;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
