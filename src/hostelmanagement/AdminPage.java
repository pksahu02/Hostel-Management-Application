/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdminPage.java
 *
 * Created on 8 Jun, 2017, 1:52:10 AM
 */

package hostelmanagement;

/**
 *
 * @author Pushpendra Kumar
 */
public class AdminPage extends javax.swing.JFrame {

    /** Creates new form AdminPage */
    public AdminPage() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_SAR = new javax.swing.JButton();
        jButton_SFR = new javax.swing.JButton();
        jButton_RAR = new javax.swing.JButton();
        jButton_VR = new javax.swing.JButton();
        jButton_SPR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator Section @ NITRR HMS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jButton_SAR.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton_SAR.setText("Student Academics Record");
        jButton_SAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SARActionPerformed(evt);
            }
        });

        jButton_SFR.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton_SFR.setText("Student Fee Record");
        jButton_SFR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SFRActionPerformed(evt);
            }
        });

        jButton_RAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_RAR.setText("Room Allotment Record");
        jButton_RAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RARActionPerformed(evt);
            }
        });

        jButton_VR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_VR.setText("Visitor Record");
        jButton_VR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VRActionPerformed(evt);
            }
        });

        jButton_SPR.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton_SPR.setText("Student Personal Record");
        jButton_SPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SPRActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hostelmanagement/nitrr_logo1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_VR, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jButton_RAR, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jButton_SPR, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jButton_SFR, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jButton_SAR, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addGap(129, 129, 129)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_SPR)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_SAR)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_SFR)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_RAR)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_VR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(53, 53, 53))
        );

        jMenu1.setText("Home");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Log Out");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Help");

        jMenuItem3.setText("Contact Us");
        jMenu4.add(jMenuItem3);

        jMenuItem5.setText("About");
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();       // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });        // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton_SPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SPRActionPerformed
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPersonal().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_SPRActionPerformed

    private void jButton_SARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SARActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentAcademics().setVisible(true);
            }
        });// TODO add your handling code here:
    }//GEN-LAST:event_jButton_SARActionPerformed

    private void jButton_SFRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SFRActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFee().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_SFRActionPerformed

    private void jButton_RARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RARActionPerformed
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomAllotment().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton_RARActionPerformed

    private void jButton_VRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VRActionPerformed
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisitorRecord().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton_VRActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_RAR;
    private javax.swing.JButton jButton_SAR;
    private javax.swing.JButton jButton_SFR;
    private javax.swing.JButton jButton_SPR;
    private javax.swing.JButton jButton_VR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
