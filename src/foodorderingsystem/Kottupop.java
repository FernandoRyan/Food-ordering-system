/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

/**
 *
 * @author RYAN
 */
public class Kottupop extends javax.swing.JFrame {

    /**
     * Creates new form Kottupop
     */
    public Kottupop() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBurger = new javax.swing.JLabel();
        lblBurgerName = new javax.swing.JLabel();
        lblLKR = new javax.swing.JLabel();
        lblBurgerPrice = new javax.swing.JLabel();
        lblQTY = new javax.swing.JLabel();
        spBurgerQty = new javax.swing.JSpinner();
        lblTotalLKR = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        lblTOTAL = new javax.swing.JLabel();
        btnAddToPlateBurger = new javax.swing.JButton();
        btnCANCEL = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAddToPlateBurger1 = new javax.swing.JButton();
        btnAddToPlateBurger2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBurger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBurger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kottu.jpg"))); // NOI18N
        jPanel1.add(lblBurger, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 250, 190));

        lblBurgerName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblBurgerName.setForeground(new java.awt.Color(0, 0, 0));
        lblBurgerName.setText("Kottu Roti");
        jPanel1.add(lblBurgerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 130, 30));

        lblLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblLKR.setForeground(new java.awt.Color(51, 51, 51));
        lblLKR.setText("LKR");
        jPanel1.add(lblLKR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 40, 20));

        lblBurgerPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblBurgerPrice.setForeground(new java.awt.Color(51, 51, 51));
        lblBurgerPrice.setText("200.00");
        jPanel1.add(lblBurgerPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 50, 20));

        lblQTY.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQTY.setForeground(new java.awt.Color(0, 0, 0));
        lblQTY.setText("QTY");
        jPanel1.add(lblQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 50, 30));

        spBurgerQty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        spBurgerQty.setBorder(null);
        spBurgerQty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(spBurgerQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 50, 50));

        lblTotalLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTotalLKR.setForeground(new java.awt.Color(51, 51, 51));
        lblTotalLKR.setText("LKR");
        jPanel1.add(lblTotalLKR, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 40, 30));

        lblTotalPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTotalPrice.setForeground(new java.awt.Color(51, 51, 51));
        lblTotalPrice.setText("200.00");
        jPanel1.add(lblTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 50, 30));

        lblTOTAL.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTOTAL.setForeground(new java.awt.Color(102, 102, 102));
        lblTOTAL.setText("TOTAL :");
        jPanel1.add(lblTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 60, 30));

        btnAddToPlateBurger.setBackground(new java.awt.Color(0, 153, 0));
        btnAddToPlateBurger.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAddToPlateBurger.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToPlateBurger.setText("Egg");
        btnAddToPlateBurger.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddToPlateBurger.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddToPlateBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddToPlateBurgerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddToPlateBurgerMouseExited(evt);
            }
        });
        jPanel1.add(btnAddToPlateBurger, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 110, 40));

        btnCANCEL.setBackground(new java.awt.Color(255, 0, 0));
        btnCANCEL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCANCEL.setForeground(new java.awt.Color(255, 255, 255));
        btnCANCEL.setText("X");
        btnCANCEL.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCANCEL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCANCEL.setPreferredSize(new java.awt.Dimension(181, 36));
        btnCANCEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCANCELMouseClicked(evt);
            }
        });
        jPanel1.add(btnCANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 20, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Select:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 70, 30));

        btnAddToPlateBurger1.setBackground(new java.awt.Color(0, 153, 0));
        btnAddToPlateBurger1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAddToPlateBurger1.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToPlateBurger1.setText("ADD TO PLATE");
        btnAddToPlateBurger1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddToPlateBurger1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddToPlateBurger1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddToPlateBurger1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddToPlateBurger1MouseExited(evt);
            }
        });
        jPanel1.add(btnAddToPlateBurger1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 210, 60));

        btnAddToPlateBurger2.setBackground(new java.awt.Color(0, 153, 0));
        btnAddToPlateBurger2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAddToPlateBurger2.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToPlateBurger2.setText("Chicken");
        btnAddToPlateBurger2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddToPlateBurger2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddToPlateBurger2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddToPlateBurger2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddToPlateBurger2MouseExited(evt);
            }
        });
        jPanel1.add(btnAddToPlateBurger2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 110, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        setSize(new java.awt.Dimension(401, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddToPlateBurgerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateBurgerMouseEntered

    }//GEN-LAST:event_btnAddToPlateBurgerMouseEntered

    private void btnAddToPlateBurgerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateBurgerMouseExited

    }//GEN-LAST:event_btnAddToPlateBurgerMouseExited

    private void btnCANCELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCANCELMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnCANCELMouseClicked

    private void btnAddToPlateBurger1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateBurger1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateBurger1MouseEntered

    private void btnAddToPlateBurger1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateBurger1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateBurger1MouseExited

    private void btnAddToPlateBurger2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateBurger2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateBurger2MouseEntered

    private void btnAddToPlateBurger2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateBurger2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateBurger2MouseExited

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
            java.util.logging.Logger.getLogger(Kottupop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kottupop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kottupop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kottupop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kottupop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToPlateBurger;
    private javax.swing.JButton btnAddToPlateBurger1;
    private javax.swing.JButton btnAddToPlateBurger2;
    private javax.swing.JButton btnCANCEL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBurger;
    private javax.swing.JLabel lblBurgerName;
    private javax.swing.JLabel lblBurgerPrice;
    private javax.swing.JLabel lblLKR;
    private javax.swing.JLabel lblQTY;
    private javax.swing.JLabel lblTOTAL;
    private javax.swing.JLabel lblTotalLKR;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JSpinner spBurgerQty;
    // End of variables declaration//GEN-END:variables
}
