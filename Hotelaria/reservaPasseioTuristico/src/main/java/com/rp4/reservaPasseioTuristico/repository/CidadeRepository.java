package com.rp4.reservaPasseioTuristico.repository;

import com.rp4.reservaPasseioTuristico.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
