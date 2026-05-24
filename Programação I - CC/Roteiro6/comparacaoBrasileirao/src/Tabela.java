import java.util.*;

public class Tabela {

    int AnoDaTabela;
    ArrayList<Time> times = new ArrayList<>();

    Tabela (int AnoDaTabela){
        this.AnoDaTabela = AnoDaTabela;
    }

    public boolean addTime(Time novoTime){

        if (times.contains(novoTime)){    
            return false;
        }
        else{
            times.add(novoTime);            
            return true;
        }
    }
    public boolean removeTime(Time novoTime){

        if (times.contains(novoTime)){    
            return false;
        }
        else{
            times.remove(novoTime);            
            return true;
        }
    }

    public Time getTime(String nomeDoTime) {
        for (Time t : times){
            if (t.getNome().equalsIgnoreCase(nomeDoTime)){
                return t;
            }
        }
        return null;
    }

    // Manipulação de Pontuação

    public void vitoria(Time time){
        time.vitorias++;
    }
    public void vitoria(String timeString){
        getTime(timeString).vitorias++;
    }

    public void empate(Time time){
        time.empates++;
    }
    public void empate(String timeString){
        Time time = getTime(timeString);
        if (time != null){
        getTime(timeString).empates++;
        }
    }

    public void derrota(Time time){
        time.derrotas++;
    }
    public void derrota(String timeString){
        getTime(timeString).derrotas++;
    }

    public int getPontuacao(Time time){
        return time.getPontuacao();
    }
    public int getPontuacao(String timeString){
        return getTime(timeString).getPontuacao();
    }

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
}
