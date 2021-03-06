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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dhanuja Supun
 */
public class POPUP_Message_CheeseBalls extends javax.swing.JFrame implements PopUpInterface_Appetizer {

    /**
     * Creates new form popup_message_cheese_balls
     */
    
    //Declaration of Member Fields
    public final int CustID = 1000;
    String Total = "0";
    int qty; 
    String ProductDescription = "Cheese Balls";
    Connection conn;
    
    //Connection setup
    String connectionUrl = "jdbc:mysql://localhost:3306/foodorderingsystem";
    String username= "sa";
    String Pass="anjalo9990";
    
    
    public POPUP_Message_CheeseBalls() {
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
        lblCheeseBalls = new javax.swing.JLabel();
        lblcheeseballsname = new javax.swing.JLabel();
        lblLKR = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        spCheeseBallsQty = new javax.swing.JSpinner();
        lblTOTAL = new javax.swing.JLabel();
        lblCheeseBallsTotalPrice = new javax.swing.JLabel();
        btnAddToPlateCheeseBalls = new javax.swing.JButton();
        lblPrice = new javax.swing.JLabel();
        lblTotalLKR = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblCheeseBalls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cheese-ball-recipe-500x375.jpg"))); // NOI18N
        lblCheeseBalls.setText("jLabel1");
        lblCheeseBalls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCheeseBallsMousePressed(evt);
            }
        });

        lblcheeseballsname.setBackground(new java.awt.Color(0, 0, 0));
        lblcheeseballsname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblcheeseballsname.setForeground(new java.awt.Color(0, 0, 0));
        lblcheeseballsname.setText(" Cheese Balls");
        lblcheeseballsname.setToolTipText("");

        lblLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblLKR.setForeground(new java.awt.Color(0, 0, 0));
        lblLKR.setText("LKR ");

        lblQty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQty.setForeground(new java.awt.Color(0, 0, 0));
        lblQty.setText("QTY");

        spCheeseBallsQty.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        spCheeseBallsQty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spCheeseBallsQtyStateChanged(evt);
            }
        });

        lblTOTAL.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lblTOTAL.setForeground(new java.awt.Color(0, 0, 0));
        lblTOTAL.setText("TOTAL :");

        lblCheeseBallsTotalPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblCheeseBallsTotalPrice.setForeground(new java.awt.Color(0, 0, 0));
        lblCheeseBallsTotalPrice.setText("00.00");

        btnAddToPlateCheeseBalls.setBackground(new java.awt.Color(0, 153, 0));
        btnAddToPlateCheeseBalls.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        btnAddToPlateCheeseBalls.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToPlateCheeseBalls.setText("ADD TO PLATE");
        btnAddToPlateCheeseBalls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddToPlateCheeseBallsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddToPlateCheeseBallsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddToPlateCheeseBallsMousePressed(evt);
            }
        });

        lblPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(0, 0, 0));
        lblPrice.setText("100.00");

        lblTotalLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTotalLKR.setForeground(new java.awt.Color(0, 0, 0));
        lblTotalLKR.setText("LKR ");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblCheeseBalls, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spCheeseBallsQty, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(lblTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotalLKR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCheeseBallsTotalPrice)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(lblLKR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrice))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(lblcheeseballsname, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(135, 135, 135)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnAddToPlateCheeseBalls, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCheeseBalls, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblcheeseballsname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLKR)
                    .addComponent(lblPrice))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spCheeseBallsQty, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalLKR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCheeseBallsTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddToPlateCheeseBalls, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 480));

        setSize(new java.awt.Dimension(370, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddToPlateCheeseBallsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateCheeseBallsMousePressed
         // Adding Cheese Balls to the plate:
         if(qty == 0)
        {
           JOptionPane.showMessageDialog(null,"Sorry! Order can't be accepted, Please increase quantity to proceed..");
        }
        else 
        {
            CalculateAppetizersPrice();  
            InsertOrderDetails();
        }
    }//GEN-LAST:event_btnAddToPlateCheeseBallsMousePressed

    private void btnAddToPlateCheeseBallsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateCheeseBallsMouseEntered
        
        btnAddToPlateCheeseBalls.setBackground(Color.RED);
// TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateCheeseBallsMouseEntered

    private void btnAddToPlateCheeseBallsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateCheeseBallsMouseExited
       
        btnAddToPlateCheeseBalls.setBackground(Color.GREEN);
// TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateCheeseBallsMouseExited

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.hide();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void lblCheeseBallsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheeseBallsMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_lblCheeseBallsMousePressed

    private void spCheeseBallsQtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spCheeseBallsQtyStateChanged
        // Calculate Cheese Balls Price:
         CalculateAppetizersPrice();
    }//GEN-LAST:event_spCheeseBallsQtyStateChanged

    //Declaration of Cheese Balls
    @Override
    public double lblPrice() 
    {
        return 100.00;
    }
    
    //Declaration of member methods 
    @Override
    public void CalculateAppetizersPrice() 
    {
        if(spCheeseBallsQty != null)
        {
            qty = (int) spCheeseBallsQty.getValue();
            
            if(qty > 20)
            {
                JOptionPane.showMessageDialog(null,"Sorry Order cant be Accepted , Please Talk to Staff..");                     
            }
            else
            {
                Total = Double.toString( qty * lblPrice());
           
                lblCheeseBallsTotalPrice.setText(Total);       
            }     
        }
         else if (spCheeseBallsQty ==  null)
              lblCheeseBallsTotalPrice.setText(Total);
         //Add a message box to add to cart 
         
    }    
    
    // Inserting the order details
    @Override
    public void InsertOrderDetails() 
    {
        String Insert;
        String Update;
        BigDecimal TotalValue = new BigDecimal(Total);
        
        try
        {    
        //Opening database for connection
            conn = DriverManager.getConnection(connectionUrl, username, Pass);
            Statement st = conn.createStatement();
            
            String sql="SELECT * FROM SALESORDER WHERE Product ='" + ProductDescription +"'";
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next())
            {
                Update="update SALESORDER set QTY= QTY + ?, Total= Total + ? where Product = ?";
                PreparedStatement pstmt = conn.prepareStatement(Update);
                pstmt.setInt(1,qty);
                pstmt.setBigDecimal(2,TotalValue);
                pstmt.setString(3,ProductDescription);
                pstmt.executeUpdate();
                pstmt.close();
                JOptionPane.showMessageDialog(null,"Sucessfully added to plate");
            }
            else
            { 
                Insert = "INSERT INTO SalesOrder (CustID, Product, QTY, Total) VALUES (?, ?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(Insert);
                pstmt.setInt(1,CustID);
                pstmt.setString(2, ProductDescription);
                pstmt.setInt(3, qty);
                pstmt.setBigDecimal(4, TotalValue);
                pstmt.executeUpdate();
                pstmt.close();
                JOptionPane.showMessageDialog(null,"Sucessfully Added to plate");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Something went wrong\n");
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
                Logger.getLogger(POPUP_Message_CheeseBalls.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(POPUP_Message_CheeseBalls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_CheeseBalls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_CheeseBalls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_CheeseBalls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POPUP_Message_CheeseBalls().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToPlateCheeseBalls;
    private javax.swing.JButton btnCancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCheeseBalls;
    private javax.swing.JLabel lblCheeseBallsTotalPrice;
    private javax.swing.JLabel lblLKR;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblTOTAL;
    private javax.swing.JLabel lblTotalLKR;
    private javax.swing.JLabel lblcheeseballsname;
    private javax.swing.JSpinner spCheeseBallsQty;
    // End of variables declaration//GEN-END:variables
}
