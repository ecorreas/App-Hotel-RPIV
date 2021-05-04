package com.rp4.servicos.interfaces;

import com.rp4.servicos.model.Reserva;
import com.rp4.servicos.model.Servico;

public interface IReservaService {
    void saveReserva(Reserva reserva);

    public Reserva updateReserva(Reserva reserva);

    public Reserva findReservaById(Long id);

    void deleteReserva(Long id);
}
