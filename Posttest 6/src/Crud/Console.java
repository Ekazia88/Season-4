package Crud;
public class Console extends Produk{ 
    private static String Nama_Supplier;
    private static String kondisi;
    private static String version;
    private final static String TipeConsole = "Hardware"; 

    public Console(String Nama_produk, int Id,int Harga, int Stok, String Tgl_rilis,int Terjual, String NamaSupplier,String Kondisi,String Version) {
        super(Nama_produk, Id, Harga,Stok,Tgl_rilis,Terjual);
        Console.Nama_Supplier = NamaSupplier;
        Console.kondisi = Kondisi;
        Console.version = Version; 
    }
    public void setNama_Supplier(String nama_Supplier) {
        Nama_Supplier = nama_Supplier;
    }
    public void setKondisi(String kondisi) {
        Console.kondisi = kondisi;
    }
    public void setVersion(String version) {
        Console.version = version;
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
    public String getTipeConsole(){
        return TipeConsole;
    }
    @Override
    public
    void DataPenjualanProduk(String namaproduk){
        System.out.println("Nama :" + namaproduk);
    }
    @Override
    public
    void DataPenjualanProduk(int Harga, int Stok, int Terjual){
        System.out.println("Harga : " + Harga);
        System.out.println("Stok : " + Stok);
        System.out.println("Harga total : " + Harga * Stok);
        System.out.println("Terjual : " + Terjual );
    }
   
} 
