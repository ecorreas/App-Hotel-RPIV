package com.rp4.reservaPasseioTuristico.repository;

import com.rp4.reservaPasseioTuristico.model.Turismo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurismoRepository  extends JpaRepository<Turismo, Long> {
}
