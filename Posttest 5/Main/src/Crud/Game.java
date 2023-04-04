package Crud;

public class Game extends Produk{

    private String Genre;
    private String Platform;
    private final String Tipeproduk = "Kaset"; 
    public Game(String Nama_produk, int Id, int Harga, int Stok, String TglRilis,int Terjual,String genre,String platform) {
        super(Nama_produk, Id, Harga, Stok, TglRilis,Terjual);
        this.Genre = genre;
        this.Platform = platform;
    }
    public void setGenre(String genre) {
        Genre = genre;
    }
    public void setPlatform(String platform) {
        Platform = platform;
    }
    public String getGenre() {
         return Genre;
    }
    public String getPlatform() {
        return Platform;
    }
    public String getTipeproduk(){
        return Tipeproduk;
    }
    @Override
    public
    void DataPenjualanProduk(String namaproduk){
        System.out.println("Nama :" + namaproduk);
    }
    /**
     * @param showID
     */
    @Override
    public
    void DataPenjualanProduk(int Harga, int Stok,int Terjual){
        System.out.println("Harga : " + Harga);
        System.out.println("Stok : " + Stok);
        System.out.println("Harga total : " + Harga * Stok);
        System.out.println("Terjual : "+ Terjual);

    }
}
