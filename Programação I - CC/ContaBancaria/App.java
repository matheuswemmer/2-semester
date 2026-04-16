public class App {
    public static void main(String[] args) throws Exception {
        Correntista correntista1 = new Correntista("Matheus", "adada", "123.321");

        Conta conta1 = new Conta(123, 100, correntista1);

        conta1.getCorrentista();
    }
}
