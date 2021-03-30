package com.rp4.hotelaria.interfaces;

import com.rp4.hotelaria.Enuns.Status;
import com.rp4.hotelaria.model.Manutencao;

import java.util.List;

public interface IManutencaoService {

    public Manutencao getManutencaoByStatus(Status status);

    public Manutencao atualizarManutencao(Manutencao manutencao);

    public List<Manutencao> pegarTodasManutencoes();

}
