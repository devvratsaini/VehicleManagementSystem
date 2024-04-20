package main;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import utils.DatabaseConnectivity;
import utils.Session;

public class CarDetails extends javax.swing.JFrame {

    private int posX, posY;
    private Home home;
    String carModel;
    
    public CarDetails() {
        initComponents();
        addDragListeners();
    }
    
    public CarDetails(Home home, String carModel) {
        initComponents();
        addDragListeners();
        this.home = home;
        this.carModel = carModel;
        this.setLocation(home.getFrameLocation());
        initFields();
        initImage();
    }

    private void initImage() {
        
        // setting the car preview image
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/resources/cars/" + carModel + ".png"));
        Image logoImage = logoIcon.getImage();
        Image logoScaledimage = logoImage.getScaledInstance(carPreview.getWidth(), carPreview.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon logoScaledIcon = new ImageIcon(logoScaledimage);
        carPreview.setIcon(logoScaledIcon);
        
        // setting the manufacturer logo image
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/resources/logos/" + manufacturerField.getText() + ".png"));
        Image image2 = icon2.getImage();
        Image scaledImage2 = image2.getScaledInstance(manufacturerLogo.getWidth(), manufacturerLogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
        manufacturerLogo.setIcon(scaledIcon2);
    }
    
    private void initFields() {
        
        Connection conn = DatabaseConnectivity.connectDatabase();
        
        // verifying if connection was successful
        if (conn != null) {
            
            try (Statement stmt = conn.createStatement()) {
                String query = "select manufacturer, cartype, transmission, price from cars where model = '" + carModel + "';";
                ResultSet rs = stmt.executeQuery(query);
                
                // checking if a record was found
                while(rs.next()) {
                    
                    // initializing fields
                    modelField.setText(carModel);
                    manufacturerField.setText(rs.getString(1));
                    carTypeField.setText(rs.getString(2));
                    transmissionField.setText(rs.getString(3));
                    priceField.setText(rs.getString(4));
                }
                
                // closing unused objects
                rs.close();
                stmt.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "An error occurred: " + e.getMessage(), "Unknown Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                DatabaseConnectivity.closeConnection(conn);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        carDetailsTitle = new javax.swing.JLabel();
        backClickable = new javax.swing.JLabel();
        exitClickable = new javax.swing.JLabel();
        carDetailsPanel = new javax.swing.JPanel();
        manufacturerLogo = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        modelField = new javax.swing.JTextField();
        manufacturerLabel = new javax.swing.JLabel();
        carTypeLabel = new javax.swing.JLabel();
        transmissionLabel = new javax.swing.JLabel();
        manufacturerField = new javax.swing.JTextField();
        carTypeField = new javax.swing.JTextField();
        transmissionField = new javax.swing.JTextField();
        addToCartButton = new javax.swing.JButton();
        priceLabel = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        carPreviewPanel = new javax.swing.JPanel();
        carPreview = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        bg.setBackground(new java.awt.Color(186, 168, 151));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titlePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        carDetailsTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        carDetailsTitle.setText("CAR DETAILS");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(carDetailsTitle)
                .addGap(293, 293, 293)
                .addComponent(exitClickable)
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carDetailsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitClickable)
                    .addComponent(backClickable))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        carDetailsPanel.setBackground(new java.awt.Color(186, 168, 151));

        modelLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        modelLabel.setForeground(new java.awt.Color(255, 255, 255));
        modelLabel.setText("Model");

        modelField.setEditable(false);
        modelField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modelField.setFocusable(false);

        manufacturerLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        manufacturerLabel.setForeground(new java.awt.Color(255, 255, 255));
        manufacturerLabel.setText("Manufacturer");

        carTypeLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        carTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        carTypeLabel.setText("Car Type");

        transmissionLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        transmissionLabel.setForeground(new java.awt.Color(255, 255, 255));
        transmissionLabel.setText("Transmission");

        manufacturerField.setEditable(false);
        manufacturerField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manufacturerField.setFocusable(false);

        carTypeField.setEditable(false);
        carTypeField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        carTypeField.setFocusable(false);

        transmissionField.setEditable(false);
        transmissionField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transmissionField.setFocusable(false);

        javax.swing.GroupLayout carDetailsPanelLayout = new javax.swing.GroupLayout(carDetailsPanel);
        carDetailsPanel.setLayout(carDetailsPanelLayout);
        carDetailsPanelLayout.setHorizontalGroup(
            carDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(carDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carDetailsPanelLayout.createSequentialGroup()
                        .addGroup(carDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelLabel)
                            .addComponent(modelField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manufacturerLabel)
                            .addComponent(carTypeLabel)
                            .addComponent(transmissionLabel)
                            .addComponent(manufacturerField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transmissionField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carDetailsPanelLayout.createSequentialGroup()
                        .addComponent(manufacturerLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        carDetailsPanelLayout.setVerticalGroup(
            carDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carDetailsPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(manufacturerLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modelLabel)
                .addGap(0, 0, 0)
                .addComponent(modelField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manufacturerLabel)
                .addGap(0, 0, 0)
                .addComponent(manufacturerField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(carTypeLabel)
                .addGap(0, 0, 0)
                .addComponent(carTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(transmissionLabel)
                .addGap(0, 0, 0)
                .addComponent(transmissionField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        manufacturerLogo.setSize(200, 90);

        addToCartButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addToCartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Cart.png"))); // NOI18N
        addToCartButton.setText("ADD TO CART");
        addToCartButton.setFocusPainted(false);
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });

        priceLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 255, 255));
        priceLabel.setText("Price");

        priceField.setEditable(false);
        priceField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        priceField.setFocusable(false);

        carPreviewPanel.setBackground(new java.awt.Color(163, 146, 130));
        carPreviewPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout carPreviewPanelLayout = new javax.swing.GroupLayout(carPreviewPanel);
        carPreviewPanel.setLayout(carPreviewPanelLayout);
        carPreviewPanelLayout.setHorizontalGroup(
            carPreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carPreviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carPreview, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );
        carPreviewPanelLayout.setVerticalGroup(
            carPreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carPreviewPanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(carPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        carPreview.setSize(500, 330);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(carDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(priceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(addToCartButton)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carPreviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(carPreviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLabel)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addComponent(carDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitClickableMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitClickableMouseClicked

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        boolean isAdded = Session.addCar(carModel);
        
        // checking if car was added successfully
        if (isAdded) {
            JOptionPane.showMessageDialog(rootPane, "Car added to Cart successfully!", 
                                "Success", JOptionPane.INFORMATION_MESSAGE);
            
            // traversing to Home page
            home.setLocation(getFrameLocation());
            home.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Cart item limit reached! You may only order upto 4 cars in a session.", 
                                "Limit Reached", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addToCartButtonActionPerformed

    private void backClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backClickableMouseClicked
        home.setLocation(this.getFrameLocation());
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backClickableMouseClicked

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
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize FlatLaf");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CarDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JLabel backClickable;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel carDetailsPanel;
    private javax.swing.JLabel carDetailsTitle;
    private javax.swing.JLabel carPreview;
    private javax.swing.JPanel carPreviewPanel;
    private javax.swing.JTextField carTypeField;
    private javax.swing.JLabel carTypeLabel;
    private javax.swing.JLabel exitClickable;
    private javax.swing.JTextField manufacturerField;
    private javax.swing.JLabel manufacturerLabel;
    private javax.swing.JLabel manufacturerLogo;
    private javax.swing.JTextField modelField;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField transmissionField;
    private javax.swing.JLabel transmissionLabel;
    // End of variables declaration//GEN-END:variables
}
