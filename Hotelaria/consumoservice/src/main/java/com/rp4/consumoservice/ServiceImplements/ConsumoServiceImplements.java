package com.rp4.consumoservice.ServiceImplements;

import com.rp4.consumoservice.interfaces.IConsumoService;
import com.rp4.consumoservice.model.Consumo;
import com.rp4.consumoservice.repository.ConsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumoServiceImplements implements IConsumoService {

    private ConsumoRepository consumoRepository;

    @Autowired
    public ConsumoServiceImplements(ConsumoRepository consumoRepository){
        this.consumoRepository = consumoRepository;
    }
    @Override
    public void saveConsumo(Consumo consumo) {
        consumoRepository.save(consumo);
    }

    @Override
    public Consumo updateConsumo(Consumo consumo) {
        return consumoRepository.save(consumo);
    }

    @Override
    public Consumo findConsumoById(Long id) {
        return consumoRepository.findConsumoById(id);
    }

    @Override
    public void deleteConsumo(Long id) {
        consumoRepository.deleteById(id);
    }
}
