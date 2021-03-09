package com.rp4.hotelaria.interfaces;

import java.util.List;

import com.rp4.hotelaria.model.Cliente;
import com.rp4.hotelaria.model.Funcionario;
import com.rp4.hotelaria.model.Usuario;

public interface IUsuarioService {
	
   public void salvarUsuario(Usuario usuario);
   public Funcionario getFuncionarioById(Long id);
   public Cliente getClienteById(Long id);
//    Usuario pegarUsuarioPeloID(Long id);
    List<Usuario> pegarTodosUsuarios();
//   public Funcionario pegarFuncionarioPeloId(Long id);
//   Cliente pegarClientePeloID(Long id);
    void excluirUsuario(Long id);
    Cliente atualizarCliente(Cliente cliente);
    Funcionario atualizarFuncionario(Funcionario funcionario);


}
