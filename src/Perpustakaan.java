
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hype
 */
public class Perpustakaan {
    private ArrayList<Buku> koleksiBuku = new ArrayList<>();
    
    // jumlah buku
    public int jumlahBuku(){
        return koleksiBuku.size();
    }
    // tambah buku
    public void tambahBuku(String judul, String pengarang){
        koleksiBuku.add(new Buku(judul, pengarang));
    }
    // edit buku baru
    public void gantiBuku(int index, String judul, String pengarang){
        koleksiBuku.set(index, new Buku(judul, pengarang));
    }
    //edit buku dengan buku lama
    public void gantiBuku(int index, Buku baru){
        koleksiBuku.set(index, baru);
    }
    // hapus buku dari array
    public void hapusBuku(int index){
        koleksiBuku.remove(index);
    }
    //cari buku berdasarkan index
    public Buku lihatBuku(int index){
        return koleksiBuku.get(index);
    }
    public Buku cariBuku(String judul){
        for (Buku buku : koleksiBuku){
            if(buku.getJudul().contains(judul)){
                return buku;
            }
        }
        return null;
    }
    public int cariIndexBuku(Buku buku){
        for (int i = 0; i < koleksiBuku.size(); i++){
            if(koleksiBuku.get(i).equals(buku)){
                return i;
            }
        }
        return -1;
    }
}
