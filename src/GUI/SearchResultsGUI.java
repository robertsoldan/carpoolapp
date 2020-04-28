
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SearchResultsGUI extends javax.swing.JFrame {
    private main.Users u;
    private carpoolapp.CarPoolDB cpdb;
   
    /**
     * Creates new form LoginGUI
     */
    
    public SearchResultsGUI() {
        initComponents();
         u = new main.Users("null", "null", "null", "null", "null", "null", "null", "null", 0, 0);
         
         nameLbl.setText(u.getUsername());
    }
    public SearchResultsGUI(main.Users user) {
        initComponents();
        u = user;
        
        nameLbl.setText(u.getUsername());
    }
    
    private void clearForm() {
        fromTf.setText("");
        toTf.setText("");
        ddTf.setText("");
        mmTf.setText("");
        yyyyTf.setText("");
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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        toTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fromTf = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        seatSpin = new javax.swing.JSpinner();
        mmTf = new javax.swing.JTextField();
        ddTf = new javax.swing.JTextField();
        yyyyTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        resultsLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchPnl = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(400, 640));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 640));
        jPanel1.setName(""); // NOI18N
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
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        headerPnlLayout.setVerticalGroup(
            headerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        nameLbl.setMaximumSize(new java.awt.Dimension(400, 400));

        logoutBtn.setBackground(new java.awt.Color(0, 153, 204));
        logoutBtn.setForeground(new java.awt.Color(254, 254, 254));
        logoutBtn.setText("LOGOUT");
        logoutBtn.setAlignmentY(0.0F);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("No. of seats");

        jLabel4.setText("Date");

        jLabel3.setText("Travelling to");

        jLabel1.setText("Leaving from");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        seatSpin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 7, 1));
        seatSpin.setRequestFocusEnabled(false);

        mmTf.setToolTipText("MM");

        ddTf.setToolTipText("DD");

        yyyyTf.setToolTipText("YYYY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(toTf, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(fromTf)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ddTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mmTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yyyyTf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(seatSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fromTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mmTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yyyyTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(seatSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel6.setText("Enter search criteria:");

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        resultsLbl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        resultsLbl.setText("   ");

        searchPnl.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout searchPnlLayout = new javax.swing.GroupLayout(searchPnl);
        searchPnl.setLayout(searchPnlLayout);
        searchPnlLayout.setHorizontalGroup(
            searchPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );
        searchPnlLayout.setVerticalGroup(
            searchPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(searchPnl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(homeBtn))
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(resultsLbl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        cpdb = new carpoolapp.CarPoolDB();
        
        searchPnl.removeAll(); // Resetting the search results on every search
        searchPnl.revalidate();
        searchPnl.repaint();
        resultsLbl.setText("");
        
        // validate and get input
        if (fromTf.getText().equals("") || toTf.getText().equals("") || ddTf.getText().equals("") || mmTf.getText().equals("") ||
                yyyyTf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "All fields must be filled");
        } else if (ddTf.getText().length() != 2 || mmTf.getText().length() != 2 || ddTf.getText().length() != 2) {
            JOptionPane.showMessageDialog(null, "Date format invalid (DD MM YYYY)");
            ddTf.setText("");
            mmTf.setText("");
            yyyyTf.setText("");
        } else if (Integer.parseInt(ddTf.getText()) < 1 || Integer.parseInt(ddTf.getText()) > 31 || Integer.parseInt(mmTf.getText()) < 1 || 
                Integer.parseInt(mmTf.getText()) > 12 || Integer.parseInt(yyyyTf.getText()) < 2020 || Integer.parseInt(yyyyTf.getText()) > 2021 || 
                (Integer.parseInt(mmTf.getText()) == 2 && Integer.parseInt(ddTf.getText()) > 29) || 
                (Integer.parseInt(mmTf.getText()) == 4 && Integer.parseInt(ddTf.getText()) > 30) ||
                (Integer.parseInt(mmTf.getText()) == 6 && Integer.parseInt(ddTf.getText()) > 30) ||
                (Integer.parseInt(mmTf.getText()) == 9 && Integer.parseInt(ddTf.getText()) > 30) ||
                (Integer.parseInt(mmTf.getText()) == 11 && Integer.parseInt(ddTf.getText()) > 29)) {
            JOptionPane.showMessageDialog(null, "Date invalid");
            ddTf.setText("");
            mmTf.setText("");
            yyyyTf.setText("");
        } else {       
            String leavingFrom = fromTf.getText();
            String travellingTo = toTf.getText();
            String date = ddTf.getText() + "-" + mmTf.getText() + "-" + yyyyTf.getText();
            String argSearch = leavingFrom + "+" + travellingTo;
            
            ArrayList<main.Trip> searchResult = cpdb.searchTripsByArgument("ADDRESS+DATE", date + "+" + argSearch);
            boolean dateMatch = true;
            
            // if the query with date has no result, expand results by using locations only
            if (searchResult.isEmpty()) {
                searchResult = cpdb.searchTripsByArgument("ADDRESS", argSearch);
                dateMatch = false;
            }
            
            if (searchResult.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No trip matching your criteria has been posted yet, come back later!");
            } else {
                int yLoc = 10; // Will the Y position of each generated panel
                int resultPanelHeight; // Will dynamically adjust the total height of the main search panel to accomodate for all the elements
//                int resultPanelHeight = 220;
                int width = 350;
                int size = searchResult.size();
                if (dateMatch) {
                    resultsLbl.setText(size > 1 ? size + " trips match your criteria." : size + " trip match your criteria.");
                } else {
                    resultsLbl.setText("We couldn't find a match for your date :(");
                }
                
                for (main.Trip trip : searchResult) {
                    // Setup the result panel
                    resultPanelHeight = 220;
                    JPanel resultPanel = new JPanel();
                    resultPanel.setBounds(10, yLoc, width - 20, resultPanelHeight);
//                    resultPanel.setLayout(null); // Set resultPanel to null to allow the labels to be placed with relative positioning.

                    resultPanel.setBackground(new Color(255, 255, 255)); // Search panel result background
                                      
                    String[] departure = trip.getDepartureDateAndTime().split("\\-");
                    String[] arrival = trip.getArrivalDateAndTime().split("\\-");
                    String departureDate = departure[0] + "-" + departure[1] + "-" + departure[2];
                    String departureTime = departure[3].substring(0, 2) + ":" + departure[3].substring(2);
                    String arrivalDate = arrival[0] + "-" + arrival[1] + "-" + arrival[2];
                    String arrivalTime = arrival[3].substring(0, 2) + ":" + arrival[3].substring(2);

                    String resultString = "<html><h4>Result " +  String.valueOf(searchResult.indexOf(trip) + 1) + " → " +
                        (trip.isComplete() ? "You are too late... This trip is fully booked..." : (trip.getSeatsAvailable() < (int)seatSpin.getValue() ?
                            "Only " + String.valueOf(trip.getSeatsAvailable()) + " seats available..." : 
                            String.valueOf(trip.getSeatsAvailable()) + " seats available!")) + "</h4><p>" +
                        "Date posted: " + trip.getDatePosted() +
                        "<br>Departure: " + trip.getDepartureAddress() + " on " + departureDate + " @ " + departureTime +
                        "<br>Arrival: " + trip.getArrivalAddress() + " on " + arrivalDate + " @ " + arrivalTime +
                        "<br>Distance in KM: " + String.valueOf(trip.getDistanceKM()) +
                        "<br>Price Per Seat: €" + String.valueOf(trip.getPricePerSeat()) +
                        (trip.isLuggageAllowed() ? "<br>✓ Luggage allowed" : "<br>✗ No space for luggage") +
                        (trip.isSmokingAllowed() ? "<br>✓ Smoking allowed" : "<br>✗ No smoking allowed") +
                        (trip.isPetAllowed() ? "<br>✓ Pet friendly" : "<br>✗ No pets allowed") +
                        (trip.isChattyDriver() ? "<br>✓ Chatty driver" : "<br>✗ I prefer a quiet trip") +
                        (trip.isMusicLover() ? "<br>✓ Music lover" : "<br>✗ I am not a music fan") +
                        "<br>Comment from the driver: " + trip.getDescription() + "</p></html>";

                    // Adding labels to the results cards
                    JLabel tripLbl = new JLabel(resultString);
                    tripLbl.setForeground(Color.BLACK); //  Label font color
                    tripLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
//                    tripLbl.setBounds(25, 25, width - 20, resultPanelHeight - 20); // Position and width of the text within the resultPanel
                    // Add label to the result panel, add the result panel to the search panel
                    resultPanel.add(tripLbl);
                    
                    // Adding the mouse event listener to the generated panel
                    tripLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Set the cursor on mouse over
                    tripLbl.addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent e) {
                            int reply = JOptionPane.showConfirmDialog(mmTf, "Do you wish to book this trip?", "Confirm", JOptionPane.YES_NO_OPTION);
                            if (reply == JOptionPane.YES_OPTION) {
                                main.Bookings booking = new main.Bookings(u.getUserID(), trip.getTripID(), "Submitted");
                                cpdb.addBooking(booking);
                                JOptionPane.showMessageDialog(null, "You're in!");
                            }
                        }
                    });
                    
                    searchPnl.add(resultPanel);
                    yLoc = yLoc + resultPanelHeight + 20; 

                    searchPnl.setPreferredSize(new Dimension(width, size * (resultPanelHeight + 20)));
                    searchPnl.revalidate();

                }         
            }
        }

            
    }//GEN-LAST:event_searchBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearForm();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // switch to the Home screen
        GUI.UserHomeGUI userHome = new GUI.UserHomeGUI(u);

        // Set the size and location of the new window
        userHome.setSize(this.getSize().width, this.getSize().height);
        userHome.setLocation(this.getLocation().x, this.getLocation().y);

        // Hide the active window, show the new window
        this.dispose();
        userHome.setVisible(true);
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
            java.util.logging.Logger.getLogger(SearchResultsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchResultsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchResultsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchResultsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new SearchResultsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField ddTf;
    private javax.swing.JTextField fromTf;
    private javax.swing.JPanel headerPnl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField mmTf;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel resultsLbl;
    private javax.swing.JButton searchBtn;
    private javax.swing.JPanel searchPnl;
    private javax.swing.JSpinner seatSpin;
    private javax.swing.JTextField toTf;
    private javax.swing.JTextField yyyyTf;
    // End of variables declaration//GEN-END:variables
}
