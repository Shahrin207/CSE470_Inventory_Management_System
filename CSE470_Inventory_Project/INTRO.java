/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CSE470_Inventory_Project;

/**
 *
 * @author User
 */
public class INTRO extends javax.swing.JFrame {

    /**
     * Creates new form INTRO
     */
    public INTRO() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Progress = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Progress.setBackground(new java.awt.Color(204, 204, 204));
        Progress.setForeground(new java.awt.Color(0, 153, 255));
        jPanel1.add(Progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 505, 677, 10));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RECLIVE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, 665, 78));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("A Simple and Easy Inventory Management System");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 104, 665, -1));

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 179, 665, 302));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 487, 495, -1));

        jLabel5.setBackground(new java.awt.Color(0, 51, 102));
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Pictures\\Saved Pictures\\inven_background1.png.jpg")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 179, 677, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        INTRO intro = new INTRO();
        intro.setVisible(true);
        
        try
        {
            for(int j = 0; j <= 100; j++)
            {
                Thread.sleep(40);
                intro.Progress.setValue(j);
            }
        }
        catch(InterruptedException e)
        {
            
        }
        
        new LOGIN_PAGE().setVisible(true);
        intro.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Progress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
