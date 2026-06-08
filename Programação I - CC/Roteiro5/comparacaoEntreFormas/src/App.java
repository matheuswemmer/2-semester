public class App {
    public static void main(String[] args) throws Exception {

        Forma circulo = new Circulo(10.0);
        Forma quadrado = new Quadrado(9.0);

        System.out.println("Circulo - " + circulo.obterArea());
        System.out.println("Quadrado = " + quadrado.obterArea());

        switch (quadrado.compareTo(circulo)) {
        case -1:
            System.out.println("Sou menor que a outra forma");
            break;

        case 1:
            System.out.println("Sou maior que a outra forma");
            break;

        default:
            System.out.println("As duas formas tem mesmo tamanho (area)");
            break;

    }
}
}
