/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.ArrayList;

/**
 *
 * @author Hype
 */
public class DataBaseMahasiswa {
   private ArrayList<Mahasiswa> list = new ArrayList<>(); 
   
   public void tambahanMahasiswa(Mahasiswa mhs){
       list.add(mhs);
       System.out.println("Data berhasil ditambah");
   }
   public Mahasiswa cariMahasiswa(String npm){
       for(Mahasiswa m : list){
           if(m.getNpm().equals(npm)){
               return m;
           }
       }
       return null;
   }
   public void editMahasiswa(String npm,String namaBaru,String alamatBaru){
       Mahasiswa m = cariMahasiswa(npm);
       if(m != null){
           m.setNama(namaBaru);
           m.setAlamat(alamatBaru);
           System.out.println("Data berhasil diupdate");
        }else{
           System.out.println("Data tidak ditemukan");
       
   }
}

        public void hapusMahasiswa(String npm){
        Mahasiswa m = carimahasiswa(npm);
        if(m != null){
            list.remove(m);
            System.out.println("Data berhasil dihapus!");
        }else{
            System.out.println("Data tidak ditemukan");
        }
     }
        
     public void tampilkanSemua(){
         if(list.isEmpty()){
             System.out.println("Belum ada data");  
         }else{
             for(Mahasiswa m : list){
                 System.out.println("m");
             }
         }
     }   
}