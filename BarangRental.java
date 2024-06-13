public class BarangRental {
    String noTNKB, namaKendaraan, jenisKendaraan;
    int tahun, biayaSewa;
    BarangRental prev, next;

    BarangRental(BarangRental prev, String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa, BarangRental next){
        this.prev = prev;
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
        this.next = next;
    }
}
