package main;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import utils.DatabaseConnectivity;
import utils.Session;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.UnsupportedLookAndFeelException;

public class SignIn extends javax.swing.JFrame {

    private int posX, posY;
    private Home home;
    
    public SignIn() {
        initComponents();
        initImages();
        addDragListeners();
    }
    
    public SignIn(Home home) {
        initComponents();
        initImages();
        addDragListeners();
        this.home = home;
        this.setLocation(home.getFrameLocation());
    }
    
    private void initImages() {
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/resources/bg_images/Sign In.png"));
        Image logoImage = logoIcon.getImage();
        Image logoScaledimage = logoImage.getScaledInstance(signInLogo.getWidth(), signInLogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon logoScaledIcon = new ImageIcon(logoScaledimage);
        signInLogo.setIcon(logoScaledIcon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        signInTitle = new javax.swing.JLabel();
        backClickable = new javax.swing.JLabel();
        exitClickable = new javax.swing.JLabel();
        signInPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        signInButton = new javax.swing.JButton();
        forgotPasswordClickable = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        signUpClickable = new javax.swing.JLabel();
        signInLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        bg.setBackground(new java.awt.Color(165, 208, 211));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titlePanel.setBackground(new java.awt.Color(255, 255, 255));
        titlePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        signInTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signInTitle.setText("SIGN IN");

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
                .addGap(324, 324, 324)
                .addComponent(signInTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                .addComponent(exitClickable)
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitClickable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backClickable)
                    .addComponent(signInTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernameLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passwordLabel.setText("Password");

        signInButton.setText("Sign In");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        forgotPasswordClickable.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        forgotPasswordClickable.setForeground(new java.awt.Color(168, 52, 47));
        forgotPasswordClickable.setText("<html><u>Forgot Password</u></html>");
        forgotPasswordClickable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPasswordClickable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordClickableMouseClicked(evt);
            }
        });

        signUpClickable.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        signUpClickable.setForeground(new java.awt.Color(168, 52, 47));
        signUpClickable.setText("<html><u>Don't have an Account? Sign Up Here</u></html>");
        signUpClickable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpClickable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpClickableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout signInPanelLayout = new javax.swing.GroupLayout(signInPanel);
        signInPanel.setLayout(signInPanelLayout);
        signInPanelLayout.setHorizontalGroup(
            signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInPanelLayout.createSequentialGroup()
                .addGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signInPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel)
                            .addComponent(usernameField)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                    .addGroup(signInPanelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(forgotPasswordClickable))
                    .addGroup(signInPanelLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(signInButton))
                    .addGroup(signInPanelLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(signUpClickable)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        signInPanelLayout.setVerticalGroup(
            signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInPanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(signInButton)
                .addGap(18, 18, 18)
                .addComponent(forgotPasswordClickable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signUpClickable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(signInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signInLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(signInLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        signInLogo.setSize(368, 368);

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backClickableMouseClicked
        home.setLocation(this.getFrameLocation());
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backClickableMouseClicked

    private void exitClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitClickableMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitClickableMouseClicked

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        
        Connection conn = DatabaseConnectivity.connectDatabase();
        
        // verifying connection was successful
        if (conn != null) {
            
            try (Statement stmt = conn.createStatement()) {
                
                String username = usernameField.getText();
                if (username.length() != 0) {
                    String userpass = String.valueOf(passwordField.getPassword());
                    String query = "select password from accounts where username = '" + username + "';";

                    ResultSet rs = stmt.executeQuery(query);

                    // checking if a record was found
                    while (rs.next()) {

                        // verifying entered password is correct
                        if(userpass.equals(rs.getString(1))) {

                            // fetching accountid and email from database
                            String accountId = "";
                            String email = "";

                            query = "select accountid, email from accounts where username = '" + username + "';";
                            rs = stmt.executeQuery(query);

                            while (rs.next()) {
                                accountId = rs.getString(1);
                                email = rs.getString(2);
                            }

                            // setting session details
                            Session.setSignIn(accountId, username, userpass, email);

                            // showing Sign-in success message
                            JOptionPane.showMessageDialog(rootPane, "Logged in successful",
                                    "Success", JOptionPane.INFORMATION_MESSAGE);

                            // traversing to home page and disposing this page
                            home.setLocation(this.getFrameLocation());
                            home.changeToSignedIn();
                            home.setVisible(true);
                            this.dispose();
                        }
                    }

                    // checking if user was logged in or not
                    if(!utils.Session.isUserSignedIn()) {
                        JOptionPane.showMessageDialog(rootPane, 
                                "Failed to Login. Please check your username and/or password.",
                                "Input Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Username cannot be empty!", 
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                }
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, "SQL Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "An error occurred: " + e.getMessage(), "Unknown Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_signInButtonActionPerformed

    private void forgotPasswordClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordClickableMouseClicked
        ForgotPassword forgotPassword = new ForgotPassword(this);
        forgotPassword.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_forgotPasswordClickableMouseClicked

    private void signUpClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpClickableMouseClicked
        SignUp signUp = new SignUp(home);
        signUp.setLocation(this.getFrameLocation());
        signUp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signUpClickableMouseClicked

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
        } catch (UnsupportedLookAndFeelException e) {
            System.err.println("Failed to initialize FlatLaf");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backClickable;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel exitClickable;
    private javax.swing.JLabel forgotPasswordClickable;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton signInButton;
    private javax.swing.JLabel signInLogo;
    private javax.swing.JPanel signInPanel;
    private javax.swing.JLabel signInTitle;
    private javax.swing.JLabel signUpClickable;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
