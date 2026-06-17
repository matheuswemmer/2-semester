import java.util.*;

public class App {


    public boolean isValida(String equacao){

        Pilha pilha = new Pilha(90);

        Set<Character> aberturas = Set.of('(', '[', '{');
        Set<Character> fechamentos = Set.of(')', ']', '}');
        Set<Character> operadores = Set.of('+', '-', '*', '/');

        char inicio = equacao.charAt(0);
        char fim = equacao.charAt(equacao.length()-1);

        if (operadores.contains(inicio) || operadores.contains(fim)){
                return false;
            }
        for (int i = 0; i < equacao.length() -1; i++) {
            char simbolo = equacao.charAt(i);  
                if (aberturas.contains(simbolo)){
                    
                }
            } 
        }



    public static void main(String[] args) throws Exception {

        String[] testes = {
        "5 + 3 * [(2 - 1)]", // VÁLIDA
        "5 + * 3", // INVÁLIDA (dois operadores seguidos)
        "(5 + 3) / / 2", // INVÁLIDA (dois operadores seguidos)
        "+ 5 - 2", // INVÁLIDA (começa com operador)
        "5 + 3 -", // INVÁLIDA (termina com operador)
        "5 + ( * 3)", // INVÁLIDA (operador após abertura)
        "5 + (3 - )", // INVÁLIDA (fechamento após operador)
        "{5 + [3 * (2 / 2)]}" // VÁLIDA
        };
        System.out.println("--- Validador de Expressões ---");
        for (String string : testes) {
        System.out.printf("Expressão: %-25s -> %s\n", string,
        (isValida(string) ? "VÁLIDA" : "INVÁLIDA"));
    }
}
}
