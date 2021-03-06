/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * login.java
 *
 * Created on 7 Jun, 2017, 4:40:05 PM
 */

package hostelmanagement;

/**
 *
 * @author Pushpendra Kumar
 */
public class login extends javax.swing.JFrame {

    /** Creates new form login */
    public login() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b_adminlogin = new javax.swing.JButton();
        b_studlogin = new javax.swing.JButton();
        b_quit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In @ NITRR HMS");
        setBackground(new java.awt.Color(255, 255, 0));
        setForeground(new java.awt.Color(255, 255, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Hostel Management System");

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hostelmanagement/nitrr_logo1.png"))); // NOI18N

        b_adminlogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_adminlogin.setForeground(new java.awt.Color(255, 0, 0));
        b_adminlogin.setText("Administrator Login");
        b_adminlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_adminloginActionPerformed(evt);
            }
        });

        b_studlogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_studlogin.setForeground(new java.awt.Color(255, 0, 0));
        b_studlogin.setText("Student Login");
        b_studlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_studloginActionPerformed(evt);
            }
        });

        b_quit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_quit.setForeground(new java.awt.Color(255, 0, 0));
        b_quit.setText("Quit");
        b_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_quitActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("NATIONAL INSTITUTE OF TECHNOLOGY, RAIPUR");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel2)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(185, 185, 185))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(b_adminlogin)
                .addGap(72, 72, 72)
                .addComponent(b_studlogin)
                .addGap(105, 105, 105)
                .addComponent(b_quit)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_studlogin)
                    .addComponent(b_quit)
                    .addComponent(b_adminlogin))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_quitActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_b_quitActionPerformed

    private void b_studloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_studloginActionPerformed
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogin().setVisible(true);
            }
        }); //ODO add your handling code here:
    }//GEN-LAST:event_b_studloginActionPerformed

    private void b_adminloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_adminloginActionPerformed
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_b_adminloginActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_adminlogin;
    private javax.swing.JButton b_quit;
    private javax.swing.JButton b_studlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
