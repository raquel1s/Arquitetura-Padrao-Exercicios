package org.example.mvvm.viewmodel;

import org.example.mvvm.model.Tarefa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TarefaViewModel {

    private List<Tarefa> tarefas;

    public TarefaViewModel() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String titulo, String prioridade) {
        this.tarefas.add(new Tarefa(titulo, prioridade));
    }

    public List<Tarefa> getTarefasOrdenadas() {
        tarefas.sort(Comparator.comparing(Tarefa::getTitulo));
        return tarefas;
    }
}
