package com.rp4.auth.repository;

import com.rp4.auth.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT usuario FROM Usuario usuario WHERE usuario.nomeUsuario =: nomeUsuario")
    Usuario findByNomeUsuario(@Param("nomeUsuario")String nomeUsuario);
}
