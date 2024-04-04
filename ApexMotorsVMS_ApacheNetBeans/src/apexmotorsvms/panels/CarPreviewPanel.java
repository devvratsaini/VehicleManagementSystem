package apexmotorsvms.panels;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CarPreviewPanel extends javax.swing.JPanel {

    public CarPreviewPanel(){
        initComponents();
    }
    
    public CarPreviewPanel(String path,String carName) {
        initComponents();
        try{Thread.sleep(1000);
        initDetails(path,carName);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public void initDetails(String path,String carName){
            modelNameLabel.setText(carName);
            ImageIcon icon = new ImageIcon(getClass().getResource(path));
            
            Image image = icon.getImage();
            Image scaledimage = image.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledimage);
            jLabel2.setIcon(scaledIcon);
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        chooseButton = new javax.swing.JButton();
        modelNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        chooseButton.setText("Choose");

        modelNameLabel.setText("Model Name Here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modelNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(chooseButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseButton)
                    .addComponent(modelNameLabel))
                .addGap(9, 9, 9))
        );

        jLabel2.setSize(250,130);
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel modelNameLabel;
    // End of variables declaration//GEN-END:variables
}
