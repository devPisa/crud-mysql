package com.crud.crud.domain.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository
        extends JpaRepository<Usuario, Long> {

}
