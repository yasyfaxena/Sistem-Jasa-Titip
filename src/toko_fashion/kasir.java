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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.print.PrinterException;
import javax.swing.JTextArea;


public class kasir extends javax.swing.JFrame {
    private Connection conn;
    private PreparedStatement statement;
    public kasir() {
        initComponents();
        conn = (Connection) koneksi.DBConnection();
        tabel.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting() && tabel.getSelectedRow() != -1) {
                    int selectedRow = tabel.getSelectedRow();
                    txtNamaBarang.setText(tabel.getValueAt(selectedRow, 1).toString());
                    txtHargaBarang.setText(tabel.getValueAt(selectedRow, 2).toString());
                    txtJumlah.setText(tabel.getValueAt(selectedRow, 3).toString());
                    txtUkuran.setText(tabel.getValueAt(selectedRow, 4).toString());
                }
            }
        });
        
        txtNamaBarang.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                updateHargaBarang();
            }
            public void removeUpdate(DocumentEvent e) {
                updateHargaBarang();
            }
            public void insertUpdate(DocumentEvent e) {
                updateHargaBarang();
            }
        });
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHargaBarang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtTanggal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        totalSeluruh = new javax.swing.JTextField();
        jPembayaran = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JTextField();
        txtKembalian = new javax.swing.JTextField();
        btnCetak = new javax.swing.JButton();
        bayarBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtUkuran = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnInvenn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        btnTransaksi = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        txtNamaBarang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));
        setResizable(false);

        jLabel2.setText("Harga Barang");

        txtHargaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaBarangActionPerformed(evt);
            }
        });

        jLabel3.setText("Jenis Pembayaran");

        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Barang", "Harga Barang", "Jumlah ", "Ukuran", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        btnTambah.setBackground(new java.awt.Color(40, 141, 167));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(40, 141, 167));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(40, 141, 167));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(40, 141, 167));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txtTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalActionPerformed(evt);
            }
        });

        jLabel4.setText("Tanggal ");

        jPembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash/Tunai", "DANA", "OVO", " " }));

        jLabel5.setText("Jumlah ");

        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });

        jLabel6.setText("Bayar");

        jLabel7.setText("Total Harga");

        jLabel8.setText("Kembalian");

        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });

        txtKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKembalianActionPerformed(evt);
            }
        });

        btnCetak.setBackground(new java.awt.Color(102, 102, 102));
        btnCetak.setText("Cetak Transaksi");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        bayarBtn.setBackground(new java.awt.Color(40, 141, 167));
        bayarBtn.setText("Bayar");
        bayarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Ukuran");

        txtUkuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUkuranActionPerformed(evt);
            }
        });

        jLabel11.setText("Nama Barang");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toko_fashion/bgg r.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toko_fashion/riwayat edit.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toko_fashion/absensi edit.png"))); // NOI18N

        btnInvenn.setText("Inventori");
        btnInvenn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvennActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toko_fashion/inventori edit.png"))); // NOI18N

        jButton13.setText("Absensi");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        btnTransaksi.setText("Riwayat Transaksi");
        btnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiActionPerformed(evt);
            }
        });

        btnKeluar.setBackground(new java.awt.Color(40, 141, 167));
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(394, 394, 394))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInvenn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnKeluar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(btnInvenn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127)
                .addComponent(btnKeluar)
                .addContainerGap())
        );

        txtNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))
                                .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(143, 143, 143)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnTambah)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnEdit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnHapus))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bayarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnClear)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTanggal))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(totalSeluruh, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(totalSeluruh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah)
                            .addComponent(btnEdit)
                            .addComponent(btnHapus)
                            .addComponent(btnClear))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bayarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHargaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaBarangActionPerformed

    }//GEN-LAST:event_txtHargaBarangActionPerformed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int row = tabel.getSelectedRow();
        if (row != -1) {
            DefaultTableModel model = (DefaultTableModel) tabel.getModel();
            int idBarang = Integer.parseInt(tabel.getValueAt(row, 0).toString());

            try {
                String query = "DELETE FROM barang WHERE id_barang = ?";
                statement = (PreparedStatement) conn.prepareStatement(query);
                statement.setInt(1, idBarang);
                statement.executeUpdate();

                JOptionPane.showMessageDialog(null, "Barang berhasil dihapus.");
            } catch (Exception e) {
                e.printStackTrace();
            }

            model.removeRow(row);
            updateTotalHarga();
            clearFields();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalActionPerformed

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBayarActionPerformed

    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHargaActionPerformed

    private void txtKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKembalianActionPerformed

    private void txtUkuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUkuranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUkuranActionPerformed

    private void btnInvennActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvennActionPerformed
        // TODO add your handling code here:
        dispose();
        new inventorii().setVisible(true);
    }//GEN-LAST:event_btnInvennActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void btnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiActionPerformed
        // TODO add your handling code here:
         dispose();
        new transaksi().setVisible(true);
    }//GEN-LAST:event_btnTransaksiActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
      try {
            String namaBarang = txtNamaBarang.getText();
            int hargaBarang = Integer.parseInt(txtHargaBarang.getText().trim());
            int jumlah = Integer.parseInt(txtJumlah.getText().trim());
            String ukuran = txtUkuran.getText();
            int totalSementara = jumlah * hargaBarang;

            String query = "INSERT INTO barang (nama_barang, harga_barang, jumlah, ukuran) VALUES (?, ?, ?, ?)";
            statement = (PreparedStatement) conn.prepareStatement(query);
            statement.setString(1, namaBarang);
            statement.setInt(2, hargaBarang);
            statement.setInt(3, jumlah);
            statement.setString(4, ukuran);
            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Input Barang Berhasil");

            DefaultTableModel tbl = (DefaultTableModel) tabel.getModel();
            tbl.addRow(new Object[]{getMaxIdFromDatabase(), namaBarang, hargaBarang, jumlah, ukuran, totalSementara});

            updateTotalHarga();
            clearFields();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTambahActionPerformed
    
    
    private void txtNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBarangActionPerformed
        updateHargaBarang();
    }//GEN-LAST:event_txtNamaBarangActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
         try {
            int row = tabel.getSelectedRow();
            if (row != -1) {
                String namaBarang = txtNamaBarang.getText();
                int hargaBarang = Integer.parseInt(txtHargaBarang.getText().trim());
                int jumlah = Integer.parseInt(txtJumlah.getText().trim());
                String ukuran = txtUkuran.getText();
                int idBarang = Integer.parseInt(tabel.getValueAt(row, 0).toString());

                String query = "UPDATE barang SET nama_barang = ?, harga_barang = ?, jumlah = ?, ukuran = ? WHERE id_barang = ?";
                statement = (PreparedStatement) conn.prepareStatement(query);
                statement.setString(1, namaBarang);
                statement.setInt(2, hargaBarang);
                statement.setInt(3, jumlah);
                statement.setString(4, ukuran);
                statement.setInt(5, idBarang);
                statement.executeUpdate();

                int totalSementara = hargaBarang * jumlah;

                tabel.setValueAt(namaBarang, row, 1);
                tabel.setValueAt(hargaBarang, row, 2);
                tabel.setValueAt(jumlah, row, 3);
                tabel.setValueAt(ukuran, row, 4);
                tabel.setValueAt(totalSementara, row, 5);

                updateTotalHarga();
                clearFields();

                JOptionPane.showMessageDialog(null, "Data berhasil diperbarui.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed To Update Data: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed
    
    private void updateTotalHarga() {
        int rowCount = tabel.getRowCount();
        int totalHarga = 0;
        for (int i = 0; i < rowCount; i++) {
            int totalSementara = Integer.parseInt(tabel.getValueAt(i, 5).toString());
            totalHarga += totalSementara;
        }
        txtTotalHarga.setText("Rp. " + totalHarga);
        totalSeluruh.setText("Rp." + totalHarga);
    }
    
    private int getMaxIdFromDatabase() {
        try {
            String query = "SELECT MAX(id_barang) FROM barang";
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
  
    private void updateHargaBarang() {
        String namaBarang = txtNamaBarang.getText().trim();
        if (!namaBarang.isEmpty()) {
            try {
                String query = "SELECT hargaPcs FROM inventori WHERE nama_barang = ?";
                statement = (PreparedStatement) conn.prepareStatement(query);
                statement.setString(1, namaBarang);
                ResultSet rs = statement.executeQuery();
                if (rs.next()) {
                    System.out.println("WOI");
                    int hargaBarang = rs.getInt("hargaPcs");
                    txtHargaBarang.setText(String.valueOf(hargaBarang));
                } else {
                    txtHargaBarang.setText("");
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Gagal Mengambil Harga: " + e.getMessage());
            }
        } else {
            txtHargaBarang.setText("");
        }
}
    
    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int row = tabel.getSelectedRow();
        txtNamaBarang.setText(tabel.getValueAt(row, 1).toString());
        txtHargaBarang.setText(tabel.getValueAt(row, 2).toString());
        txtJumlah.setText(tabel.getValueAt(row, 3).toString());
        txtUkuran.setText(tabel.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tabelMouseClicked

    private void bayarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarBtnActionPerformed
        try {
            String jenisPembayaran = jPembayaran.getSelectedItem().toString();
            int bayar = Integer.parseInt(txtBayar.getText().trim());

            String pattern = "yyyy-MM-dd HH:mm:ss";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String tanggal = simpleDateFormat.format(new Date());

            DefaultTableModel model = (DefaultTableModel) tabel.getModel();
            int rowCount = model.getRowCount();
            int totalHargaSeluruh = 0;

            for (int i = 0; i < rowCount; i++) {
                String namaBarang = model.getValueAt(i, 1).toString();
                int hargaBarang = Integer.parseInt(model.getValueAt(i, 2).toString());
                int jumlah = Integer.parseInt(model.getValueAt(i, 3).toString());
                String ukuran = model.getValueAt(i, 4).toString();
                int totalHarga = Integer.parseInt(model.getValueAt(i, 5).toString());

                totalHargaSeluruh += totalHarga;

                String query = "INSERT INTO riwayat_transaksi (nama_barang, harga_barang, jumlah, ukuran, total_harga, jenis_pembayaran, kembalian, tanggal) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                statement = (PreparedStatement) conn.prepareStatement(query);
                statement.setString(1, namaBarang);
                statement.setInt(2, hargaBarang);
                statement.setInt(3, jumlah);
                statement.setString(4, ukuran);
                statement.setInt(5, totalHarga);
                statement.setString(6, jenisPembayaran);
                statement.setInt(7, 0);
                statement.setString(8, tanggal);
                statement.executeUpdate();

                updateStokBarang(namaBarang, jumlah);
            }

            int kembalian = bayar - totalHargaSeluruh;
            if (kembalian < 0) {
                JOptionPane.showMessageDialog(null, "Jumlah yang dibayarkan kurang!");
                return;
            }

            txtKembalian.setText(String.valueOf(kembalian));
            txtTanggal.setText(tanggal);

            String updateKembalianQuery = "UPDATE riwayat_transaksi SET kembalian = ? WHERE tanggal = ?";
            statement = (PreparedStatement) conn.prepareStatement(updateKembalianQuery);
            statement.setInt(1, kembalian);
            statement.setString(2, tanggal);
            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Transaksi Berhasil!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan Transaksi : " + e.getMessage());
        }
    }//GEN-LAST:event_bayarBtnActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin keluar? ", " Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
         try {
        JTextArea textArea = new JTextArea();
        textArea.append("Daftar Transaksi\n");
        textArea.append("Tanggal: " + txtTanggal.getText() + "\n\n");

        DefaultTableModel model = (DefaultTableModel) tabel.getModel();
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            textArea.append("No: " + model.getValueAt(i, 0).toString() + "\n");
            textArea.append("Nama Barang: " + model.getValueAt(i, 1).toString() + "\n");
            textArea.append("Harga Barang: " + model.getValueAt(i, 2).toString() + "\n");
            textArea.append("Jumlah: " + model.getValueAt(i, 3).toString() + "\n");
            textArea.append("Ukuran: " + model.getValueAt(i, 4).toString() + "\n");
            textArea.append("Total: " + model.getValueAt(i, 5).toString() + "\n");
            textArea.append("------------------------\n");
        }

        textArea.append("Total Harga: " + txtTotalHarga.getText() + "\n");
        textArea.append("Bayar: " + txtBayar.getText() + "\n");
        textArea.append("Kembalian: " + txtKembalian.getText() + "\n");

        boolean complete = textArea.print();
        if (complete) {
            JOptionPane.showMessageDialog(null, "Transaksi berhasil dicetak!");
        } else {
            JOptionPane.showMessageDialog(null, "Pencetakan dibatalkan.");
        }
    } catch (PrinterException e) {
        JOptionPane.showMessageDialog(null, "Gagal mencetak transaksi: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnCetakActionPerformed
   
    private void updateStokBarang(String namaBarang, int jumlahTerjual) {
        try {
            String query = "UPDATE inventori SET stok = stok - ? WHERE nama_barang = ?";
            statement = (PreparedStatement) conn.prepareStatement(query);
            statement.setInt(1, jumlahTerjual);
            statement.setString(2, namaBarang);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal Mengupdate Stok : " + e.getMessage());
        }
    }
    
    private void clearFields() {
        txtNamaBarang.setText("");
        txtHargaBarang.setText("");
        txtJumlah.setText("");
        txtUkuran.setText("");
        txtBayar.setText("");
        txtKembalian.setText("");
        txtTanggal.setText("");
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
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bayarBtn;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnInvenn;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTransaksi;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jPembayaran;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField totalSeluruh;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtHargaBarang;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTotalHarga;
    private javax.swing.JTextField txtUkuran;
    // End of variables declaration//GEN-END:variables
 
}
