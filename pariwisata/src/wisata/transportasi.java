/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wisata;

/**
 *
 * @author ACER
 */
public class transportasi {
  private String id_transportasi;
  private String jenis_transportasi;
  private String harga_tiket;

public transportasi(String id_transportasi, String jenis_transportasi, String harga_tiket) {
      this.id_transportasi = id_transportasi;
      this.jenis_transportasi = jenis_transportasi;
      this.harga_tiket = harga_tiket;
  }
 public String getId_transportasi() {
      return id_transportasi;
  }
public String getJenis_transportasi() {
      return jenis_transportasi;
  }
public String getHarga_tiket() {
      return harga_tiket;
  }
}