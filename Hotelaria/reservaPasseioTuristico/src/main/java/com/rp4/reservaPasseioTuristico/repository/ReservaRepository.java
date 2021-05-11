package com.rp4.reservaPasseioTuristico.repository;

import com.rp4.reservaPasseioTuristico.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    Reserva findReservaById(Long id);
}
