/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samad
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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
        btnFastFood = new javax.swing.JButton();
        btnMeals = new javax.swing.JButton();
        btnAppertizers = new javax.swing.JButton();
        btnBeverages = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblTopic = new javax.swing.JLabel();
        lblNescafe = new javax.swing.JLabel();
        lblMilkshake = new javax.swing.JLabel();
        lblSoftDrinks = new javax.swing.JLabel();
        lblFruitJuice = new javax.swing.JLabel();
        lblMojito = new javax.swing.JLabel();
        lblWater = new javax.swing.JLabel();
        lblNesName = new javax.swing.JLabel();
        lblNesPrice = new javax.swing.JLabel();
        lblMilkshakes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblDrinks = new javax.swing.JLabel();
        lblDrinksPrice = new javax.swing.JLabel();
        lblJuice = new javax.swing.JLabel();
        lblJuicePrice = new javax.swing.JLabel();
        lblMojitoo = new javax.swing.JLabel();
        lblMojitoPrice = new javax.swing.JLabel();
        lblBottledWater = new javax.swing.JLabel();
        lblWaterPrice = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblPlate = new javax.swing.JLabel();
        btnCheckout = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFastFood.setBackground(new java.awt.Color(0, 204, 0));
        btnFastFood.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnFastFood.setForeground(new java.awt.Color(255, 255, 255));
        btnFastFood.setText("FAST FOOD ");

        btnMeals.setBackground(new java.awt.Color(0, 204, 0));
        btnMeals.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMeals.setForeground(new java.awt.Color(255, 255, 255));
        btnMeals.setText("MEALS");

        btnAppertizers.setBackground(new java.awt.Color(0, 204, 0));
        btnAppertizers.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAppertizers.setForeground(new java.awt.Color(255, 255, 255));
        btnAppertizers.setText("APPERTIZERS");

        btnBeverages.setBackground(new java.awt.Color(0, 204, 0));
        btnBeverages.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnBeverages.setForeground(new java.awt.Color(255, 255, 255));
        btnBeverages.setText("BEVERAGES");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFastFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMeals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAppertizers, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
            .addComponent(btnBeverages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnFastFood, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMeals, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAppertizers, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnBeverages, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 700));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTopic.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTopic.setForeground(new java.awt.Color(0, 204, 0));
        lblTopic.setText("BEVERAGES");

        lblNescafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nes.jpg"))); // NOI18N
        lblNescafe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNescafeMousePressed(evt);
            }
        });

        lblMilkshake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shake3.jpg"))); // NOI18N
        lblMilkshake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMilkshakeMousePressed(evt);
            }
        });

        lblSoftDrinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soft drinks1.jpg"))); // NOI18N
        lblSoftDrinks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSoftDrinksMousePressed(evt);
            }
        });

        lblFruitJuice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fruitjuice.jpg"))); // NOI18N
        lblFruitJuice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblFruitJuiceMousePressed(evt);
            }
        });

        lblMojito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.jpg"))); // NOI18N
        lblMojito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMojitoMousePressed(evt);
            }
        });

        lblWater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/water.jpg"))); // NOI18N
        lblWater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblWaterMousePressed(evt);
            }
        });

        lblNesName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNesName.setText("NESCAFE / NESTEA / MILO");

        lblNesPrice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNesPrice.setForeground(new java.awt.Color(153, 153, 153));
        lblNesPrice.setText("LKR  40.00");

        lblMilkshakes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMilkshakes.setText("MILK SHAKES (Any Flavour)");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("LKR  350.00");

        lblDrinks.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDrinks.setText("SOFT DRINKS (Any Flavour)");

        lblDrinksPrice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDrinksPrice.setForeground(new java.awt.Color(153, 153, 153));
        lblDrinksPrice.setText("LKR  80.00");

        lblJuice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblJuice.setText("FRESH FRUIT JUICE (Any Flavour)");

        lblJuicePrice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblJuicePrice.setForeground(new java.awt.Color(153, 153, 153));
        lblJuicePrice.setText("LKR  250.00");

        lblMojitoo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMojitoo.setText("VIRGIN MOJITO");

        lblMojitoPrice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMojitoPrice.setForeground(new java.awt.Color(153, 153, 153));
        lblMojitoPrice.setText("LKR  200.00");

        lblBottledWater.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblBottledWater.setText("BOTTLED DRINKING WATER");

        lblWaterPrice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblWaterPrice.setForeground(new java.awt.Color(153, 153, 153));
        lblWaterPrice.setText("LKR  100.00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(301, 301, 301)
                                        .addComponent(lblTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNescafe, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNesName, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblMilkshakes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMilkshake, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDrinks))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lblSoftDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(lblMojitoPrice)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblWaterPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(24, 24, 24))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblMojito)
                                                .addComponent(lblMojitoo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(86, 86, 86)
                                            .addComponent(lblBottledWater))))))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblNesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDrinksPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblWater, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJuice)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblJuicePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblFruitJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNescafe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMilkshake, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblSoftDrinks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMilkshakes)
                    .addComponent(lblDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNesName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDrinksPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFruitJuice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWater, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMojito, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMojitoo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBottledWater, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJuicePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMojitoPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWaterPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 870, 698));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPlate.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblPlate.setForeground(new java.awt.Color(153, 153, 153));
        lblPlate.setText("MY PLATE");

        btnCheckout.setBackground(new java.awt.Color(0, 204, 0));
        btnCheckout.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCheckout.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckout.setText("CHECKOUT");

        lblTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(153, 153, 153));
        lblTotal.setText("TOTAL");

        lblAmount.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(153, 153, 153));
        lblAmount.setText("      LKR  0.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCheckout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 502, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(lblAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1081, 0, -1, 698));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNescafeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNescafeMousePressed
        
        NescafeDialogBox ns = new NescafeDialogBox();
        ns.setVisible(true);
        

// TODO add your handling code here:
    }//GEN-LAST:event_lblNescafeMousePressed

    private void lblMilkshakeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMilkshakeMousePressed
        
        MilkshakesDialogBox ms = new MilkshakesDialogBox();
        ms.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_lblMilkshakeMousePressed

    private void lblSoftDrinksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSoftDrinksMousePressed
            
        softdrinksDialogBox sd = new softdrinksDialogBox();
        sd.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_lblSoftDrinksMousePressed

    private void lblFruitJuiceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFruitJuiceMousePressed
        
        FruitjuiceDialogBox fj = new FruitjuiceDialogBox();
        fj.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_lblFruitJuiceMousePressed

    private void lblMojitoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMojitoMousePressed
        
        MojitoDialogBox m = new MojitoDialogBox();
        m.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_lblMojitoMousePressed

    private void lblWaterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblWaterMousePressed
        
        WaterDialogBox w = new WaterDialogBox();
        w.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_lblWaterMousePressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppertizers;
    private javax.swing.JButton btnBeverages;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnFastFood;
    private javax.swing.JButton btnMeals;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblBottledWater;
    private javax.swing.JLabel lblDrinks;
    private javax.swing.JLabel lblDrinksPrice;
    private javax.swing.JLabel lblFruitJuice;
    private javax.swing.JLabel lblJuice;
    private javax.swing.JLabel lblJuicePrice;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMilkshake;
    private javax.swing.JLabel lblMilkshakes;
    private javax.swing.JLabel lblMojito;
    private javax.swing.JLabel lblMojitoPrice;
    private javax.swing.JLabel lblMojitoo;
    private javax.swing.JLabel lblNesName;
    private javax.swing.JLabel lblNesPrice;
    private javax.swing.JLabel lblNescafe;
    private javax.swing.JLabel lblPlate;
    private javax.swing.JLabel lblSoftDrinks;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblWater;
    private javax.swing.JLabel lblWaterPrice;
    // End of variables declaration//GEN-END:variables
}
