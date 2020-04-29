
package GUI;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RegisterGUI extends javax.swing.JFrame {
    private carpoolapp.CarPoolDB cpdb;

    public RegisterGUI() {
        initComponents();
        pass1XLbl.setVisible(false);
        pass2XLbl.setVisible(false);
        emailXLbl.setVisible(false);
        passWarnLbl.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerPnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        usernameLbl = new javax.swing.JLabel();
        emailTf = new javax.swing.JTextField();
        password1Lbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        emailLbl = new javax.swing.JLabel();
        dobLbl = new javax.swing.JLabel();
        dayTf = new javax.swing.JTextField();
        monthTf = new javax.swing.JTextField();
        yearTf = new javax.swing.JTextField();
        genderTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        emailXLbl = new javax.swing.JLabel();
        pass2XLbl = new javax.swing.JLabel();
        pass1XLbl = new javax.swing.JLabel();
        password1Tf = new javax.swing.JPasswordField();
        password2Tf = new javax.swing.JPasswordField();
        bioLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bioTa = new javax.swing.JTextArea();
        passWarnLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 400, 660));
        setMaximumSize(new java.awt.Dimension(400, 660));
        setMinimumSize(new java.awt.Dimension(400, 660));
        setSize(new java.awt.Dimension(400, 660));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 660));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 660));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 660));

        headerPnl.setBackground(new java.awt.Color(179, 255, 179));
        headerPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        headerPnl.setMaximumSize(new java.awt.Dimension(400, 100));
        headerPnl.setMinimumSize(new java.awt.Dimension(400, 100));
        headerPnl.setPreferredSize(new java.awt.Dimension(400, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/carduill.png"))); // NOI18N

        javax.swing.GroupLayout headerPnlLayout = new javax.swing.GroupLayout(headerPnl);
        headerPnl.setLayout(headerPnlLayout);
        headerPnlLayout.setHorizontalGroup(
            headerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPnlLayout.setVerticalGroup(
            headerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );

        usernameLbl.setText("NAME");

        emailTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTfActionPerformed(evt);
            }
        });

        password1Lbl.setText("PASSWORD");

        loginBtn.setBackground(new java.awt.Color(0, 153, 204));
        loginBtn.setText("LOGIN");
        loginBtn.setMaximumSize(new java.awt.Dimension(69, 30));
        loginBtn.setMinimumSize(new java.awt.Dimension(69, 30));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        registerBtn.setBackground(new java.awt.Color(0, 153, 204));
        registerBtn.setText("REGISTER");
        registerBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        registerBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        emailLbl.setText("EMAIL");

        dobLbl.setText("Date of birth");

        jLabel1.setText("Gender");

        emailXLbl.setForeground(new java.awt.Color(255, 0, 0));
        emailXLbl.setText("X");

        pass2XLbl.setForeground(new java.awt.Color(255, 0, 0));
        pass2XLbl.setText("X");

        pass1XLbl.setForeground(new java.awt.Color(255, 0, 0));
        pass1XLbl.setText("X");

        bioLbl.setText("Bio");

        bioTa.setColumns(20);
        bioTa.setRows(5);
        jScrollPane1.setViewportView(bioTa);

        passWarnLbl.setForeground(new java.awt.Color(176, 1, 1));
        passWarnLbl.setText("Password must be over 6 characters");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password1Lbl)
                    .addComponent(usernameLbl)
                    .addComponent(emailLbl)
                    .addComponent(dobLbl)
                    .addComponent(jLabel1)
                    .addComponent(bioLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passWarnLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameTf, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(emailTf, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(genderTf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(dayTf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(monthTf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(yearTf, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(password1Tf)
                                .addComponent(password2Tf, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailXLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pass1XLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pass2XLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(passWarnLbl)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLbl))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailXLbl)
                    .addComponent(emailLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass1XLbl)
                    .addComponent(password1Tf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password1Lbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass2XLbl)
                    .addComponent(password2Tf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bioLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        passWarnLbl.setVisible(false);
        cpdb = new carpoolapp.CarPoolDB();
        String pass1 = password1Tf.getText();
        String pass2 = password2Tf.getText();
        String email = emailTf.getText();
        String name = nameTf.getText();
        String dateOfBirth = dayTf.getText() + "-" + monthTf.getText() + "-" + yearTf.getText();
        String registrationDate = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
        String bio = bioTa.getText();
        String gender = genderTf.getText();
        String avatar = "none";

        boolean passPassed = false;
        boolean emailPassed = false;

        // Password verification & validation
        if(!pass1.equals(pass2)) {
            pass1XLbl.setVisible(true);
            pass2XLbl.setVisible(true);
            passPassed = false;
        } else if(pass1.length() < 6) {
            passWarnLbl.setVisible(true);
        } else {
            pass1XLbl.setVisible(false);
            pass2XLbl.setVisible(false);
            passPassed = true;
        }

        if(email.indexOf("@") == -1 || email.indexOf(".") == -1) {
            emailXLbl.setVisible(true);
            emailPassed = false;
        } else {
            emailXLbl.setVisible(false);
            emailPassed = true;
        }

        if(passPassed && emailPassed && nameTf.getText().length() > 0) {
            main.Users u;
            main.Passenger p;
            u = new main.Users(name, email, pass2, dateOfBirth, gender, avatar, bio, registrationDate, 0, 0);
            p = new main.Passenger();
            cpdb.addUser(u);
            u = cpdb.getUser(email, pass2);
            p.setUserID(u.getUserID());
            cpdb.addPassenger(p);
            loginScreen();
        }

    }//GEN-LAST:event_registerBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        loginScreen();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void emailTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTfActionPerformed

    private void loginScreen(){
        //switch to the Login screen
        GUI.LoginGUI l = new GUI.LoginGUI();

        // Get the size of the active window
        int sizeH = this.getSize().height;
        int sizeW = this.getSize().width;

        // Get the location of the active window
        int currX = this.getLocation().x;
        int currY = this.getLocation().y;

        // Set the size of the new window
        l.setSize(sizeW, sizeH);

        // Set the location of the new window
        l.setLocation(currX, currY);

        // Hide the active window, show the new window
        this.dispose();
        
        // make it visible
        l.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bioLbl;
    private javax.swing.JTextArea bioTa;
    private javax.swing.JTextField dayTf;
    private javax.swing.JLabel dobLbl;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTf;
    private javax.swing.JLabel emailXLbl;
    private javax.swing.JTextField genderTf;
    private javax.swing.JPanel headerPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField monthTf;
    private javax.swing.JTextField nameTf;
    private javax.swing.JLabel pass1XLbl;
    private javax.swing.JLabel pass2XLbl;
    private javax.swing.JLabel passWarnLbl;
    private javax.swing.JLabel password1Lbl;
    private javax.swing.JPasswordField password1Tf;
    private javax.swing.JPasswordField password2Tf;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField yearTf;
    // End of variables declaration//GEN-END:variables
}
