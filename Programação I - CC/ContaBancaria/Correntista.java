public class Correntista {
    private String nome, endereco, cpf;
    private Conta conta;


    // construtor
    public Correntista(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    // atualizarEndereco getNome getEndereco

    public String atualizarEndereco (String endereco){
        this.endereco = endereco;
        return (getNome() + " seu endereco foi atualizado para:" + getEndereco());
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
    // getCPF getConta

    public String getCPF() {    
        return cpf;
    }
    public Conta getConta() {
        return conta;
    }
}
