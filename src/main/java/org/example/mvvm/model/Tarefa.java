package org.example.mvvm.model;

public class Tarefa {

    private String titulo;
    private String prioridade;

    public Tarefa(String titulo, String prioridade) {
        this.titulo = titulo;
        this.prioridade = prioridade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return "- [" + prioridade + "] " + titulo;
    }
}
