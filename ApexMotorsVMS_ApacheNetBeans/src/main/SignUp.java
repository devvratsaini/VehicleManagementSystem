package main;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import utils.AccountValidationUtils;

public class SignUp extends javax.swing.JFrame {

    private int posX, posY;
    private Home home;
    
    public SignUp() {
        initComponents();
        initImages();
        addDragListeners();
    }
    
    public SignUp(Home home) {
        initComponents();
        initImages();
        addDragListeners();
        this.home = home;
        this.setLocation(home.getFrameLocation());
    }

    private void initImages() {
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/resources/bg_images/mcqueen.png"));
        Image logoImage = logoIcon.getImage();
        Image logoScaledimage = logoImage.getScaledInstance(mcqueenImage.getWidth(), mcqueenImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon logoScaledIcon = new ImageIcon(logoScaledimage);
        mcqueenImage.setIcon(logoScaledIcon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        signUpTitle = new javax.swing.JLabel();
        exitClickable = new javax.swing.JLabel();
        backClickable = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        nameLabel1 = new javax.swing.JLabel();
        nameLabel2 = new javax.swing.JLabel();
        nameField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        mcqueenImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        bg.setBackground(new java.awt.Color(232, 232, 232));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backClickable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signUpTitle)
                .addGap(321, 321, 321)
                .addComponent(exitClickable)
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backClickable)
                    .addComponent(exitClickable)
                    .addComponent(signUpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

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

        nameLabel.setText("Name");

        nameLabel1.setText("Gender");

        nameLabel2.setText("Address");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(72, 25));

        javax.swing.GroupLayout SignUpDetailsPanelLayout = new javax.swing.GroupLayout(SignUpDetailsPanel);
        SignUpDetailsPanel.setLayout(SignUpDetailsPanelLayout);
        SignUpDetailsPanelLayout.setHorizontalGroup(
            SignUpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpDetailsPanelLayout.createSequentialGroup()
                .addGroup(SignUpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignUpDetailsPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(SignUpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameLabel2)
                            .addComponent(nameField2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(nameLabel1)
                            .addComponent(confPassSignUpLabel)
                            .addComponent(confPassSignUpField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(passwordSignUpLabel)
                            .addComponent(usernameSignUpLabel)
                            .addComponent(emailSignUpField)
                            .addComponent(passwordSignUpField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(usernameSignUpField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(emailSignUpLabel)
                            .addComponent(nameLabel)
                            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(SignUpDetailsPanelLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(signUpButton)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        SignUpDetailsPanelLayout.setVerticalGroup(
            SignUpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameSignUpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordSignUpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confPassSignUpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confPassSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailSignUpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(signUpButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(SignUpDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(SignUpDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(mcqueenImage, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(mcqueenImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        mcqueenImage.setSize(260, 200);

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
                    if (utils.AccountValidationUtils.isPasswordValid(password)) {
                        String confPass = String.valueOf(confPassSignUpField.getPassword());

                        if (password.equals(confPass)) {
                            String email = emailSignUpField.getText();
                            if (AccountValidationUtils.isEmailValid(email)) {
//                                query = "insert into accounts (name, gender, address, username, password, email) values ('" +  + "'")";

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
                        JOptionPane.showMessageDialog(rootPane,
                            "Password must contain\n- 1 capital letter\n- 1 small letter\n- 1 special character\n- 1 number.",
                            "Weak Password", JOptionPane.ERROR_MESSAGE);
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
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SignUpDetailsPanel;
    private javax.swing.JLabel backClickable;
    private javax.swing.JPanel bg;
    private javax.swing.JPasswordField confPassSignUpField;
    private javax.swing.JLabel confPassSignUpLabel;
    private javax.swing.JTextField emailSignUpField;
    private javax.swing.JLabel emailSignUpLabel;
    private javax.swing.JLabel exitClickable;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mcqueenImage;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nameField2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JPasswordField passwordSignUpField;
    private javax.swing.JLabel passwordSignUpLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel signUpTitle;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField usernameSignUpField;
    private javax.swing.JLabel usernameSignUpLabel;
    // End of variables declaration//GEN-END:variables
}
