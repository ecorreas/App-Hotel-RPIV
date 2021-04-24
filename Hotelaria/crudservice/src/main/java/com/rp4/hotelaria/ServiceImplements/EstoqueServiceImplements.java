package com.rp4.hotelaria.ServiceImplements;

import com.rp4.hotelaria.interfaces.IControleEstoque;
import com.rp4.hotelaria.model.Estoque;
import com.rp4.hotelaria.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

@Service
public class EstoqueServiceImplements implements IControleEstoque {

    private EstoqueRepository estoqueRepository;

    @Autowired
    public EstoqueServiceImplements(EstoqueRepository estoqueR){
        this.estoqueRepository = estoqueR;
    }

    @Override
    @Transactional
    public void salvarEstoque(Estoque estoque) {
        estoqueRepository.save(estoque);
    }

    @Override
    public Estoque getEstoqueById(Long id) {
        return estoqueRepository.findEstoqueById(id);
    }

    @Override
    public List<Estoque> pegarTodosItensEstoque() {
        return estoqueRepository.findAll();
    }

    @Override
    public void excluirEstoque(Long id) {
    estoqueRepository.deleteById(id);
    }

    @Override
    public Estoque atualizarEstoque(Estoque estoque) {
        return estoqueRepository.save(estoque);
    }
}
