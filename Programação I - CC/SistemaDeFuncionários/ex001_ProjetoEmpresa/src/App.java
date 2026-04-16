public class App {
    public static void main(String[] args) {
        Funcionarios funcionario1 = new Funcionarios("João", 1234, "Aux ADM");
        funcionario1.exibirDados();
        
        System.out.println();

// ========================================\\

        Programadores programador1 = new Programadores("Fulano", 199);

        programador1.adicionarLinguagem(0, "Python", 10, 1);
        programador1.adicionarLinguagem(1, "C", 1, 3);
        programador1.adicionarLinguagem(2, "Java", 2, 2);

        programador1.exibirDados();
        System.out.println();

// ========================================\\

        Programadores programador2 = new Programadores("Ciclano", 109);

        System.out.println();

        programador2.adicionarLinguagem(0, "Python", 9, 1);
        programador2.adicionarLinguagem(1, "C", 2, 3);
        programador2.adicionarLinguagem(2, "Java", 2, 2);

        programador2.exibirDados();
        System.out.println();


        ComparacaoProgramadores.comparacaoDeExperiencias("Java", programador1, programador2);
    }
}
