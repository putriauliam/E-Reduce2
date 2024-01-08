/*
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt untuk mengubah lisensi ini
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java untuk mengedit template ini
 */
package com.mycompany.e.reducebaru;

/**
 * Kelas yang menyediakan koneksi ke database MySQL.
 * Singleton pattern digunakan untuk memastikan hanya ada satu instance dari kelas ini.
 * Instance dapat diakses melalui metode getInstance().
 *
 * @author shila
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {
    // URL database MySQL
    private final String DB_URL = "jdbc:mysql://localhost:3306/java_users_db";
    
    // Nama pengguna database MySQL
    private final String DB_USER = "root";
    
    // Kata sandi pengguna database MySQL
    private final String DB_PASS = "";

    // Instance singleton MySqlConnection
    private static MySqlConnection instance;

    // Metode untuk mendapatkan instance MySqlConnection
    public static MySqlConnection getInstance() {
        if (instance == null) {
            instance = new MySqlConnection();
        }
        return instance;
    }

    // Metode untuk mendapatkan koneksi ke database MySQL
    public Connection getConnection() {
        Connection connection = null;
        try {
            // Meload driver JDBC MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Mendapatkan koneksi ke database menggunakan URL, nama pengguna, dan kata sandi
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (Exception e) {
            // Menangani exception yang mungkin terjadi selama proses koneksi
            e.printStackTrace();
        }
        return connection;
    }
}
