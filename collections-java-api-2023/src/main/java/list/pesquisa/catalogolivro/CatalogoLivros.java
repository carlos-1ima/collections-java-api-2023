package main.java.list.pesquisa.catalogolivro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> buscaAutor = new ArrayList<>();
        if(!catalogo.isEmpty()) {
            for(Livro l : catalogo) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    buscaAutor.add(l);
                }
            }
        }
        return buscaAutor;
    }

    public List<Livro> pesquisarIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> buscaAnos = new ArrayList<>();
        if(!catalogo.isEmpty()) {
            for(Livro l : catalogo) {
                if(l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
                    buscaAnos.add(l);
                }
            }
        }
        return buscaAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro buscaTitulo = null;
        if(!catalogo.isEmpty()) {
            for(Livro l : catalogo) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    buscaTitulo = l;
                    break;
                }
            }
        }
        return buscaTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros c = new CatalogoLivros();

        c.adicionarLivro("Livro 001", "Autor 001", 2001);
        c.adicionarLivro("Livro 002", "Autor 002", 2002);
        c.adicionarLivro("Livro 003", "Autor 002", 2005);
        c.adicionarLivro("Livro 004", "Autor 003", 2004);

        System.out.println(c.pesquisarPorAutor("Autor 002"));
        System.out.println(c.pesquisarIntervaloAnos(2000, 2003));
        System.out.println(c.pesquisarPorTitulo("Livro 004"));

    }
}

