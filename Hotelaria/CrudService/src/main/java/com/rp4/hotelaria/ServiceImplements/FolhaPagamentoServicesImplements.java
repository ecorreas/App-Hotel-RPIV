package com.rp4.hotelaria.ServiceImplements;

import com.rp4.hotelaria.interfaces.IFolhaPagamentoService;
import com.rp4.hotelaria.model.FolhaPagamento;
import com.rp4.hotelaria.repository.FolhaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FolhaPagamentoServicesImplements implements IFolhaPagamentoService {

    private FolhaPagamentoRepository folhaPagamentoRepository;

    @Autowired
    public FolhaPagamentoServicesImplements(FolhaPagamentoRepository folhaPagamentoR){
        this.folhaPagamentoRepository = folhaPagamentoR;
    }

    @Override
    @Transactional
    public void salvarFolhaPagamento(FolhaPagamento folhaPagamento) {
        folhaPagamentoRepository.save(folhaPagamento);
    }

    @Override
    public FolhaPagamento getFolhaPagById(Long id) {
        return folhaPagamentoRepository.getFolhaPagamentoById(id);
    }

    @Override
    public FolhaPagamento atualizarFolha(FolhaPagamento folhaPagamento) {
        return folhaPagamentoRepository.save(folhaPagamento);
    }

    @Override
    public void excluirFolha(Long id) {
        folhaPagamentoRepository.deleteById(id);
    }

    @Override
    public List<FolhaPagamento> pegarTodasFolhas() {
        return folhaPagamentoRepository.findAll();
    }
}
