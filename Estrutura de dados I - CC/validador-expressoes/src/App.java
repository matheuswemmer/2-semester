import java.util.*;

public class App {

    public static boolean isValida(String equacao) {

        Pilha pilha = new Pilha(90);

        Set<Character> aberturas = Set.of('(', '[', '{');
        Set<Character> fechamentos = Set.of(')', ']', '}');
        Set<Character> operadores = Set.of('+', '-', '*', '/');

        Map<Character, Character> pares = new HashMap<>();
        pares.put('{', '}');
        pares.put('(', ')');
        pares.put('[', ']');

        char inicio = equacao.charAt(0);
        char fim = equacao.charAt(equacao.length() - 1);

        if (operadores.contains(inicio) || operadores.contains(fim)) {
            return false;
        }

        Character ultimoChar = null;


        for (int i = 0; i < equacao.length(); i++) {

            char simbolo = equacao.charAt(i);

            if (simbolo == ' ') {
                continue;
            }


            // abertura: ( [ {
            if (aberturas.contains(simbolo)) {

                // não pode abrir depois de outro símbolo inválido
                pilha.push(simbolo);
            }


            // fechamento: ) ] }
            else if (fechamentos.contains(simbolo)) {

                // não pode fechar depois de operador
                if (ultimoChar != null && operadores.contains(ultimoChar)) {
                    return false;
                }


                Character topo = pilha.pop();

                if (topo == null) {
                    return false;
                }


                if (pares.get(topo) != simbolo) {
                    return false;
                }
            }


            // operador
            else if (operadores.contains(simbolo)) {

                // operador não pode ser primeiro,
                // nem vir depois de operador,
                // nem depois de abertura
                if (ultimoChar == null ||
                    operadores.contains(ultimoChar) ||
                    aberturas.contains(ultimoChar)) {

                    return false;
                }
            }


            // qualquer outro caractere (número/letra)
            ultimoChar = simbolo;
        }


        // se terminou com operador
        if (ultimoChar != null && operadores.contains(ultimoChar)) {
            return false;
        }


        // se ainda existem parênteses abertos
        Character topo = pilha.pop();

        if (topo != null) {
            return false;
        }


        return true;
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