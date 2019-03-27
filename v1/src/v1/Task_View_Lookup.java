/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v1;

import database_console.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Konstantin Georgiev
 */
public class Task_View_Lookup extends javax.swing.JFrame {

    /**
     * Creates new form Task_View_Lookup
     */
    public Task_View_Lookup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_heading = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        jTextField_assignee_email = new javax.swing.JTextField();
        jLabel_title = new javax.swing.JLabel();
        jTextField_title = new javax.swing.JTextField();
        jButton_lookup_task = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_heading.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel_heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_heading.setText("Lookup task");

        jLabel_email.setText("Assignee email");

        jTextField_assignee_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_assignee_emailActionPerformed(evt);
            }
        });

        jLabel_title.setText("Task title");

        jButton_lookup_task.setText("Lookup task");
        jButton_lookup_task.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lookup_taskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_email)
                            .addComponent(jLabel_title))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_lookup_task)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_assignee_email)
                                .addComponent(jTextField_title)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel_heading)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_email)
                    .addComponent(jTextField_assignee_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_title)
                    .addComponent(jTextField_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton_lookup_task)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validate_Inputs() {
        if (jTextField_assignee_email.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Assignee email field cannot be empty.", "Input Error", 2);
            return false;
        }
        else if (jTextField_title.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Task title field cannot be empty.", "Input Error", 2);
            return false;
        }
        else {
            return true;
        }
    }
    
    private boolean validate_Email() {
        String user_email = jTextField_assignee_email.getText();

        String select = "SELECT * FROM `user` WHERE `User_Email` = ? ";
        ResultSet rs;
        
        try (Connection con = DBConnect.databaseConnect();) {
            
            PreparedStatement pst = con.prepareStatement(select);
            pst.setString(1, user_email);
            
            rs = pst.executeQuery();
            
            
            if (!rs.next()) {

                JOptionPane.showMessageDialog(null, "No user registered with this email", "Input Error", 2);
                return false;
            }
            else {
                return true;
            }
            

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(DBConnect.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        }
        return false;
    }
    
    private boolean validate_task_exists () {
        String assignee_email = jTextField_assignee_email.getText();
        String task_title = jTextField_title.getText();

        String select = "SELECT * FROM `task` WHERE `assignee_email` = ? AND `Task_Title` = ?";
        ResultSet rs;
        
        try (Connection con = DBConnect.databaseConnect();) {
            
            PreparedStatement pst = con.prepareStatement(select);
            pst.setString(1, assignee_email);
            pst.setString(2, task_title);
            
            rs = pst.executeQuery();
            
            
            if (!rs.next()) {

                JOptionPane.showMessageDialog(null, "No such task exists assigned to this user", "Input Error", 2);
                return false;
            }
            else {
                System.out.println(rs.getString("task_start"));
                return true;
            }

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(DBConnect.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        }
        return false;
    }
    
    private void create_task_view_form () {
        String assignee_email = jTextField_assignee_email.getText();
        String task_title = jTextField_title.getText();

        String select = "SELECT * FROM `task` WHERE `assignee_email` = ? AND `Task_Title` = ?";
        ResultSet rs;
        
        try (Connection con = DBConnect.databaseConnect();) {
            
            PreparedStatement pst = con.prepareStatement(select);
            pst.setString(1, assignee_email);
            pst.setString(2, task_title);
            
            rs = pst.executeQuery();
            
            if (rs.next()) {
                
                String title = rs.getString("task_title");
                String task_start = rs.getString("task_start");
                String task_deadline = rs.getString("task_deadline");
                String task_description = rs.getString("task_description");
                Integer is_complete = rs.getInt("is_complete");
                String email = rs.getString("assignee_email");

                String select_start_year = "SELECT YEAR (?)";
            }


        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(DBConnect.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        }
    }
    
    private void jTextField_assignee_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_assignee_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_assignee_emailActionPerformed

    private void jButton_lookup_taskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lookup_taskActionPerformed
        create_task_view_form();
    }//GEN-LAST:event_jButton_lookup_taskActionPerformed

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
            java.util.logging.Logger.getLogger(Task_View_Lookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Task_View_Lookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Task_View_Lookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Task_View_Lookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Task_View_Lookup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_lookup_task;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_heading;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JTextField jTextField_assignee_email;
    private javax.swing.JTextField jTextField_title;
    // End of variables declaration//GEN-END:variables
}