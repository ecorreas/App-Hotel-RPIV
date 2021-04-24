package com.rp4.hotelaria.repository;

import com.rp4.hotelaria.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

    Estoque findEstoqueById(Long id);
}
