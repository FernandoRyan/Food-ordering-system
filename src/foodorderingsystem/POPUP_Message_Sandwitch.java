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
 * @author Neranji Sulakshika
 */
public class POPUP_Message_Sandwitch extends javax.swing.JFrame {

    /**
     * Creates new form SandwitchPOPUPMessage
     */
    
    //Declaration of Member Feilds   
    public final int CustID = 1000;
    String Total = "0";
    int qty; 
    String ProductDescription = "Sandwitch";
    Connection conn;
    
    //Connection setup
    String connectionUrl = "jdbc:mysql://localhost:3306/foodorderingsystem";
    String username = "nera";
    String Pass = "neranji0321";
    
    //Frame Creation
    public POPUP_Message_Sandwitch() {
        initComponents();
        // ProductDescription = Sltdropdown.getSelectedItem().toString();
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
        lblSandwitch = new javax.swing.JLabel();
        lblSandwitchName = new javax.swing.JLabel();
        lblSandwitchPrice = new javax.swing.JLabel();
        lblLKR = new javax.swing.JLabel();
        lblQTY = new javax.swing.JLabel();
        spQtySandwitch = new javax.swing.JSpinner();
        lblTotal = new javax.swing.JLabel();
        lblTotalLKR = new javax.swing.JLabel();
        btnAddToPlateSandwitch = new javax.swing.JButton();
        lblTotalPrice = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 530));
        jPanel1.setLayout(null);

        lblSandwitch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSandwitch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SANDWITCH.jpg"))); // NOI18N
        jPanel1.add(lblSandwitch);
        lblSandwitch.setBounds(70, 30, 250, 170);
        lblSandwitch.getAccessibleContext().setAccessibleName("lblSandwitch");

        lblSandwitchName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblSandwitchName.setForeground(new java.awt.Color(0, 0, 0));
        lblSandwitchName.setText("SANDWITCH");
        jPanel1.add(lblSandwitchName);
        lblSandwitchName.setBounds(120, 220, 150, 30);
        lblSandwitchName.getAccessibleContext().setAccessibleName("lblSandwitchName");

        lblSandwitchPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblSandwitchPrice.setForeground(new java.awt.Color(51, 51, 51));
        lblSandwitchPrice.setText("100.00");
        jPanel1.add(lblSandwitchPrice);
        lblSandwitchPrice.setBounds(160, 260, 50, 20);
        lblSandwitchPrice.getAccessibleContext().setAccessibleName("lblSandwitchPrice");

        lblLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblLKR.setForeground(new java.awt.Color(51, 51, 51));
        lblLKR.setText("LKR");
        jPanel1.add(lblLKR);
        lblLKR.setBounds(120, 260, 40, 20);
        lblLKR.getAccessibleContext().setAccessibleName("lblLKR");

        lblQTY.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQTY.setForeground(new java.awt.Color(0, 0, 0));
        lblQTY.setText("QTY");
        jPanel1.add(lblQTY);
        lblQTY.setBounds(60, 330, 50, 30);
        lblQTY.getAccessibleContext().setAccessibleName("lblQTY");

        spQtySandwitch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        spQtySandwitch.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        spQtySandwitch.setBorder(null);
        spQtySandwitch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spQtySandwitch.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spQtySandwitchStateChanged(evt);
            }
        });
        jPanel1.add(spQtySandwitch);
        spQtySandwitch.setBounds(110, 330, 70, 30);
        spQtySandwitch.getAccessibleContext().setAccessibleName("spQtySandwitch");

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

        btnAddToPlateSandwitch.setBackground(new java.awt.Color(0, 153, 0));
        btnAddToPlateSandwitch.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAddToPlateSandwitch.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToPlateSandwitch.setText("ADD TO PLATE");
        btnAddToPlateSandwitch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddToPlateSandwitch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddToPlateSandwitch.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnAddToPlateSandwitchStateChanged(evt);
            }
        });
        btnAddToPlateSandwitch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddToPlateSandwitchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddToPlateSandwitchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddToPlateSandwitchMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddToPlateSandwitchMousePressed(evt);
            }
        });
        jPanel1.add(btnAddToPlateSandwitch);
        btnAddToPlateSandwitch.setBounds(100, 410, 210, 60);
        btnAddToPlateSandwitch.getAccessibleContext().setAccessibleName("btnAddToPlateSandwitch");

        lblTotalPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTotalPrice.setForeground(new java.awt.Color(51, 51, 51));
        lblTotalPrice.setText("0.00");
        jPanel1.add(lblTotalPrice);
        lblTotalPrice.setBounds(320, 330, 50, 30);
        lblTotalPrice.getAccessibleContext().setAccessibleName("lblTotalPrice");

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

    private void btnAddToPlateSandwitchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateSandwitchMouseEntered
        btnAddToPlateSandwitch.setBackground(Color.RED);
        
        if(qty == 0)
        {
           JOptionPane.showMessageDialog(null,"Sorry! Order can't be accepted, Please increase quantity to proceed..");
        }
        else 
        {
            CalculateSandwitchPrice(); 
            InsertOrderDetails();
        }
    }//GEN-LAST:event_btnAddToPlateSandwitchMouseEntered

    private void btnAddToPlateSandwitchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateSandwitchMouseExited
        btnAddToPlateSandwitch.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnAddToPlateSandwitchMouseExited

    private void btnAddToPlateSandwitchStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnAddToPlateSandwitchStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateSandwitchStateChanged

    private void btnAddToPlateSandwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateSandwitchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateSandwitchMouseClicked

    private void btnAddToPlateSandwitchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToPlateSandwitchMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToPlateSandwitchMousePressed

    private void spQtySandwitchStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spQtySandwitchStateChanged
        CalculateSandwitchPrice();
    }//GEN-LAST:event_spQtySandwitchStateChanged
        
    public double lblSandwitchPrice() 
    {
        return 100.00;      
    }
    
    //Declaration of member methods 
    private void CalculateSandwitchPrice() 
    {
        if(spQtySandwitch != null)
        {
            qty = (int) spQtySandwitch.getValue();
            
            if(qty > 20)
            {
                JOptionPane.showMessageDialog(null,"Sorry Order cant be Accepted , Please Talk to Staff..");                   
            }
            else{
                Total = Double.toString( qty * lblSandwitchPrice());
           
                lblTotalPrice.setText(Total);  
            }              
        }
         else if (spQtySandwitch ==  null)
              lblTotalPrice.setText(Total);
         //Add a message box to add to cart 
    }

    private void InsertOrderDetails() 
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
                Logger.getLogger(POPUP_Message_Sandwitch.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(POPUP_Message_Sandwitch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Sandwitch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Sandwitch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_Sandwitch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new POPUP_Message_Sandwitch().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToPlateSandwitch;
    private javax.swing.JButton btnCancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLKR;
    private javax.swing.JLabel lblQTY;
    private javax.swing.JLabel lblSandwitch;
    private javax.swing.JLabel lblSandwitchName;
    private javax.swing.JLabel lblSandwitchPrice;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalLKR;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JSpinner spQtySandwitch;
    // End of variables declaration//GEN-END:variables

}
