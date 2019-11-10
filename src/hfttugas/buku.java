/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfttugas;

/**
 *
 * @author ROG
 */
public class buku extends perpustakaan{
    private String judul;
    private String pengarang;
    private String jenis;
    private int halaman;
    

    public buku(String judul, String pengarang, String jenis, int halaman) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.jenis = jenis;
        this.halaman = halaman;
    }
    
    public buku(){
        judul = "null";
        pengarang = "null";
        jenis = "null";
        halaman = 0;
        
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }
   
    
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    
    
}


   
    
