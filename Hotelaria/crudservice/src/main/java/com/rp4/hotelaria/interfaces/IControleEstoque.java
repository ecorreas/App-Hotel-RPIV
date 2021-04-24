package com.rp4.hotelaria.interfaces;

import com.rp4.hotelaria.model.Estoque;

import java.util.List;

public interface IControleEstoque {

    public void salvarEstoque(Estoque estoque);

    public Estoque getEstoqueById(Long id);

    public List<Estoque> pegarTodosItensEstoque();

    public void excluirEstoque(Long id);

    public Estoque atualizarEstoque(Estoque estoque);

}
