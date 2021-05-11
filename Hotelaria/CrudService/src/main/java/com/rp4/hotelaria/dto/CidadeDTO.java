package com.rp4.hotelaria.dto;

public class CidadeDTO {

    private Long idCidade;
    private String nome;
    private String estado;
    private String regiao;
    private String pais;
    private String ddd;

    public CidadeDTO(){}

    public CidadeDTO(Long idCidade, String nome, String estado, String regiao,
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
}
