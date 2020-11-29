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
public class POPUP_Message_Chicken_CheeseBalls extends javax.swing.JFrame implements PopUpInterface_Appetizer{

    /**
     * Creates new form popup_message_ckicken_cheese_balls
     */
    
    //Declaration of Member Fields
    public final int CustID = 1000;
    String Total = "0";
    int qty; 
    String ProductDescription = "Chicken Cheese Balls";
    Connection conn;
    
    //Connection setup
    String connectionUrl = "jdbc:mysql://localhost:3306/foodorderingsystem";
    String username= "sa";
    String Pass="anjalo9990";
    
    
    //Frame Creation1
    public POPUP_Message_Chicken_CheeseBalls() {
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
        lblChicken = new javax.swing.JLabel();
        lblchickenname = new javax.swing.JLabel();
        lblChickenTotalPrice = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        spChickenQty = new javax.swing.JSpinner();
        lblTOTAL = new javax.swing.JLabel();
        btnAddToPlateChicken = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblTotalLKR = new javax.swing.JLabel();
        lblLKR = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(401, 499));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblChicken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2020-11-12 at 5.44.48 PM.jpg"))); // NOI18N
        lblChicken.setText("jLabel1");
        lblChicken.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblChickenMousePressed(evt);
            }
        });
        jPanel1.add(lblChicken, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 240, 160));

        lblchickenname.setBackground(new java.awt.Color(0, 0, 0));
        lblchickenname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblchickenname.setForeground(new java.awt.Color(0, 0, 0));
        lblchickenname.setText("Chicken Cheese Balls ");
        jPanel1.add(lblchickenname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 230, 31));

        lblChickenTotalPrice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblChickenTotalPrice.setForeground(new java.awt.Color(0, 0, 0));
        lblChickenTotalPrice.setText("00.00");
        jPanel1.add(lblChickenTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 50, -1));

        lblQty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQty.setForeground(new java.awt.Color(0, 0, 0));
        lblQty.setText("QTY");
        lblQty.setToolTipText("");
        jPanel1.add(lblQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 47, 36));

        spChickenQty.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        spChickenQty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spChickenQtyStateChanged(evt);
            }
        });
        jPanel1.add(spChickenQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 42, 40));

        lblTOTAL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTOTAL.setForeground(new java.awt.Color(0, 0, 0));
        lblTOTAL.setText("TOTAL:");
        lblTOTAL.setToolTipText("");
        jPanel1.add(lblTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 69, 39));

        btnAddToPlateChicken.setBackground(new java.awt.Color(0, 153, 0));
        btnAddToPlateChicken.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        btnAddToPlateChicken.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToPlateChicken.setText("ADD TO PLATE");
        btnAddToPlateChicken.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAddToPlateChickenMouseMoved(evt);
            }
        });
        btnAddToPlateChicken.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddToPlateChickenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddToPlateChickenMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddToPlateChickenMousePressed(evt);
            }
        });
        jPanel1.add(btnAddToPlateChicken, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 281, 66));

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
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 20, 20));

        lblTotalLKR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTotalLKR.setForeground(new java.awt.Color(0, 0, 0));
        lblTotalLKR.setText("LKR ");
        jPanel1.add(lblTotalLKR, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 50, -1));

        lblLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblLKR.setForeground(new java.awt.Color(0, 0, 0));
        lblLKR.setText("LKR ");
        jPanel1.add(lblLKR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 40, -1));

        lblPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(0, 0, 0));
        lblPrice.setText("100.00");
        jPanel1.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 60, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 506));

        setSize(new java.awt.Dimension(390, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.setVisible(false);

    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.hide();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddToPlateChickenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateChickenMouseExited
        btnAddToPlateChicken.setBackground(Color.GREEN);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateChickenMouseExited

    private void btnAddToPlateChickenMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateChickenMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateChickenMouseMoved

    private void lblChickenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChickenMousePressed

        this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_lblChickenMousePressed

    private void btnAddToPlateChickenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateChickenMouseEntered
       
        btnAddToPlateChicken.setBackground(Color.RED);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateChickenMouseEntered

    private void btnAddToPlateChickenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateChickenMousePressed
        // Adding numbers of Chicken Cheese Balls to plate:
        if(qty == 0)
        {
           JOptionPane.showMessageDialog(null,"Sorry! Order can't be accepted, Please increase quantity to proceed..");
        }
        else 
        {
            CalculateAppetizersPrice();  
            InsertOrderDetails();
        }
    }//GEN-LAST:event_btnAddToPlateChickenMousePressed

    private void spChickenQtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spChickenQtyStateChanged
        // Calculate Chicken Cheese Balls Price:
        CalculateAppetizersPrice();
    }//GEN-LAST:event_spChickenQtyStateChanged

    // Declaration of Chicken Cheese Balls Price
    @Override
    public double lblPrice() 
    {
        return 100.00;
    }
    
    //Declaration of member methods 
    @Override
    public void CalculateAppetizersPrice() 
    {
        if(spChickenQty != null)
        {
            qty = (int) spChickenQty.getValue();
            
            if(qty > 20)
            {
                JOptionPane.showMessageDialog(null,"Sorry Order cant be Accepted , Please Talk to Staff..");                     
            }
            else
            {
                Total = Double.toString( qty * lblPrice());
           
                lblChickenTotalPrice.setText(Total);       
            }     
        }
         else if (spChickenQty ==  null)
              lblChickenTotalPrice.setText(Total);
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
                Logger.getLogger(POPUP_Message_Chicken_CheeseBalls.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(POPUP_Message_Chicken_CheeseBalls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Chicken_CheeseBalls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Chicken_CheeseBalls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Chicken_CheeseBalls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POPUP_Message_Chicken_CheeseBalls().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToPlateChicken;
    private javax.swing.JButton btnCancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblChicken;
    private javax.swing.JLabel lblChickenTotalPrice;
    private javax.swing.JLabel lblLKR;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblTOTAL;
    private javax.swing.JLabel lblTotalLKR;
    private javax.swing.JLabel lblchickenname;
    private javax.swing.JSpinner spChickenQty;
    // End of variables declaration//GEN-END:variables
}
