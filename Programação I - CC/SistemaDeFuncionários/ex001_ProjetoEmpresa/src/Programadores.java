public class Programadores extends Funcionarios {

    private LinguagemProgramacao[] linguagens = new LinguagemProgramacao[3];


    public Programadores (String nome, int matricula) {
        super(nome, matricula, "Programador");  
    }

    public void adicionarLinguagem(int posicao, String nome, int anos, int ranking) {
        if (posicao >= 0 && posicao < 3) {
            linguagens[posicao] = new LinguagemProgramacao(nome, anos, ranking);
        } else {
            System.out.println("Posição inválida! Use 0, 1 ou 2.");
        }
    }
    

    
    @Override

    public void exibirDados() {
        System.out.print(getNome() + getMatricula() + getCargo());
        System.out.println();
        for (int i = 0; i < linguagens.length; i++){
        System.out.println(linguagens[i].nome + " | " + linguagens[i].anosExperiencia + " anos | ranking " + linguagens[i].ranking);        
        }
    }

    public LinguagemProgramacao[] getLinguagens() {
        return linguagens;
    }

}
