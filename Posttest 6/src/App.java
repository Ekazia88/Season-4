import java.util.ArrayList;
import java.util.Scanner;

import Crud.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class App {
    static int i;
    static String Cari;
    static int Menu;
    static ArrayList<Console> Consoles = new ArrayList<>();
    static ArrayList<Game> Games = new ArrayList<>();
    static ArrayList<Transaksi> Transaksis = new ArrayList<>();
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
final static void Notif(){
        System.out.println("========== Data Toko Game Zeyr ==========");
        System.out.println("    Data Berhasil Ditambahkan !!!!  ");
        System.out.println("=========================================");
    }
public static void pressEnterKeyToContinue()
{ 
    System.out.println("Press Enter key to continue...");
    Scanner s = new Scanner(System.in);
    s.nextLine();
}
public static void create() throws IOException{
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("========== Data Toko Game Zeyr ==========");
    System.out.println("1. Masukkan Data Console");
    System.out.println("2. Masukkan Data Game ");
    System.out.println("======================================================");
    System.out.print("Menu : ");
    Menu = Integer.parseInt(br.readLine());
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("========== Data Toko Game Zeyr ==========");
    if(Menu == 1){
        int id = Consoles.size() + 1;
        System.out.print("Masukkan Nama : ");
        String Nama = br.readLine();
        System.out.print("Masukkan Nama Supplier : ");
        String Supplier = br.readLine();
        System.out.print("Masukkan Kondisi : ");
        String kondisi = br.readLine();
        System.out.print("Masukkan Versi : ");
        String versi = br.readLine();
        System.out.print("Masukkan Harga : ");
        int Harga = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Stok : ");
        int Stok = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Tanggal Rilis : ");
        String Tanggal_rilis = br.readLine();
        System.out.print("Masukkan Terjual : ");
        int terjual = Integer.parseInt(br.readLine());
        Console console = new Console(Nama,id,Harga,Stok,Tanggal_rilis,terjual,Supplier,kondisi,versi);
        Consoles.add(console);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Notif();
        pressEnterKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    else if(Menu == 2){
        int id = Games.size() + 1;
        System.out.print("Masukkan Nama : ");
        String Nama = br.readLine();
        System.out.print("Masukkan Genre : ");
        String Genre = br.readLine();
        System.out.print("Masukkan Platform : ");
        String Platform = br.readLine();
        System.out.print("Masukkan Harga : ");
        int Harga = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Stok : ");
        int Stok = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Tanggal Rilis : ");
        String Tanggal_rilis = br.readLine();
        System.out.print("Masukkan Terjual : ");
        int terjual = Integer.parseInt(br.readLine());
        Game game = new Game(Nama,id,Harga,Stok,Tanggal_rilis,terjual,Genre,Platform);
        Games.add(game);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Notif();
        pressEnterKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    else{
        System.out.println("Invalid Input!!! ");
        System.out.println("=========================================");
        pressEnterKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

public static void lihat()throws IOException{
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("========== Data Toko Game Zeyr ==========");
    System.out.println("1. Lihat Data Console");
    System.out.println("2. Lihat Data Game ");
    System.out.println("======================================================");
    System.out.print("Menu : ");
    Menu = Integer.parseInt(br.readLine());
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("========== Data Toko Game Zeyr ==========");
    if(Consoles.size() == 0 ){
       System.out.println("Data Kosong/tidak Ada");
       System.out.println("======================================================");
       pressEnterKeyToContinue();
       System.out.print("\033[H\033[2J");
       System.out.flush();
    }else{
        if (Menu == 1){
            System.out.println(" Data Console ");
            System.out.println("======================================================");
            for(i= 0; i < Consoles.size(); i++){
                Console console = Consoles.get(i);
                int id = console.getId();
                String nama = console.getName();
                String kondisi = console.getKondisi();
                String version = console.getVersion();
                int Harga = console.getHarga();
                int Stok = console.getStok();
                String Tanggal_rilis = console.getTanggal_rilis();
                int Terjual = console.getTerjual();
                System.out.println("Id : "+ id);
                System.out.println("Nama : " + nama);
                System.out.println("Kondisi : "+ kondisi);
                System.out.println("Version : "+ version);
                System.out.println("Harga : "+ Harga);
                System.out.println("Stok : "+ Stok);
                System.out.println("Tipe Console : " + console.getTipeConsole());
                System.out.println("Tanggal Rilis : "+ Tanggal_rilis);
                System.out.println("Terjual : " + Terjual);
                System.out.println("======================================================");
            }
        pressEnterKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        }
        else if(Menu == 2){
            System.out.println(" Data Game ");
            System.out.println("======================================================");
            for(i= 0; i < Games.size(); i++){
                Game game = Games.get(i);
                int id = game.getId();
                String nama = game.getName();
                String genre = game.getGenre();
                String platform = game.getPlatform();
                int Harga = game.getHarga();
                int Stok = game.getStok();
                String Tanggal_rilis = game.getTanggal_rilis();
                int Terjual = game.getTerjual();
                System.out.println("Id : "+ id);
                System.out.println("Nama : " + nama);
                System.out.println("Genre : "+ genre);
                System.out.println("Platform : "+ platform);
                System.out.println("Harga : "+ Harga);
                System.out.println("Stok : "+ Stok);
                System.out.println("Tanggal Rilis : "+ Tanggal_rilis);
                System.out.println("Terjual : " + Terjual);
                System.out.println("Tipe Game : " + game.getTipeproduk());
                System.out.println("======================================================");
                Notif();
                pressEnterKeyToContinue();
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } 
        }else{
            System.out.println("Invalid Input!!! ");
            System.out.println("=========================================");
            pressEnterKeyToContinue();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
public static void update() throws IOException{
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("========== Data Toko Game Zeyr ==========");
    System.out.println("1. Ubah Data Console");
    System.out.println("2. Ubah Data Game ");
    System.out.println("======================================================");
    System.out.print("Menu : ");
    Menu = Integer.parseInt(br.readLine());
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("========== Data Toko Game Zeyr ==========");
    if(Menu == 1){
        if(Consoles.size() == 0 ){
            System.out.println("Data Kosong/tidak Ada");
            System.out.println("======================================================");
            pressEnterKeyToContinue();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }else{
            System.out.print("Cari Nama : ");
            Cari = br.readLine();
            for(i= 0; i < Consoles.size(); i++){
                Console console = Consoles.get(i);
                if(console.getName().equals(Cari)){
                    int idbaru = i;
                    System.out.print("Masukkan Nama baru : ");
                    String Namabaru = br.readLine();
                    System.out.print("Masukkan Nama Supplier baru : ");
                    String Supplierbaru = br.readLine();
                    System.out.print("Masukkan Kondisi baru : ");
                    String kondisibaru = br.readLine();
                    System.out.print("Masukkan Versi baru : ");
                    String versibaru = br.readLine();
                    System.out.print("Masukkan Harga baru : ");
                    int Hargabaru = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Stok baru : ");
                    int Stokbaru = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Tanggal Rilis baru : ");
                    String Tanggal_rilisbaru = br.readLine();
                    System.out.print("Masukkan Terjual : ");
                    int terjualbaru = Integer.parseInt(br.readLine());
                    Console consoleupd = new Console(Namabaru,idbaru,Hargabaru,Stokbaru,Tanggal_rilisbaru,terjualbaru,Supplierbaru,kondisibaru,versibaru);
                    Consoles.set(i,consoleupd);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("========== Data Toko Game Zeyr ==========");
                    System.out.println("    Data Berhasil Diubah !!!!  ");
                    System.out.println("=========================================");
                    pressEnterKeyToContinue();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
            }
        }
    }else if(Menu == 2){
        if(Games.size() == 0){
            System.out.println("Data Kosong/tidak Ada");
            System.out.println("======================================================");
            pressEnterKeyToContinue();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }else{
            System.out.print("Cari Nama : ");
            Cari = br.readLine();
            for(i= 0; i < Games.size(); i++){
                Game game = Games.get(i);
                if(game.getName().equals(Cari)){
                    int idbaru = i;
                    System.out.print("Masukkan Nama baru : ");
                    String Namabaru = br.readLine();
                    System.out.print("Masukkan Genre baru: ");
                    String Genrebaru = br.readLine();
                    System.out.print("Masukkan Platform baru : ");
                    String Platformbaru = br.readLine();
                    System.out.print("Masukkan Harga baru : ");
                    int Hargabaru = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Stok baru : ");
                    int Stokbaru = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Tanggal Rilis baru : ");
                    String Tanggal_rilisbaru = br.readLine();
                    System.out.print("Masukkan Terjual baru : ");
                    int terjualbaru = Integer.parseInt(br.readLine());
                    Game gameupd = new Game(Namabaru,idbaru,Hargabaru,Stokbaru,Tanggal_rilisbaru,terjualbaru,Genrebaru,Platformbaru);
                    Games.set(i,gameupd);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("========== Data Toko Game Zeyr ==========");
                    System.out.println("    Data Berhasil Diubah !!!!  ");
                    System.out.println("=========================================");
                    pressEnterKeyToContinue();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();  
                }
            }
        }
    }else{
        System.out.println("Invalid Input!!! ");
        System.out.println("=========================================");
        pressEnterKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
public static void delete() throws IOException{
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("========== Data Toko Game Zeyr ==========");
    System.out.println("1. Hapus Data Console");
    System.out.println("2. Hapus Data Game ");
    System.out.println("======================================================");
    System.out.print("Menu : ");
    Menu = Integer.parseInt(br.readLine());
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("========== Data Toko Game Zeyr ==========");
    if(Menu == 1){
        if(Consoles.size() == 0){
            System.out.println("Data Kosong/tidak Ada");
            System.out.println("======================================================");
            pressEnterKeyToContinue();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }else{
            System.out.print("Cari Nama : ");
            Cari = br.readLine();
            for(i= 0; i < Consoles.size(); i++){
            Console console = Consoles.get(i);
                if(console.getName().equals(Cari))
                Consoles.remove(console);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("========== Data Toko Game Zeyr ==========");
                System.out.println("    Data Berhasil DiHapus !!!!  ");
                System.out.println("=========================================");
                pressEnterKeyToContinue();
                System.out.print("\033[H\033[2J");
                System.out.flush();  
            }
        }
    }else if(Menu == 2){
        if(Games.size() == 0){
            System.out.println("Data Kosong/tidak Ada");
            System.out.println("======================================================");
            pressEnterKeyToContinue();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }else{
            System.out.println("Cari Nama : ");
            Cari = br.readLine();
            for(i= 0; i < Games.size(); i++){
            Game game = Games.get(i);
                if(game.getName().equals(Cari))
                Games.remove(game);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("========== Data Toko Game Zeyr ==========");
                System.out.println("    Data Berhasil Dihapus !!!!  ");
                System.out.println("=========================================");
                pressEnterKeyToContinue();
                System.out.print("\033[H\033[2J");
                System.out.flush();  
            }
        }
    }else{
        System.out.println("Invalid Input!!! ");
    }
}
public static void ldatapenjualan() throws IOException{
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("========== Data Toko Game Zeyr ==========");
    System.out.println("1. Lihat Data penjualan Console");
    System.out.println("2. Lihat Data penjualan Game ");
    System.out.println("======================================================");
    System.out.print("Menu : ");
    Menu = Integer.parseInt(br.readLine());
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("========== Data Toko Game Zeyr ==========");
    if(Menu == 1){
        System.out.println(" Data Console ");
            System.out.println("======================================================");
            for(i = 0; i < Consoles.size(); i++){
                Console console = Consoles.get(i);
                String nama = console.getName();
                int Harga = console.getHarga();
                int Stok = console.getStok();
                int terjual = console.getTerjual();
                console.DataPenjualanProduk(nama);
                console.DataPenjualanProduk(Harga, Stok, terjual);
                System.out.println("======================================================");
            }
            pressEnterKeyToContinue();
            System.out.print("\033[H\033[2J");
            System.out.flush();
    }else if(Menu == 2){
        System.out.println(" Data Game ");
        System.out.println("======================================================");
        for(i = 0; i < Consoles.size(); i++){
            Game game = Games.get(i);
            String nama = game.getName();
            int Harga = game.getHarga();
            int Stok = game.getStok();
            int terjual = game.getTerjual();
            game.DataPenjualanProduk(nama);
            game.DataPenjualanProduk(Harga, Stok, terjual);
            System.out.println("======================================================");
        }
        pressEnterKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }else{
        System.out.println("Invalid Input!!! ");
    }
}
public static void AddTipeTransaksi() throws IOException{
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("========== Data Toko Game Zeyr ==========");
    System.out.println("         Tambahkan Tipe Transaksi        ");
    int idtransaksi = Transaksis.size() + 1;
    System.out.print(" Masukkan TipeTransaksi : ");
    String tipetransaksi = br.readLine();
    Transaksi transaksi = new Transaksi(idtransaksi,tipetransaksi);
    Transaksis.add(transaksi);
    System.out.print("\033[H\033[2J");
    System.out.flush();
}
    public static void main(String[] args) throws IOException {
        while(true){
        System.out.println("========== Selamat Datang Di Toko Game Zeyr ==========");
        System.out.println("1. Lihat Produk ");
        System.out.println("2. Masukkan Produk ");
        System.out.println("3. Ubah Produk ");
        System.out.println("4. Hapus Produk ");
        System.out.println("5. Lihat data Penjualan ");
        System.out.println("6. Masukkan Tipe Transaksi");
        System.out.println("7. Exit");
        System.out.println("======================================================");
        System.out.print("Menu : ");
        try {
            Menu = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Inputan Harus Angka!!");
            pressEnterKeyToContinue();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        switch(Menu){
            case 1:
            lihat();
            break;
            case 2:
            create();
            break;
            case 3:
            update();
            break;
            case 4:
            delete();
            break;
            case 5:
            ldatapenjualan();
            case 6:
            AddTipeTransaksi();
            case 7:
            System.exit(0);
            default :
            System.out.println("Menu Tidak ada!!!");
        }
        }
    }
}
