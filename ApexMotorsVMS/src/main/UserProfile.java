package main;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import utils.Session;
import utils.DatabaseConnectivity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class UserProfile extends javax.swing.JFrame {

    private Home home;
    private int posX, posY;
    
    public UserProfile() {
        initComponents();
        addDragListeners();
    }
    
    public UserProfile(Home home) {
        initComponents();
        this.home = home;
        this.setLocation(home.getFrameLocation());
        initDetails();
        addDragListeners();
    }

    private void initDetails() {
        usernameField.setText(Session.getUsername());
        passwordField.setText(Session.getPassword());
        emailField.setText(Session.getAccountType());
        
        Connection conn = DatabaseConnectivity.connectDatabase();
        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String query = "select name, gender, address, email from accounts where username = '" + Session.getUsername() + "';";
                
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next()) {
                    nameField.setText(rs.getString(1));
                    genderComboBox.setSelectedIndex(rs.getString(2).equals("Male") ? 0 : 1);
                    addressTextArea.setText(rs.getString(3));
                    emailField.setText(rs.getString(4));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
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
        addressLabel = new javax.swing.JLabel();
        editAccountDetails = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        genderComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        accountDetailsPanel2 = new javax.swing.JPanel();
        warningLabel = new javax.swing.JLabel();
        warningIcon = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        changePasswordButton = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        changeEmailButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        bgColorPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titlePanel.setBackground(new java.awt.Color(231, 215, 193));
        titlePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

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
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backClickable)
                    .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(userProfileTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(exitClickable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

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
                    .addGroup(profileHeaderPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(deleteAccountButton))
                    .addComponent(profileIcon))
                .addContainerGap())
        );

        accountDetailsPanel1.setPreferredSize(new java.awt.Dimension(395, 362));

        nameLabel.setText("Name");

        nameField.setBackground(new java.awt.Color(242, 242, 242));
        nameField.setEnabled(false);

        usernameLabel.setText("Username");

        usernameField.setBackground(new java.awt.Color(242, 242, 242));
        usernameField.setEnabled(false);

        genderLabel.setText("Gender");

        addressLabel.setText("Address");

        editAccountDetails.setText("Edit");
        editAccountDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAccountDetailsActionPerformed(evt);
            }
        });

        addressTextArea.setColumns(20);
        addressTextArea.setRows(5);
        addressTextArea.setEnabled(false);
        jScrollPane1.setViewportView(addressTextArea);

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderComboBox.setEnabled(false);

        jLabel1.setText("<html><i>For security reasons,<br>Username is not editable.</i></html>");

        javax.swing.GroupLayout accountDetailsPanel1Layout = new javax.swing.GroupLayout(accountDetailsPanel1);
        accountDetailsPanel1.setLayout(accountDetailsPanel1Layout);
        accountDetailsPanel1Layout.setHorizontalGroup(
            accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountDetailsPanel1Layout.createSequentialGroup()
                .addGroup(accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountDetailsPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(editAccountDetails))
                    .addGroup(accountDetailsPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(accountDetailsPanel1Layout.createSequentialGroup()
                                .addGroup(accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameLabel)
                                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(genderLabel)
                                    .addComponent(genderComboBox, 0, 150, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        accountDetailsPanel1Layout.setVerticalGroup(
            accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountDetailsPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(accountDetailsPanel1Layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(accountDetailsPanel1Layout.createSequentialGroup()
                        .addComponent(genderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(accountDetailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(accountDetailsPanel1Layout.createSequentialGroup()
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(addressLabel)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editAccountDetails)
                .addGap(24, 24, 24))
        );

        accountDetailsPanel2.setPreferredSize(new java.awt.Dimension(395, 362));

        warningLabel.setText("<html><i>The below options need special attention before editing.<br>Unwanted changes may have undesirable effects.<br>Please contact support in case you need help.</i></html>");

        warningIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Warning.png"))); // NOI18N

        passwordLabel.setText("Password");

        changePasswordButton.setText("Change");
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });

        emailLabel.setText("Email");

        emailField.setBackground(new java.awt.Color(242, 242, 242));
        emailField.setEnabled(false);

        saveButton.setText("Save");
        saveButton.setFocusPainted(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Cancel");
        resetButton.setFocusPainted(false);
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(242, 242, 242));
        passwordField.setEnabled(false);

        changeEmailButton.setText("Change");
        changeEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEmailButtonActionPerformed(evt);
            }
        });

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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountDetailsPanel2Layout.createSequentialGroup()
                            .addComponent(saveButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(resetButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountDetailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel)
                            .addGroup(accountDetailsPanel2Layout.createSequentialGroup()
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(changeEmailButton))
                            .addGroup(accountDetailsPanel2Layout.createSequentialGroup()
                                .addGroup(accountDetailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(accountDetailsPanel2Layout.createSequentialGroup()
                                        .addComponent(passwordLabel)
                                        .addGap(168, 168, 168))
                                    .addGroup(accountDetailsPanel2Layout.createSequentialGroup()
                                        .addComponent(passwordField)
                                        .addGap(18, 18, 18)))
                                .addComponent(changePasswordButton)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        accountDetailsPanel2Layout.setVerticalGroup(
            accountDetailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountDetailsPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(accountDetailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(warningIcon)
                    .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountDetailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(changePasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountDetailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeEmailButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(accountDetailsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(resetButton))
                .addGap(37, 37, 37))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        bgColorPanel.setBackground(new java.awt.Color(231, 215, 193));
        bgColorPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout bgColorPanelLayout = new javax.swing.GroupLayout(bgColorPanel);
        bgColorPanel.setLayout(bgColorPanelLayout);
        bgColorPanelLayout.setHorizontalGroup(
            bgColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bgColorPanelLayout.setVerticalGroup(
            bgColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profileHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bgColorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(accountDetailsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accountDetailsPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(profileHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(accountDetailsPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountDetailsPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bgColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountButtonActionPerformed
        
        // getting confirmation from user
        int choice = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete your account?", "Confirm Choice", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            String confirmPassword = JOptionPane.showInputDialog(rootPane, "Enter your password", "Confirm Password", JOptionPane.YES_NO_OPTION);
            if (confirmPassword.equals(Session.getPassword())) {
                Connection conn = DatabaseConnectivity.connectDatabase();
                if (conn != null) {
                    try {
                        Statement stmt = conn.createStatement();
                        String query = "delete from accounts where username = '" + Session.getUsername() + "';";
                        stmt.executeUpdate(query);
                        
                        // updating session details
                        Session.setSignOut();
                        JOptionPane.showMessageDialog(rootPane, "Account Deleted Successfully!", 
                                "Success", JOptionPane.INFORMATION_MESSAGE);
                        
                        // redirecting to Home page and disposing this page
                        home.changeToSignedOut();
                        home.setLocation(this.getFrameLocation());
                        home.setVisible(true);
                        this.dispose();
                    } catch (SQLException e) {
                        
                    }
                }
            }
        }
    }//GEN-LAST:event_deleteAccountButtonActionPerformed

    private void editAccountDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAccountDetailsActionPerformed
        nameField.setEnabled(true);
        nameField.setBackground(new Color(255,255,255));
        
        genderComboBox.setEnabled(true);
        genderComboBox.setBackground(new Color(255,255,255));
        
        addressTextArea.setEnabled(true);
        addressTextArea.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_editAccountDetailsActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        int choice = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to change your password?", "Confirm Choice", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            String confirmPassword = JOptionPane.showInputDialog(rootPane, "Enter your password", "Confirm Password", JOptionPane.YES_NO_OPTION);
            if (confirmPassword.equals(Session.getPassword())) {
                passwordField.setEnabled(true);
                passwordField.setBackground(new Color(255,255,255));
            }
        }
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void backClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backClickableMouseClicked
        home.setLocation(this.getFrameLocation());
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backClickableMouseClicked

    private void exitClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitClickableMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitClickableMouseClicked

    private void changeEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEmailButtonActionPerformed
        int choice = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to change your Email address?", 
                "Confirm Choice", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            emailField.setEnabled(true);
            emailField.setBackground(new Color(255,255,255));
        }
    }//GEN-LAST:event_changeEmailButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        home.setLocation(this.getFrameLocation());
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        Connection conn = DatabaseConnectivity.connectDatabase();
        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String query = "update accounts set name = '" + nameField.getText() 
                        + "', gender = '" + genderComboBox.getSelectedItem() 
                        + "', address = '" + addressTextArea.getText() 
                        + "' where username = '" + usernameField.getText() + "';";
                int updateCount = stmt.executeUpdate(query);
                if (updateCount != 0) {
                    JOptionPane.showMessageDialog(rootPane, "Profile updated successfully!", 
                            "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                    // traversing to Home page
                    home.setLocation(this.getFrameLocation());
                    home.setVisible(true);
                    this.dispose();
                    
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Failed to update profile. Please try again.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void addDragListeners() {
        
        titlePanel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                posX = evt.getX();
                posY = evt.getY();
            }
        });

        titlePanel.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent evt) {
                // Get the current position of the mouse
                int newX = evt.getXOnScreen();
                int newY = evt.getYOnScreen();

                // Set the frame's location to its current location plus the new
                // position of the mouse minus the position of the mouse when it was pressed
                setLocation(newX - posX, newY - posY);
            }
        });
    }
    
    public Point getFrameLocation() {
        return this.getLocation();
    }
    
    public static void main(String args[]) {
        
        // setting FlatLaf Light theme
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize FlatLaf");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountDetailsPanel1;
    private javax.swing.JPanel accountDetailsPanel2;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JLabel backClickable;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgColorPanel;
    private javax.swing.JButton changeEmailButton;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JButton deleteAccountButton;
    private javax.swing.JButton editAccountDetails;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel exitClickable;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordField;
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
