package Crud;

public final class Transaksi {
    private String tipeTransaksi;
    private int idTransaksi;

    public Transaksi(int idtransaksi,String tipetransaksi){
        this.idTransaksi = idtransaksi;
        this.tipeTransaksi = tipetransaksi;
    }
    public int getIdTransaksi() {
        return idTransaksi;
    }
    public String getTipeTransaksi() {
        return tipeTransaksi;
    }
    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }
    public void setTipeTransaksi(String tipeTransaksi) {
        this.tipeTransaksi = tipeTransaksi;
    }
}
