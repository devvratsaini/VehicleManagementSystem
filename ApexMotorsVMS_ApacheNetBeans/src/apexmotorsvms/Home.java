package apexmotorsvms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        profileIcon = new javax.swing.JLabel();
        apexMotorsVmsTitleLabel = new javax.swing.JLabel();
        deleteAccountLabel = new javax.swing.JLabel();
        signInClickableLabel = new javax.swing.JLabel();
        signUpClickableLabel = new javax.swing.JLabel();
        carPreviewPanel1 = new apexmotorsvms.panels.CarPreviewPanel("/Resources/baleno.jpeg","Maruti Suzuki Baleno");
        carPreviewPanel2 = new apexmotorsvms.panels.CarPreviewPanel("/Resources/breza.jpeg","Maruti Suzuki Vitara Brezza");
        carPreviewPanel3 = new apexmotorsvms.panels.CarPreviewPanel("/Resources/ciaz.jpeg","Maruti Suzuki Ciaz");
        carPreviewPanel4 = new apexmotorsvms.panels.CarPreviewPanel("/Resources/dzire.jpeg","Maruti Suzuki Dzire");
        carPreviewPanel5 = new apexmotorsvms.panels.CarPreviewPanel("/Resources/swift.jpeg","Maruti Suzuki Swift");
        carPreviewPanel6 = new apexmotorsvms.panels.CarPreviewPanel("/Resources/mustang.jpeg","Ford Mustang");
        carPreviewPanel7 = new apexmotorsvms.panels.CarPreviewPanel("/Resources/figo.jpeg","Ford Figo");
        carPreviewPanel8 = new apexmotorsvms.panels.CarPreviewPanel("/Resources/ecosport.jpeg","Ford Ecosport");
        carPreviewPanel9 = new apexmotorsvms.panels.CarPreviewPanel("/Resources/aspire.jpeg","Ford Aspire");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 500));

        profileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apexmotorsvms/resources/profileIcon.png"))); // NOI18N
        profileIcon.setText("username here");
        profileIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileIconMouseClicked(evt);
            }
        });

        apexMotorsVmsTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        apexMotorsVmsTitleLabel.setText("ApexMotorsVMS");

        deleteAccountLabel.setForeground(new java.awt.Color(51, 102, 255));
        deleteAccountLabel.setText("Delete Account");
        deleteAccountLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteAccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAccountLabelMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profileIcon)
                            .addComponent(carPreviewPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(apexMotorsVmsTitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteAccountLabel)
                                .addGap(18, 18, 18)
                                .addComponent(signInClickableLabel)
                                .addGap(18, 18, 18)
                                .addComponent(signUpClickableLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(carPreviewPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(carPreviewPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 38, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(carPreviewPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(carPreviewPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(carPreviewPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(carPreviewPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(carPreviewPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(carPreviewPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apexMotorsVmsTitleLabel)
                            .addComponent(profileIcon)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(signInClickableLabel)
                            .addComponent(signUpClickableLabel)
                            .addComponent(deleteAccountLabel))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carPreviewPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carPreviewPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carPreviewPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carPreviewPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carPreviewPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carPreviewPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(carPreviewPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carPreviewPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carPreviewPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        jScrollPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpClickableLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpClickableLabelMouseClicked
        SignUp signup = new SignUp();
        signup.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signUpClickableLabelMouseClicked

    private void signInClickableLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInClickableLabelMouseClicked
        SignIn login = new SignIn();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signInClickableLabelMouseClicked

    private void deleteAccountLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAccountLabelMouseClicked

    }//GEN-LAST:event_deleteAccountLabelMouseClicked

    private void profileIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileIconMouseClicked
        EditProfile editProfile = new EditProfile();
        editProfile.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_profileIconMouseClicked

   
    
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
    private apexmotorsvms.panels.CarPreviewPanel carPreviewPanel5;
    private apexmotorsvms.panels.CarPreviewPanel carPreviewPanel6;
    private apexmotorsvms.panels.CarPreviewPanel carPreviewPanel7;
    private apexmotorsvms.panels.CarPreviewPanel carPreviewPanel8;
    private apexmotorsvms.panels.CarPreviewPanel carPreviewPanel9;
    private javax.swing.JLabel deleteAccountLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JLabel signInClickableLabel;
    private javax.swing.JLabel signUpClickableLabel;
    // End of variables declaration//GEN-END:variables
}
