package apexmotorsvms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main_Draft1 extends javax.swing.JFrame {

    public Main_Draft1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        apexMotorsVmsLabel = new javax.swing.JLabel();
        signInClickableLabel = new javax.swing.JLabel();
        signUpClickableLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        apexMotorsVmsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        apexMotorsVmsLabel.setText("ApexMotorsVMS");

        signInClickableLabel.setForeground(new java.awt.Color(51, 102, 255));
        signInClickableLabel.setText("Sign In");
        signInClickableLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInClickableLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInClickableLabelMouseClicked(evt);
            }
        });

        signUpClickableLabel.setForeground(new java.awt.Color(51, 102, 255));
        signUpClickableLabel.setText("Sign Up");
        signUpClickableLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpClickableLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpClickableLabelMouseClicked(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addComponent(apexMotorsVmsLabel)
                .addGap(243, 243, 243)
                .addComponent(signInClickableLabel)
                .addGap(18, 18, 18)
                .addComponent(signUpClickableLabel)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apexMotorsVmsLabel)
                    .addComponent(signInClickableLabel)
                    .addComponent(signUpClickableLabel))
                .addContainerGap(446, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signInClickableLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInClickableLabelMouseClicked
        SignIn_Draft login = new SignIn_Draft();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signInClickableLabelMouseClicked

    private void signUpClickableLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpClickableLabelMouseClicked
        SignUp_Draft signup = new SignUp_Draft();
        signup.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signUpClickableLabelMouseClicked

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Draft1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Draft1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Draft1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Draft1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main_Draft1 mainDraft = new Main_Draft1();
                mainDraft.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apexMotorsVmsLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel signInClickableLabel;
    private javax.swing.JLabel signUpClickableLabel;
    // End of variables declaration//GEN-END:variables
}
