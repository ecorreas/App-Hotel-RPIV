package com.rp4.hotelaria.repository;

import com.rp4.hotelaria.model.Cidade;
import com.rp4.hotelaria.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    Cidade findCidadeByIdCidade(Long id);

}
