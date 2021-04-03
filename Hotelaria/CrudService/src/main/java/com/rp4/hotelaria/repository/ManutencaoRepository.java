package com.rp4.hotelaria.repository;

import com.rp4.hotelaria.Enuns.Status;
import com.rp4.hotelaria.model.Manutencao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManutencaoRepository extends JpaRepository<Manutencao, Status> {

    Manutencao findByidManutencao(Status status);
}
