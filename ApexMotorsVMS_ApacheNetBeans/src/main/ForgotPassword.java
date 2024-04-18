package main;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import utils.DatabaseConnectivity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ForgotPassword extends javax.swing.JFrame {

    private int posX, posY;
    String foundUsername;
    private SignIn signIn;
    
    public ForgotPassword() {
        initComponents();
        initImages();
        addDragListeners();
        this.hide1.setVisible(false);
        this.hide2.setVisible(false);
        
    }
    
    public ForgotPassword(SignIn signIn) {
        initComponents();
        initImages();
        this.signIn = signIn;
        this.setLocation(signIn.getFrameLocation());
        addDragListeners();
    }
    
    private void initImages() {
        ImageIcon logoIcon3 = new ImageIcon(getClass().getResource("/resources/bg_images/ForgotPassword1.png"));
        Image logoImage3 = logoIcon3.getImage();
        Image logoScaledimage3 = logoImage3.getScaledInstance(forgotPasswordLogo1.getWidth(), forgotPasswordLogo1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon logoScaledIcon3 = new ImageIcon(logoScaledimage3);
        forgotPasswordLogo1.setIcon(logoScaledIcon3);
        
        ImageIcon logoIcon2 = new ImageIcon(getClass().getResource("/resources/bg_images/ForgotPassword2.png"));
        Image logoImage2 = logoIcon2.getImage();
        Image logoScaledimage2 = logoImage2.getScaledInstance(forgotPasswordLogo2.getWidth(), forgotPasswordLogo2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon logoScaledIcon2 = new ImageIcon(logoScaledimage2);
        forgotPasswordLogo2.setIcon(logoScaledIcon2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        forgotPasswordTitle = new javax.swing.JLabel();
        exitClickable = new javax.swing.JLabel();
        backClickable = new javax.swing.JLabel();
        verifyPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        verifyButton = new javax.swing.JButton();
        emailField = new javax.swing.JTextField();
        forgotPasswordLogo1 = new javax.swing.JLabel();
        savePanel = new javax.swing.JPanel();
        newPasswordLabel = new javax.swing.JLabel();
        confPassLabel = new javax.swing.JLabel();
        confPassField = new javax.swing.JPasswordField();
        saveButton = new javax.swing.JButton();
        hide1 = new javax.swing.JLabel();
        hide2 = new javax.swing.JLabel();
        newPasswordField = new javax.swing.JPasswordField();
        forgotPasswordLogo2 = new javax.swing.JLabel();
        show2 = new javax.swing.JLabel();
        show1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        bg.setBackground(new java.awt.Color(255, 225, 199));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titlePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        titlePanel.setPreferredSize(new java.awt.Dimension(800, 50));

        forgotPasswordTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        forgotPasswordTitle.setText("FORGOT PASSWORD");

        exitClickable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Close Window.png"))); // NOI18N
        exitClickable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitClickable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitClickableMouseClicked(evt);
            }
        });

        backClickable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/back.png"))); // NOI18N
        backClickable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backClickable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backClickableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backClickable)
                .addGap(251, 251, 251)
                .addComponent(forgotPasswordTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(exitClickable)
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backClickable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitClickable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(forgotPasswordTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        verifyPanel.setBackground(new java.awt.Color(255, 225, 199));
        verifyPanel.setPreferredSize(new java.awt.Dimension(395, 450));

        usernameLabel.setText("Username");

        emailLabel.setText("Email");

        verifyButton.setText("Verify");
        verifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout verifyPanelLayout = new javax.swing.GroupLayout(verifyPanel);
        verifyPanel.setLayout(verifyPanelLayout);
        verifyPanelLayout.setHorizontalGroup(
            verifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verifyPanelLayout.createSequentialGroup()
                .addGroup(verifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(verifyPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(verifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel)
                            .addComponent(usernameLabel)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(verifyPanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(verifyButton))
                    .addGroup(verifyPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(forgotPasswordLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        verifyPanelLayout.setVerticalGroup(
            verifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verifyPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(verifyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(forgotPasswordLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        forgotPasswordLogo1.setSize(180, 126);

        savePanel.setBackground(new java.awt.Color(255, 240, 227));
        savePanel.setPreferredSize(new java.awt.Dimension(395, 450));

        newPasswordLabel.setText("New Password");
        newPasswordLabel.setEnabled(false);

        confPassLabel.setText("Confirm New Password");
        confPassLabel.setEnabled(false);

        confPassField.setEnabled(false);

        saveButton.setText("Save");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        hide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Hidden.png"))); // NOI18N
        hide1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hide1.setEnabled(false);
        hide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide1MousePressed(evt);
            }
        });

        hide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Hidden.png"))); // NOI18N
        hide2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hide2.setEnabled(false);
        hide2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide2MousePressed(evt);
            }
        });

        newPasswordField.setEnabled(false);

        show2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Shown.png"))); // NOI18N
        show2.setEnabled(false);
        show2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show2MousePressed(evt);
            }
        });

        show1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Shown.png"))); // NOI18N
        show1.setEnabled(false);
        show1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout savePanelLayout = new javax.swing.GroupLayout(savePanel);
        savePanel.setLayout(savePanelLayout);
        savePanelLayout.setHorizontalGroup(
            savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(savePanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confPassLabel)
                    .addComponent(newPasswordLabel)
                    .addGroup(savePanelLayout.createSequentialGroup()
                        .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hide1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(show1))
                    .addGroup(savePanelLayout.createSequentialGroup()
                        .addComponent(confPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hide2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(show2))
                    .addGroup(savePanelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(saveButton)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, savePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(forgotPasswordLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        savePanelLayout.setVerticalGroup(
            savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(savePanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(newPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(show1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(hide1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confPassLabel)
                .addGap(18, 18, 18)
                .addGroup(savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(savePanelLayout.createSequentialGroup()
                        .addGroup(savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hide2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(forgotPasswordLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(savePanelLayout.createSequentialGroup()
                        .addComponent(show2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        forgotPasswordLogo2.setSize(180, 126);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(verifyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(savePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(verifyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)))
        );

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyButtonActionPerformed
        Connection conn = DatabaseConnectivity.connectDatabase();
        if (conn != null) {
            try {
                String username = usernameField.getText();
                String email = emailField.getText();
                String query = "SELECT username FROM accounts WHERE username = ? AND email = ?";

                try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                    pstmt.setString(1, username);
                    pstmt.setString(2, email);

                    ResultSet rs = pstmt.executeQuery();

                    if (rs.next()) {
                        // storing username for resetting password
                        foundUsername = rs.getString("username");
                        
                        // enabling options to reset password
                        newPasswordLabel.setEnabled(true);
                        newPasswordField.setEnabled(true);
                        show1.setEnabled(true);
                        confPassLabel.setEnabled(true);
                        confPassField.setEnabled(true);
                        show2.setEnabled(true);
                        saveButton.setEnabled(true);
                        
                        // disabling verification details
                        usernameLabel.setEnabled(false);
                        usernameField.setEnabled(false);
                        emailLabel.setEnabled(false);
                        emailField.setEnabled(false);
                        verifyButton.setEnabled(false);
                        
                        // visual changes
                        verifyPanel.setBackground(savePanel.getBackground());
                        savePanel.setBackground(bg.getBackground());
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Invalid username and/or email!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_verifyButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        Connection conn = DatabaseConnectivity.connectDatabase();
        if (conn != null) {
            try {
                String newPass = String.valueOf(newPasswordField.getPassword());
                String confPass = String.valueOf(confPassField.getPassword());
                if (newPass.equals(confPass)) {
                    // SQL statement to update password
                    String query = "UPDATE accounts SET password = ? WHERE username = ?";
                    try (PreparedStatement statement = conn.prepareStatement(query)) {
                        // Set parameters
                        statement.setString(1, newPass);
                        statement.setString(2, foundUsername); // Using the passed username

                        // Execute the statement
                        int rowsUpdated = statement.executeUpdate();
                        if (rowsUpdated > 0) {
                            JOptionPane.showMessageDialog(rootPane, "Password updated successfully.", 
                                    "Success", JOptionPane.INFORMATION_MESSAGE);
                            signIn.setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(rootPane, 
                                    "Failed to update password.", 
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Passwords do not match!", "Password Mismatch", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void exitClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitClickableMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitClickableMouseClicked

    private void backClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backClickableMouseClicked
        signIn.setLocation(this.getFrameLocation());
        signIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backClickableMouseClicked

    private void hide1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide1MousePressed
         show1.setVisible(true);
        hide1.setVisible(false);
        newPasswordField.setEchoChar('\u2022');
    }//GEN-LAST:event_hide1MousePressed

    private void show1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show1MousePressed
        
        show1.setVisible(false);
        hide1.setVisible(true);
        newPasswordField.setEchoChar((char)0);
    }//GEN-LAST:event_show1MousePressed

    private void hide2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide2MousePressed
        show2.setVisible(true);
        hide2.setVisible(false);
        confPassField.setEchoChar('\u2022');
    }//GEN-LAST:event_hide2MousePressed

    private void show2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show2MousePressed
        show2.setVisible(false);
        hide2.setVisible(true);
        confPassField.setEchoChar((char)0);
    }//GEN-LAST:event_show2MousePressed

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

                // Set the frame's location to its current location plus the new position of the mouse minus the position of the mouse when it was pressed
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
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backClickable;
    private javax.swing.JPanel bg;
    private javax.swing.JPasswordField confPassField;
    private javax.swing.JLabel confPassLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel exitClickable;
    private javax.swing.JLabel forgotPasswordLogo1;
    private javax.swing.JLabel forgotPasswordLogo2;
    private javax.swing.JLabel forgotPasswordTitle;
    private javax.swing.JLabel hide1;
    private javax.swing.JLabel hide2;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel savePanel;
    private javax.swing.JLabel show1;
    private javax.swing.JLabel show2;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton verifyButton;
    private javax.swing.JPanel verifyPanel;
    // End of variables declaration//GEN-END:variables
}
