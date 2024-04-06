package panels;

import java.awt.Image;
import javax.swing.ImageIcon;

public class CarPreviewPanel extends javax.swing.JPanel {

    public CarPreviewPanel(){
        initComponents();
    }
    
    public CarPreviewPanel(String path, String carName) {
        initComponents();
        initDetails(path, carName);
    }
    
    public void initDetails(String path,String carName){
            carNameLabel.setText(carName);
            ImageIcon icon = new ImageIcon(getClass().getResource(path));
            
            Image image = icon.getImage();
            Image scaledimage = image.getScaledInstance(carImage.getWidth(), carImage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledimage);
            carImage.setIcon(scaledIcon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carImage = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        carNameLabel = new javax.swing.JLabel();
        chooseButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(255, 182));

        carImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        carImage.setMaximumSize(new java.awt.Dimension(240, 130));
        carImage.setMinimumSize(new java.awt.Dimension(240, 130));
        carImage.setPreferredSize(new java.awt.Dimension(240, 130));
        add(carImage);
        carImage.setSize(240, 130);

        jSeparator1.setPreferredSize(new java.awt.Dimension(240, 5));
        add(jSeparator1);

        jPanel1.setPreferredSize(new java.awt.Dimension(245, 25));

        carNameLabel.setText("Car Name Here");

        chooseButton.setText("Choose");
        chooseButton.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(carNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(chooseButton))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carImage;
    private javax.swing.JLabel carNameLabel;
    private javax.swing.JButton chooseButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
