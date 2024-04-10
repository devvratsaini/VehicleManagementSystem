package main;

import utils.*;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UserProfile extends javax.swing.JFrame {

    private Home home;
    
    public UserProfile() {
        initComponents();
    }
    
    public UserProfile(Home home) {
        initComponents();
        this.home = home;
        initDetails();
    }

    private void initDetails() {
        usernameField.setText(Session.getUsername());
        passwordField.setText(Session.getPassword());
        accountTypeField.setText(Session.getAccountType());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        userProfileTitle = new javax.swing.JLabel();
        backClickable = new javax.swing.JLabel();
        exitClickable = new javax.swing.JLabel();
        profileHeaderPanel = new javax.swing.JPanel();
        deleteAccountButton = new javax.swing.JButton();
        profileIcon = new javax.swing.JLabel();
        accountDetailsPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        genderField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        annualIncomeLabel = new javax.swing.JLabel();
        annualIncomeField = new javax.swing.JTextField();
        editNameButton = new javax.swing.JButton();
        editUsernameButton = new javax.swing.JButton();
        editGenderButton = new javax.swing.JButton();
        editAddressButton = new javax.swing.JButton();
        editAnnualIncomeButton = new javax.swing.JButton();
        accountDetailsPanel2 = new javax.swing.JPanel();
        warningLabel = new javax.swing.JLabel();
        warningIcon = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        editPasswordButton = new javax.swing.JButton();
        accountTypeLabel = new javax.swing.JLabel();
        accountTypeField = new javax.swing.JTextField();
        customerIdLabel = new javax.swing.JLabel();
        customerIdField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        userProfileTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        userProfileTitle.setText("USER PROFILE");

        backClickable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/back.png"))); // NOI18N
        backClickable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backClickable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backClickableMouseClicked(evt);
            }
        });

        exitClickable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Close Window.png"))); // NOI18N
        exitClickable.setToolTipText("");
        exitClickable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitClickable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitClickableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backClickable)
                .addGap(290, 290, 290)
                .addComponent(userProfileTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitClickable)
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitClickable)
                    .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(backClickable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userProfileTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        deleteAccountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Warning.png"))); // NOI18N
        deleteAccountButton.setText("Delete Account");
        deleteAccountButton.setFocusPainted(false);
        deleteAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountButtonActionPerformed(evt);
            }
        });

        profileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/BigUserProfile.png"))); // NOI18N

        javax.swing.GroupLayout profileHeaderPanelLayout = new javax.swing.GroupLayout(profileHeaderPanel);
        profileHeaderPanel.setLayout(profileHeaderPanelLayout);
        profileHeaderPanelLayout.setHorizontalGroup(
            profileHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileHeaderPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(profileIcon)
                .addGap(18, 18, 18)
                .addComponent(deleteAccountButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        profileHeaderPanelLayout.setVerticalGroup(
            profileHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileHeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileIcon)
                    .addGroup(profileHeaderPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(deleteAccountButton)))
                .addContainerGap())
        );

        accountDetailsPanel1.setPreferredSize(new java.awt.Dimension(395, 362));

        nameLabel.setText("Name");

        nameField.setEnabled(false);

        usernameLabel.setText("Username");

        usernameField.setEnabled(false);

        genderLabel.setText("Gender");

        genderField.setEnabled(false);

        addressLabel.setText("Address");

        addressField.setEnabled(false);

        annualIncomeLabel.setText("Annual Income");

        annualIncomeField.setEnabled(false);

        editNameButton.setText("Edit");
        editNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNameButtonActionPerformed(evt);
            }
        });

        editUsernameButton.setText("Edit");
        editUsernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUsernameButtonActionPerformed(evt);
            }
        });

        editGenderButton.setText("Edit");
        editGenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editGenderButtonActionPerformed(evt);
            }
        });

        editAddressButton.setText("Edit");
        editAddressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAddressButtonActionPerformed(evt);
            }
        });

        editAnnualIncomeButton.setText("Edit");
        editAnnualIncomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAnnualIncomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountDetailsPanel1Layout = new javax.swing.GroupLayout(accountDetailsPanel1);
        accountDetailsPanel1.setLayout(accountDetailsPanel1Layout);
        accountDetailsPanel1Layout.setHorizontalGroup(
            accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountDetailsPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(annualIncomeLabel)
                    .addComponent(addressLabel)
                    .addComponent(genderLabel)
                    .addComponent(usernameLabel)
                    .addComponent(nameLabel)
                    .addComponent(addressField)
                    .addComponent(genderField)
                    .addComponent(usernameField)
                    .addComponent(nameField)
                    .addComponent(annualIncomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editUsernameButton)
                    .addComponent(editNameButton)
                    .addComponent(editGenderButton)
                    .addComponent(editAddressButton)
                    .addComponent(editAnnualIncomeButton))
                .addGap(48, 48, 48))
        );
        accountDetailsPanel1Layout.setVerticalGroup(
            accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountDetailsPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editNameButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editUsernameButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(genderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editGenderButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editAddressButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(annualIncomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annualIncomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editAnnualIncomeButton))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        accountDetailsPanel2.setPreferredSize(new java.awt.Dimension(395, 362));

        warningLabel.setText("<html><i>The below options need special attention before editing.<br>Unwanted changes may have undesirable outcomes.<br>Please contact support in case you need help.</i></html>");

        warningIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Warning.png"))); // NOI18N

        passwordLabel.setText("Password");

        passwordField.setEnabled(false);

        editPasswordButton.setText("Change");
        editPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPasswordButtonActionPerformed(evt);
            }
        });

        accountTypeLabel.setText("Account Type");

        accountTypeField.setEnabled(false);

        customerIdLabel.setText("Customer ID");

        customerIdField.setEnabled(false);

        saveButton.setText("Save");
        saveButton.setFocusPainted(false);

        resetButton.setText("Reset");
        resetButton.setFocusPainted(false);

        javax.swing.GroupLayout accountDetailsPanel2Layout = new javax.swing.GroupLayout(accountDetailsPanel2);
        accountDetailsPanel2.setLayout(accountDetailsPanel2Layout);
        accountDetailsPanel2Layout.setHorizontalGroup(
            accountDetailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountDetailsPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(accountDetailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(accountDetailsPanel2Layout.createSequentialGroup()
                        .addComponent(warningIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(accountDetailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(accountTypeLabel)
                        .addComponent(accountTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(customerIdLabel)
                        .addComponent(customerIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(accountDetailsPanel2Layout.createSequentialGroup()
                            .addGroup(accountDetailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(passwordLabel)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(editPasswordButton)))
                    .addGroup(accountDetailsPanel2Layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetButton)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        accountDetailsPanel2Layout.setVerticalGroup(
            accountDetailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountDetailsPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(accountDetailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(warningIcon)
                    .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountDetailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editPasswordButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accountTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(accountDetailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(resetButton))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(accountDetailsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountDetailsPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profileHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accountDetailsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountDetailsPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountButtonActionPerformed
        int choice = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete your account?", "Confirm Choice", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            String confirmPassword = JOptionPane.showInputDialog(rootPane, "Enter your password", "Confirm Password", JOptionPane.YES_NO_OPTION);
            if (confirmPassword.equals(Session.getPassword())) {
                Connection conn =DatabaseConnectivity.connectDatabase();
                if (conn != null) {
                    try {
                        Statement stmt = conn.createStatement();
                        String query = "delete from accounts where username = '" + Session.getUsername() + "';";
                        stmt.executeUpdate(query);
                        
                        // updating session details
                        Session.setSignOut();
                        JOptionPane.showMessageDialog(rootPane, "Account Deleted Successfully!", 
                                "Success", JOptionPane.INFORMATION_MESSAGE);
                        
                        // moving to home page and disposing this page
                        home.changeToSignedOut();
                        home.setVisible(true);
                        this.dispose();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }//GEN-LAST:event_deleteAccountButtonActionPerformed

    private void editNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNameButtonActionPerformed
        nameField.setEnabled(true);
    }//GEN-LAST:event_editNameButtonActionPerformed

    private void editUsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUsernameButtonActionPerformed
        usernameField.setEnabled(true);
    }//GEN-LAST:event_editUsernameButtonActionPerformed

    private void editGenderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editGenderButtonActionPerformed
        genderField.setEnabled(true);
    }//GEN-LAST:event_editGenderButtonActionPerformed

    private void editAddressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAddressButtonActionPerformed
        addressField.setEnabled(true);
    }//GEN-LAST:event_editAddressButtonActionPerformed

    private void editAnnualIncomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAnnualIncomeButtonActionPerformed
        addressField.setEnabled(true);
    }//GEN-LAST:event_editAnnualIncomeButtonActionPerformed

    private void editPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPasswordButtonActionPerformed
        int choice = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to change your password?", 
                "Confirm Choice", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            passwordField.setEnabled(true);
        }
    }//GEN-LAST:event_editPasswordButtonActionPerformed

    private void backClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backClickableMouseClicked
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backClickableMouseClicked

    private void exitClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitClickableMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitClickableMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountDetailsPanel1;
    private javax.swing.JPanel accountDetailsPanel2;
    private javax.swing.JTextField accountTypeField;
    private javax.swing.JLabel accountTypeLabel;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField annualIncomeField;
    private javax.swing.JLabel annualIncomeLabel;
    private javax.swing.JLabel backClickable;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField customerIdField;
    private javax.swing.JLabel customerIdLabel;
    private javax.swing.JButton deleteAccountButton;
    private javax.swing.JButton editAddressButton;
    private javax.swing.JButton editAnnualIncomeButton;
    private javax.swing.JButton editGenderButton;
    private javax.swing.JButton editNameButton;
    private javax.swing.JButton editPasswordButton;
    private javax.swing.JButton editUsernameButton;
    private javax.swing.JLabel exitClickable;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel profileHeaderPanel;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel userProfileTitle;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel warningIcon;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
