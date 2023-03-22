package Crud;

public class Game extends Produk{
    private String Genre;
    private String Platform; 
    public Game(String Nama_produk, int Id, int Harga, int Stok, String TglRilis,String genre,String platform) {
        super(Nama_produk, Id, Harga, Stok, TglRilis);
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
}
