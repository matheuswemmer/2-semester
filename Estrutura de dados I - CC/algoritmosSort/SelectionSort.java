public class SelectionSort {

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int menor = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[menor]) {
                    menor = j;
                }
            }


            int temp = array[menor];
            array[menor] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {64, 25, 12, 22, 11};

        selectionSort(numeros);

        // imprime o array ordenado
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}