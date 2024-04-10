package main;

public class CarDetails extends javax.swing.JFrame {

    private Home home;
    
    public CarDetails() {
        initComponents();
    }
    
    public CarDetails(Home home) {
        initComponents();
        this.home = home;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        carPreview = new javax.swing.JPanel();
        addToCartButton = new javax.swing.JButton();
        costText = new javax.swing.JLabel();
        carDetailsPanel = new javax.swing.JPanel();
        manufacturerLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        carTypeLabel = new javax.swing.JLabel();
        engineTypeLabel = new javax.swing.JLabel();
        manufacturerText = new javax.swing.JLabel();
        carTypeText = new javax.swing.JLabel();
        modelText = new javax.swing.JLabel();
        engineTypeText = new javax.swing.JLabel();
        manufacturerLogo = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        exitClickable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        carPreview.setBackground(new java.awt.Color(232, 232, 232));

        javax.swing.GroupLayout carPreviewLayout = new javax.swing.GroupLayout(carPreview);
        carPreview.setLayout(carPreviewLayout);
        carPreviewLayout.setHorizontalGroup(
            carPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        carPreviewLayout.setVerticalGroup(
            carPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        addToCartButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addToCartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Cart.png"))); // NOI18N
        addToCartButton.setText("Add to Cart");
        addToCartButton.setFocusPainted(false);

        costText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        costText.setForeground(new java.awt.Color(0, 204, 0));
        costText.setText("Rs. 320000");

        manufacturerLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        manufacturerLabel.setText("Manufacturer");

        modelLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        modelLabel.setText("Model");

        carTypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        carTypeLabel.setText("Car Type");

        engineTypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        engineTypeLabel.setText("Engine Type");

        manufacturerText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        carTypeText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        modelText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        engineTypeText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/back.png"))); // NOI18N
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout carDetailsPanelLayout = new javax.swing.GroupLayout(carDetailsPanel);
        carDetailsPanel.setLayout(carDetailsPanelLayout);
        carDetailsPanelLayout.setHorizontalGroup(
            carDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(carDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modelText, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(engineTypeText, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(carTypeText, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(manufacturerLabel)
                    .addComponent(engineTypeLabel)
                    .addComponent(carTypeLabel)
                    .addComponent(modelLabel)
                    .addComponent(manufacturerText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manufacturerLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        carDetailsPanelLayout.setVerticalGroup(
            carDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carDetailsPanelLayout.createSequentialGroup()
                .addGroup(carDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(carDetailsPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(manufacturerLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backButton))
                .addGap(26, 26, 26)
                .addComponent(manufacturerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manufacturerText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(modelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modelText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(carTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(engineTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(engineTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        exitClickable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Close Window.png"))); // NOI18N
        exitClickable.setToolTipText("");
        exitClickable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitClickable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitClickableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carPreview, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addToCartButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(costText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(exitClickable, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(exitClickable)
                        .addGap(16, 16, 16)
                        .addComponent(carPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(costText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonMouseClicked

    private void exitClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitClickableMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitClickableMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JLabel backButton;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel carDetailsPanel;
    private javax.swing.JPanel carPreview;
    private javax.swing.JLabel carTypeLabel;
    private javax.swing.JLabel carTypeText;
    private javax.swing.JLabel costText;
    private javax.swing.JLabel engineTypeLabel;
    private javax.swing.JLabel engineTypeText;
    private javax.swing.JLabel exitClickable;
    private javax.swing.JLabel manufacturerLabel;
    private javax.swing.JLabel manufacturerLogo;
    private javax.swing.JLabel manufacturerText;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JLabel modelText;
    // End of variables declaration//GEN-END:variables
}
