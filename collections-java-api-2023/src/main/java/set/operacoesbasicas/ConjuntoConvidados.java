package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoRemover = null;
        for (Convidado c : convidados) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoRemover = c;
            }
        }
        convidados.remove(convidadoRemover);
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        System.out.println(convidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();

        //O programa não permite a entrada de valores duplicados no atributo "codigoConvite"
        conjunto.adicionarConvidado("Convidado 1", 123);
        conjunto.adicionarConvidado("Convidado 2", 456);
        conjunto.adicionarConvidado("Convidado 3", 123);
        conjunto.adicionarConvidado("Convidado 4", 321);

        conjunto.exibirConvidados();

        System.out.println(conjunto.contarConvidados() + " convidado(s) dentro do conjunto!");

        conjunto.removerConvidadoPorCodigoConvite(456);

        System.out.println(conjunto.contarConvidados() + " convidado(s) dentro do conjunto!");

        conjunto.exibirConvidados();
    }
}

