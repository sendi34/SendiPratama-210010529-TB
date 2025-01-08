
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sendi
 */
public class DashboardFrame extends javax.swing.JFrame {

    /**
     * Creates new form DashboardFrame
     */
    public DashboardFrame() {
        setUndecorated(true); // Menghilangkan border dan title bar  
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maksimalkan ke layar penuh  
        setFont();
        tampilkanTanggal();
        tampilkanWaktu();
    }
    
    private void setFont(){
        try {
            Font fontJudul = Font.createFont(Font.TRUETYPE_FONT,new File("src/Font/Montserrat-Black.ttf")).deriveFont(17f);
            jLabel2.setFont(fontJudul);
            Font fontWaktu = Font.createFont(Font.TRUETYPE_FONT,new File("src/Font/Montserrat-Bold.ttf")).deriveFont(25f);
            jLabel1.setFont(fontWaktu);
            jLabel3.setFont(fontWaktu);
            Font fontWelcome = Font.createFont(Font.TRUETYPE_FONT,new File("src/Font/Montserrat-Black.ttf")).deriveFont(40f);
            jLabel5.setFont(fontWelcome);
            Font fontButton = Font.createFont(Font.TRUETYPE_FONT,new File("src/Font/Montserrat-Bold.ttf")).deriveFont(15f);
            jButton1.setFont(fontButton);
            jButton2.setFont(fontButton);
            jButton3.setFont(fontButton);
            jButton4.setFont(fontButton);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     // Method untuk menampilkan tanggal
    private void tampilkanTanggal() {
        SimpleDateFormat formatTanggal = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        String tanggal = formatTanggal.format(new Date());
        jLabel1.setText(tanggal);
    }
    
    // Method untuk menampilkan waktu secara real-time
    private void tampilkanWaktu() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat formatWaktu = new SimpleDateFormat("HH:mm:ss");
                String waktu = formatWaktu.format(new Date());
                jLabel3.setText(waktu);
            }
        });
        timer.start();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        pegawai = new javax.swing.JLabel();
        gaji = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        absensi = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        waktudankeluar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        top.setBackground(new java.awt.Color(255, 205, 4));
        top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-house-50.png"))); // NOI18N
        top.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 50, 40));

        pegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-employee-50.png"))); // NOI18N
        top.add(pegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        gaji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-cash-50.png"))); // NOI18N
        top.add(gaji, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jButton1.setText("Gaji");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        top.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 220, 60));

        jLabel2.setText("Aplikasi Kepegawaian");
        top.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jButton2.setText("Dashboard");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        top.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 220, 60));

        absensi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-attendance-50.png"))); // NOI18N
        top.add(absensi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jButton3.setText("Pegawai");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        top.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 220, 60));

        jButton4.setText("Absensi");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        top.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 220, 60));

        waktudankeluar.setBackground(new java.awt.Color(166, 74, 201));

        jLabel1.setText("Jumat, 07 Juni 2024");

        jLabel3.setText("14:30:45");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-exit-100.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout waktudankeluarLayout = new javax.swing.GroupLayout(waktudankeluar);
        waktudankeluar.setLayout(waktudankeluarLayout);
        waktudankeluarLayout.setHorizontalGroup(
            waktudankeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(waktudankeluarLayout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 555, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        waktudankeluarLayout.setVerticalGroup(
            waktudankeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(waktudankeluarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, waktudankeluarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(waktudankeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41))
        );

        top.add(waktudankeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 0, 1160, 110));

        jPanel1.setBackground(new java.awt.Color(245, 230, 204));

        jLabel5.setText("SELAMAT DATANG DI APLIKASI KEPEGAWAIAN ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel5)
                .addContainerGap(844, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel5)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        top.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 1160, 670));

        getContentPane().add(top);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       // Tampilkan konfirmasi keluar
    int pilihan = javax.swing.JOptionPane.showConfirmDialog(
        this,
        "Apakah Anda yakin ingin keluar?",
        "Konfirmasi Keluar",
        javax.swing.JOptionPane.YES_NO_OPTION
    );
    
    if (pilihan == javax.swing.JOptionPane.YES_OPTION) {
        System.exit(0); // Keluar dari aplikasi
    }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         // Membuka form Pegawai
        KaryawanFrame KaryawanFrame = new KaryawanFrame();
        KaryawanFrame.setVisible(true); // Tampilkan form Absensi
        this.dispose(); // Tutup form Dashboard (opsional, jika diperlukan)
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         // Membuka form Absensi
        AbsensiFrame AbsensiFrame = new AbsensiFrame();
        AbsensiFrame.setVisible(true); // Tampilkan form Absensi
        this.dispose(); // Tutup form Dashboard (opsional, jika diperlukan)
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // Membuka form Gaji
        GajiFrame GajiFrame = new GajiFrame();
        GajiFrame.setVisible(true); // Tampilkan form Absensi
        this.dispose(); // Tutup form Dashboard (opsional, jika diperlukan)
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel absensi;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel gaji;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pegawai;
    private javax.swing.JPanel top;
    private javax.swing.JPanel waktudankeluar;
    // End of variables declaration//GEN-END:variables
}
