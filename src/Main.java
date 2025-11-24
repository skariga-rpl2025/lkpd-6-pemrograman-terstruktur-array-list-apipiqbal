/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hype
 */
public class Main {
    public static void main(String[] args) {
        
        
        Perpustakaan perpus = new Perpustakaan();
        perpus.tambahBuku("Belajar JAVA", "Umar Bakrie");
        perpus.tambahBuku("JAVA Untuk Pemula", "Amir Mahmud");
        perpus.tambahBuku("JAVA Untuk ahli", "Salim Iklim");
        System.out.println("Jumlah Buku:" + perpus.jumlahBuku());
        perpus.tambahBuku("JAVA Untuk Mahasiswa", "Farid Akbar");
        
        String cari = "Pemula";
        System.out.println("cari buku dengan kata kunci:"+ cari);
        Buku buku = perpus.cariBuku(cari);
        if (buku==null){
            System.out.println("Buku tidak di temukan");   
        }else{
            System.out.println("Buku ditemukan dengan judul:" + buku.getJudul() + ", pengarang" + buku.getPengarang());
    }
    perpus.gantiBuku(0,"Belajar JAVA Baru", "Umar Bakrie Salim");
    buku = perpus.lihatBuku(0);
        System.out.println("Buku diganti dengan judul:" + buku.getJudul() + ", pengarang " + buku.getPengarang());
        
        perpus.hapusBuku(0);
        System.out.println("Jumlah buku:" +perpus.jumlahBuku());
    }    
}

