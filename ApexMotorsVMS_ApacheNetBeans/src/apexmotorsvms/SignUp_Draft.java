package apexmotorsvms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SignUp_Draft extends javax.swing.JFrame {

    public SignUp_Draft() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUpHeading = new javax.swing.JLabel();
        accountTypeLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        enterPasswordLabel = new javax.swing.JLabel();
        accountTypeComboBox = new javax.swing.JComboBox<>();
        usernameField = new javax.swing.JTextField();
        enterPasswordField = new javax.swing.JPasswordField();
        reenterPasswordLabel = new javax.swing.JLabel();
        reenterPasswordField = new javax.swing.JPasswordField();
        signUpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signUpHeading.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        signUpHeading.setText("Sign Up");

        accountTypeLabel.setText("Account Type");

        usernameLabel.setText("User Name");

        enterPasswordLabel.setText("Enter Password");

        accountTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Admin", "Dealer", "Manufacturer", "Supplier" }));
        accountTypeComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        usernameField.setToolTipText("Enter your username here");
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(accountTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(enterPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reenterPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(reenterPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountTypeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(signUpButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(signUpHeading)))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signUpHeading)
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
                .addGap(39, 39, 39)
                .addComponent(signUpButton)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DatabaseCredentials.getUrl(),
            DatabaseCredentials.getUname(), DatabaseCredentials.getPass());
            System.out.println("Connection successfully established");
            Statement stmt = conn.createStatement();
            String accountType = String.valueOf(accountTypeComboBox.getSelectedItem());
            String username = usernameField.getText();
            String userpass1 = String.valueOf(enterPasswordField.getPassword());
            String userpass2 = String.valueOf(reenterPasswordField.getPassword());
            // TODO: verify userpass1 and userpass2 match, if not then handle it
            
            String query = "insert into accounts (accounttype, username, password) values ('" + accountType + "', '" + username + "', '" + userpass1 + "');";
            // TODO: verify password is valid n strong
            
            stmt.executeUpdate(query);
            System.out.println("Values inserted successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        
    }//GEN-LAST:event_usernameFieldActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SignUp_Draft signUpDraft = new SignUp_Draft();
                signUpDraft.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accountTypeComboBox;
    private javax.swing.JLabel accountTypeLabel;
    private javax.swing.JPasswordField enterPasswordField;
    private javax.swing.JLabel enterPasswordLabel;
    private javax.swing.JPasswordField reenterPasswordField;
    private javax.swing.JLabel reenterPasswordLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel signUpHeading;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
