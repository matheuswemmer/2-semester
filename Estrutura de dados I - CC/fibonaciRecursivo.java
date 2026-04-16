public class fibonaciRecursivo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args [1]); 
        System.out.print(Fib(n));
    }
    public static int Fib(int n){
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return (Fib(n-1) + Fib(n-2));
        }
    }
}
