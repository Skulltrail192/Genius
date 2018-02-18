package Negocios;

import java.util.ArrayList;
import java.util.Random;

public class Engine {

    private ArrayList<String> jogadasComputador = new ArrayList();
    private ArrayList<String> jogadasHumanas = new ArrayList();
    Random random = new Random();

    public Engine() {
    }

    public void addRandom() {
        getJogadasHumanas().add(String.valueOf(random.nextInt(4)));
    }

    public void addJogada(String a) {
        jogadasHumanas.add(a);
    }

    public int verificaTamanho() {
        int resp;
        if (jogadasHumanas.size() == getJogadasHumanas().size()) {
            resp = 0;
        } else {
            resp = 1;
        }
        return resp;
    }

    public boolean comparaArrays(int index) {
        if (jogadasHumanas.get(index).equals(getJogadasHumanas().get(index))) {
            return true;
        } else {
            return false;
        }
    }

    public void zeraJogadasHumanas() {
        jogadasHumanas.clear();
    }

    public void zeraJogadasComputador() {
        getJogadasHumanas().clear();
    }

    public ArrayList<String> getJogadasHumanas() {
        return jogadasComputador;
    }
}