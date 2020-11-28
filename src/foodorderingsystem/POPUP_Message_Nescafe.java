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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samad
 */
public class POPUP_Message_Nescafe extends javax.swing.JFrame implements PopUpInterface_Beverages {
    
    public final int CustID=1000;
    String Total ="00";
    int qty; 
    String ProductDescription = "Nescafe";
    Connection conn; 
    
    //Connection setup
    String connectionUrl = "jdbc:mysql://localhost:3306/foodorderingsystem";
    String username= "sa";
    String Pass="anjalo9990";

    /**
     * Creates new form NescafeDialogBox
     */
    public POPUP_Message_Nescafe() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        qtyNescafe = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnAddToPlateNescafe = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnCANCEL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nesnew.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("NESCAFE / NESTEA / MILO");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("QTY");

        qtyNescafe.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyNescafeStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("TOTAL : ");

        lblTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTotal.setText("LKR  0.00");

        btnAddToPlateNescafe.setBackground(new java.awt.Color(0, 204, 0));
        btnAddToPlateNescafe.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAddToPlateNescafe.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToPlateNescafe.setText("ADD TO PLATE");
        btnAddToPlateNescafe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddToPlateNescafeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddToPlateNescafeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddToPlateNescafeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddToPlateNescafeMousePressed(evt);
            }
        });
        btnAddToPlateNescafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToPlateNescafeActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 153, 153));
        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FLAVOUR", "NESCAFE", "NESTEA", "MILO" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("LKR  40.00");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(77, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addComponent(btnCANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddToPlateNescafe, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(188, 188, 188)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyNescafe, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyNescafe, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddToPlateNescafe, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 530, 590);

        setSize(new java.awt.Dimension(530, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddToPlateNescafeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateNescafeMousePressed

        this.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateNescafeMousePressed

    private void btnAddToPlateNescafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToPlateNescafeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateNescafeActionPerformed

    private void btnAddToPlateNescafeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateNescafeMouseEntered
       
        btnAddToPlateNescafe.setBackground(Color.RED);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateNescafeMouseEntered

    private void btnAddToPlateNescafeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateNescafeMouseExited
        
        btnAddToPlateNescafe.setBackground(Color.GREEN);
// TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateNescafeMouseExited

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnAddToPlateNescafeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateNescafeMouseClicked
        
          if(qty == 0)
        {
           JOptionPane.showMessageDialog(null,"Sorry! Order can't be accepted, Please increase quantity to proceed..");
        }
        else 
        {
            CalculateBeverageprice();  
            InsertOrderDetails();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateNescafeMouseClicked

    private void qtyNescafeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyNescafeStateChanged
        
        CalculateBeverageprice();
// TODO add your handling code here:
    }//GEN-LAST:event_qtyNescafeStateChanged

    private void btnCANCELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCANCELMouseClicked
        // This page is not visible
        this.setVisible(false);
    }//GEN-LAST:event_btnCANCELMouseClicked

        @Override
    public double Price() 
    {
        return 40.00;                
    }
    
    //Declaration of Member Methods  
     @Override
     public void  CalculateBeverageprice()
     {
        if(qtyNescafe != null)
        {
            qty = (int) qtyNescafe.getValue();
            
            if(qty > 20)
            {
                JOptionPane.showMessageDialog(null,"Sorry Order cant be Accepted , Please Talk to Staff..");                       
            }
            else 
            {        
                Total = Double.toString( qty * Price());
           
                lblTotal.setText(Total);             
            }            
        }
        else if (qtyNescafe == null)
              lblTotal.setText(Total);
         //Add a message box to add to cart 
    }
    
    @Override
    public void InsertOrderDetails()
    {
        String Insert;
        String Update;
        BigDecimal TotalValue=new BigDecimal(Total);
        try
        {    
            //Opening database for connection
            conn = DriverManager.getConnection(connectionUrl, username, Pass);
            Statement st=conn.createStatement();
            
            String sql="SELECT * FROM SALESORDER WHERE Product ='" + ProductDescription +"'";
            ResultSet rs=st.executeQuery(sql);
            
            if(rs.next())
            {
                Update="update SALESORDER set QTY= QTY + ?, Total= Total + ? where Product = ?";
                PreparedStatement pstmt = conn.prepareStatement(Update);
                pstmt.setInt(1,qty);
                pstmt.setBigDecimal(2,TotalValue);
                pstmt.setString(3,ProductDescription);
                pstmt.executeUpdate();
                pstmt.close();
                JOptionPane.showMessageDialog(null,"Sucessfully Added to plate");
            }
            else
            {   
                Insert="INSERT INTO SalesOrder (CustID,Product,QTY,Total) VALUES (?,?,?,?)";
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
            java.util.logging.Logger.getLogger(POPUP_Message_Nescafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Nescafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Nescafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Nescafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POPUP_Message_Nescafe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToPlateNescafe;
    private javax.swing.JButton btnCANCEL;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner qtyNescafe;
    // End of variables declaration//GEN-END:variables
}
