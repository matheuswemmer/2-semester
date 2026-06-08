public class ComparacaoProgramadores {
    
    String linguagemBuscada;
    Programadores programador1, programador2;

    public static void comparacaoDeExperiencias(String linguagemBuscada, Programadores programador1, Programadores programador2){

        LinguagemProgramacao[] linguagensDoProgUm = programador1.getLinguagens();
        LinguagemProgramacao[] linguagensDoProgDois = programador2.getLinguagens();

        int experienciaDoProgUm = 0, experienciaDoProgDois = 0;

        
        
        for(int i=0; i < linguagensDoProgUm.length; i++){
            
            if (linguagensDoProgUm[i].nome.equals(linguagemBuscada)){
                experienciaDoProgUm = linguagensDoProgUm[i].anosExperiencia;
            }
        }
        for(int i=0; i < linguagensDoProgDois.length; i++){
            
            if (linguagensDoProgDois[i].nome.equals(linguagemBuscada)){
                experienciaDoProgDois = linguagensDoProgDois[i].anosExperiencia;
            }
        }
        System.out.println("O Programador Um possui:" + experienciaDoProgUm + " anos de experiência");
        System.out.println("O Programador Dois possui:" + experienciaDoProgDois + " anos de experiencia");

        if (experienciaDoProgUm > experienciaDoProgDois){
            System.out.println("O Programador Um é" + (experienciaDoProgUm-experienciaDoProgDois) + "anos mais experiente" );

        }
        else if(experienciaDoProgUm < experienciaDoProgDois){
            System.out.println("O Programador Dois é" + (experienciaDoProgDois - experienciaDoProgUm) + "anos mais experiente" );

        }
        else {
            System.out.printf("Ambos programadores possuem o mesmo nível de experiência");
        }

    }
}
