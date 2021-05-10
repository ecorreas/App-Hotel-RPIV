package com.rp4.hotelaria.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_registro_hotel")
public class Hotel {

    @Id
    @Column(name = "id_hotel")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHotel;

    @OneToMany
    private List<Quarto> quartos;

    @Column(name = "codEndereco")
    private String codEndereco;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY)
    private Cidade cidade;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY)
    private Turismo turismo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "endereco")
    private String endereco;


    public Hotel() {

    }

    public Hotel(Long idHotel, String codEndereco, Cidade cidade, String descricao, String endereco, Turismo turismo) {
        this.idHotel = idHotel;
        this.codEndereco = codEndereco;
        this.descricao = descricao;
        this.endereco = endereco;
        this.cidade = cidade;
        this.turismo = turismo;
    }

    public Long getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Long idHotel) {
        this.idHotel = idHotel;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
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

    public Turismo getTurismo() {
        return turismo;
    }

    public void setTurismo(Turismo turismo) {
        this.turismo = turismo;
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
}
