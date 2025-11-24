/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Hype
 */
public class Mahasiswa {
   private String npm;
    private String nama;
    private String alamat;
    
    public Mahasiswa(String npm,String nama,String Alamat ){
        this.npm = npm;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String getNpm(){
        return npm;
    }
    public void getNpm(String npm){
        this.npm = npm;
    }
    public String getNama(){
        return nama;
    }
    public void getNama(String nama){
        this.nama = nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public void getAlamat(String alamat){
        this.alamat = alamat;
    }
    @Override
    public String toString(){
        return "NPM:" + npm + ",Nama:" + nama +",Alamat:" + alamat; 
    }  
}
