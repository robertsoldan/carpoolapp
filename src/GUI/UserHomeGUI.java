
package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserHomeGUI extends javax.swing.JFrame {
    // Instantiating the later used array lists and objects
    private main.Users u;
    ArrayList<main.Bookings> b = new ArrayList<>();
    ArrayList<main.Trip> dt = new ArrayList<>();
    ArrayList<main.Trip> bt = new ArrayList<>();
    carpoolapp.CarPoolDB cpdb = new carpoolapp.CarPoolDB();   
    main.Driver d = new main.Driver();
    /**
     * Creates new form LoginGUI
     */
    
    public UserHomeGUI() {
        initComponents();
         u = new main.Users("null", "null", "null", "null", "null", "null", "null", "null", 0, 0);
         
         nameLbl.setText("No logged in user");
    }
    public UserHomeGUI(main.Users user) {
        initComponents();
        u = user;
        nameLbl.setText(u.getUsername());
        int yLoc = 20;
        int panelHeight = 60;
        
        // Get the trips booked by the user as a passenger and store them in the bt array list
        b = cpdb.getBookings(u.getUserID());
        if(b.size() > 0) {
            JLabel bookings = new  JLabel("Bookings:");
            bookings.setBounds(5, 0, 350, 15);
            resultPanel.add(bookings);
            resultPanel.revalidate();
            
            
            for (main.Bookings booking : b) {
                main.Trip trip = new main.Trip(true, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, null);
                trip = cpdb.getTripById(booking.getTripsID());    
                
                 // Creating the labels which hold all of the info
                JLabel departureAndArrivaAddresses = new  JLabel(trip.getDepartureAddress() + " - " + trip.getArrivalAddress());
                departureAndArrivaAddresses.setAlignmentX(Component.CENTER_ALIGNMENT);
                departureAndArrivaAddresses.setForeground(Color.white);
                
                
                JLabel departureDate = new  JLabel("Departing at: " + trip.getDepartureDateAndTime());
                departureDate.setForeground(Color.white);
                departureDate.setAlignmentX(Component.CENTER_ALIGNMENT);
                
                JLabel arrivalDate = new JLabel("Arriving at: " + trip.getArrivalDateAndTime());
                arrivalDate.setForeground(Color.white);
                arrivalDate.setSize(300, 15);
                arrivalDate.setAlignmentX(Component.CENTER_ALIGNMENT);
                
                // Creating the panel which will keep the info
                JPanel p = new JPanel();
                p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
                p.setBounds(10, yLoc, 350, 50);
                p.setBackground(new Color(0, 153, 71)); 
                
                p.add(departureAndArrivaAddresses);
                p.add(departureDate);
                p.add(arrivalDate);
                p.revalidate();
                
                yLoc+=60;
                panelHeight+=60;
                
                resultPanel.add(p);
                resultPanel.setPreferredSize(new Dimension(200, panelHeight));
                resultPanel.revalidate();
                
                 // Making the panel clickable and redirecting to the View Trip class
                p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Set the cursor on mouse over

                // Declaring the final varialbles is needed here to be able to pass it tho the mouse event listener
                final main.Trip tr = trip;
                final main.Bookings bo = booking;
                p.addMouseListener(new MouseAdapter() {
                    
                    public void mousePressed(MouseEvent e) {
                        GUI.ViewTripGUI vt = new GUI.ViewTripGUI(u, tr, bo, "Passenger");
                        // Get the size of the active window
                        int sizeH = getSize().height;
                        int sizeW = getSize().width;

                        // Get the location of the active window
                        int currX = getLocation().x;
                        int currY = getLocation().y;

                        // Set the size of the new window
                        vt.setSize(sizeW, sizeH);

                        // Set the location of the new window
                        vt.setLocation(currX, currY);

                        // Hide the active window, show the new window
                        dispose();

                        // make it visible
                        vt.setVisible(true);
                        }
                    });
                
                
            }
        }
        
        // Get the trips created by the user as a driver, store them in the dt array list
        d = cpdb.getDriverByUserID(u.getUserID());
        if(d.getDriverID() != 0 && d.getUserID() != 0) {
            
            dt = cpdb.getTripsByDriverId(d.getDriverID());
            if(dt.size() > 0) {
                JLabel departures = new JLabel("Driving:");
                departures.setBounds(5, yLoc, 350, 15);
                resultPanel.add(departures);
            }
            
            yLoc+=20;
            panelHeight+=15;
            
            
            resultPanel.revalidate();
            
            for (main.Trip driverTrip : dt) {
                main.Trip trip = new main.Trip(true, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, null);
                trip = cpdb.getTripById(driverTrip.getTripID());
                
                // Creating the labels which hold all of the info
                JLabel departureAndArrivaAddresses = new  JLabel(trip.getDepartureAddress() + " - " + trip.getArrivalAddress());
                departureAndArrivaAddresses.setAlignmentX(Component.CENTER_ALIGNMENT);
                departureAndArrivaAddresses.setForeground(Color.white);
                
                
                JLabel departureDate = new  JLabel("Departing at: " + trip.getDepartureDateAndTime());
                departureDate.setForeground(Color.white);
                departureDate.setAlignmentX(Component.CENTER_ALIGNMENT);
                
                JLabel arrivalDate = new JLabel("Arriving at: " + trip.getArrivalDateAndTime());
                arrivalDate.setForeground(Color.white);
                arrivalDate.setSize(300, 15);
                arrivalDate.setAlignmentX(Component.CENTER_ALIGNMENT);
                
                // Creating the panel which will keep the info
                JPanel p = new JPanel();
                p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
                p.setBounds(10, yLoc, 350, 50);
                p.setBackground(new Color(0, 153, 71)); 
                
                p.add(departureAndArrivaAddresses);
                p.add(departureDate);
                p.add(arrivalDate);
                p.revalidate();
                
                yLoc = yLoc + 60;
                panelHeight+=60;
                resultPanel.add(p);
                resultPanel.setPreferredSize(new Dimension(200, panelHeight));
                resultPanel.revalidate();
                
                // Making the panel clickable and redirecting to the View Trip class
                p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Set the cursor on mouse over
                // Declaring a final varialble is needed here to be able to pass it tho the mouse event listener
                final main.Trip tr = trip;
                p.addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {
                        GUI.ViewTripGUI vt = new GUI.ViewTripGUI(u,tr, "Driver");
                        // Get the size of the active window
                        int sizeH = getSize().height;
                        int sizeW = getSize().width;

                        // Get the location of the active window
                        int currX = getLocation().x;
                        int currY = getLocation().y;

                        // Set the size of the new window
                        vt.setSize(sizeW, sizeH);

                        // Set the location of the new window
                        vt.setLocation(currX, currY);

                        // Hide the active window, show the new window
                        dispose();

                        // make it visible
                        vt.setVisible(true);
                        }
                    });
            }
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
        searchBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        newTripBtn = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();
        resultPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 420, 660));
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
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        nameLbl.setMaximumSize(new java.awt.Dimension(400, 400));

        searchBtn.setBackground(new java.awt.Color(0, 153, 204));
        searchBtn.setForeground(new java.awt.Color(254, 254, 254));
        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(0, 153, 204));
        logoutBtn.setForeground(new java.awt.Color(254, 254, 254));
        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        newTripBtn.setBackground(new java.awt.Color(0, 153, 204));
        newTripBtn.setForeground(new java.awt.Color(254, 254, 254));
        newTripBtn.setText("NEW TRIP");
        newTripBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTripBtnActionPerformed(evt);
            }
        });

        scrollPanel.setBackground(new java.awt.Color(254, 254, 254));
        scrollPanel.setBorder(null);
        scrollPanel.setForeground(new java.awt.Color(1, 1, 1));

        resultPanel.setBackground(new java.awt.Color(255, 255, 255));
        resultPanel.setForeground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        scrollPanel.setViewportView(resultPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newTripBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollPanel))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn)
                    .addComponent(newTripBtn))
                .addGap(36, 36, 36)
                .addComponent(scrollPanel)
                .addGap(18, 18, 18)
                .addComponent(logoutBtn)
                .addGap(44, 44, 44))
        );

        scrollPanel.getAccessibleContext().setAccessibleName("");
        scrollPanel.getAccessibleContext().setAccessibleDescription("");

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

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        //switch to the Search screen
        
        GUI.SearchResultsGUI s = new GUI.SearchResultsGUI(u);

        // Get the size of the active window
        int sizeH = this.getSize().height;
        int sizeW = this.getSize().width;

        // Get the location of the active window
        int currX = this.getLocation().x;
        int currY = this.getLocation().y;

        // Set the size of the new window
        s.setSize(sizeW, sizeH);

        // Set the location of the new window
        s.setLocation(currX, currY);

        // Hide the active window, show the new window
        this.dispose();
        
        // make it visible
        s.setVisible(true);
    }//GEN-LAST:event_searchBtnActionPerformed

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

    private void newTripBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTripBtnActionPerformed
        main.Driver d = new main.Driver();
        carpoolapp.CarPoolDB cpdb = new carpoolapp.CarPoolDB();
        d = cpdb.getDriverByUserID(u.getUserID());
        if(d.getDriverID() == 0 && d.getUserID() == 0 && d.getRating() == 0) {
            d.setUserID(u.getUserID());
            cpdb.addDriver(d);
        }
        
        //switch to the new trip screen
        GUI.NewTripGUI n = new GUI.NewTripGUI(u);

        // Get the size of the active window
        int sizeH = this.getSize().height;
        int sizeW = this.getSize().width;

        // Get the location of the active window
        int currX = this.getLocation().x;
        int currY = this.getLocation().y;

        // Set the size of the new window
        n.setSize(sizeW, sizeH);

        // Set the location of the new window
        n.setLocation(currX, currY);

        // Hide the active window, show the new window
        this.dispose();
        
        // make it visible
        n.setVisible(true);
    }//GEN-LAST:event_newTripBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UserHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHomeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel headerPnl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JButton newTripBtn;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
