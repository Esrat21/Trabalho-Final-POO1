/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgoneclick;

/**
 *
 * @author jgmda
 */
public class atacarFrame extends javax.swing.JFrame {

    /**
     * Creates new form atacarFrame
     */
    static Player p;
    static Monstro m1;
    
    atacarFrame(Player p1, Monstro inimigo) {
        p = p1;
        m1 = inimigo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRaioCongelante = new javax.swing.JButton();
        btnExplosaoArcana = new javax.swing.JButton();
        btnEletrocutar = new javax.swing.JButton();
        btnEspadaArcana = new javax.swing.JButton();
        lblAtaques = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRaioCongelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/Mago Magia 4 usar.png"))); // NOI18N
        btnRaioCongelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaioCongelanteActionPerformed(evt);
            }
        });

        btnExplosaoArcana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/Mago Magia 1 usar.png"))); // NOI18N
        btnExplosaoArcana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExplosaoArcanaActionPerformed(evt);
            }
        });

        btnEletrocutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/Mago Magia 3 (2).png"))); // NOI18N
        btnEletrocutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEletrocutarActionPerformed(evt);
            }
        });

        btnEspadaArcana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgoneclick/Imagens/Mago 2.png"))); // NOI18N
        btnEspadaArcana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspadaArcanaActionPerformed(evt);
            }
        });

        lblAtaques.setText("ATAQUES");

        btnReturn.setText("Voltar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRaioCongelante)
                        .addGap(18, 18, 18)
                        .addComponent(btnExplosaoArcana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnReturn)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEletrocutar)
                            .addGap(18, 18, 18)
                            .addComponent(btnEspadaArcana))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(lblAtaques)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblAtaques, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRaioCongelante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExplosaoArcana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEspadaArcana)
                    .addComponent(btnEletrocutar))
                .addGap(43, 43, 43)
                .addComponent(btnReturn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRaioCongelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaioCongelanteActionPerformed
        // TODO add your handling code here:
        int danop = p.getDanoDaArma() + 5;
        int HpAtual = m1.getHp();
        m1.setVida(HpAtual - danop);
        int danoM = m1.getDano();
        int pHpAtual = p.getHp();
        p.setHp(pHpAtual - danoM);
    }//GEN-LAST:event_btnRaioCongelanteActionPerformed

    private void btnExplosaoArcanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExplosaoArcanaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnExplosaoArcanaActionPerformed

    private void btnEletrocutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEletrocutarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnEletrocutarActionPerformed

    private void btnEspadaArcanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspadaArcanaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnEspadaArcanaActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(atacarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atacarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atacarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atacarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atacarFrame(p,m1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEletrocutar;
    private javax.swing.JButton btnEspadaArcana;
    private javax.swing.JButton btnExplosaoArcana;
    private javax.swing.JButton btnRaioCongelante;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel lblAtaques;
    // End of variables declaration//GEN-END:variables
}
