
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class PenghitungHariFrame extends javax.swing.JFrame {

    public PenghitungHariFrame() {
        initComponents();
        setSize(600, 700);
        setLocationRelativeTo(null);
        setComboxBulan();
        setSpinnerTahun();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        comboxBulan = new javax.swing.JComboBox<>();
        spinnerTahun = new javax.swing.JSpinner();
        btnHitungHari = new javax.swing.JButton();
        txtJumlahHari = new javax.swing.JTextField();
        txtPertama = new javax.swing.JTextField();
        txtTerakhir = new javax.swing.JTextField();
        btnHitungSelisih = new javax.swing.JButton();
        txtSelisih = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        calendarBulanTahun = new com.toedter.calendar.JCalendar();
        dateChooserAwal = new com.toedter.calendar.JDateChooser();
        dateChooserAkhir = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penghitung Hari");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APLIKASI PENGHITUNG HARI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWeights = new double[] {0.0, 1.0};
        jPanel1Layout.rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
        jPanel1.setLayout(jPanel1Layout);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("— PENGHITUNG HARI DALAM BULAN —");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 20;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Pilih Bulan dan Tahun");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Jumlah Hari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Hari Pertama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Hari Terakhir");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("— PENGHITUNG SELISIH HARI —");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Tanggal Awal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Tanggal Akhir");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("Selisih Hari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel9, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        comboxBulan.setToolTipText("");
        comboxBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxBulanActionPerformed(evt);
            }
        });
        jPanel2.add(comboxBulan);

        spinnerTahun.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerTahunStateChanged(evt);
            }
        });
        jPanel2.add(spinnerTahun);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel1.add(jPanel2, gridBagConstraints);

        btnHitungHari.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnHitungHari.setText("Hitung");
        btnHitungHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungHariActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel1.add(btnHitungHari, gridBagConstraints);

        txtJumlahHari.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel1.add(txtJumlahHari, gridBagConstraints);

        txtPertama.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel1.add(txtPertama, gridBagConstraints);

        txtTerakhir.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel1.add(txtTerakhir, gridBagConstraints);

        btnHitungSelisih.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnHitungSelisih.setText("Hitung");
        btnHitungSelisih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungSelisihActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel1.add(btnHitungSelisih, gridBagConstraints);

        txtSelisih.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel1.add(txtSelisih, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnHapus.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel3.add(btnHapus);

        btnKeluar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        jPanel3.add(btnKeluar);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jPanel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(calendarBulanTahun, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel1.add(dateChooserAwal, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel1.add(dateChooserAkhir, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboxBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxBulanActionPerformed
        int indexBulan = comboxBulan.getSelectedIndex();
        if (indexBulan > 0) { // Pastikan bukan "Pilih Bulan"
            java.util.Calendar calendar = calendarBulanTahun.getCalendar();
            calendar.set(java.util.Calendar.MONTH, indexBulan - 1);
            calendarBulanTahun.setCalendar(calendar);
        }
    }//GEN-LAST:event_comboxBulanActionPerformed

    private void spinnerTahunStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerTahunStateChanged
        int tahun = (int) spinnerTahun.getValue();
        java.util.Calendar calendar = calendarBulanTahun.getCalendar();
        calendar.set(java.util.Calendar.YEAR, tahun);
        calendarBulanTahun.setCalendar(calendar);
    }//GEN-LAST:event_spinnerTahunStateChanged

    private void calenderBulanTahunPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calenderBulanTahunPropertyChange
        if (evt.getNewValue() instanceof Calendar calendar) {

            // Mengambil bulan dan tahun dari kalender
            int bulan = calendar.get(Calendar.MONTH); // Mengambil bulan dari kalender
            int tahun = calendar.get(Calendar.YEAR);

            // Sinkronkan dengan comboxBulan dan spinnerTahun
            comboxBulan.setSelectedIndex(bulan + 1); // +1 untuk menyesuaikan dengan "Pilih Bulan"
            spinnerTahun.setValue(tahun);
        }
    }//GEN-LAST:event_calenderBulanTahunPropertyChange

    private void btnHitungHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungHariActionPerformed
        int bulan = comboxBulan.getSelectedIndex();
        int tahun = (Integer) spinnerTahun.getValue();

        // Cek apakah bulan dan tahun sudah dipilih
        if (bulan == 0) {
            JOptionPane.showMessageDialog(this, "Pilih bulan terlebih dahulu!");
            return;  // Menghentikan eksekusi jika bulan belum dipilih
        }
        if (tahun <= 0) {
            JOptionPane.showMessageDialog(this, "Pilih tahun terlebih dahulu!");
            return;  // Menghentikan eksekusi jika tahun belum dipilih
        }

        // Memanggil helper untuk menghitung jumlah hari
        PenghitungHariHelper helper = new PenghitungHariHelper();
        helper.hitungJumlahHari(bulan, tahun, txtJumlahHari, txtPertama, txtTerakhir);
    }//GEN-LAST:event_btnHitungHariActionPerformed

    private void btnHitungSelisihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungSelisihActionPerformed
        java.util.Date tanggalAwal = dateChooserAwal.getDate();
        java.util.Date tanggalAkhir = dateChooserAkhir.getDate();

        // Validasi apakah kedua tanggal sudah dipilih
        if (tanggalAwal == null || tanggalAkhir == null) {
            JOptionPane.showMessageDialog(this, "Pilih kedua tanggal terlebih dahulu!");
            return;
        }

        // Mengkonversi java.util.Date ke LocalDate
        LocalDate localDateAwal = new java.sql.Date(tanggalAwal.getTime()).toLocalDate();
        LocalDate localDateAkhir = new java.sql.Date(tanggalAkhir.getTime()).toLocalDate();

        // Cek apakah tanggal awal lebih besar dari tanggal akhir
        if (localDateAwal.isAfter(localDateAkhir)) {
            JOptionPane.showMessageDialog(this, "Tanggal awal tidak boleh lebih besar dari tanggal akhir.");
            return;
        }

        // Memanggil helper untuk menghitung selisih hari
        PenghitungHariHelper helper = new PenghitungHariHelper();
        long selisihHari = helper.hitungSelisihHari(localDateAwal, localDateAkhir);

        // Menampilkan hasil selisih hari
        txtSelisih.setText(String.valueOf(selisihHari));
    }//GEN-LAST:event_btnHitungSelisihActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // Menghapus semua hasil perhitungan
        txtJumlahHari.setText("");
        txtPertama.setText("");
        txtTerakhir.setText("");
        txtSelisih.setText("");

        // Mengatur ulang nilai pada JComboBox dan JSpinner ke nilai default
        comboxBulan.setSelectedIndex(0);  // Mengatur combo box bulan ke pilihan default (Pilih Bulan)
        spinnerTahun.setValue(2024);  // Atau set nilai default sesuai kebutuhan

        // Mengatur ulang JDateChooser
        dateChooserAwal.setDate(null);  // Mengosongkan tanggal awal
        dateChooserAkhir.setDate(null);  // Mengosongkan tanggal akhir

        // Mengembalikan kalender bulan tahun ke nilai default
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(java.util.Calendar.MONTH, java.util.Calendar.JANUARY);  // Atur ke Januari
        calendar.set(java.util.Calendar.YEAR, 2024);  // Atur tahun default (misalnya 2024)
        calendarBulanTahun.setCalendar(calendar);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(PenghitungHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PenghitungHariFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitungHari;
    private javax.swing.JButton btnHitungSelisih;
    private javax.swing.JButton btnKeluar;
    private com.toedter.calendar.JCalendar calendarBulanTahun;
    private javax.swing.JComboBox<String> comboxBulan;
    private com.toedter.calendar.JDateChooser dateChooserAkhir;
    private com.toedter.calendar.JDateChooser dateChooserAwal;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner spinnerTahun;
    private javax.swing.JTextField txtJumlahHari;
    private javax.swing.JTextField txtPertama;
    private javax.swing.JTextField txtSelisih;
    private javax.swing.JTextField txtTerakhir;
    // End of variables declaration//GEN-END:variables
    private void setComboxBulan() {
        String[] bulan = {"Pilih Bulan...", "Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                          "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        comboxBulan.setModel(new javax.swing.DefaultComboBoxModel<>(bulan));
        comboxBulan.setSelectedIndex(0);
    }
    private void setSpinnerTahun() {
        // Mendapatkan tahun saat ini menggunakan LocalDate
        int tahunSaatIni = LocalDate.now().getYear(); 
        // Menetapkan model Spinner untuk menampilkan tahun dengan batas minimum dan maksimum
        SpinnerNumberModel model = new SpinnerNumberModel(tahunSaatIni, 1900, 2100, 1);
        spinnerTahun.setModel(model); // Menetapkan model ke spinnerTahun
        spinnerTahun.setValue(tahunSaatIni); // Set nilai default ke tahun saat ini
    }
}
