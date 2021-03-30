package com.rp4.hotelaria.interfaces;

import com.rp4.hotelaria.model.FolhaPagamento;

import java.util.List;

public interface IFolhaPagamentoService {

    public void salvarFolhaPagamento(FolhaPagamento folhaPagamento);

    public FolhaPagamento getFolhaPagById(Long id);

    public FolhaPagamento atualizarFolha(FolhaPagamento folhaPagamento);

    public void excluirFolha(Long id);

    public List<FolhaPagamento> pegarTodasFolhas();

}
