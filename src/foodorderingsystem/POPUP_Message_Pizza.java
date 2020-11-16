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
public class POPUP_Message_Pizza extends javax.swing.JFrame {

    /**
     * Creates new form PizzaPOPUPMessage
     */
    
    //Declaration of Member Feilds    
    String Total ="0";
    int qty; 
    String ProductDescription="Pizza";
    Connection conn;
    
    //Connection setup
    String connectionUrl = "jdbc:mysql://localhost:3306/foodorderingsystem";
    String username= "nera";
    String Pass="neranji0321";
    
    //Frame Creation
    public POPUP_Message_Pizza() {
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
        lblPizza = new javax.swing.JLabel();
        lblPizzaName = new javax.swing.JLabel();
        lblPizzaPrice = new javax.swing.JLabel();
        lblLKR = new javax.swing.JLabel();
        lblQTY = new javax.swing.JLabel();
        spQtyPizza = new javax.swing.JSpinner();
        lblTotal = new javax.swing.JLabel();
        lblTotalLKR = new javax.swing.JLabel();
        btnAddToPlatePizza = new javax.swing.JButton();
        lblPizzaTotalPrice = new javax.swing.JLabel();
        lblCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 530));
        jPanel1.setLayout(null);

        lblPizza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PIZZA.jpg"))); // NOI18N
        jPanel1.add(lblPizza);
        lblPizza.setBounds(70, 40, 250, 170);
        lblPizza.getAccessibleContext().setAccessibleName("lblPizza");

        lblPizzaName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPizzaName.setForeground(new java.awt.Color(0, 0, 0));
        lblPizzaName.setText("PIZZA");
        jPanel1.add(lblPizzaName);
        lblPizzaName.setBounds(150, 220, 120, 30);
        lblPizzaName.getAccessibleContext().setAccessibleName("lblPizzaName");

        lblPizzaPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblPizzaPrice.setForeground(new java.awt.Color(51, 51, 51));
        lblPizzaPrice.setText("150.00");
        jPanel1.add(lblPizzaPrice);
        lblPizzaPrice.setBounds(180, 260, 50, 20);
        lblPizzaPrice.getAccessibleContext().setAccessibleName("lblPizzaPrice");

        lblLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblLKR.setForeground(new java.awt.Color(51, 51, 51));
        lblLKR.setText("LKR");
        lblLKR.setInheritsPopupMenu(false);
        jPanel1.add(lblLKR);
        lblLKR.setBounds(140, 260, 40, 20);
        lblLKR.getAccessibleContext().setAccessibleName("lblLKR");

        lblQTY.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQTY.setForeground(new java.awt.Color(0, 0, 0));
        lblQTY.setText("QTY");
        jPanel1.add(lblQTY);
        lblQTY.setBounds(60, 330, 50, 30);
        lblQTY.getAccessibleContext().setAccessibleName("lblQTY");

        spQtyPizza.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        spQtyPizza.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        spQtyPizza.setBorder(null);
        spQtyPizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spQtyPizza.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spQtyPizzaStateChanged(evt);
            }
        });
        jPanel1.add(spQtyPizza);
        spQtyPizza.setBounds(110, 330, 70, 30);
        spQtyPizza.getAccessibleContext().setAccessibleName("spQtyPizza");

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

        btnAddToPlatePizza.setBackground(new java.awt.Color(0, 153, 0));
        btnAddToPlatePizza.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAddToPlatePizza.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToPlatePizza.setText("ADD TO PLATE");
        btnAddToPlatePizza.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddToPlatePizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddToPlatePizza.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnAddToPlatePizzaStateChanged(evt);
            }
        });
        btnAddToPlatePizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddToPlatePizzaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddToPlatePizzaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddToPlatePizzaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddToPlatePizzaMousePressed(evt);
            }
        });
        jPanel1.add(btnAddToPlatePizza);
        btnAddToPlatePizza.setBounds(100, 410, 210, 60);
        btnAddToPlatePizza.getAccessibleContext().setAccessibleName("btnAddToPlatePizza");

        lblPizzaTotalPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblPizzaTotalPrice.setForeground(new java.awt.Color(51, 51, 51));
        lblPizzaTotalPrice.setText("0.00");
        jPanel1.add(lblPizzaTotalPrice);
        lblPizzaTotalPrice.setBounds(320, 330, 50, 30);
        lblPizzaTotalPrice.getAccessibleContext().setAccessibleName("lblPizzaTotalPrice");

        lblCancel.setBackground(new java.awt.Color(255, 0, 0));
        lblCancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCancel.setForeground(new java.awt.Color(255, 255, 255));
        lblCancel.setText("X");
        lblCancel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancel.setPreferredSize(new java.awt.Dimension(181, 36));
        lblCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelMouseClicked(evt);
            }
        });
        lblCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCancelActionPerformed(evt);
            }
        });
        jPanel1.add(lblCancel);
        lblCancel.setBounds(370, 10, 20, 20);
        lblCancel.getAccessibleContext().setAccessibleName("lblCancel");

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

    private void lblCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_lblCancelMouseClicked

    private void lblCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCancelActionPerformed

    private void btnAddToPlatePizzaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlatePizzaMouseEntered
        btnAddToPlatePizza.setBackground(Color.RED);
        
        if(qty == 0)
        {
           JOptionPane.showMessageDialog(null,"Sorry Order cant be Accepted , Increase Quantity to proceed..");
        }
        else 
        {
            CalculatePizzaPrice();    
        }
    }//GEN-LAST:event_btnAddToPlatePizzaMouseEntered

    private void btnAddToPlatePizzaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlatePizzaMouseExited
        btnAddToPlatePizza.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnAddToPlatePizzaMouseExited

    private void btnAddToPlatePizzaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnAddToPlatePizzaStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlatePizzaStateChanged

    private void btnAddToPlatePizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlatePizzaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlatePizzaMouseClicked

    private void btnAddToPlatePizzaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlatePizzaMousePressed
        InsertOrderDetails();
    }//GEN-LAST:event_btnAddToPlatePizzaMousePressed

    private void spQtyPizzaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spQtyPizzaStateChanged
        CalculatePizzaPrice();
    }//GEN-LAST:event_spQtyPizzaStateChanged
    
    public double lblPizzaPrice() 
    {
        return 150.00;
    }
    
    //Declaration of member methods 
    private void CalculatePizzaPrice() 
    {
        if(spQtyPizza != null)
        {
            qty = (int) spQtyPizza.getValue();
            
            if(qty > 20)
            {
                JOptionPane.showMessageDialog(null,"Sorry Order cant be Accepted , Please Talk to Staff..");
                return;        
            }
        
            Total = Double.toString( qty * lblPizzaPrice());
           
            lblPizzaTotalPrice.setText(Total);                
        }
         else if (spQtyPizza ==  null)
              lblPizzaTotalPrice.setText(Total);
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
                Logger.getLogger(POPUP_Message_Pizza.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(POPUP_Message_Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new POPUP_Message_Pizza().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToPlatePizza;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lblCancel;
    private javax.swing.JLabel lblLKR;
    private javax.swing.JLabel lblPizza;
    private javax.swing.JLabel lblPizzaName;
    private javax.swing.JLabel lblPizzaPrice;
    private javax.swing.JLabel lblPizzaTotalPrice;
    private javax.swing.JLabel lblQTY;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalLKR;
    private javax.swing.JSpinner spQtyPizza;
    // End of variables declaration//GEN-END:variables

}
