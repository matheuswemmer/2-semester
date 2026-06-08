public class CartaoCredito implements Pagamento {
    double valor;
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento no valor de %.2f processado no Cartão de Crédito\n", valor);
    }
}
