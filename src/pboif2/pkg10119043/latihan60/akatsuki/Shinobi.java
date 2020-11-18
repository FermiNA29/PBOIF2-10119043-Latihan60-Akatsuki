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
public class Shinobi {
    protected String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void anggota(String anggota) {
        System.out.println("Anggota : " + anggota);
    } 
    
    public void sebabKematian() {
        System.out.println("Kematian : Dibunuh oleh seseorang");
    }
}
