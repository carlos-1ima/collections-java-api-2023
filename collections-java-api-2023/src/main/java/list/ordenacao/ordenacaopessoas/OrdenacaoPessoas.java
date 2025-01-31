package main.java.list.ordenacao.ordenacaopessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoa;

    public OrdenacaoPessoas() {
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarIdade(){
        List<Pessoa> pessoaIdade = new ArrayList<>(listaPessoa);
        Collections.sort(pessoaIdade);
        return pessoaIdade;
    }

    public List<Pessoa> ordenarAltura(){
        List<Pessoa> pessoaAltura = new ArrayList<>(listaPessoa);
        Collections.sort(pessoaAltura, new ComparatorAltura());
        return pessoaAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas o = new OrdenacaoPessoas();

        o.adicionarPessoa("Pessoa 001", 15, 1.50);
        o.adicionarPessoa("Pessoa 002", 29, 1.90);
        o.adicionarPessoa("Pessoa 003", 12, 1.75);
        o.adicionarPessoa("Pessoa 004", 36, 2.10);

        System.out.println(o.ordenarIdade());
        System.out.println(o.ordenarAltura());
    }
}

