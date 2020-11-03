/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

import java.awt.Color;

/**
 *
 * @author Neranji Sulakshika
 */
public class HotDogPOPUPMessage extends javax.swing.JFrame {

    /**
     * Creates new form HotDogPOPUPMessage
     */
    public HotDogPOPUPMessage() {
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
        lblHotDog = new javax.swing.JLabel();
        lblHotDogName = new javax.swing.JLabel();
        lblHotDogPrice = new javax.swing.JLabel();
        lblLKR = new javax.swing.JLabel();
        lblQTY = new javax.swing.JLabel();
        spQtyHotDog = new javax.swing.JSpinner();
        lblTotal = new javax.swing.JLabel();
        lblTotalLKR = new javax.swing.JLabel();
        btnAddToPlateHotDog = new javax.swing.JButton();
        lblHotDogTotalPrice = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 530));
        jPanel1.setLayout(null);

        lblHotDog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHotDog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HOTDOG.jpg"))); // NOI18N
        jPanel1.add(lblHotDog);
        lblHotDog.setBounds(80, 40, 250, 170);
        lblHotDog.getAccessibleContext().setAccessibleName("lblHotDog");

        lblHotDogName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblHotDogName.setForeground(new java.awt.Color(0, 0, 0));
        lblHotDogName.setText("HOT DOG");
        jPanel1.add(lblHotDogName);
        lblHotDogName.setBounds(130, 220, 140, 30);
        lblHotDogName.getAccessibleContext().setAccessibleName("lblHotDogName");

        lblHotDogPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblHotDogPrice.setForeground(new java.awt.Color(51, 51, 51));
        lblHotDogPrice.setText("150.00");
        jPanel1.add(lblHotDogPrice);
        lblHotDogPrice.setBounds(170, 260, 50, 20);
        lblHotDogPrice.getAccessibleContext().setAccessibleName("lblHotDogPrice");

        lblLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblLKR.setForeground(new java.awt.Color(51, 51, 51));
        lblLKR.setText("LKR");
        jPanel1.add(lblLKR);
        lblLKR.setBounds(130, 260, 40, 20);
        lblLKR.getAccessibleContext().setAccessibleName("lblLKR");

        lblQTY.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQTY.setForeground(new java.awt.Color(0, 0, 0));
        lblQTY.setText("QTY");
        jPanel1.add(lblQTY);
        lblQTY.setBounds(60, 330, 50, 30);
        lblQTY.getAccessibleContext().setAccessibleName("lblQTY");

        spQtyHotDog.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        spQtyHotDog.setBorder(null);
        spQtyHotDog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(spQtyHotDog);
        spQtyHotDog.setBounds(110, 320, 50, 50);
        spQtyHotDog.getAccessibleContext().setAccessibleName("spQtyHotDog");

        lblTotal.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(102, 102, 102));
        lblTotal.setText("TOTAL :");
        jPanel1.add(lblTotal);
        lblTotal.setBounds(200, 330, 60, 30);
        lblTotal.getAccessibleContext().setAccessibleName("lblTotal");

        lblTotalLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTotalLKR.setForeground(new java.awt.Color(51, 51, 51));
        lblTotalLKR.setText("LKR");
        jPanel1.add(lblTotalLKR);
        lblTotalLKR.setBounds(280, 330, 40, 30);
        lblTotalLKR.getAccessibleContext().setAccessibleName("lblTotalLKR");

        btnAddToPlateHotDog.setBackground(new java.awt.Color(0, 153, 0));
        btnAddToPlateHotDog.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAddToPlateHotDog.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToPlateHotDog.setText("ADD TO PLATE");
        btnAddToPlateHotDog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddToPlateHotDog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddToPlateHotDog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddToPlateHotDogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddToPlateHotDogMouseExited(evt);
            }
        });
        jPanel1.add(btnAddToPlateHotDog);
        btnAddToPlateHotDog.setBounds(100, 410, 210, 60);
        btnAddToPlateHotDog.getAccessibleContext().setAccessibleName("btnAddToPlateHotDog");

        lblHotDogTotalPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblHotDogTotalPrice.setForeground(new java.awt.Color(51, 51, 51));
        lblHotDogTotalPrice.setText("150.00");
        jPanel1.add(lblHotDogTotalPrice);
        lblHotDogTotalPrice.setBounds(320, 330, 50, 30);
        lblHotDogTotalPrice.getAccessibleContext().setAccessibleName("lblHotDogTotalPrice");

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("X");
        btnCancel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setPreferredSize(new java.awt.Dimension(181, 36));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel);
        btnCancel.setBounds(370, 10, 20, 20);
        btnCancel.getAccessibleContext().setAccessibleName("btnCancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(400, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddToPlateHotDogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateHotDogMouseEntered
        btnAddToPlateHotDog.setBackground(Color.RED);
    }//GEN-LAST:event_btnAddToPlateHotDogMouseEntered

    private void btnAddToPlateHotDogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateHotDogMouseExited
        btnAddToPlateHotDog.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnAddToPlateHotDogMouseExited

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
            java.util.logging.Logger.getLogger(HotDogPOPUPMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotDogPOPUPMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotDogPOPUPMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotDogPOPUPMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotDogPOPUPMessage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToPlateHotDog;
    private javax.swing.JButton btnCancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHotDog;
    private javax.swing.JLabel lblHotDogName;
    private javax.swing.JLabel lblHotDogPrice;
    private javax.swing.JLabel lblHotDogTotalPrice;
    private javax.swing.JLabel lblLKR;
    private javax.swing.JLabel lblQTY;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalLKR;
    private javax.swing.JSpinner spQtyHotDog;
    // End of variables declaration//GEN-END:variables
}
