package main.java.list.pesquisa.catalogolivro;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAno() {
        return this.ano;
    }

    @Override
    public String toString() {
        return "Título: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nAno: " + this.ano + "\n";
    }
}
