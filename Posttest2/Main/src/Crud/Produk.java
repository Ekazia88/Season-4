package Crud;
public class Produk {
    private int id;
    private String nama_produk;
    private String genre;
    private String platfrom;
    private int harga;
    private String tanggal_Rilis;

    public Produk(String Nama_produk,int Id, String Genre, String Platfrom, int Harga, String Tgl_rilis) {
        this.nama_produk = Nama_produk;
        this.id = Id;
        this.genre = Genre;
        this.platfrom= Platfrom;
        this.harga = Harga;
        this.tanggal_Rilis = Tgl_rilis;
    }
    public String getName(){
        return nama_produk;
    }
    public int getid(){
        return id;
    }
    public String getGenre(){
        return genre;
    }
    public String getPlatform(){
        return platfrom;
    }
    public int getHarga(){
        return harga;
    }
    public String getTgl(){
        return tanggal_Rilis;
    }
    public Produk get(int i) {
        return null;
    }
}
