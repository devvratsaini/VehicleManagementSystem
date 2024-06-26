package main;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import utils.AccountValidationUtils;
import utils.DatabaseConnectivity;

public class SignUp extends javax.swing.JFrame {

    private int posX, posY;
    private Home home;
    
    public SignUp() {
        initComponents();
        initImages();
        addDragListeners();
    }
    
    public SignUp(Home home){
        initComponents();
        initImages();
        addDragListeners();
        this.home = home;
    }
    
    private void initImages() {
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/resources/bg_images/Sign Up.png"));
        Image logoImage = logoIcon.getImage();
        Image logoScaledimage = logoImage.getScaledInstance(signUpLogo.getWidth(), signUpLogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon logoScaledIcon = new ImageIcon(logoScaledimage);
        signUpLogo.setIcon(logoScaledIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        signUpTitle = new javax.swing.JLabel();
        exitClickable = new javax.swing.JLabel();
        backClickable = new javax.swing.JLabel();
        signUpPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        confPassLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        signUpButton = new javax.swing.JButton();
        signInClickable = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        confPassField = new javax.swing.JPasswordField();
        signUpLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        bg.setBackground(new java.awt.Color(240, 230, 221));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titlePanel.setBackground(new java.awt.Color(255, 255, 255));
        titlePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        signUpTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signUpTitle.setText("SIGN UP");

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
                .addGap(322, 322, 322)
                .addComponent(signUpTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addComponent(exitClickable)
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backClickable)
                    .addComponent(exitClickable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        signUpPanel.setBackground(new java.awt.Color(191, 158, 115));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name");

        genderLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender");

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        addressLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Address");

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");

        confPassLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        confPassLabel.setText("Confirm Password");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");

        signUpButton.setText("Sign Up");
        signUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        signInClickable.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        signInClickable.setText("<html><u>Already have an account? Sign In Here<u></html>");
        signInClickable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInClickable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInClickableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout signUpPanelLayout = new javax.swing.GroupLayout(signUpPanel);
        signUpPanel.setLayout(signUpPanelLayout);
        signUpPanelLayout.setHorizontalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailLabel)
                    .addComponent(confPassLabel)
                    .addComponent(passwordLabel)
                    .addComponent(usernameLabel)
                    .addComponent(addressLabel)
                    .addComponent(genderLabel)
                    .addComponent(nameLabel)
                    .addComponent(nameField)
                    .addComponent(genderComboBox, 0, 250, Short.MAX_VALUE)
                    .addComponent(addressField)
                    .addComponent(usernameField)
                    .addComponent(emailField)
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(signUpButton))
                    .addComponent(passwordField)
                    .addComponent(confPassField))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(signInClickable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        signUpPanelLayout.setVerticalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(nameLabel)
                .addGap(0, 0, 0)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderLabel)
                .addGap(0, 0, 0)
                .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressLabel)
                .addGap(0, 0, 0)
                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel)
                .addGap(0, 0, 0)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLabel)
                .addGap(0, 0, 0)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confPassLabel)
                .addGap(0, 0, 0)
                .addComponent(confPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel)
                .addGap(0, 0, 0)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signUpButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signInClickable)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signUpLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(signUpLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 157, Short.MAX_VALUE))))
        );

        signUpLogo.setSize(368, 153);

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitClickableMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitClickableMouseClicked

    private void backClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backClickableMouseClicked
        home.setLocation(this.getFrameLocation());
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backClickableMouseClicked

    private void signInClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInClickableMouseClicked
        SignIn signIn = new SignIn(home);
        signIn.setLocation(this.getFrameLocation());
        signIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signInClickableMouseClicked

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        
        Connection conn = DatabaseConnectivity.connectDatabase();
        
        // verifying connection was successful
        if (conn != null) {
            
            try {
                Statement stmt = conn.createStatement();
                
                String name = nameField.getText();
                
                // verifying name is not empty
                if (name.length() != 0) {
                    String gender = String.valueOf(genderComboBox.getSelectedItem());
                    String address = addressField.getText();
                    
                    // verifying address is not empty
                    if (address.length()!=0) {
                        String username = usernameField.getText();
                        String query = "select username from accounts where username = '" + username + "';";
                        ResultSet rs = stmt.executeQuery(query);
                        
                        // checking if a record was found
                        if (!rs.next()) {
                            String password = String.valueOf(passwordField.getPassword());
                            
                            // verifying password is valid
                            if (utils.AccountValidationUtils.isPasswordValid(password)) {
                                String confPass = String.valueOf(confPassField.getPassword());
                                
                                // verifying both passwords are equal
                                if (password.equals(confPass)) {
                                    String email = emailField.getText();
                                    
                                    // verifying email is valid
                                    if (AccountValidationUtils.isEmailValid(email)) {
                                        query = "insert into accounts(name, gender, address, username, password, email) values "
                                                + "('" + name + "', '" + gender + "', '" + address + "', '" + username + "', '" + password + "', '" + email + "');";

                                        stmt.executeUpdate(query);
                                        
                                        JOptionPane.showMessageDialog(rootPane, "Account created successfully!", 
                                                "Success", JOptionPane.INFORMATION_MESSAGE);

                                        // redirecting to SignIn page
                                        SignIn signIn = new SignIn(home);
                                        signIn.setLocation(this.getFrameLocation());
                                        signIn.setVisible(true);
                                        this.dispose();
                                    } else {
                                        JOptionPane.showMessageDialog(rootPane, "Email is invalid.", 
                                            "Input Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "Passwords are not equal.", 
                                            "Input Error", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(rootPane, """
                                                                        Password must be 8 characters long and must contain
                                                                        - 1 capital letter
                                                                        - 1 small letter
                                                                        - 1 special character
                                                                        - 1 number.""", 
                                        "Input Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Username is already taken, try a different username.", 
                                    "Unvailable", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Address cannot be empty.", 
                                    "Input Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                        JOptionPane.showMessageDialog(rootPane, "Name cannot be empty.", 
                                    "Input Error", JOptionPane.ERROR_MESSAGE);
                    }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, "SQL Error: " + e.getMessage(),
                        "Database Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "An error occurred: " + e.getMessage(),
                        "Unknown Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        DatabaseConnectivity.closeConnection(conn);
    }//GEN-LAST:event_signUpButtonActionPerformed

    // method to add window draggind functionality
    private void addDragListeners() {
        titlePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                posX = evt.getX();
                posY = evt.getY();
            }
        });

        titlePanel.addMouseMotionListener(new MouseAdapter() {
            @Override
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
        } catch (UnsupportedLookAndFeelException e) {
            System.err.println("Failed to initialize FlatLaf");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel backClickable;
    private javax.swing.JPanel bg;
    private javax.swing.JPasswordField confPassField;
    private javax.swing.JLabel confPassLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel exitClickable;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel signInClickable;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel signUpLogo;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JLabel signUpTitle;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
