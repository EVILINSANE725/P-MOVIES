/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// address phone username password email
package movie_world;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class changeFrame extends javax.swing.JFrame {

    /**
     * Creates new form changeFrame
     */
    String source;
    
    public changeFrame(String source) {
        this.source = source;
        
        initComponents();
        jScrollPane1.setVisible(false);
        usernameLb.setVisible(false);
        usernameTf.setVisible(false);
        if (source.equals("email")) {
            headingLb.setText("Change Email");
            emaillb.setText("New Email");
            currentlb.setText("Password");
            newlb.setVisible(false);
            newtf.setVisible(false);
        } else if (source.equals("password")) {
            headingLb.setText("Change Password");
            emaillb.setText("Email");
            currentlb.setText("Current Password");
            newlb.setText("New Password");
        } else if (source.equals("username")) {
            headingLb.setText("Change Username");
            emaillb.setText("New username");
            currentlb.setText("password");
            newlb.setVisible(false);
            newtf.setVisible(false);
            usernameLb.setText("password");
            usernameLb.setVisible(false);
            usernameTf.setVisible(false);
        } else if (source.equals("phone")) {
            headingLb.setText("Phone No change");
            emaillb.setText("new phoneno");
            currentlb.setText("password");
            newtf.setVisible(false);
            newlb.setVisible(false);
            newtf.setVisible(false);
            usernameLb.setVisible(false);
            usernameLb.setVisible(false);
        } else if (source.equals("address")) {
            jScrollPane1.setVisible(true);
            headingLb.setText("Address Change");
            emaillb.setText("New Address");
            currentlb.setVisible(false);
            emailTf.setVisible(false);
            emaillb.setVisible(false);
            currenttf.setVisible(false);
            newlb.setText("Password");
            newtf.setVisible(false);
            usernameLb.setVisible(false);
            usernameLb.setVisible(false);
        }
        setVisible(true);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        emaillb = new javax.swing.JLabel();
        emailTf = new javax.swing.JTextField();
        headingLb = new javax.swing.JLabel();
        currentlb = new javax.swing.JLabel();
        currenttf = new javax.swing.JTextField();
        newlb = new javax.swing.JLabel();
        newtf = new javax.swing.JTextField();
        applyBt = new javax.swing.JButton();
        backBt = new javax.swing.JButton();
        usernameLb = new javax.swing.JLabel();
        usernameTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTf = new javax.swing.JTextArea();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        emaillb.setText("Email");
        getContentPane().add(emaillb);
        emaillb.setBounds(21, 53, 80, 16);

        emailTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTfActionPerformed(evt);
            }
        });
        getContentPane().add(emailTf);
        emailTf.setBounds(230, 50, 150, 22);

        headingLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLb.setText("heading");
        getContentPane().add(headingLb);
        headingLb.setBounds(80, 6, 220, 30);

        currentlb.setText("Current password");
        getContentPane().add(currentlb);
        currentlb.setBounds(20, 110, 110, 16);

        currenttf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currenttfActionPerformed(evt);
            }
        });
        getContentPane().add(currenttf);
        currenttf.setBounds(230, 100, 150, 22);

        newlb.setText("new password");
        getContentPane().add(newlb);
        newlb.setBounds(20, 170, 100, 16);

        newtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newtfActionPerformed(evt);
            }
        });
        getContentPane().add(newtf);
        newtf.setBounds(230, 160, 150, 22);

        applyBt.setText("Apply changes");
        applyBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyBtActionPerformed(evt);
            }
        });
        getContentPane().add(applyBt);
        applyBt.setBounds(130, 240, 130, 23);

        backBt.setText("<-");
        backBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtActionPerformed(evt);
            }
        });
        getContentPane().add(backBt);
        backBt.setBounds(0, 10, 50, 23);

        usernameLb.setText("username");
        getContentPane().add(usernameLb);
        usernameLb.setBounds(20, 210, 90, 20);
        getContentPane().add(usernameTf);
        usernameTf.setBounds(230, 210, 150, 22);

        addressTf.setColumns(20);
        addressTf.setRows(5);
        jScrollPane1.setViewportView(addressTf);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 50, 234, 86);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTfActionPerformed

    private void newtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newtfActionPerformed

    private void backBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtActionPerformed
        // TODO add your handling code here:
        new UserDetails();
        dispose();
       
    }//GEN-LAST:event_backBtActionPerformed

    private void applyBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyBtActionPerformed
        // TODO add your handling code here:
        if (source.equals("email")) {
            String newEmail = emailTf.getText();
            String password = currenttf.getText();
            try {
                HttpResponse<String> res = Unirest.get("http://localhost:8000/changeemail").queryString("email", dump.email).queryString("newemail", newEmail).queryString("password", password).asString();
                if (res.getStatus() == 200) {
                    String back = res.getBody();
                    if (back.contains("sucess")) {
                        JOptionPane.showMessageDialog(this, "Email changed sucess");
                        new UserDetails();
                        dispose();
                        
                    } else if (back.contains("unsucess")) {
                        JOptionPane.showMessageDialog(this, "Enter details properly");
                        
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Error");
                }
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (source.equals("username")) {
            System.out.println("hii");
            String newUsername = emailTf.getText();
            String password = currenttf.getText();
            try {
                HttpResponse<String> res = Unirest.get("http://localhost:8000/changeusername").queryString("email", dump.email).queryString("newusername", newUsername).queryString("password", password).asString();
                if (res.getStatus() == 200) {
                    String back = res.getBody();
                    if (back.contains("sucess")) {
                        JOptionPane.showMessageDialog(this, "changed sucess");
                        new UserDetails();
                        dispose();
                    } else if (back.contains("unsucess")) {
                        JOptionPane.showMessageDialog(this, "Enter details properly");
                        
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Error");
                }
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (source.equals("password")) {
            String email = emailTf.getText();
            String currpassword = currenttf.getText();
            String newPassword = newtf.getText();
            try {
                HttpResponse<String> res = Unirest.get("http://localhost:8000/changepassword").queryString("email", email).queryString("currpassword", currpassword).queryString("newpassword", newPassword).asString();
                if (res.getStatus() == 200) {
                    String back = res.getBody();
                    if (back.contains("sucess")) {
                        JOptionPane.showMessageDialog(this, "Password changed sucess");
                       new UserDetails();
                       dispose();
                    } else if (back.contains("unsucess")) {
                        JOptionPane.showMessageDialog(this, "Enter details properly");
                        
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Error");
                }
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (source.equals("address")) {
            String address = emailTf.getText();
            String password = newtf.getText();
            try {
                HttpResponse<String> res = Unirest.get("http://localhost:8000/changeaddress").queryString("email", dump.email).queryString("address", address).queryString("password", password).asString();
                if (res.getStatus() == 200) {
                    String back = res.getBody();
                    if (back.contains("sucess")) {
                        JOptionPane.showMessageDialog(this, " changed sucess");
                        new UserDetails();
                        dispose();
                                
                    } else if (back.contains("unsucess")) {
                        JOptionPane.showMessageDialog(this, "Enter details properly");
                        
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Error");
                }
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (source.equals("phone")) {
            String newphone = emailTf.getText();
            String password = currenttf.getText();
            try {
                HttpResponse<String> res = Unirest.get("http://localhost:8000/changephone").queryString("email", dump.email).queryString("newphone", newphone).queryString("password", password).asString();
                if (res.getStatus() == 200) {
                    String back = res.getBody();
                    if (back.contains("sucess")) {
                        JOptionPane.showMessageDialog(this, "changed sucess");
                        new UserDetails();
                        dispose();
                    } else if (back.contains("unsucess")) {
                        JOptionPane.showMessageDialog(this, "Enter details properly");
                        
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Error");
                }
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_applyBtActionPerformed

    private void currenttfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currenttfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currenttfActionPerformed

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
            java.util.logging.Logger.getLogger(changeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changeFrame("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressTf;
    public javax.swing.JButton applyBt;
    public javax.swing.JButton backBt;
    public javax.swing.JLabel currentlb;
    public javax.swing.JTextField currenttf;
    public javax.swing.JTextField emailTf;
    public javax.swing.JLabel emaillb;
    public javax.swing.JLabel headingLb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel newlb;
    public javax.swing.JTextField newtf;
    private javax.swing.JLabel usernameLb;
    private javax.swing.JTextField usernameTf;
    // End of variables declaration//GEN-END:variables
}
