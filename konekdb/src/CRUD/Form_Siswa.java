package CRUD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSi-GAMING
 */
public class Form_Siswa extends javax.swing.JFrame {

    private DefaultTableModel tabmode;
    private ResultSet hasil;

    Crud aa = new Crud();

    public Form_Siswa() throws SQLException {
        initComponents();
        tampil_database();

    }

    public void tampil_database() {
        Object[] baris = {"ID", "Nama", "Alamat"};
        tabmode = new DefaultTableModel(null, baris);
        table_siswa.setModel(tabmode);
        try {
            hasil = aa.tampilData();
            while (hasil.next()) {
                aa.setID(hasil.getString("id"));
                aa.setNama(hasil.getString("nama"));
                aa.setAlamat(hasil.getString("alamat"));
                String[] data = {aa.getID(), aa.getNama(), aa.getAlamat()};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }

    public void reset_text() {
        txt_id.setText("");
        txt_nama.setText("");
        txt_alamat.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        txt_nama = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_reset = new javax.swing.JButton();
        txt_ubah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_siswa = new javax.swing.JTable();
        btn_keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Data Siswa");

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel3.setText("NAMA");

        jLabel4.setText("Alamat");

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        txt_ubah.setText("ubah");
        txt_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ubahActionPerformed(evt);
            }
        });

        table_siswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"111", "anton", "blitar"},
                {"222", "ratih", "Malang"},
                {null, "", null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nama", "Alamat"
            }
        ));
        table_siswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_siswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_siswa);

        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_alamat)
                            .addComponent(txt_nama)
                            .addComponent(txt_id)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(txt_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(678, 678, 678))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_simpan)
                            .addComponent(btn_hapus)
                            .addComponent(btn_reset)
                            .addComponent(txt_ubah)
                            .addComponent(btn_keluar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(251, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        if (txt_id.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, ID belum diisi !");
            txt_id.requestFocus();
        } else if (txt_nama.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Nama belum diisi !");
            txt_nama.requestFocus();
        } else if (txt_alamat.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Alamat belum diisi !");
            txt_alamat.requestFocus();
        } else {
            try {
                aa.setID(txt_id.getText());
                aa.setNama(txt_nama.getText());
                aa.setAlamat(txt_alamat.getText());
                aa.simpanData(aa.getID(), aa.getNama(), aa.getAlamat());
                JOptionPane.showMessageDialog(null, "Data berhasil tersimpan", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);

                tampil_database();
                reset_text();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal tersimpan", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            }
}    }//GEN-LAST:event_btn_simpanActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        if (txt_id.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, ID belum diisi !");
            txt_id.requestFocus();
        } else {
            if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data ini ?", "Warning", 2) == JOptionPane.YES_OPTION) {
                String id = "";
                try {
                    aa.setID(txt_id.getText());
                    aa.hapusData(aa.getID());
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);

                    tampil_database();
                    reset_text();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data gagal dihapus", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
// TODO add your handling code here:
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
reset_text();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_resetActionPerformed

    private void txt_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ubahActionPerformed
if (txt_id.getText().trim().equals("")){
JOptionPane.showMessageDialog(null,"Maaf, ID belum diisi !");
txt_id.requestFocus();
} else if (txt_nama.getText().trim().equals("")){
JOptionPane.showMessageDialog(null,"Maaf, Nama belum diisi !");
txt_nama.requestFocus();
} else if (txt_alamat.getText().trim().equals("")){
JOptionPane.showMessageDialog(null,"Maaf, Alamat belum diisi !");
txt_alamat.requestFocus();
} else {
try { aa.setID(txt_id.getText());
aa.setNama(txt_nama.getText());
aa.setAlamat(txt_alamat.getText());
aa.ubahData(aa.getID(), aa.getNama(), aa.getAlamat());
JOptionPane.showMessageDialog(null, "Data berhasil diubah" , "Informasi",

JOptionPane.INFORMATION_MESSAGE);

tampil_database();
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "Data gagal diubah" , "Informasi",
JOptionPane.INFORMATION_MESSAGE);
}
}        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ubahActionPerformed

    private void table_siswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_siswaMouseClicked
try { int row = table_siswa.rowAtPoint(evt.getPoint());
String id = table_siswa.getValueAt(row, 0).toString();
String nama = table_siswa.getValueAt(row, 1).toString();
String alamat = table_siswa.getValueAt(row, 2).toString();
txt_id.setText(String.valueOf(id));
txt_nama.setText(String.valueOf(nama));
txt_alamat.setText(String.valueOf(alamat));
} catch (Exception e) {
}        // TODO add your handling code here:
    }//GEN-LAST:event_table_siswaMouseClicked

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan keluar ?","Warning",2)
== JOptionPane.YES_OPTION){
System.exit(0);
}        // TODO add your handling code here:
    }//GEN-LAST:event_btn_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Form_Siswa().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Form_Siswa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_siswa;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JButton txt_ubah;
    // End of variables declaration//GEN-END:variables
}
