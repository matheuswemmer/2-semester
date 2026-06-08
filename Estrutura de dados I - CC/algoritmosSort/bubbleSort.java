import java.util.Arrays;


public class bubbleSort {
    public static void main(String[] args) throws Exception {

        int[] arr = {27, 4, 89, 13, 56, 72};

        int[] arrayOrdenado = bubbleSort.ordenarInteiros(arr);

        System.out.printf("Array Ordenado:" + Arrays.toString(arrayOrdenado));
    }

    public static int[] ordenarInteiros(int[] arr) {   
        
        boolean trocou = false;
        int tamanhoDoarr = arr.length; 

        for (int i = 0; i < tamanhoDoarr - 1; i++){

            for(int j = 0; j < tamanhoDoarr - 1 - i ; j++) {
                int aux = 0;
                if (arr[j] > arr[j + 1]) {
                    aux = arr[j]; 
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                    trocou = true;
                }
            }
        }

        if (trocou == false) {
            System.out.println("Não houve trocas");
        }
        else {
            System.out.println("Array ordenado");
        }
        return(arr);
        
    }
}