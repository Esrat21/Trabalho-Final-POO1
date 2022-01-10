package rpgoneclick;

import javazoom.jl.player.Player;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
/**
 *
 * @author mateu
 */
public class GameBegin extends javax.swing.JFrame {

    /**
     * Creates new form GameBegin
     */    
    private static Musica1 m;
    public GameBegin(Musica1 mus) {
        m = mus;
        initComponents();
        setResizable(false);
        magiaLuzMago.setVisible(false);
        Guri.setVisible(false);
        Lobo.setVisible(false);
        luzLobo.setVisible(false);   
        btnSkip.setVisible(true);
    }
    int cont=0;
    
    private void Textos() {
    
        new Thread() {
            @Override
            public void run() {
                FileReader arqt;
                String linha = null;
                try {
                    File f2 = new File("C:\\RPGOneClick\\build\\classes\\rpgoneclick\\Textos\\Historia do MAgo.txt");
                    arqt = new FileReader(f2);
                    BufferedReader lerArq = new BufferedReader(arqt);
                    while (cont<=35) {
                        linha = lerArq.readLine();
                        historia.setText(linha);
                        System.out.println(historia.getText());
                        Thread.sleep(5000);
                        historia.setText("");
                        cont++;
                        System.out.println(cont);
                        
                    }
                    if(cont == 36){
                        int checkpoint;
                            System.out.println("Sai batata");
                            dispose();
                            finish();
                        }
                
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GameBegin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException | InterruptedException ex) {
                    Logger.getLogger(GameBegin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }
    
    public void movimentaçãoCutsceneIncio() {
        new Thread() {
            @Override
                public void run() {
                    
                    Point p = Mago.getLocation();
                    while (cont<13){
                    
                        while (p.x <600) {
                            p.x=p.x + 2;
                            Mago.setLocation(p);
                            try {
                            sleep(40);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(GameBegin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            if (cont == 3 || cont >= 13)
                                break;    
                        }
                        if (cont>=3 && cont <=12) {
                            Mago.setLocation(498, 410);
                            magiaLuzMago.setLocation(498 + 50, 410 -50);
                            
                            while(cont >= 3 && cont <= 8) {
                                
                                    magiaLuzMago.setVisible(true);
                                    try {
                                        sleep(70);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(GameBegin.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    magiaLuzMago.setVisible(false);
                                    try {
                                        sleep(50);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(GameBegin.class.getName()).log(Level.SEVERE, null, ex);
                                
                            } 
                                while (cont > 8 && cont <=12) {
                                magiaLuzMago.setVisible(true);
                                    try {
                                        sleep(40);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(GameBegin.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    magiaLuzMago.setVisible(false);
                                    try {
                                        sleep(40);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(GameBegin.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            }
                            }
                        
                        if (cont == 9) {
                            Guri.setVisible(true);
                        }
                        while(p.x > -30) {
                            p.x = p.x - 2;
                            Mago.setLocation(p);
                            try {
                            sleep(40);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(GameBegin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            if (cont == 3)
                                break;
                            if (cont >= 13)
                                break;
                        }
                        
                        System.out.println(p.x);


                }                        
                        Guri.setVisible(true);
                        Mago.setLocation(Guri.getX() - 100,Guri.getY());
                        while (cont <= 34) {
                            System.out.println("alo");
                            if (cont == 23) {
                                if (!(Lobo.isVisible())) {
                                    Lobo.setVisible(true);
                                }
                            }
                            if (cont == 24){ 
                                while (cont<26) {
                                    magiaLuzMago.setLocation(Lobo.getLocation());
                                    magiaLuzMago.setVisible(true);
                                    
                                    luzLobo.setVisible(true);
                                    try {
                                        sleep(30);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(GameBegin.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    luzLobo.setVisible(false);
                                    magiaLuzMago.setVisible(false);
                                    try {
                                        sleep(30);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(GameBegin.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                            if (cont == 26 ) {
                                if (Lobo.isVisible()) {
                                    Lobo.setVisible(false);
                                }
                            }
                            else if (cont == 34) {
                                Point f = Mago.getLocation();
                                Point fi = Guri.getLocation();
                                while (f.x >= -60 && fi.x >= -60) {
                                    f.x = f.x - 2;
                                    fi.x = fi.x - 3;
                                    Mago.setLocation(f);
                                    Guri.setLocation(fi);
                                    try {
                                        sleep(40);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(GameBegin.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                
                            }
                        }
                    
                }
       }.start();
    }
    
    public void finish(){
        new Thread() {
            public void run () {
                m.paraMusica();
                File f4 = new File("C:\\RPGOneClick\\src\\rpgoneclick\\Sounds\\Música Dramática - O fim do mundo.mp3");
            Musica1 M2 = new Musica1(f4);
            HistoryBeginning history = new HistoryBeginning(M2);
            history.setVisible(true);
            history.setResizable(true);
            dispose();
            try {
                M2.iniciaMusica();
                M2.paraMusica();
            } catch (JavaLayerException ex) {
                Logger.getLogger(GameBegin.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
        }.start();
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSkip = new javax.swing.JButton();
        luzLobo = new javax.swing.JLabel();
        Lobo = new javax.swing.JLabel();
        Guri = new javax.swing.JLabel();
        magiaLuzMago = new javax.swing.JLabel();
        Mago = new javax.swing.JLabel();
        historia = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSkip.setText("Skip");
        btnSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkipActionPerformed(evt);
            }
        });
        getContentPane().add(btnSkip, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, -1));

        luzLobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/magoLuzUtilizar.png"))); // NOI18N
        getContentPane().add(luzLobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, -1, -1));

        Lobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/3.png"))); // NOI18N
        getContentPane().add(Lobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        Guri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/CriançaRPG2.png"))); // NOI18N
        getContentPane().add(Guri, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, -1, -1));

        magiaLuzMago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/magoLuzUtilizar.png"))); // NOI18N
        getContentPane().add(magiaLuzMago, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 140, 130));

        Mago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/UsingMago.png"))); // NOI18N
        Mago.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                MagoAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(Mago, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        historia.setBackground(new java.awt.Color(153, 153, 153));
        historia.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        historia.setForeground(new java.awt.Color(255, 255, 255));
        historia.setOpaque(true);
        getContentPane().add(historia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 39));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/FlorestaInicio.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        System.out.println(magiaLuzMago.getLocation());
        System.out.println(Mago.getLocation());
        movimentaçãoCutsceneIncio();
        Textos();
        System.out.println(Mago.getLocation());
        
        
    
        
    }//GEN-LAST:event_formWindowOpened

    private void MagoAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MagoAncestorMoved
        
    }//GEN-LAST:event_MagoAncestorMoved

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    
        
    }//GEN-LAST:event_formWindowActivated

    private void btnSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkipActionPerformed
            // TODO add your handling code here:
            
        System.out.println("Sai batata");
        dispose();
        finish();
        
        cont = 36;     
    }//GEN-LAST:event_btnSkipActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameBegin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameBegin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameBegin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameBegin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameBegin(m).setVisible(true);
                
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Guri;
    private javax.swing.JLabel Lobo;
    private javax.swing.JLabel Mago;
    private javax.swing.JButton btnSkip;
    private javax.swing.JLabel historia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel luzLobo;
    private javax.swing.JLabel magiaLuzMago;
    // End of variables declaration//GEN-END:variables
}
