/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookTrading.seller;

/**
 *
 * @author Ulis
 */
public class BookSellerGuiImpl extends javax.swing.JFrame implements BookSellerGui {
    private BookSellerAgent myAgent;
    
    /**
     * Creates new form BookSellerGuiImpl
     */
    public BookSellerGuiImpl() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NamaPelanggan = new javax.swing.JLabel();
        NamaPelanggan1 = new javax.swing.JLabel();
        judulNovelMajalah = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        HargaPerHari = new javax.swing.JLabel();
        awalPeminjaman = new javax.swing.JLabel();
        awalPeminjaman1 = new javax.swing.JLabel();
        statusPesanan = new javax.swing.JLabel();
        awalPeminjaman3 = new javax.swing.JLabel();
        awalPeminjaman4 = new javax.swing.JLabel();
        konfirmasiStatus = new javax.swing.JButton();
        isiJudul = new javax.swing.JTextField();
        isiHargaPerHari = new javax.swing.JTextField();
        isiNamaPelanggan = new javax.swing.JTextField();
        isiAlamat = new javax.swing.JTextField();
        isiAwalPeminjaman = new javax.swing.JTextField();
        isiAkhirPeminjaman = new javax.swing.JTextField();
        isiStatus = new javax.swing.JTextField();
        ubahStatusPesanan = new javax.swing.JComboBox();
        totalHarga = new javax.swing.JLabel();
        isiTotalHarga = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NamaPelanggan.setText("Pelanggan");

        judulNovelMajalah.setText("Judul");

        alamat.setText("Alamat");

        HargaPerHari.setText("Harga/Hari");

        awalPeminjaman.setText("Awal Peminjaman");

        awalPeminjaman1.setText("Akhir Peminjaman");

        statusPesanan.setText("Status");

        awalPeminjaman3.setText("Ubah Status");

        awalPeminjaman4.setText("Konfirmasi?");

        konfirmasiStatus.setText("Submit");
        konfirmasiStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konfirmasiStatusActionPerformed(evt);
            }
        });

        isiJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiJudulActionPerformed(evt);
            }
        });

        isiAkhirPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiAkhirPeminjamanActionPerformed(evt);
            }
        });

        ubahStatusPesanan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Di kirim ke pelanggan", "Di pelanggan", "Selesai" }));
        ubahStatusPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahStatusPesananActionPerformed(evt);
            }
        });

        totalHarga.setText("Total Harga");

        jLabel1.setText("Daftar Peminjaman");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(isiJudul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(isiHargaPerHari, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(judulNovelMajalah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NamaPelanggan1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(HargaPerHari)
                        .addGap(34, 34, 34)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isiTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(isiNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(isiAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(totalHarga)
                                .addGap(52, 52, 52)
                                .addComponent(NamaPelanggan)
                                .addGap(60, 60, 60)
                                .addComponent(alamat)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isiAwalPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(awalPeminjaman))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(awalPeminjaman1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isiAkhirPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(isiStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ubahStatusPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(konfirmasiStatus)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(statusPesanan)
                                .addGap(61, 61, 61)
                                .addComponent(awalPeminjaman3)
                                .addGap(63, 63, 63)
                                .addComponent(awalPeminjaman4)
                                .addGap(20, 20, 20))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaPelanggan)
                    .addComponent(NamaPelanggan1)
                    .addComponent(alamat)
                    .addComponent(HargaPerHari)
                    .addComponent(judulNovelMajalah)
                    .addComponent(awalPeminjaman)
                    .addComponent(awalPeminjaman1)
                    .addComponent(statusPesanan)
                    .addComponent(awalPeminjaman3)
                    .addComponent(awalPeminjaman4)
                    .addComponent(totalHarga))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(konfirmasiStatus)
                    .addComponent(isiJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isiHargaPerHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isiNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isiAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isiAwalPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isiAkhirPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isiStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ubahStatusPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isiTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void konfirmasiStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konfirmasiStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_konfirmasiStatusActionPerformed

    private void isiJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiJudulActionPerformed

    private void isiAkhirPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiAkhirPeminjamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiAkhirPeminjamanActionPerformed

    private void ubahStatusPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahStatusPesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubahStatusPesananActionPerformed

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
            java.util.logging.Logger.getLogger(BookSellerGuiImpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookSellerGuiImpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookSellerGuiImpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookSellerGuiImpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookSellerGuiImpl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HargaPerHari;
    private javax.swing.JLabel NamaPelanggan;
    private javax.swing.JLabel NamaPelanggan1;
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel awalPeminjaman;
    private javax.swing.JLabel awalPeminjaman1;
    private javax.swing.JLabel awalPeminjaman3;
    private javax.swing.JLabel awalPeminjaman4;
    private javax.swing.JTextField isiAkhirPeminjaman;
    private javax.swing.JTextField isiAlamat;
    private javax.swing.JTextField isiAwalPeminjaman;
    private javax.swing.JTextField isiHargaPerHari;
    private javax.swing.JTextField isiJudul;
    private javax.swing.JTextField isiNamaPelanggan;
    private javax.swing.JTextField isiStatus;
    private javax.swing.JTextField isiTotalHarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel judulNovelMajalah;
    private javax.swing.JButton konfirmasiStatus;
    private javax.swing.JLabel statusPesanan;
    private javax.swing.JLabel totalHarga;
    private javax.swing.JComboBox ubahStatusPesanan;
    // End of variables declaration//GEN-END:variables

    public void setAgent(BookSellerAgent a) {
        myAgent = a;
        setTitle(myAgent.getName());
    }

    @Override
    public void notifyUser(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
