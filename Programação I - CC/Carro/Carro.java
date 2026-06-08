import java.time.LocalDate;


public class Carro {
    private String marca, modelo;
    private int ano;

    
    // construir carro
    Carro (String modelo, String marca, int ano) {
        if (validarAno(ano) == true)  {
            this.ano = ano;   
            this.modelo = modelo;
            this.marca = marca;
        }
        else {
            ano = 0;
        }
    }


    public boolean validarAno(int ano) {
    int anoAtual = LocalDate.now().getYear();

        if (ano > 1885 && ano <= anoAtual ) {
            return true;
        }
        else {
            return false;
        }
    }

    public String atualizarAno(int ano) {
            if (validarAno(this.ano) == true)  {
                this.ano = ano;   
                return "Ano Atualizado";
            }
            else {
                return "Ano Inválido";
            }
    }

    public String exibirDetalhes() {
        return ("A Marca é: " + this.marca + " O modelo é: " + this.modelo + " O Ano é: " + this.ano);
    }
 
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }
}

