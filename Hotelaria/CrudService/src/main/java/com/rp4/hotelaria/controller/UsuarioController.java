package com.rp4.hotelaria.controller;

import com.rp4.hotelaria.dto.UsuarioDTO;
import com.rp4.hotelaria.interfaces.IUsuarioService;
import com.rp4.hotelaria.model.Cliente;
import com.rp4.hotelaria.model.Funcionario;
import com.rp4.hotelaria.model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UsuarioController {


    private IUsuarioService usuarioService;
    public UsuarioController(IUsuarioService usuarioServ){
        this.usuarioService = usuarioServ;

    }
    @GetMapping("/todos")
    public List<Usuario> pegarTodosUsuarios(){
        List<Usuario> usuarios = usuarioService.pegarTodosUsuarios();
        return usuarios;
    }

    @PostMapping("/funcionario/adicionar")
    public void salvarFuncionario(@RequestBody UsuarioDTO usuarioDTO){
        Funcionario funcionario = new Funcionario();
        funcionario.setId(usuarioDTO.getId());
        funcionario.setEmail(usuarioDTO.getEmail());
        funcionario.setNome(usuarioDTO.getNome());
        funcionario.setCargo(usuarioDTO.getCargo());
        funcionario.setCpf(usuarioDTO.getCpf());
        funcionario.setTelefone(usuarioDTO.getTelefone());
        funcionario.setSenha(usuarioDTO.getSenha());
    }
    @PostMapping
    public void salvarCliente(@RequestBody UsuarioDTO usuarioDTO){
        Cliente cliente = new Cliente();
        cliente.setId(usuarioDTO.getId());
        cliente.setNome(usuarioDTO.getNome());
        cliente.setEmail(usuarioDTO.getEmail());
        cliente.setSenha(usuarioDTO.getSenha());
        cliente.setEndereco(usuarioDTO.getEndereco());
        cliente.setCpf(usuarioDTO.getCpf());
        cliente.setTelefone(usuarioDTO.getTelefone());

    }
    @GetMapping("/funcionario/pegar/{id}")
    public Funcionario pegarFuncionarioPeloId(@PathVariable("id")Long id){
        Funcionario funcionario = usuarioService.pegarFuncionarioPeloId(id);
        return funcionario;

    }
    @GetMapping("/cliente/pegar/{id}")
    public Cliente pegarClientePeloID(@PathVariable("id")Long id){
        Cliente cliente = usuarioService.pegarClientePeloID(id);
        return cliente;
    }
    @GetMapping("/usuario/")
    public Usuario pegarUsuarioPeloID(@PathVariable("id")Long id){
        Usuario usuario = usuarioService.pegarUsuarioPeloID(id);
        return usuario;
    }

    @PutMapping("/funcionario/atualizar")
    public Funcionario atualizarFuncionario(@RequestBody Funcionario func){
        Funcionario funcionario = usuarioService.atualizarFuncionario(func);
        return funcionario;
    }
    @PutMapping("/cliente/atualizar")
    public Cliente atualizarCliente(@RequestBody Cliente cli){
        Cliente cliente = usuarioService.atualizarCliente(cli);
        return cliente;
    }
    @DeleteMapping("/excluir/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        usuarioService.excluirUsuario(id);
    }

}