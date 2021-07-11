package bookTrading.StockManager;

import jade.gui.TimeChooser;
import java.awt.*;
import java.awt.Event.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import javax.swing.border.*;

public class extends javax.swing.JFrame implements StockManagerGui {
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TextFieldBuku = new javax.swing.JTextField();
        TextFieldPenulisBuku = new javax.swing.JTextField();
        TextFieldKetersediaan = new javax.swing.JTextField();
        TextFieldHarga = new javax.swing.JTextField();
        ButtonAdd = new javax.swing.JButton();
        ButtonUpdate = new javax.swing.JButton();
        ButtonDelete = new javax.swing.JButton();
        ButtonExit = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        ButtonKeluar.setText("Keluar");
        ButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKeluarActionPerformed(evt);
            }
        });

        ButtonTambah.setText("Tambah Pesanan");
        ButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTambahActionPerformed(evt);
            }
        });

        LabelNamaPeminjam.setText("Nama Peminjam");

        TextFieldTanggalAkhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldTanggalAkhirActionPerformed(evt);
            }
        });

        TextAreaLogs.setColumns(20);
        TextAreaLogs.setRows(5);
        jScrollPane1.setViewportView(TextAreaLogs);


        ButtonAdd.setText("Add");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });
        ButtonDelete.setText("Delete");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });
        ButtonUpdate.setText("Update");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });

       
}
