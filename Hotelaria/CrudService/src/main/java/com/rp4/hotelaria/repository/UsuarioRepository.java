package com.rp4.hotelaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rp4.hotelaria.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
//    Funcionario encontrarFuncionarioPeloId(Long id);
//    Usuario encontrarUsuarioPeloId(Long id);
//    Cliente encontrarClientePeloID(Long id);
}
