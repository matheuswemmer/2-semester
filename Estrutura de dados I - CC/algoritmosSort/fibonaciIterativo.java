public class fibonaciIterativo {
    
    public static void main(String[] args) {
        int n = Integer.parseInt(args [1]); 
        System.out.print(Fib(n));
    }

    public static long Fib(int n){
        if (n == 1 || n == 2) {
            return 1;
        }

        else {
            long ResFibonaci;
            for (int i=3; i != n; i++) {

                long termo1 = 1;
                long termo2 = 1;
                long resp = termo1 + termo2;

                termo1 = termo2;
                termo2 = resp;
            }
            return termo2;
        }
    }
}
