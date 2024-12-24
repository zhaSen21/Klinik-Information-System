/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Main.KoneksiDatabase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * a
 */
public class inputDataPegawai extends javax.swing.JFrame {

    /**
     * Creates new form inputDataPegawai
     */
    public inputDataPegawai() {
        initComponents();   
    }
    inputDataPegawai(String tahun) throws SQLException {
        initComponents();
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel11.setText(tahun);
        jLabel10.hide();
        iJadwalPraktek.hide();       
    }
    
     public void FilterHanyaAngka(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE))
                )
            )
        {
            evt.consume();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_submit = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pilihData = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        iNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        iAlamat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        iNohp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        iUname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        iPwd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        iJabatan = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        iJadwalPraktek = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FORM INPUT");

        btn_submit.setBackground(new java.awt.Color(255, 255, 255));
        btn_submit.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/add.jpg"))); // NOI18N
        btn_submit.setText("SUBMIT");
        btn_submit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_submit.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(255, 255, 255));
        btn_back.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/b.jpg"))); // NOI18N
        btn_back.setText("BACK");
        btn_back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_back.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(56, 199, 203));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setText("Silahkan masukan data !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("Semua data wajib diisi");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Pilih data yang akan diinput");

        pilihData.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pilihData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pegawai", "Dokter" }));
        pilihData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihDataActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORM INPUT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Nama                     :");

        iNama.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        iNama.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iNamaActionPerformed(evt);
            }
        });
        iNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iNamaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Alamat                   :");

        iAlamat.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        iAlamat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iAlamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iAlamatKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("NO. HP                  :");

        iNohp.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        iNohp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iNohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iNohpActionPerformed(evt);
            }
        });
        iNohp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iNohpKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Username             :");

        iUname.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        iUname.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iUname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iUnameKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Password             :");

        iPwd.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        iPwd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iPwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iPwdKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Jabatan                 :");

        iJabatan.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        iJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Resepsionis" }));
        iJabatan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        iJabatan.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                iJabatanComponentHidden(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("Jadwal Praktek    :");

        iJadwalPraktek.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        iJadwalPraktek.setText("ex: Rabu 09:00-16:00");
        iJadwalPraktek.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iJadwalPraktek, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(iNama, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iAlamat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iNohp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iUname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iPwd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(iJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(iNama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iNohp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iUname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iJadwalPraktek, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 247, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_back)
                                .addGap(18, 18, 18)
                                .addComponent(btn_submit)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(pilihData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pilihData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_submit)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iNohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iNohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iNohpActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
    String jenisInput = (String) pilihData.getSelectedItem();
    switch (jenisInput){
        case "Pegawai":
        try {
            inputDataP();
        } catch (SQLException ex) {
            Logger.getLogger(inputDataPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
        case "Dokter":
        try {
            inputDataD();
        } catch (SQLException ex) {
            Logger.getLogger(inputDataPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }  
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void iNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iNamaKeyTyped
                if ( iNama.getText().length() == 25 ) {
                evt.consume();
            }
    }//GEN-LAST:event_iNamaKeyTyped

    private void iAlamatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iAlamatKeyTyped
        if ( iAlamat.getText().length() == 40 ) {
                evt.consume();
            }
    }//GEN-LAST:event_iAlamatKeyTyped

    private void iNohpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iNohpKeyTyped
        if ( iNohp.getText().length() == 12 ) {
                evt.consume();
            }
        FilterHanyaAngka(evt);

    }//GEN-LAST:event_iNohpKeyTyped

    private void iUnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iUnameKeyTyped
        if ( iUname.getText().length() == 10 ) {
                evt.consume();
            }
    }//GEN-LAST:event_iUnameKeyTyped

    private void iPwdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iPwdKeyTyped
        if ( iPwd.getText().length() == 10 ) {
                evt.consume();
            }
    }//GEN-LAST:event_iPwdKeyTyped

    private void iJabatanComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_iJabatanComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_iJabatanComponentHidden

    private void pilihDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihDataActionPerformed
        if (pilihData.getSelectedItem()=="Pegawai"){
            iJabatan.show();
            jLabel6.show();
            jLabel10.hide();
            iJadwalPraktek.hide();       
        }
        else{
            iJadwalPraktek.show();
            jLabel10.show();
            jLabel6.hide();
            iJabatan.hide();
        }
    }//GEN-LAST:event_pilihDataActionPerformed

    private void iNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iNamaActionPerformed
        
    }//GEN-LAST:event_iNamaActionPerformed
    public void generateIdP() throws SQLException{
        Connection kon = KoneksiDatabase.getConnection();
        Statement st;
        ResultSet rs;
        PreparedStatement ps;
        String sql;
        {
       try {
            sql="select * from tb_pegawai order by id_pegawai desc";
            st=kon.createStatement();
            rs=st.executeQuery(sql);
            if (rs.next()) {
                String id = rs.getString("id_pegawai").substring(4);
                String AN = "" +(Integer.parseInt(id) + 1);
                String Nol = "";
                switch (AN.length()) {
                    case 1:
                        Nol = "00";
                        break;
                    case 2:
                        Nol = "0";
                        break;
                    case 3:
                        Nol = "";
                        break;
                    default:
                        break;
                }
                jLabel12.setText(jLabel11.getText()+Nol+AN);
            }
            else{
                jLabel12.setText(jLabel11.getText()+"001");
            }
            }
      catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }
        }
    }
    
    public void generateIdD() throws SQLException{
        Connection kon = KoneksiDatabase.getConnection();
        Statement st;
        ResultSet rs;
        PreparedStatement ps;
        String sql;
        {
       try {
            sql="select * from tb_dokter order by id_dokter desc";
            st=kon.createStatement();
            rs=st.executeQuery(sql);
            if (rs.next()) {
                String id = rs.getString("id_dokter").substring(4);
                String AN = "" +(Integer.parseInt(id) + 1);
                String Nol = "";
                switch (AN.length()) {
                    case 1:
                        Nol = "00";
                        break;
                    case 2:
                        Nol = "0";
                        break;
                    case 3:
                        Nol = "";
                        break;
                    default:
                        break;
                }
                jLabel12.setText(jLabel11.getText()+Nol+AN);
            }
            else{
                jLabel12.setText(jLabel11.getText()+"001");
            }
            }
      catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }
        }
    }
    
    public void inputDataP() throws SQLException {
        generateIdP();
        Connection kon = KoneksiDatabase.getConnection();
        Statement st = kon.createStatement();
        if (iNama.getText().equals("")||iAlamat.getText().equals("")||iNohp.getText().equals("")||iUname.getText().equals("")||iPwd.getText().equals("")){
        JOptionPane.showMessageDialog(rootPane, "Data tidak boleh kosong", "Error", 1);
       }
        else {
           try{
               String id="01"+jLabel12.getText();
                String iDataP ="insert into tb_pegawai (id_pegawai, nama_pegawai, alamat_pegawai, telepon_pegawai, username, password, jabatan) values('"+id+"','"+iNama.getText()+"','"+iAlamat.getText()+"','"+iNohp.getText()+"','"+iUname.getText()+"','"+iPwd.getText()+"','"+iJabatan.getSelectedItem()+"')";
                st.executeUpdate(iDataP);
                JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
                this.dispose();
            }
            
            catch (HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
            }
        }

        
    
}
    public void inputDataD() throws SQLException {
        generateIdD();
        Connection kon = KoneksiDatabase.getConnection();
        Statement st = kon.createStatement();
        
        if (iNama.getText().equals("")||iAlamat.getText().equals("")||iNohp.getText().equals("")||iUname.getText().equals("")||iPwd.getText().equals("")||iJadwalPraktek.getText().equals("")){
        JOptionPane.showMessageDialog(rootPane, "Data tidak boleh kosong", "Error", 1);
       }
        else {
           try{
                String id="03"+jLabel12.getText();
                String iDataD ="insert into tb_dokter (id_dokter, nama_dokter, alamat_dokter,telepon_dokter, username, password, jadwal_praktek) values('"+id+"','"+iNama.getText()+"','"+iAlamat.getText()+"','"+iNohp.getText()+"','"+iUname.getText()+"','"+iPwd.getText()+"','"+iJadwalPraktek.getText()+"')";
                st.executeUpdate(iDataD);
                JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
                this.dispose();
            }
            
            catch (HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
            }
        }
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
            java.util.logging.Logger.getLogger(inputDataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputDataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputDataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputDataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputDataPegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_submit;
    private javax.swing.JTextField iAlamat;
    private javax.swing.JComboBox<String> iJabatan;
    private javax.swing.JTextField iJadwalPraktek;
    private javax.swing.JTextField iNama;
    private javax.swing.JTextField iNohp;
    private javax.swing.JTextField iPwd;
    private javax.swing.JTextField iUname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JComboBox<String> pilihData;
    // End of variables declaration//GEN-END:variables
}
