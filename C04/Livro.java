public class Livro {

    String titulo;
    String autor;
    int ano;
    int numeroPaginas;
    double preco;

    public Livro() {

    }

    public Livro(String autor, int ano) {
        this.autor = autor;
        this.ano = ano;
    }
    
    public Livro(String t, String autor, int ano, int numeroPaginas, double preco) {
        titulo = t;
        this.autor = autor;
        this.ano = ano;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
    }
}