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
public class POPUP_Message_Burger extends javax.swing.JFrame {

    /**
     * Creates new form BurgerPOPUPMessage
     */
    
    //Declaration of Member Feilds    
    String Total ="0";
    int qty; 
    String ProductDescription="Chicken Burger";
    Connection conn;
    
    //Connection setup
    String connectionUrl = "jdbc:mysql://localhost:3306/foodorderingsystem";
    String username= "nera";
    String Pass="neranji0321";
    
    //Frame Creation
    public POPUP_Message_Burger() {
        initComponents();
        setBackground(new Color(0,0,0,0));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(null);

        lblBurger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBurger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BURGER.jpg"))); // NOI18N
        jPanel1.add(lblBurger);
        lblBurger.setBounds(70, 10, 250, 190);
        lblBurger.getAccessibleContext().setAccessibleName("lblBurger");

        lblBurgerName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblBurgerName.setForeground(new java.awt.Color(0, 0, 0));
        lblBurgerName.setText("CRISPY CHICKEN BURGER");
        jPanel1.add(lblBurgerName);
        lblBurgerName.setBounds(50, 220, 320, 30);
        lblBurgerName.getAccessibleContext().setAccessibleName("lblBurgerName");

        lblLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblLKR.setForeground(new java.awt.Color(51, 51, 51));
        lblLKR.setText("LKR");
        jPanel1.add(lblLKR);
        lblLKR.setBounds(50, 260, 40, 20);
        lblLKR.getAccessibleContext().setAccessibleName("lblLKR");

        lblBurgerPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblBurgerPrice.setForeground(new java.awt.Color(51, 51, 51));
        lblBurgerPrice.setText("200.00");
        jPanel1.add(lblBurgerPrice);
        lblBurgerPrice.setBounds(90, 260, 50, 20);
        lblBurgerPrice.getAccessibleContext().setAccessibleName("lblBurgerPrice");

        lblQTY.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQTY.setForeground(new java.awt.Color(0, 0, 0));
        lblQTY.setText("QTY");
        jPanel1.add(lblQTY);
        lblQTY.setBounds(50, 330, 50, 30);
        lblQTY.getAccessibleContext().setAccessibleName("lblQTY");

        spBurgerQty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        spBurgerQty.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        spBurgerQty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spBurgerQty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spBurgerQtyStateChanged(evt);
            }
        });
        jPanel1.add(spBurgerQty);
        spBurgerQty.setBounds(100, 330, 70, 30);
        spBurgerQty.getAccessibleContext().setAccessibleName("spBurgerQty");

        lblTotalLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTotalLKR.setForeground(new java.awt.Color(51, 51, 51));
        lblTotalLKR.setText("LKR");
        jPanel1.add(lblTotalLKR);
        lblTotalLKR.setBounds(270, 330, 40, 30);
        lblTotalLKR.getAccessibleContext().setAccessibleName("lblTotalLKR");

        lblTotalPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTotalPrice.setForeground(new java.awt.Color(51, 51, 51));
        lblTotalPrice.setText("0.00");
        jPanel1.add(lblTotalPrice);
        lblTotalPrice.setBounds(310, 330, 50, 30);
        lblTotalPrice.getAccessibleContext().setAccessibleName("lblTotalPrice");

        lblTOTAL.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTOTAL.setForeground(new java.awt.Color(102, 102, 102));
        lblTOTAL.setText("TOTAL :");
        jPanel1.add(lblTOTAL);
        lblTOTAL.setBounds(190, 330, 60, 30);
        lblTOTAL.getAccessibleContext().setAccessibleName("lblTOTAL");

        btnAddToPlateBurger.setBackground(new java.awt.Color(0, 153, 0));
        btnAddToPlateBurger.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAddToPlateBurger.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToPlateBurger.setText("ADD TO PLATE");
        btnAddToPlateBurger.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddToPlateBurger.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddToPlateBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddToPlateBurgerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddToPlateBurgerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddToPlateBurgerMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddToPlateBurgerMousePressed(evt);
            }
        });
        jPanel1.add(btnAddToPlateBurger);
        btnAddToPlateBurger.setBounds(90, 410, 210, 60);
        btnAddToPlateBurger.getAccessibleContext().setAccessibleName("btnAddToPlateBurger");

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
        jPanel1.add(btnCANCEL);
        btnCANCEL.setBounds(370, 10, 20, 20);
        btnCANCEL.getAccessibleContext().setAccessibleName("btnCANCEL");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        setSize(new java.awt.Dimension(401, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCANCELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCANCELMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnCANCELMouseClicked

    private void btnAddToPlateBurgerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateBurgerMouseEntered
        btnAddToPlateBurger.setBackground(Color.RED);
        
        if(qty == 0)
        {
           JOptionPane.showMessageDialog(null,"Sorry Order cant be Accepted , Increase Quantity to proceed..");
        }
        else 
        {
            CalculateBurgerPrice();    
        }
    }//GEN-LAST:event_btnAddToPlateBurgerMouseEntered

    private void btnAddToPlateBurgerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateBurgerMouseExited
        btnAddToPlateBurger.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnAddToPlateBurgerMouseExited

    private void btnAddToPlateBurgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateBurgerMouseClicked
         // TODO add your handling code here:       
    }//GEN-LAST:event_btnAddToPlateBurgerMouseClicked

    private void spBurgerQtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spBurgerQtyStateChanged
        CalculateBurgerPrice();
    }//GEN-LAST:event_spBurgerQtyStateChanged

    private void btnAddToPlateBurgerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateBurgerMousePressed
        InsertOrderDetails();
    }//GEN-LAST:event_btnAddToPlateBurgerMousePressed

    public double lblBurgerPrice() 
    {
        return 200.00;                
    }
    
    //Declaration of Member Methods     
     public void  CalculateBurgerPrice()
     {
        if(spBurgerQty != null)
        {
            qty = (int) spBurgerQty.getValue();
            
            if(qty > 20)
            {
                JOptionPane.showMessageDialog(null,"Sorry Order cant be Accepted , Please Talk to Staff..");                       
            }
            else 
            {        
                Total = Double.toString( qty * lblBurgerPrice());
           
                lblTotalPrice.setText(Total);             
            }            
        }
        else if (spBurgerQty == null)
              lblTotalPrice.setText(Total);
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
                pstmt.executeUpdate();
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
                Logger.getLogger(POPUP_Message_Burger.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(POPUP_Message_Burger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Burger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Burger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Burger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new POPUP_Message_Burger().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToPlateBurger;
    private javax.swing.JButton btnCANCEL;
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
