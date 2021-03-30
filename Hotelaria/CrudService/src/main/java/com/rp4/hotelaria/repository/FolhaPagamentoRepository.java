package com.rp4.hotelaria.repository;

import com.rp4.hotelaria.model.FolhaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolhaPagamentoRepository extends JpaRepository<FolhaPagamento, Long> {

    FolhaPagamento getFolhaPagamentoById(Long id);
}
