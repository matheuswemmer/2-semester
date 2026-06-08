public class App {

 public static void main(String[] args) {

 Tabela brasileirao2022 = new Tabela(2022);
 
 brasileirao2022.addTime(new Time("Gremio"));
 brasileirao2022.addTime(new Time("Internacional"));
 brasileirao2022.addTime(new Time("Novo Hamburgo"));
 
 int ptsInter = brasileirao2022.getPontuacao("Internacional");
 
 System.out.println("Pontuacao Inter: " + ptsInter);
 
 brasileirao2022.vitoria("Internacional");

 ptsInter = brasileirao2022.getPontuacao("Internacional");

 System.out.println("Pontuacao Inter: " + ptsInter);
 
 brasileirao2022.vitoria("internacional"); // Aceita com "i" minúsculo ou maiúsculo (pesquise como é feito)
 brasileirao2022.vitoria("Gremio");
 brasileirao2022.empate("Internacional");
 brasileirao2022.empate("Inter"); // Nome de time nao cadastrado (não alterar nada)
 brasileirao2022.vitoria("Novo hamburgo");
 brasileirao2022.empate("Novo Hamburgo");
 brasileirao2022.empate("Brasil");
 
 System.out.println(brasileirao2022); // Imprime a tabela pela ordem de pontuação
 
 brasileirao2022.removeTime(brasileirao2022.getTime("Internacional"));
 
 System.out.println(brasileirao2022);
 
 brasileirao2022.removeTime(brasileirao2022.getTime("Brasil"));
 }
}