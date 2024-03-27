package com.crud.crud.domain.users;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "usuarios")
@Entity(name = "usuarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

}