package C05;

public class Biblioteca {
    
    public static void main(String[] args) {
        
        Livro li = new Livro();

        // li.somarEImprime(5, 2);
        // li.somarEImprime(2, 1);
        // li.somarEImprime(10, 5);
        // li.somarEImprime(6, 6);

        int resultado = li.somarERetorna(5, 12);
        System.out.println(resultado);
    }

}
