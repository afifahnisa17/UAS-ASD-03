public class TransaksiRental {
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental br;
    TransaksiRental prev, next;

    TransaksiRental(TransaksiRental prev, int kodeTransaksi, String namaPeminjam, int lamaPinjam, double totalBiaya, BarangRental br, TransaksiRental next){
        this.prev = prev;
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.totalBiaya = totalBiaya;
        this.next = next;
    
    }
}
