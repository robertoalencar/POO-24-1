public class Teste {

    public static void main(String[] args) {

        Livro x = new Livro("Java Como Programar", "Joao", 2010, 259, 35.90);
        System.out.println(x.titulo);
        System.out.println(x.ano);

        Livro z = new Livro();
        z.autor = "Maria";
        z.titulo = "Joao e Maria";
        z.ano = 2000;
        z.numeroPaginas = 800;
        z.preco = 55.90;

        System.out.println(z.titulo);
        System.out.println(z.ano);
    }
}