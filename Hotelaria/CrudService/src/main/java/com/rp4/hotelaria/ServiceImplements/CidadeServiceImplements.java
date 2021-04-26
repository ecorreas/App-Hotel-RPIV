package com.rp4.hotelaria.ServiceImplements;

import com.rp4.hotelaria.ProducerMensagem.CidadeProducer;
import com.rp4.hotelaria.ProducerMensagem.ProdutoProducer;
import com.rp4.hotelaria.interfaces.ICidadeService;
import com.rp4.hotelaria.model.Cidade;
import com.rp4.hotelaria.model.Produto;
import com.rp4.hotelaria.repository.CidadeRepository;
import com.rp4.hotelaria.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CidadeServiceImplements implements ICidadeService {

    private CidadeRepository cidadeRepository;
    private CidadeProducer cidadeProducer;

    @Autowired
    public CidadeServiceImplements(CidadeRepository cidadeRepository, CidadeProducer cidadeProducer){
        this.cidadeRepository = cidadeRepository;
        this.cidadeProducer = cidadeProducer;
    }

    @Override
    @Transactional
    public void salvarCidade(Cidade cidade) {
        cidadeRepository.save(cidade);
        cidadeProducer.producerMensagem(cidade);
    }

    @Override
    public Cidade getCidadeById(Long id) {
        return cidadeRepository.findCidadeById(id);
    }

    @Override
    public List<Cidade> pegarTodasCidades() {
        return cidadeRepository.findAll();
    }

    @Override
    public void excluirCidade(Long id) {
        cidadeRepository.deleteById(id);
    }

    @Override
    public Cidade atualizarCidade(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }
}

