package rpgoneclick;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FightFrame extends javax.swing.JFrame {
static String p;
    /**
     * Creates new form FightFrame
     * @param mob
     */
     public static Player player;
     public static Monstro monstro;
    public FightFrame(String mob,Player pl,Monstro mons) {
        p = mob;
        initComponents();
        this.player = pl;
        this.monstro = mons;
        setLocationRelativeTo(null);
        lblPlayerFugir.setVisible(false);
        magiaFugir.setVisible(false);
        lblPlayerRain.setVisible(false);
        Rain.setVisible(false);
        Comemoração.setVisible(false);
        FireGround.setVisible(false);
        Fogo.setVisible(false);
    }
    
    //instanciando Player e Inimigo
    //Player tem 7 parametros int
    /*Player p1 = new Player(10,10,10,10,10,10,10);
    Monstro inimigo = new Monstro();
    */
    
    public void showHp () {
        new Thread() {
            @Override
            public void run () {
                while(true) {
                    lblMobHpShow.setText(Integer.toString(monstro.getHp()));
                    lblPlayerHpShow.setText(Integer.toString(player.getHp()));
                    hpPlayer1.setValue(player.getHp());
                    hpMob.setValue(monstro.getHp());
                    
                    if (monstro.getHp() <= 0) {
                        btnAtacar.setEnabled(false);
                        btnFugir.setEnabled(false);
                        lblSlime.setVisible(false);
                        lblPlayer.setVisible(false);
                        Comemoração.setVisible(true);
                        lblMobHpShow.setText("DEATH");
                        FireGround.setVisible(false);
                        Fogo.setVisible(false);
                        lblPlayerFugir.setVisible(false);
                        magiaFugir.setVisible(false);
                        lblPlayerRain.setVisible(false);
                        Rain.setVisible(false);
                        try {
                            sleep(4000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(FightFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        dispose();
                    }
                    else if (player.getHp() <= 0) {
                        lblPlayer.setVisible(false);
                        lblPlayerHpShow.setText("DEATH");
                        try {
                            sleep(4000);
                            
                        } catch (InterruptedException ex) {
                            Logger.getLogger(FightFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        dispose();
                    }
                }
            }
        }.start();
    }
    
    
    /*
    public void chamaInimigos(){
        //fazendo todas as labels ficarem invisiveis
        lblSlime.setVisible(false);
        
        //selecionando a label que deve ser mostrada
        if(p.equals("Slime")){
            //criacao do inimigo Slime
            lblSlime.setVisible(true);
            inimigo.setDano(6);
            //Mob slime = new Mob();
        }
    }
    */
    
    public void fugir () {
        new Thread() {
            public void run () {
                for (int i=0; i<100; i++) {
                   if (i <50) {
                        magiaFugir.setVisible(true);
                        magiaFugir.setLocation(magiaFugir.getX() +10, magiaFugir.getY() +10);
                       try {
                           sleep(55);
                       } catch (InterruptedException ex) {
                           Logger.getLogger(FightFrame.class.getName()).log(Level.SEVERE, null, ex);
                       }
                       magiaFugir.setVisible(false);
                       magiaFugir.setLocation(magiaFugir.getX() -10, magiaFugir.getY() -10);
                       try {
                           sleep(55);
                       } catch (InterruptedException ex) {
                           Logger.getLogger(FightFrame.class.getName()).log(Level.SEVERE, null, ex);
                       }
                   }
                   else  {
                       magiaFugir.setVisible(true); 
                       lblPlayerFugir.setVisible(false);
                       try {
                           sleep(30);
                       } catch (InterruptedException ex) {
                           Logger.getLogger(FightFrame.class.getName()).log(Level.SEVERE, null, ex);
                       }
                       magiaFugir.setVisible(false);
                       lblPlayerFugir.setVisible(true);
                       try {
                           sleep(30);
                       } catch (InterruptedException ex) {
                           Logger.getLogger(FightFrame.class.getName()).log(Level.SEVERE, null, ex);
                       }
                   }
                   
                }
                dispose();
            }

            
            
        }.start();
    }
    
    public void rain () {
        new Thread() {
            @Override
            public void run() {
                lblPlayerRain.setVisible(true);
                lblPlayer.setVisible(false);
                
                for (int i=0; i<30; i++) {
                    Rain.setVisible(true);
                    try {
                        sleep(40);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FightFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Rain.setVisible(false);
                    try {
                        sleep(40);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FightFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                lblPlayerRain.setVisible(false);
                lblPlayer.setVisible(true);
            }
        }.start();
    }
    public void calmaAi() {
        new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FightFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }
    public void FireGround () {
        new Thread() {
            @Override
            public void run() {
                FireGround.setVisible(true);
                lblPlayer.setVisible(false);
                
                for (int i=0; i<30; i++) {
                    Fogo.setVisible(true);
                    try {
                        sleep(40);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FightFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Fogo.setVisible(false);
                    try {
                        sleep(40);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FightFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                FireGround.setVisible(false);
                lblPlayer.setVisible(true);
            }
        }.start();
    }
    
    public void Cura () {
        new Thread() {
            public void run() {
                lblPlayer.setVisible(false);
                lblPlayerFugir.setVisible(true);
                for (int i = 0; i < 30; i++) {
                    if (player.getHp() < 100)
                        player.setHp(player.getHp() + 1);
                    try {
                        sleep(60);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FightFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                lblPlayer.setVisible(true);
                lblPlayerFugir.setVisible(false);
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
        ultimoDano = new javax.swing.JLabel();
        Rain = new javax.swing.JLabel();
        Fogo = new javax.swing.JLabel();
        BarraCodigos = new javax.swing.JTextField();
        Livro = new javax.swing.JButton();
        hpMob = new javax.swing.JProgressBar();
        Comemoração = new javax.swing.JLabel();
        lblPlayerRain = new javax.swing.JLabel();
        FireGround = new javax.swing.JLabel();
        hpPlayer1 = new javax.swing.JProgressBar();
        lblPlayerHpShow = new javax.swing.JLabel();
        lblPlayer = new javax.swing.JLabel();
        lblSlime = new javax.swing.JLabel();
        btnAtacar = new javax.swing.JButton();
        btnFugir = new javax.swing.JButton();
        lblPlayerHp = new javax.swing.JLabel();
        lblMobHp = new javax.swing.JLabel();
        lblMobHpShow = new javax.swing.JLabel();
        magiaFugir = new javax.swing.JLabel();
        lblPlayerFugir = new javax.swing.JLabel();
        imagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Ultimo dano: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        ultimoDano.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        getContentPane().add(ultimoDano, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        Rain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/Raio.png"))); // NOI18N
        getContentPane().add(Rain, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        Fogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/Ataque explosão.png"))); // NOI18N
        getContentPane().add(Fogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, -20, -1, -1));

        BarraCodigos.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        BarraCodigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarraCodigosActionPerformed(evt);
            }
        });
        getContentPane().add(BarraCodigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 542, 230, 30));

        Livro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/The Livro.png"))); // NOI18N
        Livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LivroActionPerformed(evt);
            }
        });
        getContentPane().add(Livro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 80, 70));
        getContentPane().add(hpMob, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 330, 20));

        Comemoração.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/Comemoration.png"))); // NOI18N
        getContentPane().add(Comemoração, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblPlayerRain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/MagoRain.png"))); // NOI18N
        getContentPane().add(lblPlayerRain, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        FireGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/FireGround.png"))); // NOI18N
        getContentPane().add(FireGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        getContentPane().add(hpPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 330, 20));

        lblPlayerHpShow.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        getContentPane().add(lblPlayerHpShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 100, 20));

        lblPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/Mago Sem movimento.png"))); // NOI18N
        getContentPane().add(lblPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 410));

        lblSlime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/Slime1 luta.png"))); // NOI18N
        getContentPane().add(lblSlime, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 145, 137));

        btnAtacar.setText("Atacar");
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 89, 34));

        btnFugir.setText("Fugir");
        btnFugir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFugirActionPerformed(evt);
            }
        });
        getContentPane().add(btnFugir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 97, 34));

        lblPlayerHp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPlayerHp.setText("HP: ");
        getContentPane().add(lblPlayerHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        lblMobHp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMobHp.setText("HP:");
        getContentPane().add(lblMobHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, -1));

        lblMobHpShow.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblMobHpShow.setText(" ");
        getContentPane().add(lblMobHpShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 100, 30));

        magiaFugir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/Ataque explosao azul.png"))); // NOI18N
        getContentPane().add(magiaFugir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        lblPlayerFugir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/Fugir editado.png"))); // NOI18N
        getContentPane().add(lblPlayerFugir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        imagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/Bosque.png"))); // NOI18N
        getContentPane().add(imagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
        //atacarFrame atk = new atacarFrame(p1,inimigo);
        //btnFugir.setVisible(false);
       // btnAtacar.setEnabled(false);
       String chave = BarraCodigos.getText();
       int dan;
       if (chave.isEmpty()) {
           dan = (player.getDanoDaArma() - monstro.getDef());
            if (dan>0) {
                monstro.setHp(monstro.getHp() - dan);
                ultimoDano.setText(Integer.toString(monstro.getHp() - dan));
            }
            else
                ultimoDano.setText("Miss");
        }
       else if (chave.equals("Storm")) {
            dan = (player.getDanoDaArma() - monstro.getDef()) + 5;
            if (dan>0)  {
                monstro.setHp(monstro.getHp() - dan);
                ultimoDano.setText(Integer.toString(monstro.getDef() - dan));
            }
            else
                ultimoDano.setText("Miss");
            rain();
       }
       else if (chave.equals("Fire Blast")) {
           dan = (player.getDanoDaArma() - monstro.getDef()) + 10;
           if (dan>0) {
               monstro.setHp(monstro.getHp() - dan);
               ultimoDano.setText(Integer.toString( monstro.getDef() - dan));
           }
           else
               ultimoDano.setText("Miss");
           FireGround();
       }
       else if (chave.equals("Healing")) {
           Cura();
       }
    
        dan = monstro.getDano();
        if (dan>0)
            player.setHp(player.getHp() - (dan-player.getArmadura()));
        else
                ultimoDano.setText("Miss");
        ultimoDano.setText("");
       
    }//GEN-LAST:event_btnAtacarActionPerformed

    private void btnFugirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFugirActionPerformed
        
        lblPlayer.setVisible(false);
        lblPlayerFugir.setVisible(true);
        fugir();
        
    }//GEN-LAST:event_btnFugirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showHp();
    }//GEN-LAST:event_formWindowOpened

    private void LivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LivroActionPerformed
        Livro livro = new Livro();
        livro.setVisible(true);
    }//GEN-LAST:event_LivroActionPerformed

    private void BarraCodigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarraCodigosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BarraCodigosActionPerformed

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
            java.util.logging.Logger.getLogger(FightFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FightFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FightFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FightFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FightFrame(p,player,monstro).setVisible(true);
                //Player p1 = new Player();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BarraCodigos;
    private javax.swing.JLabel Comemoração;
    private javax.swing.JLabel FireGround;
    private javax.swing.JLabel Fogo;
    private javax.swing.JButton Livro;
    private javax.swing.JLabel Rain;
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnFugir;
    private javax.swing.JProgressBar hpMob;
    private javax.swing.JProgressBar hpPlayer1;
    private javax.swing.JLabel imagemFundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMobHp;
    private javax.swing.JLabel lblMobHpShow;
    private javax.swing.JLabel lblPlayer;
    private javax.swing.JLabel lblPlayerFugir;
    private javax.swing.JLabel lblPlayerHp;
    private javax.swing.JLabel lblPlayerHpShow;
    private javax.swing.JLabel lblPlayerRain;
    private javax.swing.JLabel lblSlime;
    private javax.swing.JLabel magiaFugir;
    private javax.swing.JLabel ultimoDano;
    // End of variables declaration//GEN-END:variables
}
