package com.rp4.hotelaria.ServiceImplements;

import com.rp4.hotelaria.interfaces.IManutencaoService;
import com.rp4.hotelaria.model.Manutencao;
import com.rp4.hotelaria.Enuns.Status;
import com.rp4.hotelaria.repository.ManutencaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ManutencaoServiceImplements implements IManutencaoService {

    private ManutencaoRepository manutencaoRepository;

    @Autowired
    public ManutencaoServiceImplements(ManutencaoRepository manutencaoR){
        this.manutencaoRepository = manutencaoR;

    }

    @Transactional
    @Override
    public void AddManutencao(Manutencao manutencao){
        manutencaoRepository.save(manutencao);
    }


    @Override
    public Manutencao getManutencaoByStatus(Status status) {
        return manutencaoRepository.findManutencaoByid_manutencao(status);
    }

    @Override
    public Manutencao atualizarManutencao(Manutencao manutencao) {
        return manutencaoRepository.save(manutencao);
    }

    @Override
    public List<Manutencao> pegarTodasManutencoes() {
        return manutencaoRepository.findAll();
    }


}
