package apexmotorsvms;

import apexmotorsvms.utils.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {
    
    private Home home;
    
    public SignUp() {
        initComponents();
    }

    public SignUp(Home home) {
        initComponents();
        this.home = home;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUpTitleLabel = new javax.swing.JLabel();
        accountTypeLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        enterPasswordLabel = new javax.swing.JLabel();
        accountTypeComboBox = new javax.swing.JComboBox<>();
        usernameField = new javax.swing.JTextField();
        enterPasswordField = new javax.swing.JPasswordField();
        reenterPasswordLabel = new javax.swing.JLabel();
        reenterPasswordField = new javax.swing.JPasswordField();
        signUpButton = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        signInLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signUpTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        signUpTitleLabel.setText("Sign Up");

        accountTypeLabel.setText("Account Type");

        usernameLabel.setText("Username");

        enterPasswordLabel.setText("Enter Password");

        accountTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Admin" }));
        accountTypeComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        usernameField.setToolTipText("Enter your username here");

        enterPasswordField.setToolTipText("Enter your password here");

        reenterPasswordLabel.setText("Re-enter Password");

        reenterPasswordField.setToolTipText("Re-enter your password here");

        signUpButton.setText("Sign Up");
        signUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        emailLabel.setText("E-Mail");

        signInLabel.setForeground(new java.awt.Color(102, 153, 255));
        signInLabel.setText("Already have an account? Sign In Here");
        signInLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(signUpButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(accountTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enterPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reenterPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(emailLabel))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reenterPasswordField)
                            .addComponent(emailField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accountTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameField)
                            .addComponent(enterPasswordField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(signUpTitleLabel)))
                .addGap(310, 310, 310))
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(signInLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signUpTitleLabel)
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountTypeLabel)
                    .addComponent(accountTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterPasswordLabel)
                    .addComponent(enterPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reenterPasswordLabel)
                    .addComponent(reenterPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(signUpButton)
                .addGap(18, 18, 18)
                .addComponent(signInLabel)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        Connection conn = DatabaseConnectivity.connectDatabase();
        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String accountType = String.valueOf(accountTypeComboBox.getSelectedItem());
                String username = usernameField.getText();
                String userpass1 = String.valueOf(enterPasswordField.getPassword());
                String userpass2 = String.valueOf(reenterPasswordField.getPassword());
                String email = emailField.getText();

                String query = "insert into accounts (accounttype, username, password, email) values ('" 
                        + accountType + "', '" + username + "', '" + userpass1 + "', '" + email + "');";

                stmt.executeUpdate(query);

                JOptionPane.showMessageDialog(rootPane, "Account created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                new SignIn(home).setVisible(true);
                this.dispose();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void signInLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseClicked
        SignIn signin = new SignIn(home);
        signin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signInLabelMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SignUp signUpDraft = new SignUp();
                signUpDraft.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accountTypeComboBox;
    private javax.swing.JLabel accountTypeLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPasswordField enterPasswordField;
    private javax.swing.JLabel enterPasswordLabel;
    private javax.swing.JPasswordField reenterPasswordField;
    private javax.swing.JLabel reenterPasswordLabel;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel signUpTitleLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
