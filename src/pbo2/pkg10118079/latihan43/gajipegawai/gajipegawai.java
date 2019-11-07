/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118079.latihan43.gajipegawai;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class gajipegawai {
   private String nama,alamat;
   private int uangtranspot,uangtunjangan,gajipokok,totalgaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangtranspot() {
        return uangtranspot;
    }

    public void setUangtranspot(int uangtranspot) {
        this.uangtranspot = uangtranspot;
    }

    public int getUangtunjangan() {
        return uangtunjangan;
    }

    public void setUangtunjangan(int uangtunjangan) {
        this.uangtunjangan = uangtunjangan;
    }

    public int getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(int gajipokok) {
        this.gajipokok = gajipokok;
    }

    public int getTotalgaji() {
        return totalgaji = uangtunjangan+uangtranspot+gajipokok; 
    }

    public void setTotalgaji(int totalgaji) {
        this.totalgaji = totalgaji;
    }
   
   
   
  public void totalgaji(){
      Scanner userInput = new Scanner(System.in);
      System.out.println("### Data Gaji Karyawan PT.KAKATU###");
      System.out.println("--------------------------");
      System.out.print("Nama Karyawan: ");
      this.nama = userInput.nextLine();
      System.out.print("Alamat: ");
      this.alamat = userInput.nextLine();
      System.out.print("Uang Transport:"+" Rp. ");
      this.uangtranspot = userInput.nextInt();
      System.out.print("Uang Tunjangan:"+" Rp. ");
      this.uangtunjangan = userInput.nextInt();
      System.out.print("Gaji Pokok"+" Rp. ");
      this.gajipokok = userInput.nextInt();
      
  } 
  public void tampildata(){
      System.out.println("");
      System.out.println("### Data Gaji Karyawan PT.KAKATU###");
      System.out.println("--------------------------");
      System.out.println("Nama Karyawan: "+getNama());
      System.out.println("Alamat: "+getAlamat());
      System.out.println("Uang Transport:"+" Rp."+getUangtranspot());
      System.out.println("Uang Tunjangan:"+" Rp."+getUangtunjangan());
      System.out.println("Gaji Pokok"+" Rp."+getGajipokok());
      System.out.println("TOTAL GAJI:"+" Rp."+getTotalgaji());
      
      
  } 
}
