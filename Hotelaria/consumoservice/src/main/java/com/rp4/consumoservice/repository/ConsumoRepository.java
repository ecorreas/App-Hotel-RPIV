package com.rp4.consumoservice.repository;

import com.rp4.consumoservice.model.Consumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumoRepository extends JpaRepository<Consumo, Long> {
    Consumo findConsumoById(Long id);
}
