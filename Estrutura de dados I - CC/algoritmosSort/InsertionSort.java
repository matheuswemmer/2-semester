public class InsertionSort {

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int chave = array[i]; // elemento atual
            int j = i - 1;

            // move os elementos maiores para frente
            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j--;
            }

            // insere o elemento na posição correta
            array[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {64, 25, 12, 22, 11};

        insertionSort(numeros);

        // imprime o array ordenado
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}