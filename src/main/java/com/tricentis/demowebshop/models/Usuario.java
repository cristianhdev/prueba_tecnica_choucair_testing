package com.tricentis.demowebshop.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Usuario {

    @Getter
    private String primerNombre;
    private String segundoNombre;
    private String email;
    private String password;
}