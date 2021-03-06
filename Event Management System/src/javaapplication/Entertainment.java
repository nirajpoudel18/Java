
package javaapplication;

import java.awt.Color;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Entertainment extends javax.swing.JFrame {

    public Entertainment() {
        Container c = getContentPane();
        c.setBackground(new Color(0,153,204));
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 144, 246));
        jPanel1.setForeground(new java.awt.Color(235, 240, 242));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("URW Palladio L", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 246, 247));
        jLabel1.setText("Entertainment");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 27, 143, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(247, 248, 248));
        jLabel2.setText("Events");
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 244, 245));
        jLabel3.setText("+ Post Events");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(247, 249, 250));
        jLabel4.setText("<<<");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        l1.setForeground(new java.awt.Color(244, 249, 250));
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 129, -1, -1));

        l2.setForeground(new java.awt.Color(242, 246, 247));
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 153, -1, -1));

        l3.setForeground(new java.awt.Color(232, 240, 243));
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 177, -1, -1));

        l4.setForeground(new java.awt.Color(246, 250, 252));
        jPanel1.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 201, -1, -1));

        l5.setForeground(new java.awt.Color(240, 243, 243));
        jPanel1.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 271, -1, -1));

        l6.setForeground(new java.awt.Color(238, 246, 248));
        jPanel1.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 295, -1, -1));

        l7.setForeground(new java.awt.Color(237, 243, 245));
        jPanel1.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 319, -1, -1));

        l8.setForeground(new java.awt.Color(244, 249, 250));
        jPanel1.add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 342, -1, -1));

        l9.setForeground(new java.awt.Color(241, 247, 248));
        jPanel1.add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 129, -1, -1));

        l10.setForeground(new java.awt.Color(242, 246, 247));
        jPanel1.add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 153, -1, -1));

        l11.setForeground(new java.awt.Color(240, 244, 245));
        jPanel1.add(l11, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 177, -1, -1));

        l12.setForeground(new java.awt.Color(241, 248, 250));
        jPanel1.add(l12, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 201, -1, -1));

        l13.setForeground(new java.awt.Color(241, 247, 248));
        jPanel1.add(l13, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 279, -1, -1));

        l14.setForeground(new java.awt.Color(240, 244, 245));
        jPanel1.add(l14, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 303, -1, -1));

        l15.setForeground(new java.awt.Color(239, 245, 247));
        jPanel1.add(l15, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 327, -1, -1));

        l16.setForeground(new java.awt.Color(235, 240, 242));
        jPanel1.add(l16, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 351, -1, -1));

        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 387, -1, -1));

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 387, -1, -1));

        jButton3.setText("Book");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 387, -1, -1));

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 387, -1, -1));

        jButton5.setText("Book");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 225, -1, -1));

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 225, -1, -1));

        jButton7.setText("Book");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 225, -1, -1));

        jButton8.setText("Delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 225, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       
        HomePage hp = new HomePage();
        this.hide();
        hp.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       
        EntertainmentPost pe = new EntertainmentPost();
        this.hide();
        pe.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Connection con;
        PreparedStatement pst;
        int yesNo = JOptionPane.showConfirmDialog(null, "Are you sure you want to book?","Book",JOptionPane.YES_NO_OPTION);
        if(yesNo == JOptionPane.YES_OPTION){
  
            try {
                String L1,L2,L3,L4;
                L1 = l1.getText();
                L2 = l2.getText();
                L3 = l3.getText();
                L4 = l4.getText();                
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
                String  query1 = "delete from Entertainment where id=2";
                pst = con.prepareStatement(query1);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Booking Successful");
                System.out.print("is successfully booked.");
             
                pst = con.prepareStatement("insert into MyBookings(EventName,EventTime,EventDate,EventVenue)values(?,?,?,?)");
                pst.setString(1, L1);
                pst.setString(2, L2); 
                pst.setString(3, L3);
                pst.setString(4, L4);
                pst.executeUpdate();   
              
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            }
    } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        Connection con;
        PreparedStatement pst;
        int yesNo = JOptionPane.showConfirmDialog(null, "Delete this Post?","Delete",JOptionPane.YES_NO_OPTION);
        if(yesNo == JOptionPane.YES_OPTION){
  
            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
                String  query1 = "delete from Entertainment where id=1";
                pst = con.prepareStatement(query1);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Deleted Successfully!");
                System.out.print("is successfully deleted.");
                
              
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        Connection con;
        PreparedStatement pst;
        int yesNo = JOptionPane.showConfirmDialog(null, "Delete this Post?","Delete",JOptionPane.YES_NO_OPTION);
        if(yesNo == JOptionPane.YES_OPTION){
  
            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
                String  query1 = "delete from Entertainment where id=2";
                pst = con.prepareStatement(query1);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Deleted Successfully!");
                System.out.print("is successfully deleted.");
                
              
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
        Connection con;
        PreparedStatement pst;
        int yesNo = JOptionPane.showConfirmDialog(null, "Delete this Post?","Delete",JOptionPane.YES_NO_OPTION);
        if(yesNo == JOptionPane.YES_OPTION){
  
            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
                String  query1 = "delete from Entertainment where id=3";
                pst = con.prepareStatement(query1);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Deleted Successfully!");
                System.out.print("is successfully deleted.");
                
              
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        Connection con;
        PreparedStatement pst;
        int yesNo = JOptionPane.showConfirmDialog(null, "Delete this Post?","Delete",JOptionPane.YES_NO_OPTION);
        if(yesNo == JOptionPane.YES_OPTION){
  
            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
                String  query1 = "delete from Entertainment where id=4";
                pst = con.prepareStatement(query1);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Deleted Successfully!");
                System.out.print("is successfully deleted.");
                
              
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved
        


    }//GEN-LAST:event_jLabel2MouseMoved

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        try {
            String L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15,L16;
            L1 = l1.getText();
            L2 = l2.getText();
            L3 = l3.getText();
            L4 = l4.getText();
            L5 = l5.getText();
            L6 = l6.getText();
            L7 = l7.getText();
            L8 = l8.getText();
            L9 = l9.getText();
            L10 = l10.getText();
            L11 = l11.getText();
            L12 = l12.getText();
            L13 = l13.getText();
            L14 = l14.getText();
            L15 = l15.getText();
            L16 = l16.getText();
                   
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
            String sql = "select * from Entertainment where id=1";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while(rs.next()){
            String a = rs.getString("EventName");
            l1.setText(a);
            String b = rs.getString("EventTime");
            l2.setText(b);
            String c = rs.getString("EventDate");
            l3.setText(c);
            String d = rs.getString("EventVenue");
            l4.setText(d);
            
            String sql1 = "select * from Entertainment where id=2";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();
            while(rs.next()){
            String e = rs.getString("EventName");
            l5.setText(e);
            String f = rs.getString("EventTime");
            l6.setText(f);
            String g = rs.getString("EventDate");
            l7.setText(g);
            String h = rs.getString("EventVenue");
            l8.setText(h);
            }
            String sql2 = "select * from Entertainment where id=3";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            while(rs.next()){
            String e = rs.getString("EventName");
            l9.setText(e);
            String f = rs.getString("EventTime");
            l10.setText(f);
            String g = rs.getString("EventDate");
            l11.setText(g);
            String h = rs.getString("EventVenue");
            l12.setText(h);
            }
            String sql3 = "select * from Entertainment where id=4";
            pst = con.prepareStatement(sql3);
            rs = pst.executeQuery();
            while(rs.next()){
            String e = rs.getString("EventName");
            l13.setText(e);
            String f = rs.getString("EventTime");
            l14.setText(f);
            String g = rs.getString("EventDate");
            l15.setText(g);
            String h = rs.getString("EventVenue");
            l16.setText(h);
            }

            }
        
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
        Connection con;
        PreparedStatement pst;
        int yesNo = JOptionPane.showConfirmDialog(null, "Are you sure you want to book?","Book",JOptionPane.YES_NO_OPTION);
        if(yesNo == JOptionPane.YES_OPTION){
  
            try {
                String L1,L2,L3,L4;
                L1 = l1.getText();
                L2 = l2.getText();
                L3 = l3.getText();
                L4 = l4.getText();                
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
                String  query1 = "delete from Entertainment where id=1";
                pst = con.prepareStatement(query1);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Booking Successful");
                System.out.print("is successfully booked.");
             
                pst = con.prepareStatement("insert into MyBookings(EventName,EventTime,EventDate,EventVenue)values(?,?,?,?)");
                pst.setString(1, L1);
                pst.setString(2, L2); 
                pst.setString(3, L3);
                pst.setString(4, L4);
                pst.executeUpdate();   
              
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            }
    } 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     
        Connection con;
        PreparedStatement pst;
        int yesNo = JOptionPane.showConfirmDialog(null, "Are you sure you want to book?","Book",JOptionPane.YES_NO_OPTION);
        if(yesNo == JOptionPane.YES_OPTION){
  
            try {
                String L1,L2,L3,L4;
                L1 = l1.getText();
                L2 = l2.getText();
                L3 = l3.getText();
                L4 = l4.getText();                
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
                String  query1 = "delete from Entertainment where id=3";
                pst = con.prepareStatement(query1);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Booking Successful");
                System.out.print("is successfully booked.");
             
                pst = con.prepareStatement("insert into MyBookings(EventName,EventTime,EventDate,EventVenue)values(?,?,?,?)");
                pst.setString(1, L1);
                pst.setString(2, L2); 
                pst.setString(3, L3);
                pst.setString(4, L4);
                pst.executeUpdate();   
              
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            }
    } 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Connection con;
        PreparedStatement pst;
        int yesNo = JOptionPane.showConfirmDialog(null, "Are you sure you want to book?","Book",JOptionPane.YES_NO_OPTION);
        if(yesNo == JOptionPane.YES_OPTION){
  
            try {
                String L1,L2,L3,L4;
                L1 = l1.getText();
                L2 = l2.getText();
                L3 = l3.getText();
                L4 = l4.getText();                
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
                String  query1 = "delete from Entertainment where id=4";
                pst = con.prepareStatement(query1);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Booking Successful");
                System.out.print("is successfully booked.");
             
                pst = con.prepareStatement("insert into MyBookings(EventName,EventTime,EventDate,EventVenue)values(?,?,?,?)");
                pst.setString(1, L1);
                pst.setString(2, L2); 
                pst.setString(3, L3);
                pst.setString(4, L4);
                pst.executeUpdate();   
              
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            }
    } 
    }//GEN-LAST:event_jButton3ActionPerformed


   public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entertainment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    // End of variables declaration//GEN-END:variables
}
