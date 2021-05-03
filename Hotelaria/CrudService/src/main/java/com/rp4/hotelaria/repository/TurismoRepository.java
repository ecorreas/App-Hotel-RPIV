package com.rp4.hotelaria.repository;

import com.rp4.hotelaria.model.Turismo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurismoRepository extends JpaRepository<Turismo, Long> {

    Turismo findByIdTurismo(Long id);
}
