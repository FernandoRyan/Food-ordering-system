/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

//Import classes
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Neranji Sulakshika
 */
public class Selecting_DineIn_or_TakeAway extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame2
     */

    //Frame Creation
    public Selecting_DineIn_or_TakeAway() {
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
        btnDineIn = new javax.swing.JButton();
        btnTakeAway = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1367, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDineIn.setFont(new java.awt.Font("Algerian", 1, 50)); // NOI18N
        btnDineIn.setForeground(new java.awt.Color(255, 255, 255));
        btnDineIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DineIn.png"))); // NOI18N
        btnDineIn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnDineIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDineIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDineInMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDineInMousePressed(evt);
            }
        });
        btnDineIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDineInActionPerformed(evt);
            }
        });
        jPanel1.add(btnDineIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 260, 260));
        btnDineIn.getAccessibleContext().setAccessibleName("btnDineIn");

        btnTakeAway.setFont(new java.awt.Font("Algerian", 1, 50)); // NOI18N
        btnTakeAway.setForeground(new java.awt.Color(255, 255, 255));
        btnTakeAway.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TakeAway.png"))); // NOI18N
        btnTakeAway.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnTakeAway.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTakeAway.setPreferredSize(new java.awt.Dimension(149, 58));
        btnTakeAway.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTakeAwayMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTakeAwayMousePressed(evt);
            }
        });
        btnTakeAway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeAwayActionPerformed(evt);
            }
        });
        jPanel1.add(btnTakeAway, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 260, 260));
        btnTakeAway.getAccessibleContext().setAccessibleName("btnTakeAway");

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SelectingPage_Background.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1367, 720));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 1290, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDineInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDineInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDineInActionPerformed

    private void btnTakeAwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeAwayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTakeAwayActionPerformed

    private void btnDineInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDineInMousePressed
       Meal ml= new Meal();
       ml.show();
       this.hide();
    }//GEN-LAST:event_btnDineInMousePressed

    private void btnTakeAwayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTakeAwayMousePressed
       Meal ml= new Meal();
       ml.show();
       this.hide();
    }//GEN-LAST:event_btnTakeAwayMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
    }//GEN-LAST:event_formWindowOpened

    private void btnTakeAwayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTakeAwayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTakeAwayMouseClicked

    private void btnDineInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDineInMouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_btnDineInMouseClicked
    
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
            java.util.logging.Logger.getLogger(Selecting_DineIn_or_TakeAway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selecting_DineIn_or_TakeAway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selecting_DineIn_or_TakeAway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selecting_DineIn_or_TakeAway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Selecting_DineIn_or_TakeAway().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDineIn;
    private javax.swing.JButton btnTakeAway;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
