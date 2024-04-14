package main;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import utils.DatabaseConnectivity;
import utils.Session;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import utils.AccountValidationUtils;

public class SignInUp extends javax.swing.JFrame {
    
    private Home home;
    int posX, posY;
    
    public SignInUp() {
        initComponents();
        addDragListeners();
    }
    
    public SignInUp(Home home) {
        initComponents();
        this.home = home;
        this.setLocation(home.getFrameLocation());
        addDragListeners();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        signInPanel = new javax.swing.JPanel();
        signInTitlePanel = new javax.swing.JPanel();
        signInDetailsPanel = new javax.swing.JPanel();
        usernameSignInLabel = new javax.swing.JLabel();
        usernameSignInField = new javax.swing.JTextField();
        passwordSignInLabel = new javax.swing.JLabel();
        passwordSignInField = new javax.swing.JPasswordField();
        signInButton = new javax.swing.JButton();
        forgotPasswordClickable = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        exitClickable = new javax.swing.JLabel();
        backClickable = new javax.swing.JLabel();
        signInTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        bg.setBackground(new java.awt.Color(232, 232, 232));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        signInPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        signInTitlePanel.setPreferredSize(new java.awt.Dimension(400, 100));

        javax.swing.GroupLayout signInTitlePanelLayout = new javax.swing.GroupLayout(signInTitlePanel);
        signInTitlePanel.setLayout(signInTitlePanelLayout);
        signInTitlePanelLayout.setHorizontalGroup(
            signInTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        signInTitlePanelLayout.setVerticalGroup(
            signInTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
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

        titlePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

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

        signInTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signInTitle.setText("SIGN IN");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backClickable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                .addComponent(signInTitle)
                .addGap(316, 316, 316)
                .addComponent(exitClickable)
                .addGap(11, 11, 11))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titlePanelLayout.createSequentialGroup()
                        .addComponent(exitClickable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(7, Short.MAX_VALUE))
                    .addGroup(titlePanelLayout.createSequentialGroup()
                        .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signInTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backClickable))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(signInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(signInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
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
                        Session.setUsername(username);
                        Session.setPassword(userpass);
                        
                        // traversing to home page and disposing this page
                        home.setLocation(this.getFrameLocation());
                        home.changeToSignedIn();
                        home.setVisible(true);
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

    private void exitClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitClickableMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitClickableMouseClicked

    private void backClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backClickableMouseClicked
        home.setLocation(this.getFrameLocation());
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backClickableMouseClicked

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
                new SignInUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backClickable;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel exitClickable;
    private javax.swing.JLabel forgotPasswordClickable;
    private javax.swing.JPasswordField passwordSignInField;
    private javax.swing.JLabel passwordSignInLabel;
    private javax.swing.JButton signInButton;
    private javax.swing.JPanel signInDetailsPanel;
    private javax.swing.JPanel signInPanel;
    private javax.swing.JLabel signInTitle;
    private javax.swing.JPanel signInTitlePanel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField usernameSignInField;
    private javax.swing.JLabel usernameSignInLabel;
    // End of variables declaration//GEN-END:variables
}
