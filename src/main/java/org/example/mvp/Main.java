package org.example.mvp;

import org.example.mvp.presenter.ImcPresenter;
import org.example.mvp.view.TelaIMC;

public class Main {

    public static void main(String[] args) {
        TelaIMC view = new TelaIMC();
        ImcPresenter presenter = new ImcPresenter(view);

        presenter.calcularImc();
    }
}
