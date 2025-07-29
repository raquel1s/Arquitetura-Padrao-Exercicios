package org.example.mvp.presenter;

import org.example.mvp.model.Pessoa;
import org.example.mvp.view.TelaIMC;

public class ImcPresenter {

    private Pessoa pessoa;
    private TelaIMC tela;

    public ImcPresenter(TelaIMC tela) {
        this.tela = tela;
        this.pessoa = new Pessoa(46.9, 1.53);
    }

    public void calcularImc() {
        double imc = pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
        tela.exibirIMC(imc);
    }
}
