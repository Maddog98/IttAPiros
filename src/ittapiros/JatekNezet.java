package ittapiros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Varga Balázs
 */
public class JatekNezet extends javax.swing.JFrame {

    /**
     * Creates new form JatekNezet
     */
    public JatekNezet() {
        initComponents();
        jatek();
        UjJatek();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn1Pohar = new javax.swing.JButton();
        Btn2Pohar = new javax.swing.JButton();
        Btn3Pohar = new javax.swing.JButton();
        LbNyertNemNyert = new javax.swing.JLabel();
        CbUj = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MiUjJatek = new javax.swing.JMenuItem();
        Mi3Pohar = new javax.swing.JMenuItem();
        Mi4Pohar = new javax.swing.JMenuItem();
        MiMentes = new javax.swing.JMenuItem();
        MiBetoltes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Itt a Piros Hol a Piros játék");

        Btn1Pohar.setText("1. Pohár");

        Btn2Pohar.setText("2. Pohár");

        Btn3Pohar.setText("3. Pohár");
        Btn3Pohar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3PoharActionPerformed(evt);
            }
        });

        LbNyertNemNyert.setText("Eltaláltad! / Nem találtad el");

        CbUj.setText("Új helyre kérem a golyót");
        CbUj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbUjActionPerformed(evt);
            }
        });

        jLabel2.setText("Itt a piros hol a Piros?");

        jMenu1.setText("Menü");

        MiUjJatek.setText("Új játék");
        MiUjJatek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiUjJatekActionPerformed(evt);
            }
        });
        jMenu1.add(MiUjJatek);

        Mi3Pohar.setText("3 pohár");
        jMenu1.add(Mi3Pohar);

        Mi4Pohar.setText("4 pohár");
        Mi4Pohar.setToolTipText("");
        Mi4Pohar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mi4PoharActionPerformed(evt);
            }
        });
        jMenu1.add(Mi4Pohar);

        MiMentes.setText("Mentés");
        jMenu1.add(MiMentes);

        MiBetoltes.setText("Betöltés");
        jMenu1.add(MiBetoltes);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn1Pohar)
                                .addGap(108, 108, 108)
                                .addComponent(Btn2Pohar)
                                .addGap(92, 92, 92)
                                .addComponent(Btn3Pohar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CbUj)
                                    .addComponent(LbNyertNemNyert)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel2)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn1Pohar)
                    .addComponent(Btn2Pohar)
                    .addComponent(Btn3Pohar))
                .addGap(44, 44, 44)
                .addComponent(LbNyertNemNyert)
                .addGap(32, 32, 32)
                .addComponent(CbUj)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Mi4PoharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mi4PoharActionPerformed
        JOptionPane.showMessageDialog(this, "Jelen ez a mód sajnos nem elérhető!", "HIBA", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_Mi4PoharActionPerformed

    private void Btn3PoharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3PoharActionPerformed


    }//GEN-LAST:event_Btn3PoharActionPerformed

    private void MiUjJatekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiUjJatekActionPerformed
        jatek();
    }//GEN-LAST:event_MiUjJatekActionPerformed

    private void CbUjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbUjActionPerformed
        if (CbUj.isSelected()==true) {
            UjJatek();
        }else{
            jatek();
        }
    }//GEN-LAST:event_CbUjActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JatekNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JatekNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JatekNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JatekNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JatekNezet().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1Pohar;
    private javax.swing.JButton Btn2Pohar;
    private javax.swing.JButton Btn3Pohar;
    private javax.swing.JCheckBox CbUj;
    private javax.swing.JLabel LbNyertNemNyert;
    private javax.swing.JMenuItem Mi3Pohar;
    private javax.swing.JMenuItem Mi4Pohar;
    private javax.swing.JMenuItem MiBetoltes;
    private javax.swing.JMenuItem MiMentes;
    private javax.swing.JMenuItem MiUjJatek;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private void jatek() {
        Btn3Pohar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LbNyertNemNyert.setText("Nyertél!");
            }
        });
        Btn1Pohar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LbNyertNemNyert.setText("Nem nyertél!");
            }
        });
        Btn2Pohar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LbNyertNemNyert.setText("Nem nyertél!");
            }
        });
        
    }

    private void UjJatek() {
        Btn3Pohar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LbNyertNemNyert.setText("Nem nyertél!");
            }
        });
        Btn1Pohar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LbNyertNemNyert.setText("Nyertél!");
                
            }
        });
        Btn2Pohar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LbNyertNemNyert.setText("Nem nyertél!");
            }
        });
    }
}
