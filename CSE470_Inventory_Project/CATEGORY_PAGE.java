/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CSE470_Inventory_Project;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class CATEGORY_PAGE extends javax.swing.JFrame {

    private static final String userName = "root";
    private static final String passWord = "1234";
    private static final String urlConn = "jdbc:mysql://localhost:3306/category";
    
    Connection Con = null;
    PreparedStatement St = null;
    ResultSet Rs = null;
    ResultSetMetaData ptData = null;
    
    
    public CATEGORY_PAGE() {
        initComponents();
    }

    public void updateDB()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection(urlConn, userName, passWord);
            St = Con.prepareStatement("select * from category");
            Rs = St.executeQuery();
            ptData = (ResultSetMetaData) Rs.getMetaData();
            int q = ptData.getColumnCount();
            
            DefaultTableModel RecTable = (DefaultTableModel)Cat_Table.getModel();
            RecTable.setRowCount(0);
            
            while(Rs.next())
            {
                Vector colData = new Vector();
                int i;
                
                for (i = 1; i < q; i++)
                {
                    colData.add(Rs.getString("sl no."));
                    colData.add(Rs.getString("cat_ID"));
                    colData.add(Rs.getString("cat_name"));
                    colData.add(Rs.getString("cat_qty"));
                }
                RecTable.addRow(colData);
            }
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CATEGORY_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CatName = new javax.swing.JTextField();
        CatID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CatQty = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Cat_Table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 255)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RECLIVE");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Book Antiqua", 1, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("PRODUCT CATEGORY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addGap(239, 239, 239)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1043, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CategoryID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 147, -1, -1));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 200, -1, -1));

        CatName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatNameActionPerformed(evt);
            }
        });
        jPanel1.add(CatName, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 203, 217, 32));

        CatID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatIDActionPerformed(evt);
            }
        });
        jPanel1.add(CatID, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 150, 217, 32));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 253, -1, -1));

        CatQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatQtyActionPerformed(evt);
            }
        });
        jPanel1.add(CatQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 256, 217, 32));

        AddBtn.setFont(new java.awt.Font("Book Antiqua", 1, 22)); // NOI18N
        AddBtn.setText("ADD");
        AddBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 354, -1, -1));

        EditBtn.setFont(new java.awt.Font("Book Antiqua", 1, 22)); // NOI18N
        EditBtn.setText("EDIT");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        jPanel1.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 354, -1, -1));

        HomeBtn.setFont(new java.awt.Font("Book Antiqua", 1, 22)); // NOI18N
        HomeBtn.setText("HOME");
        HomeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 425, -1, -1));

        DeleteBtn.setFont(new java.awt.Font("Book Antiqua", 1, 22)); // NOI18N
        DeleteBtn.setText("DELETE\n\n\n");
        DeleteBtn.setActionCommand("BACK");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 425, -1, -1));

        Cat_Table.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        Cat_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CategoryID", "Name", "Quantity", "Sold"
            }
        ));
        Cat_Table.setRowHeight(25);
        Cat_Table.setSelectionBackground(new java.awt.Color(0, 153, 255));
        Cat_Table.setSelectionForeground(new java.awt.Color(0, 153, 255));
        jScrollPane1.setViewportView(Cat_Table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 147, 605, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setForeground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1043, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 599, 1043, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1043, 608));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatNameActionPerformed

    private void CatIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatIDActionPerformed

    private void CatQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatQtyActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection(urlConn, userName, passWord);
            St = Con.prepareStatement("insert into category(cat_ID, cat_name, cat_qty)value(?,?,?)");
            St.setString(1, CatID.getText());
            St.setString(2, CatName.getText());
            St.setString(3, CatQty.getText());
            St.executeUpdate();
            JOptionPane.showMessageDialog(this, "Category Successfully Added");
            updateDB();   
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(CATEGORY_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(CATEGORY_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection(urlConn, userName, passWord);
            St = Con.prepareStatement("update category set cat_ID = ?, cat_name = ?, cat_qty = ? where sl_no = ?)");
            St.setString(1, CatID.getText());
            St.setString(2, CatName.getText());
            St.setString(4, CatQty.getText());
            St.executeUpdate();
            JOptionPane.showMessageDialog(this, "Category Successfully Edited");
            updateDB();   
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(CATEGORY_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(CATEGORY_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditBtnActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        new HOME_PAGE().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        DefaultTableModel RecTable = (DefaultTableModel)Cat_Table.getModel();
        int selectedRow = Cat_Table.getSelectedRow();
        
        try
        {
            int sl_no;
            sl_no = Integer.parseInt(RecTable.getValueAt(selectedRow, 0).toString());
            int delItem = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete the item", "Warning", JOptionPane.YES_NO_OPTION);
            
            if (delItem == JOptionPane.YES_OPTION)
            {
                Class.forName("com.mysql.jdbc.Driver");
                Con = DriverManager.getConnection(urlConn, userName, passWord);
                St = Con.prepareStatement("delete from category where sl_no = ?");
                
                St.setInt(1, sl_no);
                St.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Deleted");
                updateDB();
                
                CatID.setText(" ");
                CatName.setText(" ");
                CatQty.setText(" ");
            }   
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(CUSTOMER_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(CUSTOMER_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(CATEGORY_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CATEGORY_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CATEGORY_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CATEGORY_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CATEGORY_PAGE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField CatID;
    private javax.swing.JTextField CatName;
    private javax.swing.JTextField CatQty;
    private javax.swing.JTable Cat_Table;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
