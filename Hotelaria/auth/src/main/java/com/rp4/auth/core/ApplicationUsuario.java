package com.rp4.auth.core;


import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ApplicationUsuario implements EntidadeAbstrata{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @NotNull(message = "Campo Obrigatório")
    @Column(nullable = false)
    private String username;
    @NotNull(message = "Campo Obrigatório")
    @Column(nullable = false)
    @ToString.Exclude
    private String password;
    @NotNull(message = "Campo Obrigatório")
    @Column(nullable = false)
    private String role = "USER";


    public ApplicationUsuario(@NotNull ApplicationUsuario applicationUsuario) {
        this.id = applicationUsuario.getId();
        this.username = applicationUsuario.getUsername();
        this.password = applicationUsuario.getPassword();
        this.role = applicationUsuario.getRole();
    }

}
