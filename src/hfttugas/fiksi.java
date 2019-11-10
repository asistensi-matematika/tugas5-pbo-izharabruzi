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
public class fiksi extends buku{
    private String jenisbuku;
    
    public fiksi(){
        super();
        jenisbuku="fiksi";
    }
    public fiksi(int halaman , String jenisbuku ,String judul , String pengarang , String jenis ){
        super(judul,pengarang,jenis,halaman);
        this.jenisbuku=jenisbuku;
        
    }

    public String getJenisbuku() {
        return jenisbuku;
    }

    public void setJenisbuku(String jenisbuku) {
        this.jenisbuku = jenisbuku;
    }
    
}
