/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.runtime.PropertyMap.getCount;

/**
 *
 * @author dlsak
 */

public class Order_Details extends javax.swing.JFrame {

    /**
     * Creates new form Order
     */
    private double Total; 
    private int count;
    //Connection settings to database
    Connection conn;
    String connectionUrl = "jdbc:mysql://localhost:3306/foodorderingsystem";
    String username= "sa";
    String Pass="anjalo9990";
    
    public Order_Details() {
        initComponents();
        this.setExtendedState(Order_Details.MAXIMIZED_BOTH);
    }

    public String ordertype;
    
    
    Order_Details(String type) 
    {
        initComponents();
        ordertype = type;
        lblOrderType.setText(ordertype);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblOrderTypeName = new javax.swing.JLabel();
        lblOrderType = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Sidepanel = new javax.swing.JPanel();
        FFbtn = new javax.swing.JButton();
        APBTN = new javax.swing.JButton();
        BVGBtn = new javax.swing.JButton();
        Logobtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText("ORDER DETAILS");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 390, 50));

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Checkout");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkbtn(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 630, 170, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Servise Charge:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sub Total           :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tax (VAT)          :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lblOrderTypeName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblOrderTypeName.setForeground(new java.awt.Color(0, 0, 0));
        lblOrderTypeName.setText("Order Type       :");
        jPanel3.add(lblOrderTypeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));
        lblOrderTypeName.getAccessibleContext().setAccessibleName("lblOrderTypeName");

        lblOrderType.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblOrderType.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(lblOrderType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 100, 30));
        lblOrderType.getAccessibleContext().setAccessibleName("lblOrderType");

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 250, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Total           :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, -1, -1));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item No", "Product Description", "Qty", "Sub Total"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(102, 255, 51));
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 880, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1070, 710));

        Sidepanel.setBackground(new java.awt.Color(255, 255, 255));
        Sidepanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        FFbtn.setBackground(new java.awt.Color(0, 204, 0));
        FFbtn.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        FFbtn.setForeground(new java.awt.Color(255, 255, 255));
        FFbtn.setText("Fast Food");
        FFbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FFbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FFbtn.setPreferredSize(new java.awt.Dimension(72, 36));
        FFbtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FFbtnMouseMoved(evt);
            }
        });
        FFbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FFbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FFbtnMousePressed(evt);
            }
        });

        APBTN.setBackground(new java.awt.Color(0, 204, 0));
        APBTN.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        APBTN.setForeground(new java.awt.Color(255, 255, 255));
        APBTN.setText("Apertizers");
        APBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        APBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APBTN.setPreferredSize(new java.awt.Dimension(72, 36));
        APBTN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                APBTNMouseMoved(evt);
            }
        });
        APBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                APBTNMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                APBTNMousePressed(evt);
            }
        });

        BVGBtn.setBackground(new java.awt.Color(0, 204, 0));
        BVGBtn.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        BVGBtn.setForeground(new java.awt.Color(255, 255, 255));
        BVGBtn.setText("Beverages");
        BVGBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BVGBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BVGBtn.setPreferredSize(new java.awt.Dimension(72, 36));
        BVGBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BVGBtnMouseMoved(evt);
            }
        });
        BVGBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BVGBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BVGBtnMousePressed(evt);
            }
        });

        Logobtn.setBackground(new java.awt.Color(255, 255, 255));
        Logobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jButton1.setText("MEAL");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SidepanelLayout = new javax.swing.GroupLayout(Sidepanel);
        Sidepanel.setLayout(SidepanelLayout);
        SidepanelLayout.setHorizontalGroup(
            SidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidepanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(SidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SidepanelLayout.createSequentialGroup()
                        .addGroup(SidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(APBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BVGBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FFbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(SidepanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Logobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SidepanelLayout.setVerticalGroup(
            SidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidepanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(Logobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FFbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(APBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BVGBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(Sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(279, 279, 279))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkbtn(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbtn

       Payment_Method py= new Payment_Method(); 
       py.setVisible(true);
       
    }//GEN-LAST:event_chkbtn

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
   this.setSize(screenSize.width, screenSize.height);
    }//GEN-LAST:event_formWindowOpened

//fast food start
    private void FFbtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FFbtnMouseMoved
        FFbtn.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_FFbtnMouseMoved

    private void FFbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FFbtnMouseExited
        FFbtn.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_FFbtnMouseExited

    private void FFbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FFbtnMousePressed
        Fastfood ff= new Fastfood();
        ff.show();
        this.hide();
    }//GEN-LAST:event_FFbtnMousePressed
//fast food end
//appetizer start
    private void APBTNMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APBTNMouseMoved
        APBTN.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_APBTNMouseMoved

    private void APBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APBTNMouseExited
        APBTN.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_APBTNMouseExited

    private void APBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APBTNMousePressed
        Appetizers ap= new Appetizers();
        ap.show();
        this.hide();
    }//GEN-LAST:event_APBTNMousePressed
//appetizer end
//bevarage start
    private void BVGBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BVGBtnMouseMoved
        BVGBtn.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_BVGBtnMouseMoved

    private void BVGBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BVGBtnMouseExited
        BVGBtn.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_BVGBtnMouseExited

    private void BVGBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BVGBtnMousePressed
        Beverages bv= new Beverages();
        bv.show();
        this.hide();
    }//GEN-LAST:event_BVGBtnMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        jButton1.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        Meal m= new Meal();
        m.show();
        this.hide();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1MousePressed
//bevarage end
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
            java.util.logging.Logger.getLogger(Order_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order_Details().setVisible(true);
            }
        });
    }
    
    
 
   
 
   
 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton APBTN;
    private javax.swing.JButton BVGBtn;
    private javax.swing.JButton FFbtn;
    private javax.swing.JButton Logobtn;
    private javax.swing.JPanel Sidepanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel lblOrderType;
    private javax.swing.JLabel lblOrderTypeName;
    // End of variables declaration//GEN-END:variables

    
}
