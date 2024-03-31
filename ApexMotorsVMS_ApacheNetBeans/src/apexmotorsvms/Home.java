package apexmotorsvms;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        apexMotorsVmsTitleLabel = new javax.swing.JLabel();
        signInClickableLabel = new javax.swing.JLabel();
        signUpClickableLabel = new javax.swing.JLabel();
        profileIcon = new javax.swing.JLabel();
        carPreviewPanel1 = new apexmotorsvms.panels.CarPreviewPanel();
        carPreviewPanel2 = new apexmotorsvms.panels.CarPreviewPanel();
        carPreviewPanel3 = new apexmotorsvms.panels.CarPreviewPanel();
        carPreviewPanel4 = new apexmotorsvms.panels.CarPreviewPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        apexMotorsVmsTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        apexMotorsVmsTitleLabel.setText("ApexMotorsVMS");

        signInClickableLabel.setForeground(new java.awt.Color(51, 102, 255));
        signInClickableLabel.setText("Sign In");
        signInClickableLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInClickableLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInClickableLabelMouseClicked(evt);
            }
        });

        signUpClickableLabel.setForeground(new java.awt.Color(51, 102, 255));
        signUpClickableLabel.setText("Sign Up");
        signUpClickableLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpClickableLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpClickableLabelMouseClicked(evt);
            }
        });

        profileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/profileIcon.png"))); // NOI18N
        profileIcon.setText("username here");
        profileIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(profileIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                        .addComponent(apexMotorsVmsTitleLabel)
                        .addGap(243, 243, 243)
                        .addComponent(signInClickableLabel)
                        .addGap(24, 24, 24)
                        .addComponent(signUpClickableLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(carPreviewPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(carPreviewPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(carPreviewPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(carPreviewPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(profileIcon)
                        .addComponent(apexMotorsVmsTitleLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(signUpClickableLabel)
                        .addComponent(signInClickableLabel)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carPreviewPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carPreviewPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carPreviewPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carPreviewPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileIconMouseClicked
        if (apexmotorsvms.utils.Session.isUserSignedIn()) {
            EditProfile editProfile = new EditProfile(this);
            editProfile.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(rootPane, "You need to be Signed In to view the User Profile.",
                    "Sign-in to Continue", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_profileIconMouseClicked

    private void signUpClickableLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpClickableLabelMouseClicked
        SignUp signup = new SignUp(this);
        signup.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signUpClickableLabelMouseClicked

    private void signInClickableLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInClickableLabelMouseClicked
        SignIn login = new SignIn(this);
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signInClickableLabelMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home home = new Home();
                home.setVisible(true);
                home.setTitle("ApexMtotrsVMS");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apexMotorsVmsTitleLabel;
    private apexmotorsvms.panels.CarPreviewPanel carPreviewPanel1;
    private apexmotorsvms.panels.CarPreviewPanel carPreviewPanel2;
    private apexmotorsvms.panels.CarPreviewPanel carPreviewPanel3;
    private apexmotorsvms.panels.CarPreviewPanel carPreviewPanel4;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JLabel signInClickableLabel;
    private javax.swing.JLabel signUpClickableLabel;
    // End of variables declaration//GEN-END:variables
}
