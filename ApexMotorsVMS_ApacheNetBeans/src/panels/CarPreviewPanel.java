package panels;

import java.awt.Image;
import javax.swing.ImageIcon;
import main.CarDetails;
import main.Home;

public class CarPreviewPanel extends javax.swing.JPanel {
    
    private String carName;
    private Home home;
    
    public CarPreviewPanel(){
        initComponents();
    }
    
    public CarPreviewPanel(Home home, String carName) {
        initComponents();
        this.carName = carName;
        this.home = home;
        initDetails(carName);
    }
    
    public void initDetails(String carName){
            carNameLabel.setText(carName);
            ImageIcon icon = new ImageIcon(getClass().getResource("/resources/cars/" + carName + ".jpeg"));
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(carImage.getWidth(), carImage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            carImage.setIcon(scaledIcon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carImage = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        carDetailsPanel = new javax.swing.JPanel();
        carNameLabel = new javax.swing.JLabel();
        chooseButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(255, 182));

        carImage.setMaximumSize(new java.awt.Dimension(240, 130));
        carImage.setMinimumSize(new java.awt.Dimension(240, 130));
        carImage.setPreferredSize(new java.awt.Dimension(240, 130));
        add(carImage);
        carImage.setSize(240, 130);

        jSeparator1.setPreferredSize(new java.awt.Dimension(240, 5));
        add(jSeparator1);

        carDetailsPanel.setPreferredSize(new java.awt.Dimension(245, 25));

        carNameLabel.setText("Car Name Here");

        chooseButton.setText("Choose");
        chooseButton.setFocusPainted(false);
        chooseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout carDetailsPanelLayout = new javax.swing.GroupLayout(carDetailsPanel);
        carDetailsPanel.setLayout(carDetailsPanelLayout);
        carDetailsPanelLayout.setHorizontalGroup(
            carDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseButton)
                .addContainerGap())
        );
        carDetailsPanelLayout.setVerticalGroup(
            carDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(carNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(chooseButton))
        );

        add(carDetailsPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void chooseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseButtonActionPerformed
        String carModel = carNameLabel.getText();
        
        CarDetails carDetails = new CarDetails(home, carName);
        carDetails.setVisible(true);
        home.setVisible(false);
    }//GEN-LAST:event_chooseButtonActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel carDetailsPanel;
    private javax.swing.JLabel carImage;
    private javax.swing.JLabel carNameLabel;
    private javax.swing.JButton chooseButton;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
