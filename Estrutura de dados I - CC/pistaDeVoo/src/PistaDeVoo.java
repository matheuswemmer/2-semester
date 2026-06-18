public class PistaDeVoo {
    private int inicio;
    private int fim;
    private Aviao pistaDeAvioes[];

    PistaDeVoo(int tamanho){
        this.inicio = 0;
        this.fim = 0;
        this.pistaDeAvioes = new Aviao[tamanho]; 
    }

    public boolean enfileirar(Aviao novoAviao){
        if(!pistaCheia()){
            this.pistaDeAvioes[fim] = novoAviao;
            this.fim++;
            return true;
        }
        return false;
    }

    /*  Implementacao errônea com diminuição de espaços por interação
    public Aviao desenfileirarAviao(){
        if(!pistaVazia()){
            Aviao aviaoRemovido = this.pistaDeAvioes[inicio];
            inicio ++;
            return aviaoRemovido;
        }
        return null;
    }
    */

   // Solução para desempilhar a fila toda.
    public Aviao desenfileirarAviao(){
        if(!pistaVazia()){
            Aviao aviaoRemovido = this.pistaDeAvioes[this.inicio];
            for (int i = 0; i < this.fim-1; i++)
                this.pistaDeAvioes[i] = this.pistaDeAvioes[i+1];
            this.fim--;
            this.pistaDeAvioes[fim] = null;
            return aviaoRemovido;
        }
        return null;
    }

    public void imprimirFila(){
        if (!pistaVazia()){
            System.out.println("Pista atual:");
            for (Aviao a : this.pistaDeAvioes) {
                if (a != null) {
                System.out.println(a.verAviao());
                }
        }
    }
        else {
            System.out.println("Pista vazia");
        }
    }

   public boolean pistaCheia(){
        if(this.fim >= this.pistaDeAvioes.length){
            return true;
        }
        return false;
   }

    public boolean pistaVazia(){
        if(this.fim == 0){
            return true;
        }
        else return false;
    }



    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public Aviao[] getPistaDeAvioes() {
        return pistaDeAvioes;
    }

    public void setPistaDeAvioes(Aviao[] pistaDeAvioes) {
        this.pistaDeAvioes = pistaDeAvioes;
    }

    
}
