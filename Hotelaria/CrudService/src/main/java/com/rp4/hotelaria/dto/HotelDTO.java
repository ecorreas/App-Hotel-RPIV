package com.rp4.hotelaria.dto;

import com.rp4.hotelaria.model.Cidade;

public class HotelDTO {

    private Long idHotel;
    private Long numeroQuarto;
    private String codEndereco;
    private Cidade cidade;
    private String descricao;
    private String endereco;
    private String status;
    private double preco;

    public HotelDTO() {

    }

    public HotelDTO(Long idHotel, Long numeroQuarto, String codEndereco, String descricao,
                    String endereco, String status, double preco, Cidade cidade) {
        this.idHotel = idHotel;
        this.numeroQuarto = numeroQuarto;
        this.codEndereco = codEndereco;
        this.cidade = cidade;
        this.descricao = descricao;
        this.endereco = endereco;
        this.status = status;
        this.preco = preco;
    }

    public Long getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Long idHotel) {
        this.idHotel = idHotel;
    }

    public Long getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Long numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(String codEndereco) {
        this.codEndereco = codEndereco;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
