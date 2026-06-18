public class Aviao {
    String prefixo, ciaAerea;

    Aviao (String prefixo, String ciaAerea){
        this.prefixo = prefixo;
        this.ciaAerea = ciaAerea;
    }
    public String verAviao(){
        return ("Prefixo: " + this.prefixo + " - CIA: " + this.ciaAerea + "\n");
    }
}
