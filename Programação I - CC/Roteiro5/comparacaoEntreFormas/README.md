# Comparação de Formas em Java

Exercício para praticar herança, polimorfismo e implementação da interface `Comparable`.

A classe `Forma` armazena uma área e implementa `compareTo()` para comparar objetos com base nesse valor. `Circulo` e `Quadrado` herdam de `Forma`, permitindo que diferentes tipos sejam tratados de maneira uniforme através de:

```java
Forma circulo = new Circulo(10.0);
```

O programa cria objetos, exibe suas áreas e informa qual forma possui maior, menor ou igual tamanho.
