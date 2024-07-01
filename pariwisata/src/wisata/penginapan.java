/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wisata;

/**
 *
 * @author ACER
 */
public class penginapan {
  private String id_penginapan;
  private String id_kota;
  private String nama_penginapan;

public penginapan(String id_penginapan, String id_kota, String nama_penginapan) {
      this.id_penginapan = id_penginapan;
      this.id_kota = id_kota;
      this.nama_penginapan = nama_penginapan;
  }
 public String getId_penginapan() {
      return id_penginapan;
  }
public String getId_kota() {
      return id_kota;
  }
public String getNama_penginapan() {
      return nama_penginapan;
  }
}
