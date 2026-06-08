public class App {
    
    public static void main(String[] args) {
        
        // Criando uma lista
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada(null);
    
        // Adicionando nodos no início da lista
        lista.adicionarNoInicio(5, "John");
        lista.adicionarNoInicio(10, "Paul");
        lista.adicionarNoInicio(15, "George");
        // Adicionando nodos no final da lista
        lista.adicionarNoFinal(20,"Ringo");
        lista.adicionarNoFinal(25, "Pete");
        lista.adicionarNodoNaPosicao(6, 100, "Ana");
        //lista.removerNodoNaPosicao(1);
        //lista.removerNodosDoInicio(7);
        lista.removerNodosDoFim(7);
        // Imprimindo a lista
        lista.imprimirLista();
        // Removendo o primeiro nodo da lista
        //lista.removerPrimeiroAluno();
        //lista.imprimirLista();

        // Buscar um nodo específico
        /*Aluno nodoEncontrado = lista.buscarAluno(20);
        if (nodoEncontrado != null)
            System.out.println("Nodo: " + nodoEncontrado.getMatricula() + ": " + nodoEncontrado.getNome());
        else    
            System.out.println("Nodo não encontrado.");

        // Remover um nodo específico
        lista.removerAluno(10);
        lista.imprimirLista();

        // Removendo todos os nodos
        lista.removerTodosAlunos();
        lista.imprimirLista();*/

    }

}