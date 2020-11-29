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
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author RYAN
 */
public class POPUP_Message_FriedRice extends javax.swing.JFrame implements PopUpInterface {

    /**
     * Creates new form Fried rice
     */
      //Declaration of Member Feilds
    public final int CustID=1000;
    String Total ="00";
    int qty; 
    String ProductDescription="Fried Rice with Chicken";
    Connection conn;
    
    //Connection setup
    String connectionUrl = "jdbc:mysql://localhost:3306/foodorderingsystem";
    String username= "sa";
    String Pass="anjalo9990";
    //Frame Creation
    
    public POPUP_Message_FriedRice() {
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
        lblrice = new javax.swing.JLabel();
        lblricen = new javax.swing.JLabel();
        lblLKR = new javax.swing.JLabel();
        lblriceprice = new javax.swing.JLabel();
        lblQTY = new javax.swing.JLabel();
        dpriceqty = new javax.swing.JSpinner();
        lblTotalLKR = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        lblTOTAL = new javax.swing.JLabel();
        btnCANCEL = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Add_To_Plate = new javax.swing.JButton();
        Sltdropdown = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblrice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fried.jpg"))); // NOI18N
        lblrice.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(lblrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 250, 190));

        lblricen.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblricen.setForeground(new java.awt.Color(0, 0, 0));
        lblricen.setText("Fried Rice");
        lblricen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblricen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 130, 30));

        lblLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblLKR.setForeground(new java.awt.Color(51, 51, 51));
        lblLKR.setText("LKR");
        jPanel1.add(lblLKR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 40, 20));

        lblriceprice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblriceprice.setForeground(new java.awt.Color(51, 51, 51));
        lblriceprice.setText("200.00");
        jPanel1.add(lblriceprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 50, 20));

        lblQTY.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQTY.setForeground(new java.awt.Color(0, 0, 0));
        lblQTY.setText("QTY :");
        jPanel1.add(lblQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 80, 30));

        dpriceqty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dpriceqty.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        dpriceqty.setBorder(null);
        dpriceqty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dpriceqty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dpriceqtyStateChanged(evt);
            }
        });
        jPanel1.add(dpriceqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 170, 30));

        lblTotalLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTotalLKR.setForeground(new java.awt.Color(51, 51, 51));
        lblTotalLKR.setText("LKR");
        jPanel1.add(lblTotalLKR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 40, 30));

        lblTotalPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTotalPrice.setForeground(new java.awt.Color(51, 51, 51));
        lblTotalPrice.setText("00.00");
        jPanel1.add(lblTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 50, 30));

        lblTOTAL.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTOTAL.setForeground(new java.awt.Color(102, 102, 102));
        lblTOTAL.setText("TOTAL :");
        jPanel1.add(lblTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 60, 30));

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
        jPanel1.add(btnCANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 20, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Select:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 70, 40));

        Add_To_Plate.setBackground(new java.awt.Color(0, 153, 0));
        Add_To_Plate.setFont(new java.awt.Font("Algerian", 1, 24));
        Add_To_Plate.setForeground(new java.awt.Color(255, 255, 255));
        Add_To_Plate.setText("ADD TO PLATE");
        Add_To_Plate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Add_To_Plate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_To_Plate.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Add_To_PlateMouseMoved(evt);
            }
        });
        Add_To_Plate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Add_To_PlateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Add_To_PlateMousePressed(evt);
            }
        });
        jPanel1.add(Add_To_Plate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 210, 50));

        Sltdropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fried Rice with Chicken","Fried Rice with Egg" }));
        Sltdropdown.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SltdropdownItemStateChanged(evt);
            }
        });
        jPanel1.add(Sltdropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 170, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        setSize(new java.awt.Dimension(401, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCANCELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCANCELMouseClicked
        this.setVisible(false);
      
    }//GEN-LAST:event_btnCANCELMouseClicked

    private void Add_To_PlateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_To_PlateMouseMoved
         Add_To_Plate.setBackground(Color.RED);
    }//GEN-LAST:event_Add_To_PlateMouseMoved

    private void Add_To_PlateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_To_PlateMouseExited
       Add_To_Plate.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_Add_To_PlateMouseExited

    private void SltdropdownItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SltdropdownItemStateChanged
 
        CalculateMealprice();
    }//GEN-LAST:event_SltdropdownItemStateChanged

    private void dpriceqtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dpriceqtyStateChanged

        CalculateMealprice();
    }//GEN-LAST:event_dpriceqtyStateChanged

    private void Add_To_PlateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_To_PlateMousePressed
             if(qty==0){
           JOptionPane.showMessageDialog(null,"Sorry Order cant be Accepted , Increase Quantity to proceed");
        }else{
                 
         CalculateMealprice();  
         
         InsertOrderDetails();
         
      
             }
        
    }//GEN-LAST:event_Add_To_PlateMousePressed

    private void btnCANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCANCELActionPerformed
    this.hide();
    }//GEN-LAST:event_btnCANCELActionPerformed

    
    //Declaration of Member Methods 
    
    @Override
     public void  CalculateMealprice(){
         if(dpriceqty!=null)
       { 
            qty =(int) dpriceqty.getValue();
          
           if(qty>20){
        JOptionPane.showMessageDialog(null,"Sorry Order cant be Accepted , Please Talk to Staff");
       return;
           }
           Total= Double.toString( qty * MatchMenu());
           
           lblTotalPrice.setText(Total);
       }
         else if (dpriceqty==null)
              lblTotalPrice.setText(Total);
         //Add a message box to add to cart 
    }
    
    
    @Override
    public double MatchMenu(){
        ProductDescription = Sltdropdown.getSelectedItem().toString();
        switch (ProductDescription) {
            case "Fried Rice with Chicken":
                return 230.00;
            case "Fried Rice with Egg":
                return 200.00;
            default:
                break;
        }
        return 0;
     }
    
    
    @Override
    public void  InsertOrderDetails(){
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
        if(rs.next()){
         Update="update SALESORDER set QTY= QTY + ?, Total= Total + ? where Product = ?";
         PreparedStatement pstmt = conn.prepareStatement(Update);
         pstmt.setInt(1,qty);
         pstmt.setBigDecimal(2,TotalValue);
         pstmt.setString(3,ProductDescription);
         pstmt.executeUpdate();
         pstmt.close();
         JOptionPane.showMessageDialog(null,"Sucessfully Added to plate");
        }
        
       else{   
        
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
        catch(SQLException e){
               JOptionPane.showMessageDialog(null,"Something went wrong\n");
             e.printStackTrace();
  
    }
        finally{
            try {
                
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(POPUP_Message_FriedRice.class.getName()).log(Level.SEVERE, null, ex);
            }} 
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
            java.util.logging.Logger.getLogger(POPUP_Message_FriedRice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_FriedRice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_FriedRice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POPUP_Message_FriedRice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new POPUP_Message_FriedRice().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_To_Plate;
    private javax.swing.JComboBox<String> Sltdropdown;
    private javax.swing.JButton btnCANCEL;
    private javax.swing.JSpinner dpriceqty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLKR;
    private javax.swing.JLabel lblQTY;
    private javax.swing.JLabel lblTOTAL;
    private javax.swing.JLabel lblTotalLKR;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lblrice;
    private javax.swing.JLabel lblricen;
    private javax.swing.JLabel lblriceprice;
    // End of variables declaration//GEN-END:variables
}
