package com.rp4.hotelaria.interfaces;

import com.rp4.hotelaria.model.Manutencao;

import java.util.List;

public interface IManutencaoService {

    public void salvarManutencao(Manutencao manutencao);

    public Manutencao getManutencaoById(Long id);

    public Manutencao atualizarManutencao(Manutencao manutencao);

    public void excluirManutencao(Long id);

    public List<Manutencao> pegarTodasManutencoes();

}
