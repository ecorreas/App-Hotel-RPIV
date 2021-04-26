package com.rp4.hotelaria.interfaces;

import com.rp4.hotelaria.model.Cidade;

import java.util.List;

public interface ICidadeService {

    public void salvarCidade(Cidade cidade);

    public Cidade getCidadeById(Long id);

    public List<Cidade> pegarTodasCidades();

    public void excluirCidade(Long id);

    public Cidade atualizarCidade(Cidade cidade);
}
