# Brasileirão 2022 — Conceitos explorados

## equalsIgnoreCase
Compara duas strings ignorando maiúsculas/minúsculas. Acentos são preservados normalmente.

```java
"grêmio".equalsIgnoreCase("Grêmio") // true
"INTER".equalsIgnoreCase("inter")   // true
```

Usado no `getTime(String)` como ponto central de busca por nome, evitando repetir a lógica em toda operação.

---

## Sobrecarga de métodos (Overloading)
Dois métodos com o mesmo nome mas parâmetros diferentes. A versão com `String` delega para a versão com `Time`.

```java
public void vitoria(Time time) {
    // lógica aqui
}

public void vitoria(String nome) {
    Time time = getTime(nome);
    if (time != null) vitoria(time); // delega
}
```

Isso mantém o `equalsIgnoreCase` em um único lugar (`getTime`), e o `null check` evita `NullPointerException` quando o time não existe.

---

## toString()
Sobrescrever `toString()` define o que aparece quando você faz `System.out.println(objeto)`. Sem ele, Java imprime o hashCode (`Time@50134894`).

```java
// Em Time.java
@Override
public String toString() {
    return nome + " | Pts: " + getPontuacao() + " | V: " + vitorias + " | E: " + empates + " | D: " + derrotas;
}

// Em Tabela.java
@Override
public String toString() {
    List<Time> ordenados = new ArrayList<>(times);
    Collections.sort(ordenados, Collections.reverseOrder());

    String resultado = "";
    for (Time t : ordenados) {
        resultado += t + "\n";
    }
    return resultado;
}
```

---

## Collections.sort + reverseOrder
Ordena uma lista usando o `compareTo` do objeto. `reverseOrder()` inverte a ordem natural — necessário aqui porque o `compareTo` de `Time` retorna 1 para o time **melhor**, então a ordem natural colocaria o pior primeiro.

```java
Collections.sort(ordenados, Collections.reverseOrder());
```

---

## Comparable
Interface implementada por `Time` que define a ordem natural entre objetos. O `compareTo` segue os critérios do Brasileirão: pontuação → vitórias → derrotas → empates → saldo de gols → gols pró → ordem alfabética.

```java
public class Time implements Comparable<Time> {
    public int compareTo(Time outroTime) {
        // retorna positivo se this > outroTime
        // retorna negativo se this < outroTime
        // retorna 0 se iguais
    }
}
```