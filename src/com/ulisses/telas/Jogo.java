/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulisses.telas;

import java.util.Random;

/**
 *
 * @author Ulisses
 */
public class Jogo extends javax.swing.JFrame {

    /**
     * Creates new form Jogo
     */
    public Jogo() {
        initComponents();
    }
    
    public void PCjoga(int pN) {
        Random randomizar = new Random();
        int pn = pN;
        int cN = randomizar.nextInt(3);
        System.out.println(cN);
        switch (cN) {
            case 0:
                lblEscolhaPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ulisses/icones/pedra.png")));
                break;
            case 1:
                lblEscolhaPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ulisses/icones/papel.png")));
                break;
            case 2:
                lblEscolhaPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ulisses/icones/tesoura.png")));
                break;
        }
        if (pn == 0) {
            if (cN == 0) {
                lblPCganha.setText("Empate");
            } else if (cN == 1) {
                lblPCganha.setText("PC Ganha");
            } else {
                lblPganha.setText("Player Ganha");
            }
        } else if (pn == 1) {
            if (cN == 0) {
                lblPCganha.setText("Player Ganha");
            } else if (cN == 1) {
                lblPCganha.setText("Empate");
            } else {
                lblPganha.setText("PC Ganha");
            }
        } else {
            if (cN == 0) {
                lblPCganha.setText("PC Ganha");
            } else if (cN == 1) {
                lblPCganha.setText("Player Ganha");
            } else {
                lblPganha.setText("Empate");
            }
        }
    }
    
    public void LimparRes() {
        lblPCganha.setText("");
        lblPganha.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblPapel = new javax.swing.JLabel();
        lblTesou = new javax.swing.JLabel();
        lblPedra = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCOMpapel1 = new javax.swing.JLabel();
        lblCOMpedra1 = new javax.swing.JLabel();
        lblCOMtesou1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblEscolha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblEscolhaPC = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblPCganha = new javax.swing.JLabel();
        lblPganha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlMenu.setBackground(new java.awt.Color(44, 47, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ulisses/icones/PC.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jPanel1.setBackground(new java.awt.Color(153, 170, 181));
        jPanel1.setPreferredSize(new java.awt.Dimension(486, 117));

        lblPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ulisses/icones/papel.png"))); // NOI18N
        lblPapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPapelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPapelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPapelMouseExited(evt);
            }
        });

        lblTesou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ulisses/icones/tesoura.png"))); // NOI18N
        lblTesou.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTesouMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTesouMouseEntered(evt);
            }
        });

        lblPedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ulisses/icones/pedra.png"))); // NOI18N
        lblPedra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPedraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPedraMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblPedra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(lblPapel)
                .addGap(121, 121, 121)
                .addComponent(lblTesou)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPapel)
                    .addComponent(lblPedra)
                    .addComponent(lblTesou))
                .addGap(29, 29, 29))
        );

        jPanel2.setBackground(new java.awt.Color(153, 170, 181));
        jPanel2.setPreferredSize(new java.awt.Dimension(486, 117));

        lblCOMpapel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ulisses/icones/papel.png"))); // NOI18N

        lblCOMpedra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ulisses/icones/pedra.png"))); // NOI18N
        lblCOMpedra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCOMpedra1MouseClicked(evt);
            }
        });

        lblCOMtesou1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ulisses/icones/tesoura.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblCOMpedra1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(lblCOMpapel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(lblCOMtesou1)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCOMtesou1)
                    .addComponent(lblCOMpapel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCOMpedra1))
                .addGap(30, 30, 30))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ulisses/icones/escolha2.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ulisses/icones/escolha.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblPCganha.setForeground(new java.awt.Color(255, 255, 255));

        lblPganha.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblPCganha, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 168, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEscolhaPC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(36, 36, 36)
                        .addComponent(lblPganha, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEscolhaPC, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(lblEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPCganha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblPganha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCOMpedra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCOMpedra1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCOMpedra1MouseClicked

    private void lblPedraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPedraMouseEntered
        lblEscolha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ulisses/icones/pedra.png")));
    }//GEN-LAST:event_lblPedraMouseEntered

    private void lblPapelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPapelMouseEntered
        lblEscolha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ulisses/icones/papel.png")));
    }//GEN-LAST:event_lblPapelMouseEntered

    private void lblPapelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPapelMouseExited
    }//GEN-LAST:event_lblPapelMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu abrir = new Menu();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblTesouMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTesouMouseEntered
        lblEscolha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ulisses/icones/tesoura.png")));
    }//GEN-LAST:event_lblTesouMouseEntered

    private void lblPedraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPedraMouseClicked
        LimparRes();
        int pN = 0;
        PCjoga(pN);
    }//GEN-LAST:event_lblPedraMouseClicked

    private void lblPapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPapelMouseClicked
        LimparRes();
        int pN = 1;
        PCjoga(pN);
    }//GEN-LAST:event_lblPapelMouseClicked

    private void lblTesouMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTesouMouseClicked
        LimparRes();
        int pN = 2;
        PCjoga(pN);
    }//GEN-LAST:event_lblTesouMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCOMpapel1;
    private javax.swing.JLabel lblCOMpedra1;
    private javax.swing.JLabel lblCOMtesou1;
    private javax.swing.JLabel lblEscolha;
    private javax.swing.JLabel lblEscolhaPC;
    private javax.swing.JLabel lblPCganha;
    private javax.swing.JLabel lblPapel;
    private javax.swing.JLabel lblPedra;
    private javax.swing.JLabel lblPganha;
    private javax.swing.JLabel lblTesou;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
