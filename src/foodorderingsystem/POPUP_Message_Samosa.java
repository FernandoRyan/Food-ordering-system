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
public class POPUP_Message_Samosa extends javax.swing.JFrame implements PopUpInterface_Appetizer{

    /**
     * Creates new form popup_message_samosa
     */
    //Declaration of Member fields
    public final int CustID = 1000;
    String Total = "0";
    int qty; 
    String ProductDescription = "Samosa";
    Connection conn;
    
    //Connection setup
    String connectionUrl = "jdbc:mysql://localhost:3306/foodorderingsystem";
    String username= "sa";
    String Pass="anjalo9990";
    
    
    public POPUP_Message_Samosa() {
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
        lblSamosa = new javax.swing.JLabel();
        lblsamosaname = new javax.swing.JLabel();
        lblLKR = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        spWadeQty = new javax.swing.JSpinner();
        lblTOTAL = new javax.swing.JLabel();
        btnAddToPlateSamosa = new javax.swing.JButton();
        btnCANCEL = new javax.swing.JButton();
        lblPrice = new javax.swing.JLabel();
        lblTotalLKR = new javax.swing.JLabel();
        lblSamosaTotalPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblSamosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/samosa.jpeg"))); // NOI18N
        lblSamosa.setText("jLabel1");
        lblSamosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSamosaMousePressed(evt);
            }
        });

        lblsamosaname.setBackground(new java.awt.Color(0, 0, 0));
        lblsamosaname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblsamosaname.setForeground(new java.awt.Color(0, 0, 0));
        lblsamosaname.setText("SAMOSA");

        lblLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblLKR.setForeground(new java.awt.Color(0, 0, 0));
        lblLKR.setText("LKR ");

        lblQty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQty.setForeground(new java.awt.Color(0, 0, 0));
        lblQty.setText("QTY");

        spWadeQty.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        spWadeQty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spWadeQtyStateChanged(evt);
            }
        });

        lblTOTAL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTOTAL.setForeground(new java.awt.Color(0, 0, 0));
        lblTOTAL.setText("TOTAL:");

        btnAddToPlateSamosa.setBackground(new java.awt.Color(0, 153, 0));
        btnAddToPlateSamosa.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        btnAddToPlateSamosa.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToPlateSamosa.setText("ADD TO PLATE");
        btnAddToPlateSamosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddToPlateSamosaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddToPlateSamosaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddToPlateSamosaMousePressed(evt);
            }
        });

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
        btnCANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCANCELActionPerformed(evt);
            }
        });

        lblPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(0, 0, 0));
        lblPrice.setText("40.00");

        lblTotalLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTotalLKR.setForeground(new java.awt.Color(0, 0, 0));
        lblTotalLKR.setText("LKR ");

        lblSamosaTotalPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblSamosaTotalPrice.setForeground(new java.awt.Color(0, 0, 0));
        lblSamosaTotalPrice.setText("00.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSamosa, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnCANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spWadeQty, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblLKR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrice))
                            .addComponent(lblsamosaname)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(lblTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotalLKR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSamosaTotalPrice))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnAddToPlateSamosa, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSamosa, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsamosaname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLKR)
                    .addComponent(lblPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spWadeQty, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalLKR)
                    .addComponent(lblSamosaTotalPrice))
                .addGap(41, 41, 41)
                .addComponent(btnAddToPlateSamosa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        lblSamosaTotalPrice.getAccessibleContext().setAccessibleName("lblSamosaTotalPrice");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(383, 504));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddToPlateSamosaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateSamosaMousePressed
         // Adding Samosa to the plate:
           if(qty == 0)
        {
           JOptionPane.showMessageDialog(null,"Sorry! Order can't be accepted, Please increase quantity to proceed..");
        }
        else 
        {
            CalculateAppetizersPrice();  
            InsertOrderDetails();
        }

        
    }//GEN-LAST:event_btnAddToPlateSamosaMousePressed

    private void btnAddToPlateSamosaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateSamosaMouseEntered
       
        btnAddToPlateSamosa.setBackground(Color.RED);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateSamosaMouseEntered

    private void btnAddToPlateSamosaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateSamosaMouseExited

        btnAddToPlateSamosa.setBackground(Color.GREEN);
// TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateSamosaMouseExited

    private void btnCANCELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCANCELMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnCANCELMouseClicked

    private void btnCANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCANCELActionPerformed
        this.hide();
    }//GEN-LAST:event_btnCANCELActionPerformed

    private void lblSamosaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSamosaMousePressed
        // TODO add your handling code here:
         this.setVisible(false);
    }//GEN-LAST:event_lblSamosaMousePressed

    private void spWadeQtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spWadeQtyStateChanged
        // TODO add your handling code here:
        CalculateAppetizersPrice();
    }//GEN-LAST:event_spWadeQtyStateChanged

    //Declaration of Cheese Balls
    @Override
    public double lblPrice() 
    {
        return 40.00;
    }
    //Declaration of member methods 
    @Override
    public void CalculateAppetizersPrice() 
    {
        if(spWadeQty != null)
        {
            qty = (int) spWadeQty.getValue();
            
            if(qty > 20)
            {
                JOptionPane.showMessageDialog(null,"Sorry Order cant be Accepted , Please Talk to Staff..");                     
            }
            else
            {
                Total = Double.toString( qty * lblPrice());
           
                lblSamosaTotalPrice.setText(Total);       
            }     
        }
         else if (spWadeQty ==  null)
              lblSamosaTotalPrice.setText(Total);
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
                Logger.getLogger(POPUP_Message_Samosa.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(POPUP_Message_Samosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Samosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Samosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Samosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POPUP_Message_Samosa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToPlateSamosa;
    private javax.swing.JButton btnCANCEL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLKR;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblSamosa;
    private javax.swing.JLabel lblSamosaTotalPrice;
    private javax.swing.JLabel lblTOTAL;
    private javax.swing.JLabel lblTotalLKR;
    private javax.swing.JLabel lblsamosaname;
    private javax.swing.JSpinner spWadeQty;
    // End of variables declaration//GEN-END:variables

   
}
