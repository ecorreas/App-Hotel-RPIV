package com.rp4.hotelaria.repository;

import com.rp4.hotelaria.model.Hotel;
import com.rp4.hotelaria.model.Manutencao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManutencaoRepository extends JpaRepository<Manutencao, Long> {

    Manutencao findManutencaoById_manutencao(Long id);
}
