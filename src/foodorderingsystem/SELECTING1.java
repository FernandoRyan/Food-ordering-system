/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

/**
 *
 * @author Neranji Sulakshika
 */
public class SELECTING1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame2
     */
    public SELECTING1() {
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1367, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDineIn.setBackground(new java.awt.Color(255, 204, 153));
        btnDineIn.setFont(new java.awt.Font("Algerian", 1, 50)); // NOI18N
        btnDineIn.setForeground(new java.awt.Color(51, 0, 0));
        btnDineIn.setText("DINE IN");
        btnDineIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDineIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDineIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDineInActionPerformed(evt);
            }
        });
        jPanel1.add(btnDineIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 490, 110));
        btnDineIn.getAccessibleContext().setAccessibleName("btnDineIn");

        btnTakeAway.setBackground(new java.awt.Color(255, 204, 153));
        btnTakeAway.setFont(new java.awt.Font("Algerian", 1, 50)); // NOI18N
        btnTakeAway.setForeground(new java.awt.Color(51, 0, 0));
        btnTakeAway.setText("TAKE AWAY");
        btnTakeAway.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTakeAway.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTakeAway.setPreferredSize(new java.awt.Dimension(149, 58));
        btnTakeAway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeAwayActionPerformed(evt);
            }
        });
        jPanel1.add(btnTakeAway, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 490, 110));
        btnTakeAway.getAccessibleContext().setAccessibleName("btnTakeAway");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/filename (11) - Copy.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1367, 720));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1370, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDineInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDineInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDineInActionPerformed

    private void btnTakeAwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeAwayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTakeAwayActionPerformed

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
            java.util.logging.Logger.getLogger(SELECTING1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SELECTING1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SELECTING1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SELECTING1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SELECTING1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDineIn;
    private javax.swing.JButton btnTakeAway;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
