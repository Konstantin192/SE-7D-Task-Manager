/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v1;

import java.util.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import database_console.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Konstantin Georgiev
 */
public class Task extends javax.swing.JFrame {

    /**
     * Creates new form Task
     */
    public Task() {
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

        jLabel1 = new javax.swing.JLabel();
        heading_label = new javax.swing.JLabel();
        description_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description_text_field = new javax.swing.JTextArea();
        title_label = new javax.swing.JLabel();
        title_text_field = new javax.swing.JTextField();
        startTime_label = new javax.swing.JLabel();
        startTime_year_comboBox = new javax.swing.JComboBox<>();
        startTime_year_label = new javax.swing.JLabel();
        startTime_month_label = new javax.swing.JLabel();
        startTime_month_comboBox = new javax.swing.JComboBox<>();
        startTime_day_label = new javax.swing.JLabel();
        startTime_day_comboBox = new javax.swing.JComboBox<>();
        finish_time_label = new javax.swing.JLabel();
        finishTime_year_comboBox = new javax.swing.JComboBox<>();
        finishTime_year_label = new javax.swing.JLabel();
        finishTime_month_label = new javax.swing.JLabel();
        finishTime_month_comboBox = new javax.swing.JComboBox<>();
        finishTime_day_label = new javax.swing.JLabel();
        finishTime_day_comboBox = new javax.swing.JComboBox<>();
        assignee_Label = new javax.swing.JLabel();
        assignee_text_field = new javax.swing.JTextField();
        createTask_button = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        heading_label.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        heading_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading_label.setText("Task");

        description_label.setText("Description");

        description_text_field.setColumns(20);
        description_text_field.setLineWrap(true);
        description_text_field.setRows(5);
        jScrollPane1.setViewportView(description_text_field);

        title_label.setText("Title");

        startTime_label.setText("Start time");

        startTime_year_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        startTime_year_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTime_year_comboBoxActionPerformed(evt);
            }
        });

        startTime_year_label.setText("Year :");

        startTime_month_label.setText("Month :");

        startTime_month_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        startTime_month_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTime_month_comboBoxActionPerformed(evt);
            }
        });

        startTime_day_label.setText("Day:");

        startTime_day_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        startTime_day_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTime_day_comboBoxActionPerformed(evt);
            }
        });

        finish_time_label.setText("Finish time");

        finishTime_year_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        finishTime_year_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishTime_year_comboBoxActionPerformed(evt);
            }
        });

        finishTime_year_label.setText("Year :");

        finishTime_month_label.setText("Month :");

        finishTime_month_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        finishTime_month_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishTime_month_comboBoxActionPerformed(evt);
            }
        });

        finishTime_day_label.setText("Day:");

        finishTime_day_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        finishTime_day_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishTime_day_comboBoxActionPerformed(evt);
            }
        });

        assignee_Label.setText("Assignee email");

        assignee_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignee_text_fieldActionPerformed(evt);
            }
        });

        createTask_button.setText("Create task");
        createTask_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTask_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(heading_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(description_label)
                            .addComponent(title_label)
                            .addComponent(startTime_label)
                            .addComponent(assignee_Label))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(startTime_year_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(startTime_year_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(startTime_month_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(startTime_month_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(startTime_day_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(startTime_day_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1))
                            .addComponent(assignee_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(finish_time_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finishTime_year_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(finishTime_year_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(finishTime_month_label))
                            .addComponent(createTask_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finishTime_month_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(finishTime_day_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finishTime_day_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(heading_label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignee_Label)
                    .addComponent(assignee_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title_label)
                    .addComponent(title_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(description_label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startTime_year_label)
                    .addComponent(startTime_year_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startTime_label)
                    .addComponent(startTime_month_label)
                    .addComponent(startTime_month_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startTime_day_label)
                    .addComponent(startTime_day_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(finishTime_year_label)
                        .addComponent(finishTime_year_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(finishTime_month_label)
                        .addComponent(finishTime_month_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(finishTime_day_label)
                        .addComponent(finishTime_day_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(finish_time_label))
                .addGap(32, 32, 32)
                .addComponent(createTask_button)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validate_days (JComboBox<String> year_comboBox, JComboBox<String> month_comboBox, JComboBox<String> day_comboBox) {
        String year_input = (String)year_comboBox.getSelectedItem();
        Integer year_input_number = Integer.parseInt(year_input);
        
        String month_input = (String)month_comboBox.getSelectedItem();
        
        // Make a String Array
        String[] high_months = new String[]{"01","03","05","07","08","10","12"};
        
        // Convert the String Array to a list so that it can be searched when 
        // deciding how many days a selected month has
        List<String> high_months_list = Arrays.asList(high_months);
        
        /*
         The length of the days of the getItemCount's is off by 1 because the
         day combo box also has a default "- -" entry in it. This is to 
         prevent user mistakes when the system is updating the day list while
         users are changing the desired year / month.
        */
        if ((year_input_number % 4 != 0) && month_input == "02" && (day_comboBox.getItemCount() != 29)) {
            day_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"}));
        }
        else if ((year_input_number % 4 == 0) && month_input == "02" && (day_comboBox.getItemCount() != 30)) {
            day_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29"}));
        }
        else if (high_months_list.contains(month_input) && (day_comboBox.getItemCount() != 32)) {
            day_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));       
        }
        else if (!high_months_list.contains(month_input) && month_input != "02" && day_comboBox.getItemCount() != 31) {
            day_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
        }
    }
    
    private void validate_Inputs () {
        
        Integer start_year = Integer.parseInt((String)startTime_year_comboBox.getSelectedItem());
        Integer finish_year = Integer.parseInt((String)finishTime_year_comboBox.getSelectedItem());
        
        Integer start_month = Integer.parseInt((String)startTime_month_comboBox.getSelectedItem());
        Integer finish_month = Integer.parseInt((String)finishTime_month_comboBox.getSelectedItem());
        
        Integer start_day= Integer.parseInt((String)startTime_day_comboBox.getSelectedItem());
        Integer finish_day = Integer.parseInt((String)finishTime_day_comboBox.getSelectedItem());
                
        if (assignee_text_field.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Assignee email field cannot be empty.", "Input Error", 2);
        }
        else if (title_text_field.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Title field cannot be empty.", "Input Error", 2);
        }
        else if (description_text_field.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Description field cannot be empty.", "Input Error", 2);
        }
        else if (startTime_day_comboBox.getSelectedItem() == "00") {
            JOptionPane.showMessageDialog(null, "Day field of Start time cannot be 00", "Input Error", 2);
        }
        else if (finishTime_day_comboBox.getSelectedItem() == "00") {
            JOptionPane.showMessageDialog(null, "Day field of Finish time cannot be 00", "Input Error", 2);
        }
        else if (start_year > finish_year || finish_year < start_year ||
                 start_year == finish_year && (start_month > finish_month || finish_month < start_month) ||
                 start_year == finish_year && start_month == finish_month && (start_day > finish_day || finish_day < start_day)) {
            JOptionPane.showMessageDialog(null, "Start time has to be earlier than finish time.", "Input Error", 2);
        }
    }
    
    private void validate_Email() {
        String user_email = assignee_text_field.getText();

        String select = "SELECT * FROM `user` WHERE `User_Email` = ? ";
        ResultSet rs;
        
        try (Connection con = DBConnect.databaseConnect();) {
            
            PreparedStatement pst = con.prepareStatement(select);
            pst.setString(1, user_email);
            
            rs = pst.executeQuery();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Task creation successful", "Task created", 1);
            }
            else {
                JOptionPane.showMessageDialog(null, "No user registered with this email", "Input Error", 2);
            }


        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(DBConnect.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        }
    }
    
    private void startTime_year_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTime_year_comboBoxActionPerformed
        validate_days(startTime_year_comboBox, startTime_month_comboBox, startTime_day_comboBox);
    }//GEN-LAST:event_startTime_year_comboBoxActionPerformed

    private void startTime_day_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTime_day_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startTime_day_comboBoxActionPerformed

    private void startTime_month_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTime_month_comboBoxActionPerformed
        validate_days(startTime_year_comboBox, startTime_month_comboBox, startTime_day_comboBox);
    }//GEN-LAST:event_startTime_month_comboBoxActionPerformed

    private void finishTime_year_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishTime_year_comboBoxActionPerformed
        validate_days(finishTime_year_comboBox, finishTime_month_comboBox, finishTime_day_comboBox);
    }//GEN-LAST:event_finishTime_year_comboBoxActionPerformed

    private void finishTime_month_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishTime_month_comboBoxActionPerformed
        validate_days(finishTime_year_comboBox, finishTime_month_comboBox, finishTime_day_comboBox);
    }//GEN-LAST:event_finishTime_month_comboBoxActionPerformed

    private void finishTime_day_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishTime_day_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finishTime_day_comboBoxActionPerformed

    private void assignee_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignee_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assignee_text_fieldActionPerformed

    private void createTask_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTask_buttonActionPerformed
        validate_Inputs();
        validate_Email();
        
    }//GEN-LAST:event_createTask_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Task().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignee_Label;
    private javax.swing.JTextField assignee_text_field;
    private javax.swing.JButton createTask_button;
    private javax.swing.JLabel description_label;
    private javax.swing.JTextArea description_text_field;
    private javax.swing.JComboBox<String> finishTime_day_comboBox;
    private javax.swing.JLabel finishTime_day_label;
    private javax.swing.JComboBox<String> finishTime_month_comboBox;
    private javax.swing.JLabel finishTime_month_label;
    private javax.swing.JComboBox<String> finishTime_year_comboBox;
    private javax.swing.JLabel finishTime_year_label;
    private javax.swing.JLabel finish_time_label;
    private javax.swing.JLabel heading_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> startTime_day_comboBox;
    private javax.swing.JLabel startTime_day_label;
    private javax.swing.JLabel startTime_label;
    private javax.swing.JComboBox<String> startTime_month_comboBox;
    private javax.swing.JLabel startTime_month_label;
    private javax.swing.JComboBox<String> startTime_year_comboBox;
    private javax.swing.JLabel startTime_year_label;
    private javax.swing.JLabel title_label;
    private javax.swing.JTextField title_text_field;
    // End of variables declaration//GEN-END:variables
}
