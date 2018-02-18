package Interface;

import Negocios.Audio;
import Negocios.Jogadores;
import Negocios.Ranking;
import java.awt.Color;
import java.awt.Container;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class Mensagens {

    private Ranking ranking = new Ranking();
    private String nome;
    Audio audio= new Audio();

    public void sobre() {
        JOptionPane.showMessageDialog(null, "Versão 1.0", "Versao do Genius", 1);
    }

    public void maior(int score) {
        JOptionPane.showMessageDialog(null, "Maior Score: " + score);
    }

    public void salvar(int score) throws IOException {
        if (ranking.existeArquivo() == true) {
            ranking.setScoreJogadores(ranking.lerDoArquivo());
            addJogadorAoArrayList(score);
        } else {
            addJogadorAoArrayList(score);
        }
    }

    private void addJogadorAoArrayList(int score) throws FileNotFoundException, IOException {
        nome=JOptionPane.showInputDialog(null, "Errou a Jogada.Digite seu nome para salvar seu score: ","Salvar score",1);
        if(nome!=null){
            ranking.addJogador(nome, score);
        JOptionPane.showMessageDialog(null, "O Seu score foi " + score, "Score total", 1);
        if( ranking.quebrouRecorde(score)==true){
            audio.selecionaSom(6);
            JOptionPane.showMessageDialog(null, "Parabéns!!! Você quebrou o maior recorde! Agora está no topo!","Quebrou o recorde",1);
         }
            ranking.gravarEmArquivo();
        lerArquivo();
        }
    }
    
    public void subirLevel(int score){
        JOptionPane.showMessageDialog(null, "Parabens, voce acertou "+score+" vezes seguidas");
    }

    public void lerArquivo() throws FileNotFoundException, IOException {
        ArrayList<Jogadores> listaRecuperada = ranking.lerDoArquivo();
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Ranking de Jogadores");
        frame.setResizable(false);
        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);
        for (int i = 0; i < listaRecuperada.size(); i++) {
            JLabel nome = new JLabel();
            nome.setSize(100, 20);
            nome.setLocation(30, 20 * (i + 1));
            nome.setText(listaRecuperada.get(i).getNome());
            nome.setForeground(Color.white);
            JLabel score = new JLabel();
            score.setSize(50, 20);
            score.setLocation(300, 20 * (i + 1));
            score.setText(String.valueOf(listaRecuperada.get(i).getScore()));
            score.setForeground(Color.white);
            frame.add(nome);
            frame.add(score); 
            frame.repaint();
        }
    }
}