package com.rp4.reservaPasseioTuristico.interfaces;

import com.rp4.reservaPasseioTuristico.model.Reserva;

public interface IReserva {

        void saveReserva(Reserva reserva);

        public Reserva updateReserva(Reserva reserva);

        public Reserva findReservaById(Long id);
}


