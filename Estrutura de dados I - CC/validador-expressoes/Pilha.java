public class Pilha{
    private int[] pilha;
    private int topo;

    public Pilha(int capacidade){
        pilha = new int[capacidade];
        topo = -1;
    }

    public void push(int valor){
        if(topo < pilha.length - 1){
            topo++;
            pilha[topo] = valor;
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    public int pop(){
        if(topo >= 0){
            int valor = pilha[topo];
            topo--;
            return valor;
        } else {
            System.out.println("Pilha vazia!");
            return -1; // Valor de erro
        }
    }

    public boolean isEmpty(){
        return topo == -1;
    }

    public boolean isFull(){
        return topo == pilha.length - 1;
    }

    public int size(){
        return topo + 1;
    }
}