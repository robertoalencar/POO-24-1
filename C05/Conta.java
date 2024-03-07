package C05;
public class Conta {
    
    String titular;
    double saldo;

    public Conta() {
        
    }

    public Conta(String titular, double saldo) {

        this.titular = titular;
        this.saldo = saldo;
    }

    public void creditar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void debitar(double valor) {
        this.saldo = this.saldo - valor;
    }

}
