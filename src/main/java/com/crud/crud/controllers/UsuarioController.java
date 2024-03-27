package com.crud.crud.controllers;

import com.crud.crud.domain.users.Usuario;
import com.crud.crud.domain.users.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping("/assessment")
    public String index(){
        return "index";
    }
    @GetMapping
    public List<Usuario> listarUsuario(){

        return usuarioRepository.findAll();
    }
    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){

        return usuarioRepository.save(usuario);
    }
    @PutMapping("/{id}")
    public Usuario atualizarUsuario
            (@PathVariable Long id, @RequestBody Usuario usuarioAtualizado){
        return usuarioRepository.findById(id)
                .map(usuario -> {
                    usuario.setNome(usuarioAtualizado.getNome());
                    usuario.setEmail(usuarioAtualizado.getEmail());
                    return usuarioRepository.save(usuario);
                })
                .orElseThrow();
    }
    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id){
        usuarioRepository.deleteById(id);
    }
}
