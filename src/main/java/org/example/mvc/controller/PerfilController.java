package org.example.mvc.controller;

import org.example.mvc.model.Perfil;

public class PerfilController {

    public Perfil criarPerfil(String nome, int idade, String senha) {
        return new Perfil(nome, idade, senha);
    }
}
