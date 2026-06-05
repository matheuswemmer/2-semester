import java.util.Scanner;


public class Exer {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int[] numeros = {1,5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95};
        
        System.out.println("Digite o número que deseja procurar: ");
        int numeroProcurado = scanner.nextInt();

        int indice = buscaBinaria(numeros, numeroProcurado);

            if (indice == -1) {
                System.out.println("Índice: " + indice);
            }
            else {
                System.out.println("Índice: " + indice);
            }
        scanner.close();
    }
        
        public static int buscaBinaria(int[]numeros, int numeroProcurado) {
                int ini = 0;
                int fim = numeros.length -1;

                while (ini <= fim) {
                    int meio = (ini + fim) / 2;

                    if (numeros[meio] == numeroProcurado) {
                        return meio;
                    } else if (numeros[meio] < numeroProcurado) {
                        ini = meio + 1;
                    }
                    else {
                        fim = meio - 1;
                    }
                }
                return -1;
        }
    }

