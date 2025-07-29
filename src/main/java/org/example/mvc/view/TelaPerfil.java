package org.example.mvc.view;

import org.example.mvc.model.Perfil;

public class TelaPerfil {

    public void exibirPerfil(Perfil perfil) {
        System.out.println("===== Resumo do Perfil =====");
        System.out.println("Nome: " + perfil.getNome());
        System.out.println("Idade: " + perfil.getIdade() + " anos");
        System.out.println("Profissão: " + perfil.getProfissao());
        System.out.println("============================");
    }
}
