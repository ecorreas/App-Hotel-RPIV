package com.rp4.hotelaria.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_registro_FolhasPagamento")
public class FolhaPagamento {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    private Funcionario funcionario;

    @Column(name = "salario")
    private double salario;

    @Column(name = "horasExtras")
    private String horasExtras;

    @Column(name = "horaEntrada")
    private String horaEntrada;

    @Column(name = "horaSaida")
    private String horaSaida;


    public FolhaPagamento() {
    }

    public FolhaPagamento(Long id, Funcionario funcionario, double salario, String horasExtras,
                          String horaEntrada, String horaSaida) {
        this.id = id;
        this.funcionario = funcionario;
        this.salario = salario;
        this.horasExtras = horasExtras;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(String horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }
}





