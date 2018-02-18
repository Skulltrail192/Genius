package Negocios;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;

public class Audio {

    public void tocarSom(String caminho) {
        try {
            AudioClip clip = Applet.newAudioClip(new File(caminho).toURL());
            clip.play();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }

    public void selecionaSom(int index) {
        if (index == 1) {
            tocarSom("src/Recursos/som1.wav");
        }
        if (index == 2) {
            tocarSom("src/Recursos/som2.wav");
        }
        if (index == 3) {
            tocarSom("src/Recursos/som3.wav");
        }
        if (index == 4) {
            tocarSom("src/Recursos/som4.wav");
        }
        if (index == 5) {
            tocarSom("src/Recursos/erro.wav");
        }  
        if (index == 6) {
            tocarSom("src/Recursos/applause.wav");
        }  
    }
}
