package com.rp4.reservaPasseioTuristico.serviceImplements;

import com.rp4.reservaPasseioTuristico.interfaces.IReserva;
import com.rp4.reservaPasseioTuristico.model.Reserva;
import com.rp4.reservaPasseioTuristico.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImplements implements IReserva {

    private ReservaRepository reservaRepository;

    @Autowired
    public ReservaServiceImplements(ReservaRepository reservaR) {
        this.reservaRepository = reservaR;

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


}