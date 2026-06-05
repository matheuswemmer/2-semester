public class CallStack {
    
    public static void main(String[] args) {
        // pausa a exec atual para continuar na linha 11
        int x = Metodo_A(4, 3);
        System.out.println("x: " + x);
    }

    public static int Metodo_A (int a, int b) {
        // pausa a exec atual para continuar na linha 15
        a = Metodo_B(a);
        return a + b;
    }

    public static int Metodo_B (int a) {
        return 2 * a;
    }
}