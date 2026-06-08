public class Funcionarios {
    
    private String nome, cargo;
    private int matricula;

    

    public Funcionarios(String nome, int matricula, String cargo) {
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public String getFuncionario() {
        return (nome + matricula);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void exibirDados(){
        System.out.print(nome + matricula + cargo);
    }
}
