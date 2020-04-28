package GUI;

public class ViewTripGUI extends javax.swing.JFrame {

    private main.Users u;
    private carpoolapp.CarPoolDB cpdb;

    /**
     * Creates new form LoginGUI
     */

    public ViewTripGUI() {
        initComponents();
    }
    
    public ViewTripGUI(main.Users user, main.Trip trip, String userT) {
        initComponents();
        u = user;

        nameLbl.setText(u.getUsername());
        cancelTBtn.setVisible(false);
        cancelBBtn.setVisible(false);
        resultsPanel.setVisible(true);
       
        String userType = userT;
        //cpdb = new carpoolapp.CarPoolDB();
        
        main.Trip t = trip;
        
        
        deptTf.setText(t.getDepartureAddress() + ", " + t.getDepartureDateAndTime());
        arrTf.setText(t.getArrivalAddress() + ", " + t.getArrivalDateAndTime());
        priceTf.setText(Double.toString(t.getPricePerSeat()));
        seatsTf.setText(Integer.toString(t.getSeatsAvailable()));
        String luggage = new String();
        String smoking = new String();
        String pets = new String();
        String chatty = new String();
        String music = new String();
        if (t.isLuggageAllowed()) {
            luggage = "luggage";
        } else {
            luggage = "no luggage";
        }
        if (t.isSmokingAllowed()) {
            smoking = "smoking";
        } else {
            smoking = "no smoking";
        }
        if (t.isPetAllowed()) {
            pets = "pets";
        } else {
            pets = "no pets";
        }
        if (t.isChattyDriver()) {
            chatty = "chatter";
        } else {
            chatty = "not much chatter";
        }
        if (t.isMusicLover()) {
            music = "music";
        } else {
            music = "no music";
        }
        preferencesTf.setText(luggage + ", " + smoking + ", " + pets + ", " + chatty + ", " + music);
        
      
        
        if (userType.equals("Driver")) {
            
            cancelTBtn.setVisible(true);

        } else {

            cancelBBtn.setVisible(true);
        }

    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerPnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        cancelTBtn = new javax.swing.JButton();
        cancelBBtn = new javax.swing.JButton();
        warningLbl = new javax.swing.JLabel();
        resultsPanel = new javax.swing.JPanel();
        deptLbl = new javax.swing.JLabel();
        arrLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        prefLbl = new javax.swing.JLabel();
        seatsLbl = new javax.swing.JLabel();
        deptTf = new javax.swing.JTextField();
        arrTf = new javax.swing.JTextField();
        priceTf = new javax.swing.JTextField();
        seatsTf = new javax.swing.JTextField();
        preferencesTf = new javax.swing.JTextField();
        homeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 640));
        setMinimumSize(new java.awt.Dimension(400, 640));
        setSize(new java.awt.Dimension(400, 640));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 640));

        headerPnl.setBackground(new java.awt.Color(179, 255, 179));
        headerPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        headerPnl.setMaximumSize(new java.awt.Dimension(400, 100));
        headerPnl.setMinimumSize(new java.awt.Dimension(400, 100));
        headerPnl.setPreferredSize(new java.awt.Dimension(400, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/carduill.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(254, 154));

        javax.swing.GroupLayout headerPnlLayout = new javax.swing.GroupLayout(headerPnl);
        headerPnl.setLayout(headerPnlLayout);
        headerPnlLayout.setHorizontalGroup(
            headerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPnlLayout.setVerticalGroup(
            headerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );

        nameLbl.setMaximumSize(new java.awt.Dimension(400, 400));

        logoutBtn.setBackground(new java.awt.Color(0, 153, 204));
        logoutBtn.setForeground(new java.awt.Color(254, 254, 254));
        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        cancelTBtn.setText("CANCEL");
        cancelTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTBtnActionPerformed(evt);
            }
        });

        cancelBBtn.setText("CANCEL");
        cancelBBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBBtnActionPerformed(evt);
            }
        });

        deptLbl.setText("Departure");

        arrLbl.setText("Arrival");

        priceLbl.setText("Price per seat");

        prefLbl.setText("Allowed");

        seatsLbl.setText("Seats Available");

        javax.swing.GroupLayout resultsPanelLayout = new javax.swing.GroupLayout(resultsPanel);
        resultsPanel.setLayout(resultsPanelLayout);
        resultsPanelLayout.setHorizontalGroup(
            resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(preferencesTf)
                    .addComponent(deptLbl, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arrLbl, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prefLbl, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, resultsPanelLayout.createSequentialGroup()
                        .addGroup(resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceLbl)
                            .addComponent(priceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seatsLbl)
                            .addComponent(seatsTf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(deptTf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(arrTf, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resultsPanelLayout.setVerticalGroup(
            resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deptLbl)
                .addGap(3, 3, 3)
                .addComponent(deptTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arrLbl)
                .addGap(1, 1, 1)
                .addComponent(arrTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLbl)
                    .addComponent(seatsLbl))
                .addGap(2, 2, 2)
                .addGroup(resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatsTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prefLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preferencesTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        homeBtn.setBackground(new java.awt.Color(0, 153, 204));
        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addGap(135, 135, 135)
                .addComponent(homeBtn)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(cancelBBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(warningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(homeBtn)))
                .addGap(35, 35, 35)
                .addComponent(resultsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelTBtn)
                    .addComponent(cancelBBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(warningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addContainerGap())
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

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
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
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void cancelBBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBBtnActionPerformed

       /*     
            resultsPanel.setVisible(false);
            warningLbl.setText("Booking cancelled.");
            cancelBBtn.setVisible(false);
         */

    }//GEN-LAST:event_cancelBBtnActionPerformed

    private void cancelTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelTBtnActionPerformed

        cpdb = new carpoolapp.CarPoolDB();
        int tripId = 18;
        main.Trip t = cpdb.getTripById(tripId);        
        
        
        
            cpdb.cancelTrip(t);
            cancelTBtn.setVisible(false);
            resultsPanel.setVisible(false);
            warningLbl.setText("Trip deleted.");
            
            

    }//GEN-LAST:event_cancelTBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        
         //switch to the Home screen
        GUI.UserHomeGUI uh = new GUI.UserHomeGUI(u);

        // Get the size of the active window
        int sizeH = this.getSize().height;
        int sizeW = this.getSize().width;

        // Get the location of the active window
        int currX = this.getLocation().x;
        int currY = this.getLocation().y;

        // Set the size of the new window
        uh.setSize(sizeW, sizeH);

        // Set the location of the new window
        uh.setLocation(currX, currY);

        // Hide the active window, show the new window
        this.dispose();

        // make it visible
        uh.setVisible(true);
        
        
    }//GEN-LAST:event_homeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewTripGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTripGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTripGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTripGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTripGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrLbl;
    private javax.swing.JTextField arrTf;
    private javax.swing.JButton cancelBBtn;
    private javax.swing.JButton cancelTBtn;
    private javax.swing.JLabel deptLbl;
    private javax.swing.JTextField deptTf;
    private javax.swing.JPanel headerPnl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel prefLbl;
    private javax.swing.JTextField preferencesTf;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JTextField priceTf;
    private javax.swing.JPanel resultsPanel;
    private javax.swing.JLabel seatsLbl;
    private javax.swing.JTextField seatsTf;
    private javax.swing.JLabel warningLbl;
    // End of variables declaration//GEN-END:variables
}
