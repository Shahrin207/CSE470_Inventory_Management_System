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


public class PRODUCT_PAGE extends javax.swing.JFrame {

    private static final String userName = "root";
    private static final String passWord = "1234";
    private static final String urlConn = "jdbc:mysql://localhost:3306/product";
    
    Connection Con = null;
    PreparedStatement St = null;
    ResultSet Rs = null;
    ResultSetMetaData ptData = null;
    
    
    public PRODUCT_PAGE() {
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
            
            DefaultTableModel RecTable = (DefaultTableModel)Product.getModel();
            RecTable.setRowCount(0);
            
            while(Rs.next())
            {
                Vector colData = new Vector();
                int i;
                
                for (i = 1; i < q; i++)
                {
                    colData.add(Rs.getShort("sl no."));
                    colData.add(Rs.getString("productID"));
                    colData.add(Rs.getString("product_name"));
                    colData.add(Rs.getString("product_price"));
                    colData.add(Rs.getString("product_qty"));
                    colData.add(Rs.getString("product_cat"));
                }
                RecTable.addRow(colData);
            }
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PRODUCT_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*public void showProduct() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Con = DriverManager.getConnection(urlConn, userName, passWord);
        St = (PreparedStatement) Con.createStatement();
        Rs = St.executeQuery();
        ProductTable.setModel(DubUtils.resultSetToTableModel(Rs));
    }*/
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ProdName = new javax.swing.JTextField();
        ProductID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Prod_Qty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Prod_Price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Prod_Cat = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Product = new javax.swing.JTable();
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
        jLabel13.setText("PRODUCT\n");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(239, 239, 239)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1056, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ProductID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 147, -1, -1));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 200, -1, -1));

        ProdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdNameActionPerformed(evt);
            }
        });
        jPanel1.add(ProdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 203, 217, 32));

        ProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductIDActionPerformed(evt);
            }
        });
        jPanel1.add(ProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 150, 217, 32));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 253, -1, -1));

        Prod_Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prod_QtyActionPerformed(evt);
            }
        });
        jPanel1.add(Prod_Qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 309, 217, 32));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 306, -1, -1));

        Prod_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prod_PriceActionPerformed(evt);
            }
        });
        jPanel1.add(Prod_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 256, 217, 32));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Category:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 359, -1, -1));

        Prod_Cat.setBackground(new java.awt.Color(204, 204, 204));
        Prod_Cat.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        Prod_Cat.setForeground(new java.awt.Color(255, 255, 255));
        Prod_Cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(Prod_Cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 359, 217, 32));

        AddBtn.setFont(new java.awt.Font("Book Antiqua", 1, 22)); // NOI18N
        AddBtn.setText("ADD");
        AddBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 463, -1, -1));

        EditBtn.setFont(new java.awt.Font("Book Antiqua", 1, 22)); // NOI18N
        EditBtn.setText("EDIT");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        jPanel1.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 463, -1, -1));

        HomeBtn.setFont(new java.awt.Font("Book Antiqua", 1, 22)); // NOI18N
        HomeBtn.setText("HOME");
        HomeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 544, -1, -1));

        DeleteBtn.setFont(new java.awt.Font("Book Antiqua", 1, 22)); // NOI18N
        DeleteBtn.setText("DELETE\n\n\n");
        DeleteBtn.setActionCommand("BACK");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 544, -1, -1));

        Product.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl_no", "ProductID", "Name", "Price", "Quantity", "Catergory"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Product.setRowHeight(25);
        Product.setSelectionBackground(new java.awt.Color(0, 153, 255));
        Product.setSelectionForeground(new java.awt.Color(0, 153, 255));
        Product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Product);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 147, 605, -1));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 702, 1056, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdNameActionPerformed

    private void ProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductIDActionPerformed

    private void Prod_QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prod_QtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Prod_QtyActionPerformed

    private void Prod_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prod_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Prod_PriceActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        
    }//GEN-LAST:event_AddBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection(urlConn, userName, passWord);
            St = Con.prepareStatement("insert into product(productID, product_name, product_price, product_qty, product_cat)value(?,?,?,?,?)");
            St.setString(1, ProductID.getText());
            St.setString(2, ProdName.getText());
            St.setString(3, Prod_Price.getText());
            St.setString(4, Prod_Qty.getText());
            St.setString(5, Prod_Cat.getSelectedItem().toString());
            St.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product Successfully Added");
            updateDB();   
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(PRODUCT_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(PRODUCT_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection(urlConn, userName, passWord);
            St = Con.prepareStatement("update product set productID = ?, product_name = ?, product_price = ?, product_qty = ?, product_cat = ? where id = ?");
            St.setString(1, ProductID.getText());
            St.setString(2, ProdName.getText());
            St.setString(3, Prod_Price.getText());
            St.setString(4, Prod_Qty.getText());
            St.setString(5, Prod_Cat.getSelectedItem().toString());
            St.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product Successfully Edited");
            updateDB();   
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(PRODUCT_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(PRODUCT_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditBtnActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        new HOME_PAGE().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        
        DefaultTableModel RecTable = (DefaultTableModel)Product.getModel();
        int selectedRow = Product.getSelectedRow();
        
        try
        {
            int id;
            id = Integer.parseInt(RecTable.getValueAt(selectedRow, 0).toString());
            int delItem = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete the item", "Warning", JOptionPane.YES_NO_OPTION);
            
            if (delItem == JOptionPane.YES_OPTION)
            {
                Class.forName("com.mysql.jdbc.Driver");
                Con = DriverManager.getConnection(urlConn, userName, passWord);
                St = Con.prepareStatement("delete from product where id = ?");
                
                St.setInt(1, id);
                St.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Deleted");
                updateDB();
                
                ProductID.setText(" ");
                ProdName.setText(" ");
                Prod_Price.setText(" ");
                Prod_Qty.setText(" ");
                Prod_Cat.setSelectedItem(" ");
            }   
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(PRODUCT_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(PRODUCT_PAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductMouseClicked
        
        DefaultTableModel RecTable = (DefaultTableModel)Product.getModel();
        int selectedRow = Product.getSelectedRow();
        
        ProductID.setText(RecTable.getValueAt(selectedRow, 1).toString());
        ProdName.setText(RecTable.getValueAt(selectedRow, 2).toString());
        Prod_Price.setText(RecTable.getValueAt(selectedRow, 3).toString());
        Prod_Qty.setText(RecTable.getValueAt(selectedRow, 4).toString());
        //Prod_Cat.setSelectedItem(RecTable.getValueAt(selectedRow, 5).toString());
        
    }//GEN-LAST:event_ProductMouseClicked

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
            java.util.logging.Logger.getLogger(PRODUCT_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRODUCT_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRODUCT_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRODUCT_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRODUCT_PAGE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JTextField ProdName;
    private javax.swing.JComboBox<String> Prod_Cat;
    private javax.swing.JTextField Prod_Price;
    private javax.swing.JTextField Prod_Qty;
    private javax.swing.JTable Product;
    private javax.swing.JTextField ProductID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
