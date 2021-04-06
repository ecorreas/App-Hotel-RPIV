package com.rp4.reservaservice.interfaces;

import com.rp4.reservaservice.model.Reserva;

public interface IReservaService {

    void saveReserva(Reserva reserva);
    public Reserva updateReserva(Reserva reserva);
    public Reserva findReservaById(Long id);
}
