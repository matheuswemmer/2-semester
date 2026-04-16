import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.printf("%nBem-vindo ao sistema de pedidos!%nPara criar um pedido digite: 1%nPara exibir um pedido digite: 2%nPara exibir todos os pedidos existentes digite: 3%nPara sair do sistema digite: 4%n");
            opcao = sc.nextInt();
        
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do lanche: ");
                    String nomeDoLanche = sc.next();

                    System.out.println("Digite o valor do lanche: ");
                    double valor = sc.nextDouble();

                    System.out.printf("%nPedido: " + nomeDoLanche + "%nValor: " + valor + "%nCriado com sucesso!%n");
                    break;

                case 2:
                    System.out.println("Digite o número do pedido que deseja exibir: ");
                    int numeroDoPedido = sc.nextInt();
                    
                    System.out.println("Exibindo pedido número: " + numeroDoPedido);
                    break;

                case 3:
                    System.out.println("Exibindo todos os pedidos existentes...");     
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    sc.close();
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida."); 
                    break;
            }
        } while (opcao != 4);

    }
}