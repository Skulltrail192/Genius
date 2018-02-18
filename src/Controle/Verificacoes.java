package Controle;

import Interface.Mensagens;
import Negocios.Audio;
import Negocios.Engine;
import java.io.IOException;
import java.util.ArrayList;


public class Verificacoes {

    private int index = -1;
    private int score = 0;
    private Engine engine = new Engine();
    private Mensagens mensagens = new Mensagens();
    private Audio audio = new Audio();

    public void iniciarReiniciar() {
        getEngine().zeraJogadasComputador();
        getEngine().zeraJogadasHumanas();
        getEngine().addRandom();
    }

    public void sobreGenius() {
        getMensagens().sobre();
    }
 
    public ArrayList retornaArrayJogadasHumanas() {
        return getEngine().getJogadasHumanas();
    }

    public int verificacao(String a) throws IOException {
        int retornoTamanhoMaximoArray = 0;       
        if (!engine.getJogadasHumanas().isEmpty()) {
            getEngine().addJogada(a);
            index++;
            if (getEngine().verificaTamanho() == 0) {
                if (getEngine().comparaArrays(index) == true) {
                    getEngine().addRandom();
                    getEngine().zeraJogadasHumanas();
                    retornoTamanhoMaximoArray = 1;
                    score++;
                     if((score==5) || (score==10) || (score==15) || (score==20)){
                         mensagens.subirLevel(score);
                     }
                } else {
                    audio.selecionaSom(5);
                    getMensagens().salvar(getScore());
                    getEngine().zeraJogadasComputador();
                    getEngine().zeraJogadasHumanas();  
                    retornoTamanhoMaximoArray = 2;
                }
                index = -1;
            } else {
                if (getEngine().verificaTamanho() == 1) {
                    if (getEngine().comparaArrays(index) == false) {
                        audio.selecionaSom(5);
                        getMensagens().salvar(getScore());
                        getEngine().zeraJogadasComputador();
                        getEngine().zeraJogadasHumanas();
                        index = -1;
                        score++;
                        retornoTamanhoMaximoArray = 2;
                    }
                }
            }
        }
        return retornoTamanhoMaximoArray;
    }

    public int getScore() {
        return score;
    }
    
    public int aumentaNivel(){
            int tempo = 0;
            if(score<=5){
                return 600;
            }
            if(score>5 && score<=10){
                tempo=450;
            }
            if(score>10 && score<15){
                tempo=300;
            }
            if(score>15 && score<=20){
                tempo=200;
            } 
            if(score>20){
                tempo=120;
            }
            return tempo;     
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Mensagens getMensagens() {
        return mensagens;
    }

    public Engine getEngine() {
        return engine;
    }
}
