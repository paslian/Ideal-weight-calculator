/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;


import Controller.MainController;
import Project.Girl;
import Project.Boy;
import Project.IdealOld;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


/**
 *
 * @author hp
 */
public class frameapp extends javax.swing.JFrame {
    IdealOld model = new IdealOld() {};
    MainController controller = new MainController();
     Girl orangG = new Girl();
     Boy orangB = new Boy();

    frameHistory frame3 = new frameHistory();

    public static String bb ;
    public static String tb;
    public static String gender;
    public static String result;


    /**
    /**
     * Creates new form frameapp
     */
    public frameapp() {
        initComponents();

        lbl_welcome.setText("welcome " + frameLogin.name);
        bb = tf_bb.getText();
        tb = tf_tb.getText();
        gender = cb_gender.getSelectedItem().toString();
        result = label_result.getText();

    }

    private void reset(){
            cb_gender.setSelectedIndex(0);
            tf_bb.setText("");
            tf_tb.setText("");
            label_result.setText ("...");
    }


    private String validateForm1() {
            List<String> flag = new ArrayList<String>();
            String alert = "";

            String tf1 = tf_tb.getText();

                        if(tf1.length() < 1) {
                            flag.add("Please fill in your height!");
                        }

                        if(!tf1.matches("[0-9]+")){
                            flag.add("Please put only numbers!");
                        }

            String tf3 = tf_bb.getText();

                        if(tf3.length() < 1) {
                            flag.add("Please enter your weight!");
                        }

                        if(!tf3.matches("[0-9]+")){
                            flag.add("Please put only numbers!");
                        }

            JComboBox<String> tf2 = cb_gender;

                                    if(tf2.getSelectedIndex()==0) {
                                        flag.add("Please select Gender!");
                                    }

                                   if (flag.size() > 0) {
                                       for (String msg : flag) {
                                           alert += (msg + "\n");
                                       }
            }
        return alert;

    }  






    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_welcome = new javax.swing.JLabel();
        tf_bb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_tb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_cek = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        label_result = new javax.swing.JLabel();
        cb_gender = new javax.swing.JComboBox<>();
        btn_history = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel2.setText("IDEAL WEIGHT CALCULATOR");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, 33));

        lbl_welcome.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 16)); // NOI18N
        lbl_welcome.setText("welcome ...");
        lbl_welcome.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                lbl_welcomeInputMethodTextChanged(evt);
            }
        });
        jPanel3.add(lbl_welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 230, 20));

        tf_bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_bbActionPerformed(evt);
            }
        });
        jPanel3.add(tf_bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 49, -1));

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel4.setText("KG");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));
        jPanel3.add(tf_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 50, -1));

        jLabel5.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel5.setText("CM");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        btn_cek.setBackground(new java.awt.Color(255, 255, 255));
        btn_cek.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cek.setText("Cek");
        btn_cek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cekMouseClicked(evt);
            }
        });
        btn_cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cekActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cek, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 81, -1));

        btn_reset.setBackground(new java.awt.Color(255, 255, 255));
        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_resetMouseClicked(evt);
            }
        });
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel3.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 83, -1));

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel3.setText("Result :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        label_result.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        label_result.setText("...");
        jPanel3.add(label_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 349, -1));

        cb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Boy", "Girl" }));
        cb_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_genderActionPerformed(evt);
            }
        });
        jPanel3.add(cb_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 147, -1));

        btn_history.setText("History");
        btn_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_historyActionPerformed(evt);
            }
        });
        jPanel3.add(btn_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 90, -1));

        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel3.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 90, -1));

        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 14)); // NOI18N
        jLabel7.setText("Put your weight and height");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\allpaper.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 870, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseClicked
        // TODO add your handling code here:
        this.reset();
    }//GEN-LAST:event_btn_resetMouseClicked

    private void cb_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_genderActionPerformed

    private void tf_bbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_bbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_bbActionPerformed

    private void btn_cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cekActionPerformed

    private void btn_cekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cekMouseClicked
        // TODO add your handling code here:
        String validation = this.validateForm1();


        if(validation.length() > 0) {
            JOptionPane.showMessageDialog(null, validation, "Validation Error!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }


        
    

        if(cb_gender.getSelectedIndex()==1)
        {
            orangB.setTb(Double.parseDouble(tf_tb.getText()));
            orangB.setBb(Double.parseDouble(tf_bb.getText()));
            orangB.hasilinfob();
            frame3.initTable();
            frame3.storeB();
            this.orangB.getInfo();
            this.setLableB();

        } else {
            orangG.setTb(Double.parseDouble(tf_tb.getText()));
            orangG.setBb(Double.parseDouble(tf_bb.getText()));
            orangG.hasilinfog();
            frame3.initTable();
            frame3.storeG();
            this.orangG.getInfo();
            this.setLableG();

        }
    }//GEN-LAST:event_btn_cekMouseClicked

    private void btn_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historyActionPerformed
        // TODO add your handling code here:

        frame3.setLocationRelativeTo(null);
        frame3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_historyActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        frameLogin frame1 = new frameLogin();
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void lbl_welcomeInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lbl_welcomeInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_welcomeInputMethodTextChanged

    private void setLableB () {
    String info = this.orangB.getInfo();
    label_result.setText(info);
}

    private void setLableG () {
    String info = this.orangG.getInfo();
    label_result.setText(info);
}

    private void resultB () {
    orangB.setTb(Double.parseDouble(tf_tb.getText()));
    orangB.setBb(Double.parseDouble(tf_bb.getText()));
    orangB.hasilinfob();
    this.orangB.getInfo();
    String infoB = this.orangB.getInfo();

}

    private void resultG () {
    orangG.setTb(Double.parseDouble(tf_tb.getText()));
    orangG.setBb(Double.parseDouble(tf_bb.getText()));
    orangG.hasilinfog();
    this.orangG.getInfo();
    String infoG = this.orangG.getInfo();

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
            java.util.logging.Logger.getLogger(frameapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameapp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cek;
    private javax.swing.JButton btn_history;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_reset;
    public javax.swing.JComboBox<String> cb_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel label_result;
    private javax.swing.JLabel lbl_welcome;
    public javax.swing.JTextField tf_bb;
    public javax.swing.JTextField tf_tb;
    // End of variables declaration//GEN-END:variables

}
