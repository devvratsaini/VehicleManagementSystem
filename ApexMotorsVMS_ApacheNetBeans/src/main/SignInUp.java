package main;

import utils.DatabaseConnectivity;
import utils.Session;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import utils.AccountValidationUtils;

public class SignInUp extends javax.swing.JFrame {

    private Home home;
    
    public SignInUp() {
        initComponents();
    }
    
    public SignInUp(Home home) {
        initComponents();
        this.home = home;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        signInPanel = new javax.swing.JPanel();
        signInTitlePanel = new javax.swing.JPanel();
        signInTitle = new javax.swing.JLabel();
        signInDetailsPanel = new javax.swing.JPanel();
        usernameSignInLabel = new javax.swing.JLabel();
        usernameSignInField = new javax.swing.JTextField();
        passwordSignInLabel = new javax.swing.JLabel();
        passwordSignInField = new javax.swing.JPasswordField();
        signInButton = new javax.swing.JButton();
        forgotPasswordClickable = new javax.swing.JLabel();
        signUpTitlePanel = new javax.swing.JPanel();
        signUpTitle = new javax.swing.JLabel();
        SignUpDetailsPanel = new javax.swing.JPanel();
        usernameSignUpLabel = new javax.swing.JLabel();
        emailSignUpField = new javax.swing.JTextField();
        passwordSignUpLabel = new javax.swing.JLabel();
        passwordSignUpField = new javax.swing.JPasswordField();
        signUpButton = new javax.swing.JButton();
        confPassSignUpField = new javax.swing.JPasswordField();
        confPassSignUpLabel = new javax.swing.JLabel();
        emailSignUpLabel = new javax.swing.JLabel();
        usernameSignUpField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        bg.setBackground(new java.awt.Color(232, 232, 232));

        signInPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        signInTitlePanel.setPreferredSize(new java.awt.Dimension(400, 100));

        signInTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signInTitle.setText("SIGN IN");

        javax.swing.GroupLayout signInTitlePanelLayout = new javax.swing.GroupLayout(signInTitlePanel);
        signInTitlePanel.setLayout(signInTitlePanelLayout);
        signInTitlePanelLayout.setHorizontalGroup(
            signInTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInTitlePanelLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(signInTitle)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        signInTitlePanelLayout.setVerticalGroup(
            signInTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInTitlePanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(signInTitle)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        signInPanel.add(signInTitlePanel);

        signInDetailsPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        usernameSignInLabel.setText("Username");

        passwordSignInLabel.setText("Password");

        signInButton.setText("Sign In");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        forgotPasswordClickable.setForeground(new java.awt.Color(51, 153, 255));
        forgotPasswordClickable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Question Mark.png"))); // NOI18N
        forgotPasswordClickable.setText("Forgot Password");
        forgotPasswordClickable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPasswordClickable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordClickableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout signInDetailsPanelLayout = new javax.swing.GroupLayout(signInDetailsPanel);
        signInDetailsPanel.setLayout(signInDetailsPanelLayout);
        signInDetailsPanelLayout.setHorizontalGroup(
            signInDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInDetailsPanelLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(signInButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(signInDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordSignInLabel)
                    .addComponent(usernameSignInLabel)
                    .addComponent(usernameSignInField)
                    .addComponent(passwordSignInField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
            .addGroup(signInDetailsPanelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(forgotPasswordClickable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        signInDetailsPanelLayout.setVerticalGroup(
            signInDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInDetailsPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(usernameSignInLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameSignInField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordSignInLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordSignInField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signInButton)
                .addGap(18, 18, 18)
                .addComponent(forgotPasswordClickable)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        signInPanel.add(signInDetailsPanel);

        signUpTitlePanel.setBackground(new java.awt.Color(232, 232, 232));
        signUpTitlePanel.setPreferredSize(new java.awt.Dimension(400, 100));

        signUpTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signUpTitle.setText("SIGN UP");

        javax.swing.GroupLayout signUpTitlePanelLayout = new javax.swing.GroupLayout(signUpTitlePanel);
        signUpTitlePanel.setLayout(signUpTitlePanelLayout);
        signUpTitlePanelLayout.setHorizontalGroup(
            signUpTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpTitlePanelLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(signUpTitle)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        signUpTitlePanelLayout.setVerticalGroup(
            signUpTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpTitlePanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(signUpTitle)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        SignUpDetailsPanel.setBackground(new java.awt.Color(232, 232, 232));
        SignUpDetailsPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        usernameSignUpLabel.setText("Username");

        passwordSignUpLabel.setText("Password");

        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        confPassSignUpLabel.setText("Confirm Password");

        emailSignUpLabel.setText("Email");

        javax.swing.GroupLayout SignUpDetailsPanelLayout = new javax.swing.GroupLayout(SignUpDetailsPanel);
        SignUpDetailsPanel.setLayout(SignUpDetailsPanelLayout);
        SignUpDetailsPanelLayout.setHorizontalGroup(
            SignUpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SignUpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpDetailsPanelLayout.createSequentialGroup()
                        .addComponent(signUpButton)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpDetailsPanelLayout.createSequentialGroup()
                        .addGroup(SignUpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confPassSignUpLabel)
                            .addComponent(confPassSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SignUpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordSignUpLabel)
                                .addComponent(usernameSignUpLabel)
                                .addComponent(emailSignUpField)
                                .addComponent(passwordSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(usernameSignUpField))
                            .addComponent(emailSignUpLabel))
                        .addGap(73, 73, 73))))
        );
        SignUpDetailsPanelLayout.setVerticalGroup(
            SignUpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usernameSignUpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(passwordSignUpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confPassSignUpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confPassSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailSignUpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(signUpButton)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(signInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(signUpTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(SignUpDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(signInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signUpTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignUpDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        Connection conn = DatabaseConnectivity.connectDatabase();
        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String username = usernameSignInField.getText();
                String userpass = String.valueOf(passwordSignInField.getPassword());
                String query = "select password from accounts where username = '" 
                        + username + "';";
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next()) {
                    if(userpass.equals(rs.getString(1))) {
                        JOptionPane.showMessageDialog(rootPane, "Logged in successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                        
                        // updating session details
                        Session.setUserSignedIn(true);
                        Session.setAccountType("Customer");
                        Session.setUsername(username);
                        Session.setPassword(userpass);
                        
                        // traversing to home page and disposing this page
                        home.setVisible(true);
                        home.changeToSignedIn();
                        this.dispose();
                    }
                }
                if(!utils.Session.isUserSignedIn()) {
                    JOptionPane.showMessageDialog(rootPane, "Failed to Login. Please check your username and/or password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }    }//GEN-LAST:event_signInButtonActionPerformed

    private void forgotPasswordClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordClickableMouseClicked
        ForgotPassword forgotPassword = new ForgotPassword(this);
        forgotPassword.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_forgotPasswordClickableMouseClicked

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        Connection conn = utils.DatabaseConnectivity.connectDatabase();
        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String username = usernameSignUpField.getText();
                
                String query = "select username from accounts where username = '" + username + "';";
                ResultSet rs = stmt.executeQuery(query);
                if (!rs.next()) {
                    String password = String.valueOf(passwordSignUpField.getPassword());
                    String confPass = String.valueOf(confPassSignUpField.getPassword());

                    if (password.equals(confPass)) {
                        String email = emailSignUpField.getText();
                        if (AccountValidationUtils.isEmailValid(email)) {
                            query = "insert into accounts (username, password, email) values ('" 
                                + username + "', '" + password + "', '" + email + "');";

                        stmt.executeUpdate(query);

                        JOptionPane.showMessageDialog(rootPane, "Account created successfully!", 
                                "Success", JOptionPane.INFORMATION_MESSAGE);
                        
                        // clearing fields
                        usernameSignUpField.setText(null);
                        passwordSignUpField.setText(null);
                        confPassSignUpField.setText(null);
                        emailSignUpField.setText(null);
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Email is invalid.", 
                                "Invalid Email", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Passwords are not equal.", 
                                "Password Mismatch", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Username is already taken, try a different username.", 
                            "Username Taken", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_signUpButtonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SignUpDetailsPanel;
    private javax.swing.JPanel bg;
    private javax.swing.JPasswordField confPassSignUpField;
    private javax.swing.JLabel confPassSignUpLabel;
    private javax.swing.JTextField emailSignUpField;
    private javax.swing.JLabel emailSignUpLabel;
    private javax.swing.JLabel forgotPasswordClickable;
    private javax.swing.JPasswordField passwordSignInField;
    private javax.swing.JLabel passwordSignInLabel;
    private javax.swing.JPasswordField passwordSignUpField;
    private javax.swing.JLabel passwordSignUpLabel;
    private javax.swing.JButton signInButton;
    private javax.swing.JPanel signInDetailsPanel;
    private javax.swing.JPanel signInPanel;
    private javax.swing.JLabel signInTitle;
    private javax.swing.JPanel signInTitlePanel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel signUpTitle;
    private javax.swing.JPanel signUpTitlePanel;
    private javax.swing.JTextField usernameSignInField;
    private javax.swing.JLabel usernameSignInLabel;
    private javax.swing.JTextField usernameSignUpField;
    private javax.swing.JLabel usernameSignUpLabel;
    // End of variables declaration//GEN-END:variables
}
