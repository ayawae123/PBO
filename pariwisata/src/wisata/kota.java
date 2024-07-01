/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wisata;

/**
 *
 * @author ACER
 */
public class kota {
  private String id_kota;
  private String nama_kota;
  private String kode_pos;

public kota(String id_kota, String nama_kota, String kode_pos) {
      this.id_kota = id_kota;
      this.nama_kota = nama_kota;
      this.kode_pos = kode_pos;
  }
 public String getId_kota() {
      return id_kota;
  }
public String getNama_kota() {
      return nama_kota;
  }
public String getKode_pos() {
      return kode_pos;
  }
}
