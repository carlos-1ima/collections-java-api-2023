package main.java.list.operacoesbasicas.listatarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefa;

    public ListaTarefas() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaRemover = new ArrayList<>();
        for(Tarefa t : this.listaTarefa) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaRemover.add(t);
            }
        }
        this.listaTarefa.removeAll(tarefaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return this.listaTarefa.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(this.listaTarefa);
    }

    public static void main(String[] args) {
        ListaTarefas l = new ListaTarefas();

        l.adicionarTarefa("Tarefa 001");
        l.adicionarTarefa("Tarefa 002");
        l.adicionarTarefa("Tarefa 003");

        l.removerTarefa("tarefa 002");

        l.obterDescricoesTarefas();

        System.out.println("TOTAL DE TAREFAS: " + l.obterNumeroTotalTarefas());
    }
}
