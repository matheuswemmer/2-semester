public class Pilha {
    private final char[] pilha;
    private int topo;

    public Pilha(int capacidade){
        pilha = new char[capacidade];
        topo = -1;
    }

    public void push(char valor){
        if(topo < pilha.length - 1){
            topo++;
            pilha[topo] = valor;
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    public Character pop(){
        if(topo >= 0){
            char valor = pilha[topo];
            topo--;
            return valor;
        } 
        return null;
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