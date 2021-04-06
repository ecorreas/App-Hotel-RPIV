package com.rp4.reservaservice.repository;

import com.rp4.reservaservice.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    Reserva findReservaById(Long id);
}
