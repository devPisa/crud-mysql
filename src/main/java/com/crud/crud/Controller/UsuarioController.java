package com.crud.crud.Controller;

import com.crud.crud.Model.Usuario;
import com.crud.crud.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
        private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> listarUsuario(){

        return usuarioRepository.findAll();
    }
    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){

        return usuarioRepository.save(usuario);
    }
    @PutMapping("/{id}")
    public Usuario atualizarUsuario
            (@PathVariable Long id, @RequestBody Usuario usuarioAtualizado){
        return null;
    }
    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id){
    }
}
