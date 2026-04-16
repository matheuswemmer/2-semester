public class Conta {
    private int numero;
    private double saldo;
    public double valor;
    private Correntista correntista;

    
    public Conta(int numero, double saldo, Correntista correntista){
        this.numero = numero;
        this.saldo = saldo;
        this.correntista = correntista; 
    }
    public void depositar(double valorDeDeposito){
        this.saldo += valorDeDeposito;
    }
    public boolean transferir(double valorDeTransferencia){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public double extratoBancario() {
        return saldo;
    }

    public Correntista getCorrentista() {
        return correntista;
    }    
}
