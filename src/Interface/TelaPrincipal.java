package Interface;

import Controle.Verificacoes;
import Negocios.ThreadButtons;
import java.awt.Color;
import java.awt.Container;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class TelaPrincipal extends javax.swing.JFrame {

    ThreadButtons threadBotoes = new ThreadButtons();
    Verificacoes verificacoes = new Verificacoes();
    ArrayList<JButton> botoes = new ArrayList();

    public TelaPrincipal() {
        lookAndFeel();
        initComponents();
        addBotoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoSuperiorEsquerdo = new javax.swing.JButton();
        botaoSuperiorDireito = new javax.swing.JButton();
        Iniciar = new javax.swing.JButton();
        botaoInferiroEsquerdo = new javax.swing.JButton();
        botaoInferiroDireito = new javax.swing.JButton();
        atual = new javax.swing.JLabel();
        maximo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MenuMain = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        sair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        maiorRanking = new javax.swing.JMenuItem();
        Sobre = new javax.swing.JMenu();
        sobreGenius = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Genius !! v1.0 !! by Samuel");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frame");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoSuperiorEsquerdo.setBackground(java.awt.Color.darkGray);
        botaoSuperiorEsquerdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/2.png"))); // NOI18N
        botaoSuperiorEsquerdo.setBorder(null);
        botaoSuperiorEsquerdo.setMaximumSize(new java.awt.Dimension(256, 256));
        botaoSuperiorEsquerdo.setMinimumSize(new java.awt.Dimension(265, 256));
        botaoSuperiorEsquerdo.setPreferredSize(new java.awt.Dimension(256, 256));
        botaoSuperiorEsquerdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSuperiorEsquerdoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSuperiorEsquerdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 70, 256, 256));

        botaoSuperiorDireito.setBackground(java.awt.Color.darkGray);
        botaoSuperiorDireito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/1.png"))); // NOI18N
        botaoSuperiorDireito.setBorder(null);
        botaoSuperiorDireito.setRequestFocusEnabled(false);
        botaoSuperiorDireito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSuperiorDireitoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSuperiorDireito, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 256, 256));

        Iniciar.setText("Iniciar");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        getContentPane().add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, 30));

        botaoInferiroEsquerdo.setBackground(java.awt.Color.darkGray);
        botaoInferiroEsquerdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/3.png"))); // NOI18N
        botaoInferiroEsquerdo.setBorder(null);
        botaoInferiroEsquerdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInferiroEsquerdoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoInferiroEsquerdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 326, 256, 256));

        botaoInferiroDireito.setBackground(java.awt.Color.darkGray);
        botaoInferiroDireito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/4.png"))); // NOI18N
        botaoInferiroDireito.setBorder(null);
        botaoInferiroDireito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInferiroDireitoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoInferiroDireito, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 326, 256, 256));

        atual.setForeground(new java.awt.Color(255, 255, 255));
        atual.setText("0");
        getContentPane().add(atual, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 40, 20));

        maximo.setForeground(new java.awt.Color(255, 255, 255));
        maximo.setText("0");
        getContentPane().add(maximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 20, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Score Atual:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Level Atual:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        jMenu1.setText("Arquivo");

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenu1.add(sair);

        MenuMain.add(jMenu1);

        jMenu2.setText("Ranking");

        maiorRanking.setText("Maior");
        maiorRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maiorRankingActionPerformed(evt);
            }
        });
        jMenu2.add(maiorRanking);

        MenuMain.add(jMenu2);

        Sobre.setText("Sobre");

        sobreGenius.setText("Sobre Genius");
        sobreGenius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreGeniusActionPerformed(evt);
            }
        });
        Sobre.add(sobreGenius);

        MenuMain.add(Sobre);

        setJMenuBar(MenuMain);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-556)/2, (screenSize.height-657)/2, 556, 657);
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        verificacoes.iniciarReiniciar();
        verificacoes.setScore(0);        
        threadBotoes.setJogadasHumanas(verificacoes.retornaArrayJogadasHumanas());
        threadBotoes.acender();
    }//GEN-LAST:event_IniciarActionPerformed

    private void botaoSuperiorDireitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSuperiorDireitoActionPerformed
        try {
            jogada("0");
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoSuperiorDireitoActionPerformed

    private void botaoSuperiorEsquerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSuperiorEsquerdoActionPerformed
        try {
            jogada("1");
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoSuperiorEsquerdoActionPerformed

    private void botaoInferiroEsquerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInferiroEsquerdoActionPerformed
        try {
            jogada("2");
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoInferiroEsquerdoActionPerformed

    private void botaoInferiroDireitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInferiroDireitoActionPerformed
        try {
            jogada("3");
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoInferiroDireitoActionPerformed

    public void jogada(String index) throws IOException {
        int resultado;      
        atual.setText(String.valueOf(verificacoes.getScore()));
        maximo.setText(String.valueOf(verificacoes.getEngine().getJogadasHumanas().size()));
        resultado=verificacoes.verificacao(index);
        if (resultado==1) {      
            threadBotoes.setTempo(verificacoes.aumentaNivel());
            threadBotoes.setJogadasHumanas(verificacoes.retornaArrayJogadasHumanas());
            threadBotoes.acender();            
        } 
    }

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void sobreGeniusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreGeniusActionPerformed
        verificacoes.getMensagens().sobre();
    }//GEN-LAST:event_sobreGeniusActionPerformed

    private void maiorRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maiorRankingActionPerformed
        try {
            verificacoes.getMensagens().lerArquivo();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_maiorRankingActionPerformed

    private void lookAndFeel() {
        Container c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);
    }

    public void addBotoes() {
        botoes.add(botaoSuperiorDireito);
        botoes.add(botaoSuperiorEsquerdo);
        botoes.add(botaoInferiroEsquerdo);
        botoes.add(botaoInferiroDireito);
        threadBotoes.setBotoes(botoes);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new TelaPrincipal().setVisible(true);                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JMenuBar MenuMain;
    private javax.swing.JMenu Sobre;
    private static javax.swing.JLabel atual;
    private javax.swing.JButton botaoInferiroDireito;
    private javax.swing.JButton botaoInferiroEsquerdo;
    private javax.swing.JButton botaoSuperiorDireito;
    private javax.swing.JButton botaoSuperiorEsquerdo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem maiorRanking;
    private javax.swing.JLabel maximo;
    private javax.swing.JMenuItem sair;
    private javax.swing.JMenuItem sobreGenius;
    // End of variables declaration//GEN-END:variables
}