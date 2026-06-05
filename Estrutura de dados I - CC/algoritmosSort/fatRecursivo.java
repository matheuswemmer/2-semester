import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int n = scanner.nextInt();

        long x = Fat(n);

        System.out.println(x);
        scanner.close();
    }

    public static long Fat(int n) {
    if (n == 1) {
        return 1;
    }

    else {
        return (n * Fat(n-1));
        }
    }

}