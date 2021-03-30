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

    @Column(name = "valorConserto")
    private double valorConserto;

    @Column(name = "consertos")
    private String consertos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_quarto", referencedColumnName = "id_quarto", nullable = false)
    private Quarto quarto;

    public Manutencao(){

    }

    public Manutencao(Long id_manutencao, String data, Quarto quarto, String consertos, double valorConserto){
        this.id_manutencao = id_manutencao;
        this.data = data;
        this.valorConserto = valorConserto;
        this.consertos = consertos;
        this.quarto = quarto;


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

    public Quarto getQuarto() { return quarto; }

    public void setQuarto(Quarto quarto) { this.quarto = quarto; }

    public double getValorConserto() {
        return valorConserto;
    }

    public void setValorConserto(double valorConserto) {
        this.valorConserto = valorConserto;
    }

    public String getConsertos() {
        return consertos;
    }

    public void setConsertos(String consertos) {
        this.consertos = consertos;
    }
}
