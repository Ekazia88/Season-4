package Crud;
public class Console extends Produk{ 
    private String Nama_Supplier;
    private String kondisi;
    private String version;
    public Console(String Nama_produk, int Id,int Harga, int Stok, String Tgl_rilis,int Terjual, String NamaSupplier,String Kondisi,String Version) {
        super(Nama_produk, Id, Harga,Stok,Tgl_rilis,Terjual);
        this.Nama_Supplier = NamaSupplier;
        this.kondisi = Kondisi;
        this.version = Version; 
    }
    public void setNama_Supplier(String nama_Supplier) {
        Nama_Supplier = nama_Supplier;
    }
    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getNama_Supplier() {
        return Nama_Supplier;
    }
    public String getKondisi() {
        return kondisi;
    }
    public String getVersion() {
        return version;
    }
    public void DataPenjualanProduk(String namaproduk){
        System.out.println("Nama :" + namaproduk);
    }
    public void DataPenjualanProduk(int Harga, int Stok, int Terjual){
        System.out.println("Harga : " + Harga);
        System.out.println("Stok : " + Stok);
        System.out.println("Harga total : " + Harga * Stok);
        System.out.println("Terjual : " + Terjual );
    }
} 
