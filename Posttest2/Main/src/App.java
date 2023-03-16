import java.util.ArrayList;

import Crud.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class App {
    public static void main(String[] args) throws IOException {
        int i;
        int Cari;
        ArrayList<Produk> Produks = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while(true){
        System.out.println("========== Selamat Datang Di Toko Game Zeyr ==========");
        System.out.println("1. Lihat Produk ");
        System.out.println("2. Masukkan Produk ");
        System.out.println("3. Ubah Produk ");
        System.out.println("4. Hapus Produk ");
        System.out.println("======================================================");
        System.out.print("Menu : ");
        int Menu = Integer.parseInt(br.readLine());
        switch(Menu){
            case 1:
            System.out.println("========== Data Toko Game Zeyr ==========");
            for(i= 0; i < Produks.size(); i++){
                Produk produk = Produks.get(i);
                int id = produk.getid();
                String nama = produk.getName();
                String Genre = produk.getGenre();
                String Platform = produk.getPlatform();
                int Harga = produk.getHarga();
                String Tanggal_rilis = produk.getTgl();
                System.out.println("Id : "+ id);
                System.out.println("Nama : " + nama);
                System.out.println("Genre : "+ Genre);
                System.out.println("Platform"+ Platform);
                System.out.println("Harga : "+ Harga);
                System.out.println("Tanggal Rilis : "+ Tanggal_rilis);
                System.out.println("======================================================");
            }
            break;
            case 2:
            int id = Produks.size() + 1;
            System.out.print("Masukkan Nama : ");
            String Nama = br.readLine();
            System.out.print("Masukkan Genre : ");
            String Genre = br.readLine();
            System.out.print("Masukkan Platform : ");
            String Platform = br.readLine();
            System.out.print("Masukkan Harga : ");
            int Harga = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Tanggal Rilis : ");
            String Tanggal_rilis = br.readLine();
            Produk Prk = new Produk(Nama,id,Genre,Platform,Harga,Tanggal_rilis);
            Produks.add(Prk);
            break;

            case 3:
            System.out.println("============================");
            System.out.println("Cari Index : ");
            Cari = Integer.parseInt(br.readLine());
            for(i= 0; i < Produks.size(); i++){
                if(Cari == i){
                    int idbaru = i;
                    System.out.print("Masukkan Nama : ");
                    String Namabaru = br.readLine();
                    System.out.print("Masukkan Genre : ");
                    String Genrebaru = br.readLine();
                    System.out.print("Masukkan Platform : ");
                    String Platformbaru = br.readLine();
                    System.out.print("Masukkan Harga : ");
                    int Hargabaru = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Tanggal Rilis : ");
                    String Tanggal_rilisbaru = br.readLine();
                    Produk Prkbaru = new Produk(Namabaru,idbaru,Genrebaru,Platformbaru,Hargabaru,Tanggal_rilisbaru);
                    Produks.set(i,Prkbaru);  
                }
            }
            break;

            case 4:
            System.out.println("============================");
            System.out.println("Cari Index : ");
            Cari = Integer.parseInt(br.readLine());
            Produks.remove(Cari);
            break;

            default :
            System.out.println("Menu Tidak ada!!!");
        }
        }

    }
}
