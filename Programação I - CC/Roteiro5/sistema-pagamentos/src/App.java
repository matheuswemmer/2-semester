public class App {
    public static void main(String[] args) throws Exception {

        CartaoCredito meuCC = new CartaoCredito();
        Paypal minhaContaPaypal = new Paypal();
        Boleto boleto = new Boleto();

        meuCC.processarPagamento(90);
        minhaContaPaypal.processarPagamento(912);
        boleto.processarPagamento(19);


    }
}
