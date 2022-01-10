package rpgoneclick;

import java.awt.Point;

public class salaDoBoss extends javax.swing.JFrame {
    public salaDoBoss() {
        initComponents();
    }
    
    //variaveis de controle para aparicao do boss
    boolean tochaCimaE = true;
    boolean tochaCimaD = true;
    boolean tochaBaixoE = true;
    boolean tochaBaixoD = true;
    int tochasAcesas = 0;
    
    //instanciacao do Boss
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBoss = new javax.swing.JLabel();
        lblMago = new javax.swing.JLabel();
        lblMapa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBoss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Boss Final teste1.png"))); // NOI18N
        getContentPane().add(lblBoss, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 40, 50));

        lblMago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/MaguinhoUsarESSE.png"))); // NOI18N
        getContentPane().add(lblMago, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 464, -1, -1));

        lblMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/imagenssssss/Boss.png"))); // NOI18N
        getContentPane().add(lblMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // metodo que verifica onde o jogador pode se mover
    private void movimentos(){
        if (tochasAcesas == 4){
            //animacao do Boss Surgindo
            
            //Inicia a luta com o Boss
            
        }
        //bloqueio da parede do meio
        
        //bloqueio da lava a esquerda
        
        //bloqueio da lava a direita
        
        //bloqueio da parede de cima
        
        //bloqueio das laterais esquerdas
        
        //bloqueio das laterais direitas
        
        //bloqueio das paredes de baixo
    }
    
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
            java.util.logging.Logger.getLogger(salaDoBoss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salaDoBoss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salaDoBoss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salaDoBoss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salaDoBoss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBoss;
    private javax.swing.JLabel lblMago;
    private javax.swing.JLabel lblMapa;
    // End of variables declaration//GEN-END:variables
}
