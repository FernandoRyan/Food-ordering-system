/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodorderingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Neranji Sulakshika
 */
public class Thank_You_Message extends javax.swing.JFrame {

    //Connection settings to database
    Connection conn;
    String connectionUrl = "jdbc:mysql://localhost:3306/foodorderingsystem";
    String username= "sa";
    String Pass="anjalo9990";
    
    /**
     * Creates new form Thanking
     */
    public Thank_You_Message() {
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
        jPanel5 = new javax.swing.JPanel();
        lblGIF4 = new javax.swing.JLabel();
        lblMessage4 = new javax.swing.JLabel();
        lblThanks4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGIF4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Tick.gif"))); // NOI18N
        jPanel5.add(lblGIF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 111, 212, 150));

        lblMessage4.setBackground(new java.awt.Color(255, 255, 255));
        lblMessage4.setFont(new java.awt.Font("Edwardian Script ITC", 1, 58)); // NOI18N
        lblMessage4.setForeground(new java.awt.Color(0, 153, 0));
        lblMessage4.setText("Order placed successfully");
        jPanel5.add(lblMessage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, 67));

        lblThanks4.setBackground(new java.awt.Color(255, 255, 255));
        lblThanks4.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        lblThanks4.setForeground(new java.awt.Color(0, 204, 0));
        lblThanks4.setText("THANK YOU!");
        jPanel5.add(lblThanks4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 263, 42));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 3, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("Cafetaria");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 330, 70));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(508, 471));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        Home hm = new Home();
        hm.show();
        this.hide();
        deleteorder();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void deleteorder() {
        String qry="DELETE FROM SALESORDER WHERE CustID=1000";
        try
        {
            conn=DriverManager.getConnection(connectionUrl, username, Pass);
            Statement st=conn.createStatement();
            st.execute(qry);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //</editor-fold>
        //* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Thank_You_Message().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblGIF4;
    private javax.swing.JLabel lblMessage4;
    private javax.swing.JLabel lblThanks4;
    // End of variables declaration//GEN-END:variables
}