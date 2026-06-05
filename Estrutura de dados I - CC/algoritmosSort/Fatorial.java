import java.util.Scanner;

public class Fatorial {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int n = scanner.nextInt();
        int total = 1;

        for (int i=n; i>1; i--) {
            total = total * i;
        }
        scanner.close();
    }
}