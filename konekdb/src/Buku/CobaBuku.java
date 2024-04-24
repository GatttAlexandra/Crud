/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buku;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;


public class CobaBuku {
   public static void main(String[] args) {
       String url ="jdbc:mysql://localhost:3306/bukudb";
       String username = "root";
       String password = "";
       
       Connection connect = null;
       
       try {
       connect = DriverManager.getConnection(url, username, password);
           System.out.println("koneksi berhasil");
   }catch (SQLException ex){
            System.out.println("Koneksi gagal: " + ex);
               
}
       
       String query ="Select * from buku";
       Statement st;
       ResultSet rs;
       String judulBuku;
       
       try{
       st = connect.createStatement();
       rs = st.executeQuery(query);
       while (rs.next()){
           judulBuku = rs.getString("buku_judul");
           System.out.println(judulBuku);
       }
} catch(SQLException ex) {
           System.out.println("Query gagal dijalankan: " +ex);
}
}
}
