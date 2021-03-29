package com.rp4.auth.repository;

import com.rp4.auth.model.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PermissaoRepository extends JpaRepository<Permissao,Long> {
    @Query("SELECT permissao FROM Permissao permissao WHERE permissao.descricao =: descricao")
    Permissao findByPermissao(@Param("descricao") String descricao);
}
