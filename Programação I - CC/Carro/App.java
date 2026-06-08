import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual a marca do carro que você quer criar?");
        String escolhendoMarca = sc.next();

        System.out.println("Qual o modelo do carro que você quer criar?");
        String escolhendoModelo = sc.next();

        System.out.println("Qual o ano do carro que você quer criar?");
        int escolhendoAno = sc.nextInt();

        Carro gol = new Carro(escolhendoMarca, escolhendoModelo, escolhendoAno);

        System.out.printf(gol.exibirDetalhes());
        sc.close();
    }
    
}
