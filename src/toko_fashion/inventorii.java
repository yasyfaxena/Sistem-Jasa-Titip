package toko_fashion;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class inventorii extends javax.swing.JFrame {
    private Connection conn;
    private PreparedStatement statement;
    
    public inventorii() {
        initComponents();
        conn = (Connection) koneksi.DBConnection();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelInven = new javax.swing.JTable();
        btnTambahInv = new javax.swing.JButton();
        btnEditInv = new javax.swing.JButton();
        btnHapusInv = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtNamaBarangInv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHargaPcs = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesk = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        ktgInv = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tabelInven.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Barang", "Harga/pcs", "Deskripsi", "Kategori", "Stok", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelInven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelInvenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelInven);

        btnTambahInv.setBackground(new java.awt.Color(40, 141, 167));
        btnTambahInv.setText("Tambah");
        btnTambahInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahInvActionPerformed(evt);
            }
        });

        btnEditInv.setBackground(new java.awt.Color(40, 141, 167));
        btnEditInv.setText("Edit");
        btnEditInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInvActionPerformed(evt);
            }
        });

        btnHapusInv.setBackground(new java.awt.Color(40, 141, 167));
        btnHapusInv.setText("Hapus");
        btnHapusInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusInvActionPerformed(evt);
            }
        });

        jLabel11.setText("Nama Barang");

        txtNamaBarangInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaBarangInvActionPerformed(evt);
            }
        });

        jLabel2.setText("Harga/pcs");

        txtHargaPcs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaPcsActionPerformed(evt);
            }
        });

        jLabel5.setText("Deskripsi");

        jLabel9.setText("Kategori");

        txtStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokActionPerformed(evt);
            }
        });

        jLabel6.setText("Stok");

        txtDesk.setColumns(20);
        txtDesk.setRows(5);
        jScrollPane2.setViewportView(txtDesk);

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel1.setText("INVENTORI");

        btnKembali.setBackground(new java.awt.Color(40, 141, 167));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        ktgInv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kategori", "Pakaian Pria", "Pakaian Wanita", "Pakaian Anak-Anak", "Pakaian Olahraga", "Pakaian Formal", "Pakaian Kasual", "Pakaian Musim Dingin", "Pakaian Musim Panas", "Aksesori Fashion" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaBarangInv, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtHargaPcs, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ktgInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditInv)
                            .addComponent(btnHapusInv)
                            .addComponent(btnTambahInv)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnKembali)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambahInv)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapusInv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditInv))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamaBarangInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ktgInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHargaPcs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKembali)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelInvenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelInvenMouseClicked
        int row = tabelInven.getSelectedRow();
        txtNamaBarangInv.setText(tabelInven.getValueAt(row, 1).toString());
        txtHargaPcs.setText(tabelInven.getValueAt(row, 2).toString());
        txtDesk.setText(tabelInven.getValueAt(row, 3).toString());
        ktgInv.setSelectedItem(tabelInven.getValueAt(row, 4).toString());
        txtStok.setText(tabelInven.getValueAt(row, 5).toString());
    }//GEN-LAST:event_tabelInvenMouseClicked

    private void btnTambahInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahInvActionPerformed
         try {
            String namaBarang = txtNamaBarangInv.getText();
            String deskripsi = txtDesk.getText();
            String kategori = ktgInv.getSelectedItem().toString();
            int stok = Integer.parseInt(txtStok.getText().trim());
            double hargaPerPcs = Double.parseDouble(txtHargaPcs.getText().trim());
            String status = (stok > 0) ? "Tersedia" : "Habis";

            String query = "INSERT INTO inventori (nama_barang, deskripsi, kategori, stok, hargaPcs, status) VALUES (?, ?, ?, ?, ?, ?)";
            statement = (PreparedStatement) conn.prepareStatement(query);
            statement.setString(1, namaBarang);
            statement.setString(2, deskripsi);
            statement.setString(3, kategori);
            statement.setInt(4, stok);
            statement.setDouble(5, hargaPerPcs);
            statement.setString(6, status);
            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Input Barang Berhasil");
            DefaultTableModel tbl = (DefaultTableModel) tabelInven.getModel();
            tbl.addRow(new Object[]{getMaxIdFromDatabase(), namaBarang, hargaPerPcs, deskripsi, kategori, stok, status});
            clearFields();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan Data: " + e.getMessage());
        }
    }//GEN-LAST:event_btnTambahInvActionPerformed

    private void btnEditInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInvActionPerformed
        try {
            int row = tabelInven.getSelectedRow();
            if (row != -1) {
                String namaBarang = txtNamaBarangInv.getText();
                String deskripsi = txtDesk.getText();
                String kategori = ktgInv.getSelectedItem().toString();
                int stok = Integer.parseInt(txtStok.getText().trim());
                double hargaPerPcs = Double.parseDouble(txtHargaPcs.getText().trim());
                String status = (stok > 0) ? "Tersedia" : "Habis";
                int idBarang = Integer.parseInt(tabelInven.getValueAt(row, 0).toString());

                String query = "UPDATE inventori SET nama_barang = ?, deskripsi = ?, kategori = ?, stok = ?, hargaPcs = ?, status = ? WHERE idBarang = ?";
                statement = (PreparedStatement) conn.prepareStatement(query);
                statement.setString(1, namaBarang);
                statement.setString(2, deskripsi);
                statement.setString(3, kategori);
                statement.setInt(4, stok);
                statement.setDouble(5, hargaPerPcs);
                statement.setString(6, status);
                statement.setInt(7, idBarang);
                statement.executeUpdate();

                tabelInven.setValueAt(namaBarang, row, 1);
                tabelInven.setValueAt(hargaPerPcs, row, 2);
                tabelInven.setValueAt(deskripsi, row, 3);
                tabelInven.setValueAt(kategori, row, 4);
                tabelInven.setValueAt(stok, row, 5);
                tabelInven.setValueAt(status, row, 6);

                clearFields();
                JOptionPane.showMessageDialog(null, "Data berhasil diperbarui.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed To Update Data: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditInvActionPerformed

    private void btnHapusInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusInvActionPerformed
       int row = tabelInven.getSelectedRow();
        if (row != -1) {
            int idBarang = Integer.parseInt(tabelInven.getValueAt(row, 0).toString());

            try {
                String query = "DELETE FROM inventori WHERE idBarang = ?";
                statement = (PreparedStatement) conn.prepareStatement(query);
                statement.setInt(1, idBarang);
                statement.executeUpdate();

                DefaultTableModel model = (DefaultTableModel) tabelInven.getModel();
                model.removeRow(row);

                JOptionPane.showMessageDialog(null, "Barang berhasil dihapus.");
                clearFields();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Gagal Menghapus Data: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnHapusInvActionPerformed

    private void clearFields() {
        txtNamaBarangInv.setText("");
        txtDesk.setText("");
        ktgInv.setSelectedIndex(0);
        txtStok.setText("");
        txtHargaPcs.setText("");
    }

    private int getMaxIdFromDatabase() {
        try {
            String query = "SELECT MAX(idBarang) FROM inventori";
            statement = (PreparedStatement) conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    private void loadData() {
        try {
            String query = "SELECT * FROM inventori";
            statement = (PreparedStatement) conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tabelInven.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                int idBarang = rs.getInt("idBarang");
                String namaBarang = rs.getString("nama_barang");
                double hargaPerPcs = rs.getDouble("hargaPcs");
                String deskripsi = rs.getString("deskripsi");
                String kategori = rs.getString("kategori");
                int stok = rs.getInt("stok");
                String status = rs.getString("status");

                model.addRow(new Object[]{idBarang, namaBarang, hargaPerPcs, deskripsi, kategori, stok, status});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void txtNamaBarangInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBarangInvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaBarangInvActionPerformed

    private void txtHargaPcsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaPcsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaPcsActionPerformed

    private void txtStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStokActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        dispose();
        new kasir().setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(inventorii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventorii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventorii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventorii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventorii().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditInv;
    private javax.swing.JButton btnHapusInv;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambahInv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> ktgInv;
    private javax.swing.JTable tabelInven;
    private javax.swing.JTextArea txtDesk;
    private javax.swing.JTextField txtHargaPcs;
    private javax.swing.JTextField txtNamaBarangInv;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}
