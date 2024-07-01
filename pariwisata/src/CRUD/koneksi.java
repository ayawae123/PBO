/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author ACER
 */
public class koneksi {
    private String databaseName = "2210010095";
    private String username = "root";
    private String password = "";
    public Connection koneksiDB;
    
     public koneksi(){
        try {
            String location = "jdbc:mysql://localhost/"+databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(location, username, password);
            System.out.println("database terkoneksi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanKota(String id_kota, String nama_kota, String kode_pos){
        try {
            String sql = "insert into kota (id_kota, nama_kota, kode_pos) value (?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, id_kota);
            perintah.setString(2, nama_kota);
            perintah.setString(3, kode_pos);
            
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
    }
    
    public void ubahKota(String id_kota, String nama_kota, String kode_pos){
        try {
            String sql = "update kota set nama_kota = ?, kode_pos = ? where id_kota = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nama_kota);
            perintah.setString(2, kode_pos);
            perintah.setString(3, id_kota);
            
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusKota(String id_kota){
        try {
            String sql = "delete from kota where id_kota = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, id_kota);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariKota(String id_kota){
        try {
            String sql = "select * from kota where id_kota = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, id_kota);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID KOTA : "+data.getString("id_kota"));
                System.out.println("NAMA KOTA : "+data.getString("nama_kota"));
                System.out.println("KODE POS : "+data.getString("kode_pos"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void dataKota(String id_kota){
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("select * from kota order by id_kota asc");
            while(baris.next()){
                System.out.println(baris.getString("id_kota")+" | "+
                        baris.getString("nama_kota")+" | "+
                        baris.getString("kode_pos"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
     public void simpanKuliner(String id_kuliner, String id_kota, String nama_kuliner ){
        try {
            String sql = "insert into kuliner (id_kuliner, id_kota, nama_kuliner ) value (?, ?, ? )";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, id_kuliner);
            perintah.setString(2, id_kota);
            perintah.setString(3, nama_kuliner);
           
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahKuliner(String id_kuliner, String id_kota, String nama_kuliner ){
        try {
            String sql = "update kuliner set id_kota = ?, nama_kuliner = ? where id_kuliner = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, id_kota);
            perintah.setString(2, nama_kuliner);
            perintah.setString(3, id_kuliner);
           
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusKuliner(String id_kuliner){
        try {
            String sql = "delete from kuliner where id_kuliner = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, id_kuliner);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariKuliner (String id_kuliner){
        try {
            String sql = "select * from kuliner where id_kuliner = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, id_kuliner);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID KULINER : "+data.getString("id_kuliner"));
                System.out.println("ID KOTA : "+data.getString("id_kota"));
                System.out.println("NAMA KULINER : "+data.getString("nama_kuliner"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void dataKuliner(String id_kuliner){
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("select * from kuliner order by id_kuliner asc");
            while(baris.next()){
                System.out.println(baris.getString("id_kuliner")+" | "+
                        baris.getString("id_kota")+" | "+
                        baris.getString("jumlah_terima")+" | "+
                        baris.getString("nama_kuliner"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
     public void simpanPenginapan(String id_penginapan, String id_kota, String nama_penginapan){
        try {
            String sql = "insert into penginapan (id_penginapan, id_kota, nama_penginapan) value (?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, id_penginapan);
            perintah.setString(2, id_kota);
            perintah.setString(3, nama_penginapan);
            
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPenginapan(String id_penginapan, String id_kota, String nama_penginapan){
        try {
            String sql = "update penginapan set id_kota = ?, nama_penginapan = ? where id_penginapan = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, id_kota);
            perintah.setString(2, nama_penginapan);
            perintah.setString(3, id_penginapan);
                    
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPenginapan(String id_penginapan){
        try {
            String sql = "delete from penginapan where id_penginapan = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, id_penginapan);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
    }
    
    public void cariPenginapan(String id_penginapan){
        try {
            String sql = "select * from penginapan where id_penginapan = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, id_penginapan);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID PENGINAPAN : "+data.getString("id_penginapan"));
                System.out.println("ID KOTA : "+data.getString("id_kota"));
                System.out.println("NAMA PENGINAPAN : "+data.getString("nama_penginapan"));
            }           
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void dataPenginapan(String id_penginapan){
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("select * from penginapan order by id_penginapan asc");
            while(baris.next()){
                System.out.println(baris.getString("id_penginapan")+" | "+
                        baris.getString("id_kota")+" | "+
                        baris.getString("nama_penginapan")+" | ");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
       
    }
    
    public void simpanTransportasi(String id_transportasi, String jenis_transportasi, String harga_tiket ){
        try {
            String sql = "insert into transportasi (id_transportasi, jenis_transportasi, harga_tiket ) value (?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, id_transportasi);
            perintah.setString(2, jenis_transportasi);
            perintah.setString(3, harga_tiket);
           
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahTransportasi(String id_transportasi, String jenis_transportasi, String harga_tiket ){
        try {
            String sql = "update transportasi set jenis_transportasi = ?, harga_tiket = ?  where id_transportasi = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, jenis_transportasi);
            perintah.setString(2, harga_tiket);
            perintah.setString(3, id_transportasi);
            
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusTransportasi(String id_transportasi){
        try {
            String sql = "delete from transportasi where id_transportasi = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, id_transportasi);
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariTransportasi(String id_transportasi){
        try {
            String sql = "select * from transportasi where id_transportasi = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, id_transportasi);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID TRANSPORTASI : "+data.getString("id_transportasi"));
                System.out.println("JENIS TRANSPORTASI : "+data.getString("jenis_transportasi"));
                System.out.println("HARGA TIKET : "+data.getString("harga_tiket"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void dataTransportasi(String id_transportasi){
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("select * from transportasi order by id_transportasi asc");
            while(baris.next()){
                System.out.println(baris.getString("id_transportasi")+" | "+
                        baris.getString("jenis_transportasi")+" | "+
                        baris.getString("harga_tiket"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
