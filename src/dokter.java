/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IZZA
 */
public class dokter extends javax.swing.JFrame {

    /**
     * Creates new form dokter
     */
    public dokter() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        usia = new javax.swing.JTextField();
        jenis = new javax.swing.JTextField();
        goldar = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        kwng = new javax.swing.JTextField();
        waktu = new javax.swing.JTextField();
        spesi = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        dokter = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Pemilihan Dokter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(108, 19, 190, 29);

        jLabel3.setText("Dokter Spesial");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 450, 90, 14);

        jLabel4.setText("Waktu Praktek");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 410, 90, 14);

        jLabel5.setText("Kewarganegaraan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 370, 110, 14);

        jLabel6.setText("Status");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 330, 90, 14);

        jLabel7.setText("Golongan Darah");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 290, 110, 14);

        jLabel8.setText("Jenis Kelamin");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 250, 90, 14);

        jLabel9.setText("Usia");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 210, 90, 14);

        jLabel10.setText("Alamat");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 170, 90, 14);

        jLabel11.setText("Nama");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 130, 90, 14);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Identitas");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(160, 100, 90, 17);

        jLabel13.setText("Pilih Dokter");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 70, 90, 14);
        getContentPane().add(alamat);
        alamat.setBounds(150, 170, 190, 30);
        getContentPane().add(usia);
        usia.setBounds(150, 210, 190, 30);
        getContentPane().add(jenis);
        jenis.setBounds(150, 250, 190, 30);
        getContentPane().add(goldar);
        goldar.setBounds(150, 290, 190, 30);
        getContentPane().add(status);
        status.setBounds(150, 330, 190, 30);
        getContentPane().add(kwng);
        kwng.setBounds(150, 370, 190, 30);
        getContentPane().add(waktu);
        waktu.setBounds(150, 410, 190, 30);

        spesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spesiActionPerformed(evt);
            }
        });
        getContentPane().add(spesi);
        spesi.setBounds(150, 450, 190, 30);
        getContentPane().add(nama);
        nama.setBounds(150, 130, 190, 30);

        dokter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Dokter-", "DR. Farras Yassar", "DR. Anisa Putri", "DR. Harun Fajar" }));
        dokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokterActionPerformed(evt);
            }
        });
        getContentPane().add(dokter);
        dokter.setBounds(150, 60, 190, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokterActionPerformed
        // TODO add your handling code here:
         if (dokter.getSelectedItem().equals("DR. Farras Yassar")){ 
             nama.setText("DR. Farras Yassar ");             
             alamat.setText("Jl. Surabaya 16, Malang");             
             usia.setText("20 Tahun");             
             jenis.setText("Laki-Laki");             
             goldar.setText("A");             
             status.setText("Belum Menikah ");             
             kwng.setText("Indonesia");             
             spesi.setText("Dokter Umum");             
             waktu.setText(" Pagi (07.00-15.00)");         
         }
            else         
         if(dokter.getSelectedItem().equals("DR. Anisa Putri ")){
            nama.setText("DR. Anisa Putri");             
            alamat.setText("Jl. Veteran 3, Malang");             
            usia.setText("20 Tahun");             
            jenis.setText("Perempuan");             
            goldar.setText("O");             
            status.setText("Belum Menikah"); 
            kwng.setText("Indonesia");             
            spesi.setText("Dokter Gigi");             
            waktu.setText(" Sore (16.00-22.00)");         
         }
             else         
         if(dokter.getSelectedItem().equals("DR. Harun Fajar ")){             
            nama.setText("DR. Harun Fajar ");             
            alamat.setText("Jl. Bandung 9, Malang");             
            usia.setText("20 Tahun");             
            jenis.setText("Laki-Laki");             
            goldar.setText("B");             
            status.setText("Belum Menikah");             
            kwng.setText("Indonesia");             
            spesi.setText("Dokter Gizi");             
            waktu.setText(" Malam (22.00-06.00)");         
         }
            
    }//GEN-LAST:event_dokterActionPerformed

    private void spesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spesiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spesiActionPerformed

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
            java.util.logging.Logger.getLogger(dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JComboBox<String> dokter;
    private javax.swing.JTextField goldar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jenis;
    private javax.swing.JTextField kwng;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField spesi;
    private javax.swing.JTextField status;
    private javax.swing.JTextField usia;
    private javax.swing.JTextField waktu;
    // End of variables declaration//GEN-END:variables
}
