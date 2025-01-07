/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Main.KoneksiDatabase;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * a
 */
public class form_rawat extends javax.swing.JFrame {

    /**
     * Creates new form form_rawat
     */
    public form_rawat() {
        initComponents();
    }

    form_rawat(String norm, String r1, String r2, String r3, String nama_dokter) throws SQLException {
        initComponents();
        lnNorm.setText(norm);
        lbNama.setText(r1);
        lbKel.setText(r3);
        tanggal.setText(r2);
        tanggal.hide();
        nama.setText(nama_dokter);
        nama.hide();
        Tanggal tgl = new Tanggal();
        jLabel9.setText(tgl.getTanggal());
        selectTanggal();
        jLabel10.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
    }

    public class Tanggal {

        private String getTanggal() {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            return dateFormat.format(date);
        }
    }

    public void selectTanggal() {
        String tahun, bulan, hari;
        tahun = jLabel9.getText().substring(2, 4);
        bulan = jLabel9.getText().substring(5, 7);
        hari = jLabel9.getText().substring(8, 10);
        jLabel10.setText(tahun + bulan + hari);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lnNorm = new javax.swing.JLabel();
        lbNama = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kel = new javax.swing.JLabel();
        lbKel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tindakan = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        diagnosa = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        resep = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        tensi = new javax.swing.JTextField();
        btn_selesai = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        bb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tinggi = new javax.swing.JTextField();
        tanggal = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FORM RAWAT");

        jPanel1.setBackground(new java.awt.Color(56, 199, 203));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("NIK Pasien                   :");

        lnNorm.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        lbNama.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Nama                             :");

        kel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        kel.setText("Keluhan                        :");

        lbKel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Uraian Pemeriksaan   :");

        tindakan.setColumns(20);
        tindakan.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tindakan.setRows(5);
        jScrollPane1.setViewportView(tindakan);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Diagnosa                      :");

        diagnosa.setColumns(20);
        diagnosa.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        diagnosa.setRows(5);
        jScrollPane2.setViewportView(diagnosa);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Resep                           :");

        resep.setColumns(20);
        resep.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        resep.setRows(5);
        jScrollPane3.setViewportView(resep);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("Tekanan Darah             :");

        tensi.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        btn_selesai.setBackground(new java.awt.Color(204, 204, 204));
        btn_selesai.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_selesai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/check.png"))); // NOI18N
        btn_selesai.setText("SELESAI");
        btn_selesai.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selesaiActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/rm.jpg"))); // NOI18N
        jButton1.setText("RIWAYAT PASIEN");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("Berat Badan(kg)  :");

        bb.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setText("Tinggi(cm)  :");

        tinggi.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(kel)
                            .addGap(18, 18, 18)
                            .addComponent(lbKel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(lbNama, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(tensi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(lnNorm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton1))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(19, 19, 19)
                                    .addComponent(jScrollPane3))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addComponent(jScrollPane2))))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_selesai, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lnNorm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lbNama))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kel)
                    .addComponent(lbKel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(bb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_selesai, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(135, 135, 135)
                .addComponent(tanggal)
                .addGap(35, 35, 35)
                .addComponent(nama)
                .addGap(97, 97, 97)
                .addComponent(jLabel9)
                .addGap(77, 77, 77))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tanggal)
                            .addComponent(nama)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String no_rm = lnNorm.getText();
        form_pasien fp;
        try {
            fp = new form_pasien(no_rm);
            fp.show();
        } catch (SQLException ex) {
            Logger.getLogger(form_rawat.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public void generateID() throws SQLException {
        Connection kon = KoneksiDatabase.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Ambil tanggal saat ini (format: yyMMdd)
            String currentDate = new SimpleDateFormat("yyMMdd").format(new java.util.Date());

            // Query untuk mendapatkan ID terbaru berdasarkan tanggal saat ini
            String sql = "SELECT no_periksa FROM tb_riwayat WHERE no_periksa LIKE ? ORDER BY no_periksa DESC LIMIT 1";
            pst = kon.prepareStatement(sql);
            pst.setString(1, currentDate + "%"); // Filter ID berdasarkan tanggal

            rs = pst.executeQuery();

            String newId;
            if (rs.next()) {
                // Ambil nomor terakhir (bagian NNN dari ID)
                String latestId = rs.getString("no_periksa");
                int sequenceNumber = Integer.parseInt(latestId.substring(6)); // Ambil bagian NNN
                sequenceNumber++; // Tambahkan 1 ke nomor terakhir

                // Format ID baru
                newId = currentDate + String.format("%03d", sequenceNumber);
            } else {
                // Jika belum ada data untuk tanggal saat ini, mulai dari 001
                newId = currentDate + "001";
            }

            // Pastikan ID baru tidak duplikat dengan pengecekan eksplisit
            while (isIdExists(kon, newId)) {
                // Jika ID sudah ada, increment sequence lagi
                int sequenceNumber = Integer.parseInt(newId.substring(6)) + 1;
                newId = currentDate + String.format("%03d", sequenceNumber);
            }

            // Set ID baru ke jLabel11
            jLabel11.setText(newId);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            // Pastikan resource ditutup
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
        }
    }

    /**
     * Helper method untuk memeriksa apakah ID sudah ada di database.
     */
    private boolean isIdExists(Connection kon, String id) throws SQLException {
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT COUNT(*) FROM tb_riwayat WHERE no_periksa = ?";
            pst = kon.prepareStatement(sql);
            pst.setString(1, id);

            rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
        }
        return false;
    }


    private void btn_selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selesaiActionPerformed
        try {
            generateID();
            if (diagnosa.getText().equals("") || tindakan.getText().equals("") || tensi.getText().equals("") || resep.getText().equals("") || tinggi.getText().equals("") || bb.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Hasil pemeriksaan harus lengkap", "Error", 1);
            } else {
                try {
                    Connection kon = KoneksiDatabase.getConnection();
                    Statement st = kon.createStatement();
                    String riwayat = "insert into tb_riwayat(no_periksa, no_rm, tanggal_periksa, tindakan, diagnosa, resep, tekanan_darah, keluhan, nama_dokter, berat, tinggi) values ('" + jLabel11.getText() + "','" + lnNorm.getText() + "','" + tanggal.getText() + "','" + tindakan.getText() + "','" + diagnosa.getText() + "','" + resep.getText() + "','" + tensi.getText() + "','" + lbKel.getText() + "','" + nama.getText() + "','" + bb.getText() + "','" + tinggi.getText() + "')";
                    st.executeUpdate(riwayat);
                    JOptionPane.showMessageDialog(null, "Pemeriksaan berhasil");
                    this.dispose();
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(form_rawat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_selesaiActionPerformed

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
            java.util.logging.Logger.getLogger(form_rawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_rawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_rawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_rawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_rawat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bb;
    private javax.swing.JButton btn_selesai;
    private javax.swing.JTextArea diagnosa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel kel;
    private javax.swing.JLabel lbKel;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lnNorm;
    private javax.swing.JLabel nama;
    private javax.swing.JTextArea resep;
    private javax.swing.JLabel tanggal;
    private javax.swing.JTextField tensi;
    private javax.swing.JTextArea tindakan;
    private javax.swing.JTextField tinggi;
    // End of variables declaration//GEN-END:variables
}
