package Negocios;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class ThreadButtons extends Thread{
    Audio audio = new Audio();
    private ArrayList <String> jogadasHumanas= new ArrayList();
    private ArrayList <JButton> botoes = new ArrayList();
    private int tempo=600;
            
    public void pausa(){
        try{
            ThreadButtons.sleep(getTempo());
        }catch (InterruptedException ex){
            Logger.getLogger(ThreadButtons.class.getName()).log(Level.SEVERE, null, ex);
        }
    }      
    
    public void acender() {
        for (int i = 0; i < getJogadasHumanas().size(); i++) {
            if ("0".equals(getJogadasHumanas().get(i))) {                
                trocarImagem(0,"/Recursos/11.png","/Recursos/1.png");
            } 
            if ("1".equals(getJogadasHumanas().get(i))) {                
                trocarImagem(1,"/Recursos/21.png","/Recursos/2.png"); 
               }
            if ("2".equals(getJogadasHumanas().get(i))) {                
                trocarImagem(2,"/Recursos/31.png","/Recursos/3.png"); 
            }
            if ("3".equals(getJogadasHumanas().get(i))) {                
                trocarImagem(3,"/Recursos/41.png","/Recursos/4.png");   
            }
        }
    }
    
    private void trocarImagem(int index,String caminhotrocado, String caminhoOriginal){
                pausa();
                botoes.get(index).setIcon(new ImageIcon(getClass().getResource(caminhotrocado)));
                botoes.get(index).update(botoes.get(index).getGraphics());                
                audio.selecionaSom(index+1);
                pausa();
                botoes.get(index).setIcon(new ImageIcon(getClass().getResource(caminhoOriginal)));
                botoes.get(index).update(botoes.get(index).getGraphics());
    }

    public ArrayList <String> getJogadasHumanas() {
        return jogadasHumanas;
    }

    public void setBotoes(ArrayList <JButton> botoes) {
        this.botoes = botoes;
    }

    public void setJogadasHumanas(ArrayList <String> jogadasHumanas) {
        this.jogadasHumanas = jogadasHumanas;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}