package com.rp4.hotelaria.ServiceImplements;


import com.rp4.hotelaria.interfaces.IProduto;
import com.rp4.hotelaria.model.Produto;
import com.rp4.hotelaria.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

@Service
public class ProdutoServiceImplements implements IProduto {

    private ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoServiceImplements(ProdutoRepository estoqueR){
        this.produtoRepository = estoqueR;
    }

    @Override
    @Transactional
    public void salvarProduto(Produto produto) {
        produtoRepository.save(produto);
    }

    @Override
    public Produto getProdutoById(Long id) {
        return produtoRepository.findProdutoById(id);
    }

    @Override
    public List<Produto> pegarTodosProdutos() {
        return produtoRepository.findAll();
    }

    @Override
    public void excluirProduto(Long id) {
    produtoRepository.deleteById(id);
    }

    @Override
    public Produto atualizarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
}
