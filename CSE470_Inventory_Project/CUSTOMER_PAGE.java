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

public class CUSTOMER_PAGE extends javax.swing.JFrame {

    private static final String userName = "root";
    private static final String passWord = "1234";
    private static final String urlConn = "jdbc:mysql://localhost:3306/customer";
    
    Connection Con = null;
    PreparedStatement St = null;
    ResultSet Rs = null;
    ResultSetMetaData ptData = null;
    
    
    public CUSTOMER_PAGE() {
        initComponents();
    }

    public void updateDB()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection(urlConn, userName, passWord);
            St = Con.prepareStatement("select * from product");
            Rs = St.executeQuery();
            ptData = (ResultSetMetaData) Rs.getMetaData();
            int q = ptData.getColumnCount();
            
            DefaultTableModel RecTable = (DefaultTableModel)Customer.getModel();
            RecTable.setRowCount(0);
            
            while(Rs.next())
            {
                Vector colData = new Vector();
                int i;
                
                for (i = 1; i < q; i++)
                {
                    colData.add(Rs.getShort("sl no."));
                    colData.add(Rs.getString("customerID"));
                    colData.add(Rs.getString("cus_name"));
                    colData.add(Rs.getString("cus_phone"));
                    /*colData.add(Rs.getString("cus_order"));
                    colData.add(Rs.getString("cus_amount"));*/
                }
                RecTable.addRow(colData);
            }
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CUSTOMER_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        customerID = new javax.swing.JTextField();
        cus_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cus_phone = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Customer = new javax.swing.JTable();
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

        jLabel13.setFont(new java.awt.Font("Book Antiqua", 1, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CUSTOMER PAGE");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(259, 259, 259)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(352, 352, 352)
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CustomerID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        customerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDActionPerformed(evt);
            }
        });
        jPanel1.add(customerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 217, 32));

        cus_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_nameActionPerformed(evt);
            }
        });
        jPanel1.add(cus_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 217, 32));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone No.:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        cus_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_phoneActionPerformed(evt);
            }
        });
        jPanel1.add(cus_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 217, 32));

        AddBtn.setFont(new java.awt.Font("Book Antiqua", 1, 22)); // NOI18N
        AddBtn.setText("ADD");
        AddBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 327, -1, -1));

        EditBtn.setFont(new java.awt.Font("Book Antiqua", 1, 22)); // NOI18N
        EditBtn.setText("EDIT");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        jPanel1.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 327, -1, -1));

        DeleteBtn.setFont(new java.awt.Font("Book Antiqua", 1, 22)); // NOI18N
        DeleteBtn.setText("DELETE\n\n\n");
        DeleteBtn.setActionCommand("BACK");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 406, -1, -1));

        HomeBtn.setFont(new java.awt.Font("Book Antiqua", 1, 22)); // NOI18N
        HomeBtn.setText("HOME");
        HomeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 406, -1, -1));

        Customer.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        Customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerID", "Name", "Phone No.", "Order No.", "Order Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Customer.setRowHeight(25);
        Customer.setSelectionBackground(new java.awt.Color(0, 153, 255));
        Customer.setSelectionForeground(new java.awt.Color(0, 153, 255));
        Customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Customer);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 605, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setForeground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 592, 1060, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 601));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void customerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDActionPerformed

    private void cus_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cus_nameActionPerformed

    private void cus_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cus_phoneActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection(urlConn, userName, passWord);
            St = Con.prepareStatement("insert into customer(customerID, cus_name, cus_phone)value(?,?,?)");
            St.setString(1, customerID.getText());
            St.setString(2, cus_name.getText());
            St.setString(3, cus_phone.getText());
            St.executeUpdate();
            JOptionPane.showMessageDialog(this, "Customer Successfully Added");
            updateDB();   
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(CUSTOMER_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(CUSTOMER_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection(urlConn, userName, passWord);
            St = Con.prepareStatement("update customer set customerID = ?, cus_name = ?, cus_phone = ? where sl_no = ?");
            St.setString(1, customerID.getText());
            St.setString(2, cus_name.getText());
            St.setString(3, cus_phone.getText());
            St.executeUpdate();
            JOptionPane.showMessageDialog(this, "Customer Successfully Edited");
            updateDB();   
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(CUSTOMER_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(CUSTOMER_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        DefaultTableModel RecTable = (DefaultTableModel)Customer.getModel();
        int selectedRow = Customer.getSelectedRow();
        
        try
        {
            int sl_no;
            sl_no = Integer.parseInt(RecTable.getValueAt(selectedRow, 0).toString());
            int delItem = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete the item", "Warning", JOptionPane.YES_NO_OPTION);
            
            if (delItem == JOptionPane.YES_OPTION)
            {
                Class.forName("com.mysql.jdbc.Driver");
                Con = DriverManager.getConnection(urlConn, userName, passWord);
                St = Con.prepareStatement("delete from customer where sl_no = ?");
                
                St.setInt(1, sl_no);
                St.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Deleted");
                updateDB();
                
                customerID.setText(" ");
                cus_name.setText(" ");
                cus_phone.setText(" ");
            }   
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(CUSTOMER_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(CUSTOMER_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        new HOME_PAGE().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMouseClicked
        DefaultTableModel RecTable = (DefaultTableModel)Customer.getModel();
        int selectedRow = Customer.getSelectedRow();
        customerID.setText(RecTable.getValueAt(selectedRow, 1).toString());
        cus_name.setText(RecTable.getValueAt(selectedRow, 1).toString());
        cus_phone.setText(RecTable.getValueAt(selectedRow, 1).toString());
    }//GEN-LAST:event_CustomerMouseClicked

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
            java.util.logging.Logger.getLogger(CUSTOMER_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUSTOMER_PAGE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTable Customer;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JTextField cus_name;
    private javax.swing.JTextField cus_phone;
    private javax.swing.JTextField customerID;
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
