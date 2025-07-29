package org.example.mvvm.view;

import org.example.mvvm.model.Tarefa;
import org.example.mvvm.viewmodel.TarefaViewModel;

import java.util.List;

public class TelaTarefas {

    public void exibirTarefas(List<Tarefa> tarefas) {
        System.out.println("=== Lista de tarefas ===");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
        System.out.println("============================");
    }
}
