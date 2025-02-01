package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agenda;

    public AgendaContatos() {
        this.agenda = new HashSet<Contato>();
    }

    public void adicionarContato(String nome, int telefone) {
        agenda.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        System.out.println(agenda);
    }

    public Set<Contato> pesquisarContato(String nome) {
        Set<Contato> pesquisar = new HashSet<>();
        for (Contato c : agenda) {
            if (c.getNome().startsWith(nome)) {
                pesquisar.add(c);
            }
        }
        return pesquisar;
    }

    public Contato atualizarContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : agenda) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(novoNumero);
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos ag = new AgendaContatos();

        ag.adicionarContato("Contato 1", 111111);
        ag.adicionarContato("Contato 2", 454545);
        ag.adicionarContato("Contato 2", 222222);
        ag.adicionarContato("Contato 3", 333333);
        ag.adicionarContato("Contato 4", 444444);

        ag.exibirContatos();

        System.out.println("Contato pesquisado: " + ag.pesquisarContato("Contato 3"));

       ag.atualizarContato("Contato 1", 555555);

        ag.exibirContatos();
    }


}
