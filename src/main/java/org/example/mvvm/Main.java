package org.example.mvvm;

import org.example.mvvm.view.TelaTarefas;
import org.example.mvvm.viewmodel.TarefaViewModel;

public class Main {

    public static void main(String[] args) {
        TarefaViewModel viewModel = new TarefaViewModel();
        TelaTarefas tela = new TelaTarefas();

        viewModel.adicionarTarefa("Estudar java", "Média");
        viewModel.adicionarTarefa("Estudar arquitetura de sistemas", "Alta");
        viewModel.adicionarTarefa("Estudar Next.js", "Baixa");

        tela.exibirTarefas(viewModel.getTarefasOrdenadas());
    }
}
