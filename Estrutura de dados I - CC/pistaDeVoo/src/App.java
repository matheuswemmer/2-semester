public class App {
    public static void main(String[] args) throws Exception {

        PistaDeVoo pistaDeVoo = new PistaDeVoo(4);
        
        pistaDeVoo.imprimirFila();

        pistaDeVoo.enfileirar(new Aviao("XPTO", "azul"));
        pistaDeVoo.enfileirar(new Aviao("QYX", "CIA!"));
        pistaDeVoo.enfileirar(new Aviao("ADD", "LATAM"));
        pistaDeVoo.enfileirar(new Aviao("ZYX", "GOL"));
        pistaDeVoo.enfileirar(new Aviao("QQQ", "LARANJA"));

        pistaDeVoo.imprimirFila();

        Aviao av = pistaDeVoo.desenfileirarAviao();
        System.out.println("Avião desenfileirado: " + av.verAviao());

        pistaDeVoo.imprimirFila();
    }
}
