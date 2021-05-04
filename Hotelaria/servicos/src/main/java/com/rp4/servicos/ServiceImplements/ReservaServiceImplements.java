package com.rp4.servicos.ServiceImplements;

import com.rp4.servicos.interfaces.IReservaService;
import com.rp4.servicos.model.Reserva;
import com.rp4.servicos.model.Servico;
import com.rp4.servicos.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImplements implements IReservaService {

    private ReservaRepository reservaRepository;
    @Autowired
    public ReservaServiceImplements(ReservaRepository reservaRepository){
        this.reservaRepository = reservaRepository;
    }

    @Override
    public void saveReserva(Reserva reserva) {
        reservaRepository.save(reserva);
    }

    @Override
    public Reserva updateReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public Reserva findReservaById(Long id) {
        return reservaRepository.findReservaById(id);
    }

    @Override
    public void deleteReserva(Long id) { reservaRepository.deleteById(id); }

}
