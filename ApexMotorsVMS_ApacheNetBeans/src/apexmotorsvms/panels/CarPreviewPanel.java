package apexmotorsvms.panels;

import java.awt.Color;

public class CarPreviewPanel extends javax.swing.JPanel {

    public CarPreviewPanel() {
        initComponents();
        setBackground(Color.LIGHT_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        chooseButton = new javax.swing.JButton();
        modelNameLabel = new javax.swing.JLabel();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 138, 236, -1));

        chooseButton.setText("Choose");
        add(chooseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 147, -1, -1));

        modelNameLabel.setText("Model Name Here");
        add(modelNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 150, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseButton;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel modelNameLabel;
    // End of variables declaration//GEN-END:variables
}
