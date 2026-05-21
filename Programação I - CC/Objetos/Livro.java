public class Livro {
        
    String titulo, autor;
    int ano;

    //mesmo nome da classe
    Livro (String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

     public String exibirFicha() {

        String ficha = ("Livro: " + titulo + ", autor: " + autor + ", ano de publicação: "+ ano);

        return ficha;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

}
   