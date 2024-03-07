package C05;
public class Teste {
    
    public static void main(String[] args) {
        
        Conta c = new Conta();
        c.titular = "Marcos";
        c.saldo = 500.0;
        c.creditar(50);

        // System.out.println(c.saldo);

        Conta c2 = new Conta("Clara", 100);
        c2.debitar(20);
        c2.creditar(100); 
        c2.debitar(5);
        c2.debitar(5);
        
        System.out.println("O cliente " + c2.titular + " tem o saldo " + c2.saldo);
    }
}
