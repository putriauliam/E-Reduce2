/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.e.reducebaru;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author lenovo
 */
public class UbahKataSandi extends javax.swing.JFrame {

    private String userEmail;
     
    public UbahKataSandi(String email) {
        this.userEmail = email;
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SimpanBtn = new javax.swing.JButton();
        PwField2 = new javax.swing.JPasswordField();
        PwField1 = new javax.swing.JPasswordField();
        PwField3 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ubah Kata Sandi");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addGap(366, 366, 366)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(95, 95, 95))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Ubah Kata Sandi");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Kata Sandi Lama");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Kata Sandi Baru");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Konfirmasi Kata Sandi ");

        SimpanBtn.setBackground(new java.awt.Color(51, 153, 255));
        SimpanBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SimpanBtn.setForeground(new java.awt.Color(255, 255, 255));
        SimpanBtn.setText("Kirim");
        SimpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(PwField1)
                            .addComponent(PwField2)
                            .addComponent(PwField3, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(SimpanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(17, 17, 17))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(PwField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PwField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PwField3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SimpanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(410, 0, 390, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanBtnActionPerformed
String kataSandiLama = PwField1.getText();
    String kataSandiBaru = PwField2.getText();
    String konfirmasiKataSandi = PwField3.getText();

    String SUrl, SUser, SPass;

    SUrl = "jdbc:MySQL://localhost:3306/java_users_db";
    SUser = "root";
    SPass = "";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

        String query = "SELECT * FROM user WHERE email = ?";
        try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
            preparedStatement.setString(1, userEmail);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                String savedPassword = rs.getString("password");

                // Menggunakan BCrypt untuk memverifikasi password lama
                if (BCrypt.checkpw(kataSandiLama, savedPassword)) {
                    if (kataSandiBaru.equals(konfirmasiKataSandi)) {
                        String hashedNewPassword = BCrypt.hashpw(kataSandiBaru, BCrypt.gensalt());
                        String updateQuery = "UPDATE user SET password = ? WHERE email = ?";
                        try (PreparedStatement updateStatement = con.prepareStatement(updateQuery)) {
                            updateStatement.setString(1, hashedNewPassword);
                            updateStatement.setString(2, userEmail);

                            updateStatement.executeUpdate();

                            JOptionPane.showMessageDialog(this, "Kata sandi berhasil diperbarui!");

                            PwField1.setText("");
                            PwField2.setText("");
                            PwField3.setText("");

                            Login LoginFrame = new Login();
                            LoginFrame.setVisible(true);
                            LoginFrame.pack();
                            LoginFrame.setLocationRelativeTo(null);
                            this.dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Kata sandi baru dan konfirmasi tidak cocok!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Kata sandi lama salah!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Pengguna tidak ditemukan!");
            }
        }
    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat memperbarui kata sandi!");
    }       
    }//GEN-LAST:event_SimpanBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          String name = null, alamat = null, jeniskelamin = null, no_hp = null, passDb, query;
    String SUrl, SUser, SPass;
    int notFound = 0;

    SUrl = "jdbc:MySQL://localhost:3306/java_users_db";
    SUser = "root";
    SPass = "";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
        Statement st = con.createStatement();

        query = "SELECT * FROM user WHERE email= '" + userEmail + "' ";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            passDb = rs.getString("password");
            name = rs.getString("name");
            alamat = rs.getString("alamat");
            jeniskelamin = rs.getString("jeniskelamin");
            no_hp = rs.getString("no_hp");
            notFound = 1;
        }

        if (notFound == 1) {
            EditProfile EditProfileFrame = new EditProfile(userEmail);
            
            EditProfileFrame.setUser(name);
            EditProfileFrame.setAlamat(alamat);
            EditProfileFrame.setNohp(no_hp);
            EditProfileFrame.setJk(jeniskelamin);
            
            EditProfileFrame.setVisible(true);
            EditProfileFrame.pack();
            EditProfileFrame.setLocationRelativeTo(null);
            dispose();
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Email atau Password Salah", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PwField1;
    private javax.swing.JPasswordField PwField2;
    private javax.swing.JPasswordField PwField3;
    private javax.swing.JButton SimpanBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
