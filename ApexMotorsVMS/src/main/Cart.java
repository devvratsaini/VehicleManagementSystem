package main;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import utils.DatabaseConnectivity;
import utils.Session;

public class Cart extends javax.swing.JFrame {

    private int posX, posY;
    private Home home;
    
    public Cart() {
        initComponents();
        addDragListeners();
    }

    public Cart(Home home) {
        initComponents();
        this.home = home;
        this.setLocation(home.getFrameLocation());
        addDragListeners();
        initCart();
    }
    
    private void initCart(){
        
        Connection conn = DatabaseConnectivity.connectDatabase();
        
        // verifying connection was successful
        if (conn != null) {
            
            try (Statement stmt = conn.createStatement()) {
                
                String query = "";
                ResultSet rs;
                int totalPrice = 0;
                
                /* initializing N fields for N cars in cart,
                   where cart can have a max. of 4 cars in a session */
                switch (Session.getCarCount()) {
                    
                    case 4:
                        removeIcon4.setEnabled(true);
                        modelLabel4.setText(Session.getCarModel(3));
                        query = "select price from cars where model = '" + Session.getCarModel(3) + "';";
                        rs = stmt.executeQuery(query);
                        while (rs.next()) {
                            priceLabel4.setText(rs.getString(1));
                            totalPrice += Integer.parseInt(rs.getString(1));
                        }
                    
                    case 3:
                        removeIcon3.setEnabled(true);
                        modelLabel3.setText(Session.getCarModel(2));
                        query = "select price from cars where model = '" + Session.getCarModel(2) + "';";
                        rs = stmt.executeQuery(query);
                        while (rs.next()) {
                            priceLabel3.setText(rs.getString(1));
                            totalPrice += Integer.parseInt(rs.getString(1));
                        }
                    
                    case 2:
                        removeIcon2.setEnabled(true);
                        modelLabel2.setText(Session.getCarModel(1));
                        query = "select price from cars where model = '" + Session.getCarModel(1) + "';";
                        rs = stmt.executeQuery(query);
                        while (rs.next()) {
                            priceLabel2.setText(rs.getString(1));
                            totalPrice += Integer.parseInt(rs.getString(1));
                        }
                    
                    case 1:
                        removeIcon1.setEnabled(true);
                        modelLabel1.setText(Session.getCarModel(0));
                        query = "select price from cars where model = '" + Session.getCarModel(0) + "';";
                        rs = stmt.executeQuery(query);
                        while (rs.next()) {
                            priceLabel1.setText(rs.getString(1));
                            totalPrice += Integer.parseInt(rs.getString(1));
                        }
                        break;
                }
                
                totalPriceValue.setText(String.valueOf(totalPrice));
                carCountValue.setText(String.valueOf(Session.getCarCount()));
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "An error occurred: " + e.getMessage(), "Unknown Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    // method to reset cart details
    public void resetCart() {
        
        modelLabel1.setText("");
        modelLabel2.setText("");
        modelLabel3.setText("");
        modelLabel4.setText("");
        
        priceLabel1.setText("");
        priceLabel2.setText("");
        priceLabel3.setText("");
        priceLabel4.setText("");
        
        removeIcon1.setEnabled(false);
        removeIcon2.setEnabled(false);
        removeIcon3.setEnabled(false);
        removeIcon4.setEnabled(false);
        
        totalPriceValue.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        cartTitle = new javax.swing.JLabel();
        backClickable = new javax.swing.JLabel();
        exitClickable = new javax.swing.JLabel();
        modelPanel = new javax.swing.JPanel();
        modelTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        modelLabel1 = new javax.swing.JLabel();
        modelLabel2 = new javax.swing.JLabel();
        modelLabel3 = new javax.swing.JLabel();
        modelLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        carCountValue = new javax.swing.JLabel();
        carCountLabel = new javax.swing.JLabel();
        pricePanel = new javax.swing.JPanel();
        priceTitle = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        totalPriceLabel = new javax.swing.JLabel();
        totalPriceValue = new javax.swing.JLabel();
        priceLabel1 = new javax.swing.JLabel();
        priceLabel2 = new javax.swing.JLabel();
        priceLabel3 = new javax.swing.JLabel();
        priceLabel4 = new javax.swing.JLabel();
        removeIcon2 = new javax.swing.JLabel();
        removeIcon1 = new javax.swing.JLabel();
        removeIcon3 = new javax.swing.JLabel();
        removeIcon4 = new javax.swing.JLabel();
        placeOrderButton = new javax.swing.JButton();
        apexMotorsLogo = new javax.swing.JLabel();
        printIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        bg.setBackground(new java.awt.Color(255, 207, 207));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titlePanel.setBackground(new java.awt.Color(255, 255, 255));
        titlePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        cartTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cartTitle.setText("CART");

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
                .addGap(337, 337, 337)
                .addComponent(cartTitle)
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
                    .addComponent(cartTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backClickable))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        modelPanel.setBackground(new java.awt.Color(255, 255, 255));
        modelPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        modelTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        modelTitle.setText("Model");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        modelLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        modelLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        modelLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        modelLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        modelLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        modelLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        modelLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        modelLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));

        carCountValue.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        carCountLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        carCountLabel.setText("CAR COUNT :");

        javax.swing.GroupLayout modelPanelLayout = new javax.swing.GroupLayout(modelPanel);
        modelPanel.setLayout(modelPanelLayout);
        modelPanelLayout.setHorizontalGroup(
            modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modelPanelLayout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())
                    .addGroup(modelPanelLayout.createSequentialGroup()
                        .addGroup(modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modelPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(modelTitle)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modelPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modelLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(modelPanelLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(carCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carCountValue, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 120, Short.MAX_VALUE))))
        );
        modelPanelLayout.setVerticalGroup(
            modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modelLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modelLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modelLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modelLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carCountValue, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pricePanel.setBackground(new java.awt.Color(255, 255, 255));
        pricePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        priceTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        priceTitle.setText("Price");

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));

        totalPriceLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        totalPriceLabel.setText("TOTAL :   Rs");

        totalPriceValue.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        priceLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        priceLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        priceLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        priceLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        priceLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        priceLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        priceLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        priceLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        removeIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Remove.png"))); // NOI18N
        removeIcon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeIcon2.setEnabled(false);
        removeIcon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeIcon2MouseClicked(evt);
            }
        });

        removeIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Remove.png"))); // NOI18N
        removeIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeIcon1.setEnabled(false);
        removeIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeIcon1MouseClicked(evt);
            }
        });

        removeIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Remove.png"))); // NOI18N
        removeIcon3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeIcon3.setEnabled(false);
        removeIcon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeIcon3MouseClicked(evt);
            }
        });

        removeIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Remove.png"))); // NOI18N
        removeIcon4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeIcon4.setEnabled(false);
        removeIcon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeIcon4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pricePanelLayout = new javax.swing.GroupLayout(pricePanel);
        pricePanel.setLayout(pricePanelLayout);
        pricePanelLayout.setHorizontalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pricePanelLayout.createSequentialGroup()
                .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pricePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pricePanelLayout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeIcon2)
                            .addComponent(removeIcon1)
                            .addComponent(removeIcon3)
                            .addComponent(removeIcon4))
                        .addGap(25, 25, 25))
                    .addGroup(pricePanelLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(priceTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pricePanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(totalPriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalPriceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pricePanelLayout.setVerticalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pricePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(priceTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(priceLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeIcon1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pricePanelLayout.createSequentialGroup()
                        .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(priceLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeIcon2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(priceLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(removeIcon3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeIcon4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPriceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        placeOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        placeOrderButton.setText("PLACE ORDER");
        placeOrderButton.setFocusPainted(false);
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        apexMotorsLogo.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        apexMotorsLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/BigCar.png"))); // NOI18N
        apexMotorsLogo.setText("APEX MOTORS");
        apexMotorsLogo.setToolTipText("");

        printIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Print.png"))); // NOI18N
        printIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printIcon.setEnabled(false);
        printIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pricePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(apexMotorsLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(printIcon)
                .addGap(35, 35, 35))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pricePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apexMotorsLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(printIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );

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

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        
        // verifying cart is not empty and user is signed in
        if (Session.getCarCount() != 0 && Session.isUserSignedIn()) {

            // confirming order placement from user
            int choice = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to place this order?",
                    "Confirm Choice", JOptionPane.YES_NO_OPTION);
            if (choice == 0) {
                Connection conn = DatabaseConnectivity.connectDatabase();

                // verifying connection was made successfully
                if (conn != null) {

                    int accountId = Session.getAccountId();
                    ArrayList<String> carList = Session.getCarList();
                    String odate = String.valueOf(java.time.LocalDate.now());

                    String query = "INSERT INTO orders(accountid, model, odate) VALUES (?, ?, ?)";
                    try (PreparedStatement pstmt = conn.prepareStatement(query)) {

                        pstmt.setInt(1, accountId);
                        pstmt.setString(3, odate);

                        for (int i = 0; i < carList.size(); i++) {
                            pstmt.setString(2, carList.get(i));
                            int rowsUpdated = pstmt.executeUpdate();

                            if (rowsUpdated > 0) {
                                JOptionPane.showMessageDialog(rootPane,
                                        "Order placed successfully!\nYou can now print the receipt using the print icon.",
                                        "Success", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(rootPane, "SQL Error: " + e.getMessage(),
                                "Database Error", JOptionPane.ERROR_MESSAGE);
                    }

                    printIcon.setEnabled(rootPaneCheckingEnabled);    
                }
            }
        } else if (!Session.isUserSignedIn()) {
            JOptionPane.showMessageDialog(rootPane, "You must Sign In to place an order!", 
                    "Account Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Cart is empty!", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void removeIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeIcon1MouseClicked
        // removes 1st car from the cart
        if (removeIcon1.isEnabled()) {
            int choice = JOptionPane.showConfirmDialog(rootPane, 
                    "Are you sure you want to remove this car from your cart?", 
                    "Confirm Choice", JOptionPane.YES_NO_OPTION);
            
            if (choice == 0) {
                Session.removeCar(0);
                JOptionPane.showMessageDialog(rootPane, "Item removed successfully!", 
                        "Success", JOptionPane.INFORMATION_MESSAGE);
                resetCart();
                initCart();
            }
        }
    }//GEN-LAST:event_removeIcon1MouseClicked

    private void removeIcon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeIcon2MouseClicked
        // removes 2nd car from the cart
        if (removeIcon2.isEnabled()) {
            int choice = JOptionPane.showConfirmDialog(rootPane, 
                    "Are you sure you want to remove this car from your cart?", 
                    "Confirm Choice", JOptionPane.YES_NO_OPTION);
            
            if (choice == 0) {
                Session.removeCar(1);
                JOptionPane.showMessageDialog(rootPane, "Item removed successfully!", 
                        "Success", JOptionPane.INFORMATION_MESSAGE);
                resetCart();
                initCart();
            }
        }
    }//GEN-LAST:event_removeIcon2MouseClicked

    private void removeIcon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeIcon3MouseClicked
        // removes 3rd car from the cart
        if (removeIcon3.isEnabled()) {
            int choice = JOptionPane.showConfirmDialog(rootPane, 
                    "Are you sure you want to remove this car from your cart?", 
                    "Confirm Choice", JOptionPane.YES_NO_OPTION);
            
            if (choice == 0) {
                Session.removeCar(2);
                JOptionPane.showMessageDialog(rootPane, "Item removed successfully!", 
                        "Success", JOptionPane.INFORMATION_MESSAGE);
                resetCart();
                initCart();
            }
        }
    }//GEN-LAST:event_removeIcon3MouseClicked

    private void removeIcon4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeIcon4MouseClicked
        // removes 4th car from the cart
        if (removeIcon4.isEnabled()) {
            int choice = JOptionPane.showConfirmDialog(rootPane, 
                    "Are you sure you want to remove this car from your cart?", 
                    "Confirm Choice", JOptionPane.YES_NO_OPTION);
            
            if (choice == 0) {
                Session.removeCar(3);
                JOptionPane.showMessageDialog(rootPane, "Item removed successfully!", 
                        "Success", JOptionPane.INFORMATION_MESSAGE);
                resetCart();
                initCart();
            }
        }
    }//GEN-LAST:event_removeIcon4MouseClicked

    private void printIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printIconMouseClicked
        if (printIcon.isEnabled()) {
            Bill bill = new Bill(this);
            bill.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_printIconMouseClicked

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
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apexMotorsLogo;
    private javax.swing.JLabel backClickable;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel carCountLabel;
    private javax.swing.JLabel carCountValue;
    private javax.swing.JLabel cartTitle;
    private javax.swing.JLabel exitClickable;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel modelLabel1;
    private javax.swing.JLabel modelLabel2;
    private javax.swing.JLabel modelLabel3;
    private javax.swing.JLabel modelLabel4;
    private javax.swing.JPanel modelPanel;
    private javax.swing.JLabel modelTitle;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JLabel priceLabel1;
    private javax.swing.JLabel priceLabel2;
    private javax.swing.JLabel priceLabel3;
    private javax.swing.JLabel priceLabel4;
    private javax.swing.JPanel pricePanel;
    private javax.swing.JLabel priceTitle;
    private javax.swing.JLabel printIcon;
    private javax.swing.JLabel removeIcon1;
    private javax.swing.JLabel removeIcon2;
    private javax.swing.JLabel removeIcon3;
    private javax.swing.JLabel removeIcon4;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JLabel totalPriceValue;
    // End of variables declaration//GEN-END:variables
}
