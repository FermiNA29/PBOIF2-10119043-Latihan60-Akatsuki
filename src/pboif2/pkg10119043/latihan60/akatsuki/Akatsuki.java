/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan60.akatsuki;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program daftar anggota akatsuki
 */
public class Akatsuki extends Shinobi {
    private String cincin;
    private String asalDesa;

    public String getCincin() {
        return cincin;
    }

    public void setCincin(String cincin) {
        this.cincin = cincin;
    }

    public String getAsalDesa() {
        return asalDesa;
    }

    public void setAsalDesa(String asalDesa) {
        this.asalDesa = asalDesa;
    }
    
    //overloading
    public void anggota() {
        System.out.println("Anggota : Akatsuki");
        System.out.println("Cincin : " + cincin);
    }
    
    //overloading
    public void sebabKematian(String kematian) {
        System.out.println("Sebab Kematian : " + kematian + "\n");
    }
    
    public void tampilAnggota() {
        System.out.println("Nama : " + nama);
        System.out.println("Asal Desa : " + asalDesa);
    }
}
