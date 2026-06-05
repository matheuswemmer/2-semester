public class ListaSimplesmenteEncadeada {
    
    private Aluno cabeca;
    private int tamanho;

    public ListaSimplesmenteEncadeada(Aluno cabeca) {
        this.cabeca = cabeca;
        this.tamanho = 0;
    }

    public Aluno getCabeca() {
        return this.cabeca;
    }

    public void setCabeca(Aluno cabeca) {
        this.cabeca = cabeca;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    // Adicionar o novo Aluno no início da lista.
    public void adicionarNoInicio(int matricula, String nome) {
        Aluno novo = new Aluno(matricula, nome);
        novo.setProximo(this.getCabeca());
        this.setCabeca(novo);
        this.setTamanho(this.getTamanho()+1);
    }

    // Adicionar o novo Aluno no final da lista.
    public void adicionarNoFinal(int matricula, String nome) {
        Aluno novo = new Aluno(matricula, nome);
        if (this.getCabeca() == null)
            this.setCabeca(novo);
        else {
            Aluno AlunoAux = this.getCabeca();
            while (AlunoAux.getProximo() != null)
                AlunoAux = AlunoAux.getProximo();
            AlunoAux.setProximo(novo);
        }
        this.setTamanho(this.getTamanho()+1);
    }

    // Remover o primeiro Aluno
    public void removerPrimeiroAluno() {
        if (this.getCabeca() != null) {
            Aluno AlunoAux = this.getCabeca();
            this.setCabeca(AlunoAux.getProximo());
            this.setTamanho(this.getTamanho()-1);
        }
    }

    // Buscar um Aluno na lista pelo matricula e retornar o local do Aluno
    public Aluno buscarAluno(int matricula) {
        Aluno AlunoAux = this.getCabeca();
        while (AlunoAux != null && AlunoAux.getMatricula() != matricula)
            AlunoAux = AlunoAux.getProximo();
        return AlunoAux;
    }

    // Remover um Aluno na lista, buscando
    public void removerAluno(int matricula) {
        Aluno AlunoAux = this.getCabeca();
        Aluno AlunoAuxAnterior = null;
        /* Varredura para descobrir qual nodo deve ser excluído
           O objeto AlunoAux apontará para o nodo a ser avaliado, a cada iteração
           O objeto AlunoAuxAnterior sempre apontará para o nodo anterior ao AlunoAux
        */
        while (AlunoAux != null && AlunoAux.getMatricula() != matricula) {
            AlunoAuxAnterior = AlunoAux;
            AlunoAux = AlunoAux.getProximo();
        }
        // Caso o nodo a ser excluído seja o primeiro da lista, é necessário ajustar o cabeça dela
        if (AlunoAuxAnterior == null) {
            this.setCabeca(AlunoAux.getProximo());
            this.setTamanho(this.getTamanho()-1);
            return;
        }
        // Caso o nodo a ser excluído seja qualquer um diferente do primeiro da lista
        if (AlunoAux != null) {
            AlunoAuxAnterior.setProximo(AlunoAux.getProximo());
            this.setTamanho(this.getTamanho()-1);
        }
    }

    // Remover todos os Alunos da lista
    public void removerTodosAlunos() {
        this.setCabeca(null);
        this.setTamanho(0);
    }

    // Imprimir os dados de todos os Alunos
    public void imprimirLista() {
        Aluno AlunoAux = this.getCabeca();
        while (AlunoAux != null) {
            System.out.print(AlunoAux.getMatricula() + ": " + AlunoAux.getNome() + " -> ");
            AlunoAux = AlunoAux.getProximo();
        }
        System.out.print(" NULL ");
        System.out.println();
    }

     /*adicionarNodoNaPosicao(int n, int valor, String nome): esse método receberá 
    por parâmetro um valor inteiro n, que indicará a posição em que o novo nodo 
    deverá ser adicionado. O valor de n tem que ser menor ou igual ao tamanho da 
    lista.*/
    public void adicionarNodoNaPosicao(int n, int matricula, String nome) {
        Aluno AlunoAux = this.getCabeca();
        Aluno AlunoAuxAnterior = null;
        int contador = 1;
        if (n < 1 || n > this.getTamanho()+1)
            return;
        while (contador < n) {
            contador++;
            AlunoAuxAnterior = AlunoAux;
            AlunoAux = AlunoAux.getProximo();
        }
        if (contador <= n) {
            Aluno novo = new Aluno(matricula, nome);    
            if (AlunoAuxAnterior == null) {
                novo.setProximo(AlunoAux);
                this.setCabeca(novo);
            }
            else {
                AlunoAuxAnterior.setProximo(novo);
                novo.setProximo(AlunoAux);
            }
            this.setTamanho(this.getTamanho()+1);
        }
    }
     
    /*removerNodoNaPosicao(int n): esse método receberá por parâmetro um valor 
    inteiro n, que indicará a posição do nodo que deverá ser removido. O valor de n 
    tem que ser menor ou igual ao tamanho da lista.*/
    public void removerNodoNaPosicao(int n) {
        Aluno AlunoAux = this.getCabeca();
        Aluno AlunoAuxAnterior = null;
        int contador = 1;
        if (n < 1 || n > this.getTamanho())
            return;
        while (contador < n) {
            contador++;
            AlunoAuxAnterior = AlunoAux;
            AlunoAux = AlunoAux.getProximo();
        }
        // Caso o nodo a ser excluído seja o primeiro
        if (AlunoAuxAnterior == null) {
            this.setCabeca(AlunoAux.getProximo());
            return;
        }
        // Caso o nodo a ser excluído seja qualquer um diferente do primeiro da lista
        if (AlunoAux != null)
            AlunoAuxAnterior.setProximo(AlunoAux.getProximo());
        this.setTamanho(this.getTamanho()-1);
    }
     
    /*removerNodosDoInicio(int n): esse método receberá por parâmetro um valor 
    inteiro n, que indicará que os n nodos do início devem ser removidos . O valor de n 
    tem que ser menor ou igual ao tamanho da lista.*/
    public void removerNodosDoInicio(int n) {
        Aluno AlunoAux = this.getCabeca();
        int contador = 1;
        if (n < 1 || n > this.getTamanho())
            return;
        while (contador < n) {
            contador++;
            AlunoAux = AlunoAux.getProximo();
        }
        if (AlunoAux != null)
            this.setCabeca(AlunoAux.getProximo());
        this.setTamanho(this.getTamanho()-n);
    }
     
    /*removerNodosDoFim(int n): esse método receberá por parâmetro um valor 
    inteiro n, que indicará que os n nodos a partir do final da lista devem ser 
    removidos. O valor de n tem que ser menor ou igual ao tamanho da lista.*/
    public void removerNodosDoFim(int n) {
        Aluno AlunoAux = this.getCabeca();
        int contador = 1;
        if (n < 1 || n > this.getTamanho())
            return;
        if (n == this.getTamanho()) {
            this.removerTodosAlunos();
            this.setTamanho(this.getTamanho()-n);
            return;
        }
        while (contador < (this.getTamanho() - n)) {
            contador++;
            AlunoAux = AlunoAux.getProximo();
        }
        if (AlunoAux != null)
            AlunoAux.setProximo(null);
        this.setTamanho(this.getTamanho()-n);
    }
}