/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgoneclick;

import com.sun.glass.events.KeyEvent;
import java.awt.Point;

/**
 *
 * @author jgmda
 */
public class Mapa2 extends javax.swing.JFrame {

    /**
     * Creates new form Mapa2
     */
    public Mapa2() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    
    public void movimentos(){
        Point m = lblMago.getLocation();
        
        //parede invisivel de cima
        if(m.y == -4){
            btnCima.setEnabled(false);
        }
        else{
            btnCima.setEnabled(true);
        }
        //Parede invisivel de Baixo
        if(m.y == 460){
            btnBaixo.setEnabled(false);
        }
        else
            btnBaixo.setEnabled(true);
        //PArede Invisivel da esquerda
        if(m.x == 0){
            btnEsquerda.setEnabled(false);
        }
        else
            btnEsquerda.setEnabled(true);
        //PArede invisivel da Direita
        if(m.x == 464 && (m.y < 332 || m.y > 348 )){
            btnDireita.setEnabled(false);
        }
        else 
            if(m.x == 464 && (m.y == 332 || m.y == 348)){
                new Mapa3().setVisible(true);
                this.dispose();
            }
            else{
                btnDireita.setEnabled(true);
        }
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
        btnBaixo = new javax.swing.JButton();
        btnEsquerda = new javax.swing.JButton();
        btnDireita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/MaguinhoUsarESSE.png"))); // NOI18N
        getContentPane().add(lblMago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 20, -1));

        Mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/0,1.png"))); // NOI18N
        getContentPane().add(Mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnCima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCimaActionPerformed(evt);
            }
        });
        btnCima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCimaKeyPressed(evt);
            }
        });
        getContentPane().add(btnCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        btnBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaixoActionPerformed(evt);
            }
        });
        btnBaixo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBaixoKeyPressed(evt);
            }
        });
        getContentPane().add(btnBaixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        btnEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsquerdaActionPerformed(evt);
            }
        });
        btnEsquerda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEsquerdaKeyPressed(evt);
            }
        });
        getContentPane().add(btnEsquerda, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        btnDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDireitaActionPerformed(evt);
            }
        });
        btnDireita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDireitaKeyPressed(evt);
            }
        });
        getContentPane().add(btnDireita, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaixoActionPerformed
        // TODO add your handling code here:
        Point m = lblMago.getLocation();
        System.out.println(lblMago.getLocation());
        m.y = m.y + 16;
        lblMago.setLocation(m);
        movimentos();
    }//GEN-LAST:event_btnBaixoActionPerformed

    private void btnEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsquerdaActionPerformed
        Point m = lblMago.getLocation();
        System.out.println(lblMago.getLocation());
        m.x = m.x - 16;
        lblMago.setLocation(m);
        movimentos();
    }//GEN-LAST:event_btnEsquerdaActionPerformed

    private void btnCimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCimaActionPerformed
        Point m = lblMago.getLocation();
        System.out.println(lblMago.getLocation());
        m.y = m.y - 16;
        lblMago.setLocation(m);
        movimentos();
    }//GEN-LAST:event_btnCimaActionPerformed

    private void btnDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDireitaActionPerformed
        // TODO add your handling code here:
        Point m = lblMago.getLocation();
        System.out.println(lblMago.getLocation());
        m.x = m.x + 16;
        lblMago.setLocation(m);
        movimentos();
    }//GEN-LAST:event_btnDireitaActionPerformed

    private void btnCimaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCimaKeyPressed
        //move personagem para esquerda
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.x = m.x - 16;
            lblMago.setLocation(m);
            movimentos();
        }
        //move o personagem para cima
        else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.y = m.y - 16;
            lblMago.setLocation(m);
            movimentos();
        }
        //move personagem para baixo
        else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.y = m.y + 16;
            lblMago.setLocation(m);
            movimentos();
        }
        //move personagem para direita
        else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.x = m.x + 16;
            lblMago.setLocation(m);
            movimentos();
        }
        
    }//GEN-LAST:event_btnCimaKeyPressed

    private void btnBaixoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBaixoKeyPressed
        //move personagem para esquerda
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.x = m.x - 16;
            lblMago.setLocation(m);
            movimentos();
        }
        //move o personagem para cima
        else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.y = m.y - 16;
            lblMago.setLocation(m);
            movimentos();
        }
        //move personagem para baixo
        else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.y = m.y + 16;
            lblMago.setLocation(m);
            movimentos();
        }
        //move personagem para direita
        else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.x = m.x + 16;
            lblMago.setLocation(m);
            movimentos();
        }
    }//GEN-LAST:event_btnBaixoKeyPressed

    private void btnEsquerdaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEsquerdaKeyPressed
        //move personagem para esquerda
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.x = m.x - 16;
            lblMago.setLocation(m);
            movimentos();
        }
        //move o personagem para cima
        else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.y = m.y - 16;
            lblMago.setLocation(m);
            movimentos();
        }
        //move personagem para baixo
        else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.y = m.y + 16;
            lblMago.setLocation(m);
            movimentos();
        }
        //move personagem para direita
        else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.x = m.x + 16;
            lblMago.setLocation(m);
            movimentos();
        }
    }//GEN-LAST:event_btnEsquerdaKeyPressed

    private void btnDireitaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDireitaKeyPressed
        //move personagem para esquerda
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.x = m.x - 16;
            lblMago.setLocation(m);
            movimentos();
        }
        //move o personagem para cima
        else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.y = m.y - 16;
            lblMago.setLocation(m);
            movimentos();
        }
        //move personagem para baixo
        else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.y = m.y + 16;
            lblMago.setLocation(m);
            movimentos();
        }
        //move personagem para direita
        else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            Point m = lblMago.getLocation();
            System.out.println(lblMago.getLocation());
            m.x = m.x + 16;
            lblMago.setLocation(m);
            movimentos();
        }
    }//GEN-LAST:event_btnDireitaKeyPressed

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
            java.util.logging.Logger.getLogger(Mapa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mapa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mapa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mapa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mapa2().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mapa;
    private javax.swing.JButton btnBaixo;
    private javax.swing.JButton btnCima;
    private javax.swing.JButton btnDireita;
    private javax.swing.JButton btnEsquerda;
    private javax.swing.JLabel lblMago;
    // End of variables declaration//GEN-END:variables
}