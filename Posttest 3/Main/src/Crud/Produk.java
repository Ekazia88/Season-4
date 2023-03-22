package Crud;
public class Produk {
    private int id;
    private String nama_produk;
    private int harga;
    private int stok;
    private String tanggal_rilis;
    public Produk(String Nama_produk,int Id, int Harga,int Stok,String TglRilis) {
        this.nama_produk = Nama_produk;
        this.id = Id;
        this.harga = Harga;
        this.stok = Stok;
        this.tanggal_rilis = TglRilis;
    }
    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public void setTanggal_rilis(String tanggal_rilis) {
        this.tanggal_rilis = tanggal_rilis;
    }
    public String getName(){
        return nama_produk;
    }
    public int getId(){
        return id;
    }
    public int getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }
    public String getTanggal_rilis() {
        return tanggal_rilis;
    }
    public Produk get(int i) {
        return null;
    }
}
