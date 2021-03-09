package com.rp4.hotelaria.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rp4.hotelaria.interfaces.IUsuarioService;
import com.rp4.hotelaria.model.Usuario;
import com.rp4.hotelaria.repository.UsuarioRepository;
	
	@Service
    public class UsuarioServiceImplements implements IUsuarioService {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImplements(UsuarioRepository usuarioR){
        this.usuarioRepository = usuarioR;

    }

    @Override
    @Transactional
    public void salvarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

//    @Override
//    public Usuario pegarUsuarioPeloID(Long id) {
//        return usuarioRepository.encontrarUsuarioPeloId(id);
//    }
//
//    @Override
//    public List<Usuario> pegarTodosUsuarios() {
//        return usuarioRepository.findAll();
//    }
//
//    @Override
//    public Funcionario pegarFuncionarioPeloId(Long id) {
//        return usuarioRepository.encontrarFuncionarioPeloId(id);
//    }
//
//    @Override
//    public Cliente pegarClientePeloID(Long id) {
//        return  usuarioRepository.encontrarClientePeloID(id);
//    }
//
//    @Override
//    public void excluirUsuario(Long id) {
//        usuarioRepository.deleteById(id);
//    }
//
//    @Override
//    public Cliente atualizarCliente(Cliente cliente) {
//        return usuarioRepository.save(cliente);
//    }
//
//    @Override
//    public Funcionario atualizarFuncionario(Funcionario funcionario) {
//        return usuarioRepository.save(funcionario);
//    }

}
