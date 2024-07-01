/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wisata;

/**
 *
 * @author ACER
 */
public class kuliner {
  private String id_kuliner;
  private String id_kota;
  private String nama_kuliner;

public kuliner(String id_kuliner, String id_kota, String nama_kuliner) {
      this.id_kuliner = id_kuliner;
      this.id_kota = id_kota;
      this.nama_kuliner = nama_kuliner;
  }
 public String getId_kuliner() {
      return id_kuliner;
  }
public String getId_kota() {
      return id_kota;
  }
public String getNama_kuliner() {
      return nama_kuliner;
  }
}
