package com.rp4.hotelaria.repository;

import com.rp4.hotelaria.model.Funcionario;
import com.rp4.hotelaria.model.Usuario;
import com.rp4.hotelaria.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Funcionario encontrarFuncionarioPeloId(Long id);
    Usuario encontrarUsuarioPeloId(Long id);
    Cliente encontrarClientePeloID(Long id);
}
