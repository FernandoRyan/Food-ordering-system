/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

//Import classes
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author RYAN
 */
public class Meal extends javax.swing.JFrame {

    
    /**
     * Creates new form Meal
     */
    public Meal() {
        initComponents();
         //setExtendedState(Meal.MAXIMIZED_BOTH); 
         
    }

     //Creating feilds
    public double Total; 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Sidepanel = new javax.swing.JPanel();
        FFbtn = new javax.swing.JButton();
        Mealbtn = new javax.swing.JButton();
        APBTN = new javax.swing.JButton();
        BVGBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Menupanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lblFASTFOOD = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLKR = new javax.swing.JLabel();
        btnBurgerPrice = new javax.swing.JLabel();
        btnLKR1 = new javax.swing.JLabel();
        btnBurgerPrice1 = new javax.swing.JLabel();
        btnLKR2 = new javax.swing.JLabel();
        btnBurgerPrice2 = new javax.swing.JLabel();
        ttpanel = new javax.swing.JPanel();
        lblMyPlate1 = new javax.swing.JLabel();
        lblTOTAL = new javax.swing.JLabel();
        lblLKRTotal = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        btnCheckout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Mealbtn.setBackground(new java.awt.Color(0, 204, 0));
        Mealbtn.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        Mealbtn.setForeground(new java.awt.Color(255, 255, 255));
        Mealbtn.setText("MEAL");
        Mealbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mealbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mealbtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MealbtnMouseMoved(evt);
            }
        });
        Mealbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MealbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MealbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MealbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MealbtnMouseReleased(evt);
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

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(APBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BVGBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FFbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Mealbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(SidepanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SidepanelLayout.setVerticalGroup(
            SidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidepanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(Mealbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(FFbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(APBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BVGBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(Sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 700));

        Menupanel.setBackground(new java.awt.Color(255, 255, 255));
        Menupanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rice and curry_1.jpg"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(281, 212));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ricecurrybtn(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kottu.jpg"))); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(281, 212));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kottubtn(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fried.jpg"))); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(281, 212));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friedrice(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lblFASTFOOD.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblFASTFOOD.setForeground(new java.awt.Color(51, 204, 0));
        lblFASTFOOD.setText("Meals");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Fried Rice");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Rice and Curry");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Kottu Roti");

        btnLKR.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLKR.setForeground(new java.awt.Color(153, 153, 153));
        btnLKR.setText("LKR");

        btnBurgerPrice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBurgerPrice.setForeground(new java.awt.Color(153, 153, 153));
        btnBurgerPrice.setText("200.00");

        btnLKR1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLKR1.setForeground(new java.awt.Color(153, 153, 153));
        btnLKR1.setText("LKR");

        btnBurgerPrice1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBurgerPrice1.setForeground(new java.awt.Color(153, 153, 153));
        btnBurgerPrice1.setText("110.00");

        btnLKR2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLKR2.setForeground(new java.awt.Color(153, 153, 153));
        btnLKR2.setText("LKR");

        btnBurgerPrice2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBurgerPrice2.setForeground(new java.awt.Color(153, 153, 153));
        btnBurgerPrice2.setText("160.00");

        javax.swing.GroupLayout MenupanelLayout = new javax.swing.GroupLayout(Menupanel);
        Menupanel.setLayout(MenupanelLayout);
        MenupanelLayout.setHorizontalGroup(
            MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenupanelLayout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(lblFASTFOOD)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MenupanelLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(MenupanelLayout.createSequentialGroup()
                        .addComponent(btnLKR)
                        .addGap(18, 18, 18)
                        .addComponent(btnBurgerPrice)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenupanelLayout.createSequentialGroup()
                        .addComponent(btnLKR1)
                        .addGap(18, 18, 18)
                        .addComponent(btnBurgerPrice1))
                    .addComponent(jLabel2))
                .addGap(159, 159, 159))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenupanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenupanelLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenupanelLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(272, 272, 272))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenupanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(362, 362, 362))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenupanelLayout.createSequentialGroup()
                        .addComponent(btnLKR2)
                        .addGap(18, 18, 18)
                        .addComponent(btnBurgerPrice2)
                        .addGap(350, 350, 350))))
            .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenupanelLayout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(467, Short.MAX_VALUE)))
        );
        MenupanelLayout.setVerticalGroup(
            MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenupanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblFASTFOOD)
                .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenupanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLKR)
                            .addComponent(btnBurgerPrice)))
                    .addGroup(MenupanelLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBurgerPrice1)
                            .addComponent(btnLKR1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBurgerPrice2)
                    .addComponent(btnLKR2))
                .addContainerGap())
            .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenupanelLayout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(346, Short.MAX_VALUE)))
        );

        jPanel1.add(Menupanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 830, 700));

        ttpanel.setBackground(new java.awt.Color(255, 255, 255));
        ttpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblMyPlate1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblMyPlate1.setForeground(new java.awt.Color(153, 153, 153));
        lblMyPlate1.setText("MY PLATE");

        lblTOTAL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTOTAL.setForeground(new java.awt.Color(153, 153, 153));
        lblTOTAL.setText("TOTAL");

        lblLKRTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLKRTotal.setForeground(new java.awt.Color(153, 153, 153));
        lblLKRTotal.setText("LKR");

        lblTotalPrice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTotalPrice.setForeground(new java.awt.Color(153, 153, 153));
        lblTotalPrice.setText("0.00");

        btnCheckout.setBackground(new java.awt.Color(0, 204, 0));
        btnCheckout.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCheckout.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckout.setText("CHECKOUT");
        btnCheckout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCheckout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCheckoutMouseMoved(evt);
            }
        });
        btnCheckout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCheckoutMouseExited(evt);
            }
        });
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ttpanelLayout = new javax.swing.GroupLayout(ttpanel);
        ttpanel.setLayout(ttpanelLayout);
        ttpanelLayout.setHorizontalGroup(
            ttpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ttpanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(ttpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ttpanelLayout.createSequentialGroup()
                        .addComponent(lblTOTAL)
                        .addGap(47, 47, 47)
                        .addComponent(lblLKRTotal)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotalPrice))
                    .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(ttpanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblMyPlate1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ttpanelLayout.setVerticalGroup(
            ttpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ttpanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblMyPlate1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 552, Short.MAX_VALUE)
                .addGroup(ttpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTOTAL)
                    .addComponent(lblLKRTotal)
                    .addComponent(lblTotalPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(ttpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 250, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
  
    
    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void friedrice(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friedrice
    POPUP_Message_FriedRice fp= new POPUP_Message_FriedRice();
       fp.setVisible(true);
    }//GEN-LAST:event_friedrice

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Ricecurrybtn(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ricecurrybtn
       POPUP_Message_Rice_and_Curry Rc= new POPUP_Message_Rice_and_Curry();
       Rc.setVisible(true);
    }//GEN-LAST:event_Ricecurrybtn

    private void Kottubtn(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kottubtn
      POPUP_Message_Kottu Kp= new POPUP_Message_Kottu();
      Kp.setVisible(true);
    }//GEN-LAST:event_Kottubtn

    private void MealbtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MealbtnMouseMoved
      Mealbtn.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_MealbtnMouseMoved

    private void FFbtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FFbtnMouseMoved
        FFbtn.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_FFbtnMouseMoved

    private void APBTNMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APBTNMouseMoved
       APBTN.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_APBTNMouseMoved

    private void BVGBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BVGBtnMouseMoved
        BVGBtn.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_BVGBtnMouseMoved

    private void MealbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MealbtnMouseReleased
       Mealbtn.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_MealbtnMouseReleased

    private void MealbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MealbtnMouseExited
          Mealbtn.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_MealbtnMouseExited

    private void FFbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FFbtnMouseExited
          FFbtn.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_FFbtnMouseExited

    private void APBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APBTNMouseExited
        APBTN.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_APBTNMouseExited

    private void BVGBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BVGBtnMouseExited
          BVGBtn.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_BVGBtnMouseExited

    private void MealbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MealbtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_MealbtnMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
    }//GEN-LAST:event_formWindowOpened

    private void MealbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MealbtnMousePressed
       this.show();
    }//GEN-LAST:event_MealbtnMousePressed

    private void APBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APBTNMousePressed
       Appetizers ap= new Appetizers();
       ap.show();
       this.hide();
    }//GEN-LAST:event_APBTNMousePressed

    private void BVGBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BVGBtnMousePressed
        Beverages bv= new Beverages();
        bv.show();
        this.hide();
    }//GEN-LAST:event_BVGBtnMousePressed

    private void btnCheckoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckoutMouseMoved
      btnCheckout.setBackground(Color.RED);
    }//GEN-LAST:event_btnCheckoutMouseMoved

    private void btnCheckoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckoutMouseExited
       btnCheckout.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_btnCheckoutMouseExited

    private void FFbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FFbtnMousePressed
        Fastfoods ff= new Fastfoods();
        ff.show();
        this.hide();

    }//GEN-LAST:event_FFbtnMousePressed

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String args[]) {
      
      //Creation of objects and intilization
     
      //Rice and curry
      
         Meals Whiterice_Chicken= new Meals("WhiteRice&Chicken",130.00,150.00,001);
         Meals Whiterice_Egg= new Meals("WhiteRice&Egg",110.00,150.00,002);
         Meals Brownrice_Egg= new Meals("BrownRice&Egg",110.00,150.00,003);
         Meals Brownrice_Chicken= new Meals("BrownRice&Chicken",130.00,150.00,004);
        
      
// Fried rice 
         Meals FriedRice_Chicken= new Meals("Fried Rice with chicken",210.00,150.00,005);
         Meals FriedRice_Egg= new Meals("Fried Rice with Egg",200.00,150.00,006);
         
//Kottu Rotti
         
         Meals Kottu_Chicken = new Meals("Kottu with Chicken",160.00,150.00,007);
         Meals Kottu_Egg   = new Meals("Kottu with Egg",130.00,150.00,009.00);
         Meals Kottu_Chicken_Cheese = new Meals("Kottu with Chicken and cheese",240.00,150.00,0010.00);
         
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Meal().setVisible(true);
        });
    }

    //Member Methods
             public void Cal_total(){
        Total = 0;
  }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton APBTN;
    private javax.swing.JButton BVGBtn;
    private javax.swing.JButton FFbtn;
    private javax.swing.JButton Mealbtn;
    private javax.swing.JPanel Menupanel;
    private javax.swing.JPanel Sidepanel;
    private javax.swing.JLabel btnBurgerPrice;
    private javax.swing.JLabel btnBurgerPrice1;
    private javax.swing.JLabel btnBurgerPrice2;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JLabel btnLKR;
    private javax.swing.JLabel btnLKR1;
    private javax.swing.JLabel btnLKR2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFASTFOOD;
    private javax.swing.JLabel lblLKRTotal;
    private javax.swing.JLabel lblMyPlate1;
    private javax.swing.JLabel lblTOTAL;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JPanel ttpanel;
    // End of variables declaration//GEN-END:variables
}
