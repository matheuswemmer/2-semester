public class Time implements Comparable<Time> {
    private String nome;
    private int golsPRO, golsContra, vitorias, empates, derrotas;

    Time(String nome){
        this.nome = nome;
    }

    public int getPontuacao(){
        return (vitorias * 3) + empates;
    }
    
    @Override
    public int compareTo(Time outroTime) {
        // pontuacao
        if (this.getPontuacao() > outroTime.getPontuacao()) return 1;
        if (this.getPontuacao() < outroTime.getPontuacao()) return -1;
        // vitorias
        if (this.vitorias > outroTime.vitorias) return 1;
        if (this.vitorias < outroTime.vitorias) return -1;
        // derrotas
        if (this.derrotas < outroTime.derrotas) return 1;
        if (this.derrotas > outroTime.derrotas) return -1;
        // empates
        if (this.empates > outroTime.empates) return 1;
        if (this.empates < outroTime.empates) return -1;
        // 
        int saldoGolsThis = this.golsPRO - this.golsContra;
        int saldoGolsOutroTime = outroTime.golsPRO - outroTime.golsContra;

        if (saldoGolsThis > saldoGolsOutroTime) return 1;
        if (saldoGolsThis < saldoGolsOutroTime) return -1;

        if (this.golsPRO > outroTime.golsPRO) return 1;
        if (this.golsPRO < outroTime.golsPRO) return -1;

        // desempate final: ordem alfabética
        return this.nome.compareTo(outroTime.nome);
    }
}
