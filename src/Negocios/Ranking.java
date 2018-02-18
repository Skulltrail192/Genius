package Negocios;

import java.io.*;
import java.util.ArrayList;

public class Ranking {

    private Jogadores jogadoresDeTroca;
    private ArrayList<Jogadores> scoreJogadores = new ArrayList();

    public void addJogador(String nome, int score) {
        Jogadores jogador = new Jogadores();
        jogador.setNome(nome);
        jogador.setScore(score);
        getScoreJogadores().add(jogador);
    }

    public ArrayList<Jogadores> getScoreJogadores() {
        return scoreJogadores;
    }
    
    public void setScoreJogadores(ArrayList<Jogadores> scoreJogadores) {
        this.scoreJogadores = scoreJogadores;
    }

    public Jogadores retornaJogador() {
        return scoreJogadores.get(scoreJogadores.size() - 1);
    }

    public void gravarEmArquivo() {
        FileOutputStream arq = null;
        ObjectOutputStream out = null;
        ordenaArrayRanking();
        try {
            arq = new FileOutputStream("save games/jogadores.dat");
            out = new ObjectOutputStream(arq);
            out.writeObject(scoreJogadores);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                arq.close();
                out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public ArrayList<Jogadores> lerDoArquivo() {
        FileInputStream arqLeitura = null;
        ObjectInputStream in = null;
        ArrayList<Jogadores> Lista = null;
        try {
            arqLeitura = new FileInputStream("save games/jogadores.dat");
            in = new ObjectInputStream(arqLeitura);
            Lista = (ArrayList<Jogadores>) in.readObject();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                arqLeitura.close();
                in.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return Lista;
    }

    public void ordenaArrayRanking() {
        if (scoreJogadores.size() > 1) {
            for (int i = 0; i < scoreJogadores.size(); i++) {
                for (int j = 0; j < scoreJogadores.size() - 1; j++) {
                    if (scoreJogadores.get(j).getScore() < scoreJogadores.get(j + 1).getScore()) {
                        jogadoresDeTroca = scoreJogadores.get(j);
                        scoreJogadores.set(j, scoreJogadores.get(j + 1));
                        scoreJogadores.set(j + 1, jogadoresDeTroca);
                    }
                }
            }
        }
    }

    public boolean quebrouRecorde(int score) {
        boolean retorno = false;
        for (int i = 0; i < scoreJogadores.size(); i++) {
            if(score>scoreJogadores.get(i).getScore()){
                retorno=true;
            }
        }
        return retorno;
    }

public boolean existeArquivo() {
        File file = new File("save games/jogadores.dat");
        if (file.exists()) {
            return true;
        } else {
            return false;
        }
    }
}