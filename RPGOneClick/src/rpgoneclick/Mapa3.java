/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgoneclick;

import java.awt.Point;

/**
 *
 * @author jgmda
 */
public class Mapa3 extends javax.swing.JFrame {

    /**
     * Creates new form Mapa3
     */
    public Mapa3() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMago = new javax.swing.JLabel();
        Mapa = new javax.swing.JLabel();
        btnCima = new javax.swing.JButton();
        bntBaixo = new javax.swing.JButton();
        btnEsquerda = new javax.swing.JButton();
        btnDireita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/MaguinhoUsarESSE.png"))); // NOI18N
        getContentPane().add(lblMago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, 20));

        Mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/0,2.png"))); // NOI18N
        getContentPane().add(Mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnCima.setIcon(new javax.swing.ImageIcon("C:\\Users\\jgmda\\Downloads\\icons8-seta-longa-acima-16.png")); // NOI18N
        btnCima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCimaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        bntBaixo.setIcon(new javax.swing.ImageIcon("C:\\Users\\jgmda\\Downloads\\icons8-seta-longa-abaixo-16.png")); // NOI18N
        bntBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBaixoActionPerformed(evt);
            }
        });
        getContentPane().add(bntBaixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        btnEsquerda.setIcon(new javax.swing.ImageIcon("C:\\Users\\jgmda\\Downloads\\icons8-seta-longa-à-esquerda-16.png")); // NOI18N
        btnEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsquerdaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEsquerda, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        btnDireita.setIcon(new javax.swing.ImageIcon("C:\\Users\\jgmda\\Downloads\\icons8-seta-longa-à-direita-16.png")); // NOI18N
        btnDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDireitaActionPerformed(evt);
            }
        });
        getContentPane().add(btnDireita, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void movimentos(){
        Point m = lblMago.getLocation();
     }
    
    private void btnCimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCimaActionPerformed
        // TODO add your handling code here:
        movimentos();
        Point m = lblMago.getLocation();
        System.out.println(lblMago.getLocation());
        m.y = m.y - 16;
        lblMago.setLocation(m);
    }//GEN-LAST:event_btnCimaActionPerformed

    private void bntBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBaixoActionPerformed
        // TODO add your handling code here:
        movimentos();
        Point m = lblMago.getLocation();
        System.out.println(lblMago.getLocation());
        m.y = m.y + 16;
        lblMago.setLocation(m);
    }//GEN-LAST:event_bntBaixoActionPerformed

    private void btnEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsquerdaActionPerformed
        // TODO add your handling code here:
        movimentos();
        Point m = lblMago.getLocation();
        System.out.println(lblMago.getLocation());
        m.x = m.x - 16;
        lblMago.setLocation(m);
    }//GEN-LAST:event_btnEsquerdaActionPerformed

    private void btnDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDireitaActionPerformed
        // TODO add your handling code here:
        movimentos();
        Point m = lblMago.getLocation();
        System.out.println(lblMago.getLocation());
        m.x = m.x + 16;
        lblMago.setLocation(m);
    }//GEN-LAST:event_btnDireitaActionPerformed

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
            java.util.logging.Logger.getLogger(Mapa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mapa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mapa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mapa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mapa3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mapa;
    private javax.swing.JButton bntBaixo;
    private javax.swing.JButton btnCima;
    private javax.swing.JButton btnDireita;
    private javax.swing.JButton btnEsquerda;
    private javax.swing.JLabel lblMago;
    // End of variables declaration//GEN-END:variables
}
