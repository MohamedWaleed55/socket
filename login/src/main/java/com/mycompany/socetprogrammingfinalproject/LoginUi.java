
package com.mycompany.socetprogrammingfinalproject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import static javax.swing.GroupLayout.*;

public class LoginUi extends javax.swing.JFrame {
    public LoginUi() {
        initComponents();
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(60, 63, 65));
        jPanel1.setForeground(new java.awt.Color(187, 187, 187));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(187, 187, 187));
        jLabel1.setText("UserName");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(187, 187, 187));
        jLabel2.setText("Password");

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(60, 63, 65));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(60, 63, 65));

        jButton1.setBackground(new java.awt.Color(75, 110, 175));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
                                        .addComponent(jLabel3, DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
                                                        .addComponent(jLabel1, DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, DEFAULT_SIZE, DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
                                                        .addComponent(jTextField1)
                                                        .addComponent(jTextField2, DEFAULT_SIZE, 207, Short.MAX_VALUE))))
                                .addContainerGap(50, Short.MAX_VALUE))
                        .addGroup( jPanel1Layout.createSequentialGroup()
                                .addContainerGap(DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(154, 154, 154))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3, PREFERRED_SIZE, 30, PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                .addComponent(jTextField1, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jTextField2, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(30, 30, 30))
);


        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(jLabel1, PREFERRED_SIZE, 31, PREFERRED_SIZE)
                                        .addComponent(jTextField1, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(jLabel2, PREFERRED_SIZE, 33, PREFERRED_SIZE)
                                        .addComponent(jTextField2, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(jButton1)
                                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                        .addComponent(jPanel1, DEFAULT_SIZE, DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                        .addComponent(jPanel1, DEFAULT_SIZE, DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null); // Center the window on the screen
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String username = jTextField1.getText();
        String password = new String(jTextField2.getPassword());

        try (Socket soc = new Socket("localhost", 9806);
             DataOutputStream out = new DataOutputStream(soc.getOutputStream());
             DataInputStream in = new DataInputStream(soc.getInputStream())) {

            System.out.println("Connected to the server");
            System.out.println(username + "5" + password);

            // Send data to the server
            out.writeUTF(username + " " + password);

            // Receive response from the server
            String Rdata = in.readUTF();
            System.out.println("Received data gui: " + Rdata);

            if ("1".equals(Rdata)) {
                System.out.println("You have successfully logged in");
                jLabel3.setText("You have successfully logged in");
            } else {
                System.out.println("Invalid username or password");
                jLabel3.setText("Invalid username or password");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            jLabel3.setText("Invalid username or password");
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new LoginUi().setVisible(true));
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField jTextField2;
}
