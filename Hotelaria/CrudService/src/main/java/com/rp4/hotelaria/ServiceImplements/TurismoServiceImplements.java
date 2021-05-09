package com.rp4.hotelaria.ServiceImplements;

import com.rp4.hotelaria.ProducerMensagem.TurismoProducer;
import com.rp4.hotelaria.interfaces.ITurismoService;
import com.rp4.hotelaria.model.Turismo;
import com.rp4.hotelaria.repository.TurismoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurismoServiceImplements implements ITurismoService {
    private TurismoRepository turismoRepository;
    private TurismoProducer turismoProducer;


    @Autowired
    public TurismoServiceImplements(TurismoRepository turismoR, TurismoProducer turismoProducer){
        this.turismoRepository = turismoR;
        this.turismoProducer = turismoProducer;

    }

    @Override
    public void cadastrarTurismo(Turismo turismo) {
        turismoRepository.save(turismo);
        turismoProducer.producerMensagem(turismo);

    }

    @Override
    public Turismo getTurismoById(Long id) {
        return turismoRepository.findByIdTurismo(id);
    }

    @Override
    public Turismo atualizarTurismo(Turismo turismo) {
        return turismoRepository.save(turismo);
    }

    @Override
    public void excluirTurismo(Long id) {
        turismoRepository.deleteById(id);
    }

    @Override
    public List<Turismo> pegarTodosPasseios() {
        return turismoRepository.findAll();
    }
}
