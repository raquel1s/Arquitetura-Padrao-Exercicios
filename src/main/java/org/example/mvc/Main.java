package org.example.mvc;

import org.example.mvc.controller.PerfilController;
import org.example.mvc.model.Perfil;
import org.example.mvc.view.TelaPerfil;

public class Main {

    public static void main(String[] args) {
        PerfilController controller = new PerfilController();
        TelaPerfil tela = new TelaPerfil();

        String nome = "Vitor";
        int idade = 18;
        String profissao = "CTW";

        Perfil perfil = controller.criarPerfil(nome, idade, profissao);
        tela.exibirPerfil(perfil);
    }
}
