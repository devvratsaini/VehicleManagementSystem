package apexmotorsvms;

import javax.swing.JOptionPane;

public class EditProfile extends javax.swing.JFrame {

    public EditProfile() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userProfilePicture = new javax.swing.JLabel();
        editProfileHeading = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        acountTypeLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        annualIncomeField = new javax.swing.JTextField();
        accountTypeLabel = new javax.swing.JLabel();
        editNameButton = new javax.swing.JButton();
        editUsernameButton = new javax.swing.JButton();
        editGenderButton = new javax.swing.JButton();
        editAddressButton = new javax.swing.JButton();
        changeAccountTypeButton = new javax.swing.JButton();
        editAnnualIncomeButton = new javax.swing.JButton();
        verticalSeparator = new javax.swing.JSeparator();
        passwordLabel = new javax.swing.JLabel();
        customerIdLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        customerIdField = new javax.swing.JTextField();
        changePasswordButton = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();
        accountTypeComboBox = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userProfilePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apexmotorsvms/resources/profilePicture.png"))); // NOI18N

        editProfileHeading.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        editProfileHeading.setText("Edit Profile");

        nameLabel.setText("Name");

        genderLabel.setText("Gender");

        addressLabel.setText("Address");

        acountTypeLabel.setText("Account Type");

        usernameLabel.setText("Username");

        nameField.setEnabled(false);

        usernameField.setEnabled(false);

        genderField.setEnabled(false);

        addressField.setEnabled(false);

        annualIncomeField.setEnabled(false);

        accountTypeLabel.setText("Annual Income");

        editNameButton.setText("Edit");
        editNameButton.setFocusPainted(false);
        editNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNameButtonActionPerformed(evt);
            }
        });

        editUsernameButton.setText("Edit");
        editUsernameButton.setFocusPainted(false);
        editUsernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUsernameButtonActionPerformed(evt);
            }
        });

        editGenderButton.setText("Edit");
        editGenderButton.setFocusPainted(false);
        editGenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editGenderButtonActionPerformed(evt);
            }
        });

        editAddressButton.setText("Edit");
        editAddressButton.setFocusPainted(false);
        editAddressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAddressButtonActionPerformed(evt);
            }
        });

        changeAccountTypeButton.setText("Change");
        changeAccountTypeButton.setFocusPainted(false);
        changeAccountTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeAccountTypeButtonActionPerformed(evt);
            }
        });

        editAnnualIncomeButton.setText("Edit");
        editAnnualIncomeButton.setFocusPainted(false);
        editAnnualIncomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAnnualIncomeButtonActionPerformed(evt);
            }
        });

        verticalSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        passwordLabel.setText("Password");

        customerIdLabel.setText("Customer ID");

        passwordField.setEnabled(false);

        customerIdField.setEditable(false);
        customerIdField.setToolTipText("Cannot edit. This is only for reference.");
        customerIdField.setEnabled(false);
        customerIdField.setFocusable(false);
        customerIdField.setRequestFocusEnabled(false);
        customerIdField.setVerifyInputWhenFocusTarget(false);
        customerIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIdFieldActionPerformed(evt);
            }
        });

        changePasswordButton.setText("Change");
        changePasswordButton.setFocusPainted(false);
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });

        warningLabel.setText("<html><i>The below options need special attention before editing.<br>Unwanted changes may have undesirable outcomes.<br>Please contact support in case you need help.</i></html>");

        accountTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Admin", "Dealer", "Manufacturer", "Supplier" }));
        accountTypeComboBox.setEnabled(false);

        saveButton.setText("Save");
        saveButton.setFocusPainted(false);

        resetButton.setText("Reset");
        resetButton.setFocusPainted(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apexmotorsvms/resources/caution.png"))); // NOI18N
        jButton1.setText("Delete Account");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apexmotorsvms/resources/caution.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genderLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(accountTypeLabel))
                    .addComponent(userProfilePicture))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameField)
                            .addComponent(usernameField)
                            .addComponent(genderField)
                            .addComponent(addressField)
                            .addComponent(annualIncomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editNameButton)
                            .addComponent(editAddressButton)
                            .addComponent(editAnnualIncomeButton)
                            .addComponent(editUsernameButton)
                            .addComponent(editGenderButton))
                        .addGap(45, 45, 45)
                        .addComponent(verticalSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(acountTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(accountTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(12, 12, 12))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(saveButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(changePasswordButton)
                                            .addComponent(changeAccountTypeButton)
                                            .addComponent(resetButton))))
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(editProfileHeading)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(editProfileHeading)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userProfilePicture)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel)
                            .addComponent(changePasswordButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(changeAccountTypeButton)
                            .addComponent(acountTypeLabel)
                            .addComponent(accountTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerIdLabel)))
                    .addComponent(verticalSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editNameButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel)
                            .addComponent(editUsernameButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderLabel)
                            .addComponent(editGenderButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel)
                            .addComponent(editAddressButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(annualIncomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountTypeLabel)
                            .addComponent(editAnnualIncomeButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(resetButton))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        annualIncomeField.setEnabled(true);
    }//GEN-LAST:event_editAnnualIncomeButtonActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        int choice = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to change your password?", "Confirm Password Change", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            passwordField.setEnabled(true);
        }
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void changeAccountTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeAccountTypeButtonActionPerformed
        accountTypeComboBox.setEnabled(true);
    }//GEN-LAST:event_changeAccountTypeButtonActionPerformed

    private void customerIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIdFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int choice = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete your account? This cannot be undone.", "Confirm Account Deletion", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            // ask for username and password again to verify and confirm
            apexmotorsvms.utils.DatabaseConnectivity.connectDatabase();
            try {
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accountTypeComboBox;
    private javax.swing.JLabel accountTypeLabel;
    private javax.swing.JLabel acountTypeLabel;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField annualIncomeField;
    private javax.swing.JButton changeAccountTypeButton;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JTextField customerIdField;
    private javax.swing.JLabel customerIdLabel;
    private javax.swing.JButton editAddressButton;
    private javax.swing.JButton editAnnualIncomeButton;
    private javax.swing.JButton editGenderButton;
    private javax.swing.JButton editNameButton;
    private javax.swing.JLabel editProfileHeading;
    private javax.swing.JButton editUsernameButton;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel userProfilePicture;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JSeparator verticalSeparator;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
