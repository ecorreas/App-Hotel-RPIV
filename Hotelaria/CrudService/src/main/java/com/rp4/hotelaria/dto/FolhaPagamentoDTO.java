package com.rp4.hotelaria.dto;

import com.rp4.hotelaria.model.Funcionario;

public class FolhaPagamentoDTO {

    private long id;
    private Funcionario funcionario;
    private double salario;
    private String horasExtras;
    private String horaEntrada;
    private String horaSaida;

    public FolhaPagamentoDTO(){}

    public FolhaPagamentoDTO(Long id, Funcionario funcionario, double salario, String horasExtras,
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

    public com.rp4.hotelaria.model.Funcionario getFuncionario() {
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
