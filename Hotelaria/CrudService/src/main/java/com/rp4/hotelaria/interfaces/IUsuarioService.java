package com.rp4.hotelaria.interfaces;

import com.rp4.hotelaria.model.Cliente;
import com.rp4.hotelaria.model.Funcionario;
import com.rp4.hotelaria.model.Usuario;

import java.util.List;

public interface IUsuarioService {
    void salvarUsuario(Usuario usuario);

    Usuario pegarUsuarioPeloID(Long id);
    List<Usuario> pegarTodosUsuarios();
    Funcionario pegarFuncionarioPeloId(Long id);
    Cliente pegarClientePeloID(Long id);
    void excluirUsuario(Long id);
    Cliente atualizarCliente(Cliente cliente);
    Funcionario atualizarFuncionario(Funcionario funcionario);


}
