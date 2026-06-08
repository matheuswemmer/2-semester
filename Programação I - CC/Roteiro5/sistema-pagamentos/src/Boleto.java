public class Boleto implements Pagamento {
    double valor;
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento no valor de %.2f processado no boleto\n", valor);
    }
}
