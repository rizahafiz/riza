/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasi_restoran_sederhana;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Parlindungan
 */
class Koneksi_1 {
    
   private static Connection KoneksiDatabase;
    public static Connection KoneksiDB() throws SQLException {
        try {
            String DB ="jbdc:mysql://localhost/mahasiswa";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            KoneksiDatabase = (Connection) DriverManager.getConnection(DB,user,pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"TIDAK ADA KONEKSI","ERROR",
            JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return KoneksiDatabase;
    }

    static Object getCon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
