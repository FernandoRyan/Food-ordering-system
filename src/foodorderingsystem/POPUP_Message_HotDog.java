/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

import java.awt.Color;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Neranji Sulakshika
 */
public class POPUP_Message_HotDog extends javax.swing.JFrame {

    /**
     * Creates new form HotDogPOPUPMessage
     */
    
    //Declaration of Member Feilds    
    String Total ="0";
    int qty; 
    String ProductDescription="Hot Dog";
    Connection conn;
    
    //Connection setup
    String connectionUrl = "jdbc:mysql://localhost:3306/foodorderingsystem";
    String username= "nera";
    String Pass="neranji0321";
    
    //Frame Creation
    public POPUP_Message_HotDog() {
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
        spQtyHotDog.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        spQtyHotDog.setBorder(null);
        spQtyHotDog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spQtyHotDog.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spQtyHotDogStateChanged(evt);
            }
        });
        jPanel1.add(spQtyHotDog);
        spQtyHotDog.setBounds(110, 330, 70, 30);
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
        btnAddToPlateHotDog.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnAddToPlateHotDogStateChanged(evt);
            }
        });
        btnAddToPlateHotDog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddToPlateHotDogMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddToPlateHotDogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddToPlateHotDogMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddToPlateHotDogMousePressed(evt);
            }
        });
        jPanel1.add(btnAddToPlateHotDog);
        btnAddToPlateHotDog.setBounds(100, 410, 210, 60);
        btnAddToPlateHotDog.getAccessibleContext().setAccessibleName("btnAddToPlateHotDog");

        lblHotDogTotalPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblHotDogTotalPrice.setForeground(new java.awt.Color(51, 51, 51));
        lblHotDogTotalPrice.setText("0.00");
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
        
        if(qty == 0)
            {
                JOptionPane.showMessageDialog(null,"Sorry! Order can't be accepted, Please increase quantity to proceed..");
            }
        else 
            {
                CalculateHotDogprice();
            }
    }//GEN-LAST:event_btnAddToPlateHotDogMouseEntered

    private void btnAddToPlateHotDogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateHotDogMouseExited
        btnAddToPlateHotDog.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnAddToPlateHotDogMouseExited

    private void btnAddToPlateHotDogStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnAddToPlateHotDogStateChanged
        // TODO add your handling code here:     
    }//GEN-LAST:event_btnAddToPlateHotDogStateChanged

    private void btnAddToPlateHotDogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateHotDogMouseClicked
        // TODO add your handling code here:       
    }//GEN-LAST:event_btnAddToPlateHotDogMouseClicked

    private void btnAddToPlateHotDogMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateHotDogMousePressed
        InsertOrderDetails();
    }//GEN-LAST:event_btnAddToPlateHotDogMousePressed

    private void spQtyHotDogStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spQtyHotDogStateChanged
        CalculateHotDogprice();
    }//GEN-LAST:event_spQtyHotDogStateChanged
    
    public double lblHotDogPrice() 
    {
        return 150.00; 
    }
    
    //Declaration of member methods 
    private void CalculateHotDogprice() 
    {
        if(spQtyHotDog != null)
        { 
           qty =(int) spQtyHotDog.getValue();
           
           if(qty > 20)
            {
               JOptionPane.showMessageDialog(null,"Sorry Order cant be Accepted , Please Talk to Staff..");                     
            }
           else{
               Total = Double.toString( qty * lblHotDogPrice());
           
               lblHotDogTotalPrice.setText(Total);
           }            
        }
        else if (spQtyHotDog == null)
                lblHotDogTotalPrice.setText(Total);
        //Add a message box to add to cart 
    }    
    
    private void InsertOrderDetails() 
    {
        String Insert;
        
        try
        {
            //Opening database for connection
            conn = DriverManager.getConnection(connectionUrl, username, Pass);         
        
            if(conn != null)
            {
                BigDecimal TotalValue = new BigDecimal(Total);
                
                Insert = "INSERT INTO SalesOrder(ProductDescription,qty,TotalValue) VALUES (?,?,?)";
                
                PreparedStatement pstmt = conn.prepareStatement(Insert);
                
                pstmt.setString(1, ProductDescription);
                pstmt.setInt(2, qty);
                pstmt.setBigDecimal(3, TotalValue);
                //pstmt.executeUpdate();
                pstmt.close();
                
                JOptionPane.showMessageDialog(null, "Sucessfully Added to the Plate!");
            }            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Something went wrong!\n");
            e.printStackTrace();
        }
        finally
        {
            try 
            {
                conn.close();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(POPUP_Message_HotDog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }    
    
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
            java.util.logging.Logger.getLogger(POPUP_Message_HotDog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_HotDog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_HotDog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_HotDog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new POPUP_Message_HotDog().setVisible(true);
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
