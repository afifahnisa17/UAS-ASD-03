import java.util.Scanner;

public class TransaksiRentalMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists rental = new DoubleLinkedLists();
        rental.addLast("S 4567 YV", "Honda Beat", "Motor", 2017, 10000);
        rental.addLast("N 4511 VS", "Honda Vario", "Motor", 2018, 10000);
        rental.addLast("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 30000);
        rental.addLast("AB 4321 A", "Toyota Innova", "Mobil", 2019, 60000);
        rental.addLast("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 25000);
        Scanner sc03 = new Scanner(System.in);
        boolean pilihan = true;

        while(pilihan){
            System.out.println("Menu: ");
            System.out.println("1. Daftar Peminjaman");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5): ");
            int choice = sc03.nextInt();

            switch (choice){
                case 1:
                    rental.print();
                    break;

                case 2:
                    System.out.print("Masukkan nama Peminjam: ");
                    String nama = sc03.nextLine();
                    System.out.print("Masukkan Nomor TNKB: ");
                    String TNKB = sc03.nextLine();
                    System.out.print("Masukkan Lama Pinjam: ");
                    int lamapinjam = sc03.nextInt();
                    System.out.print("Apakah Member(ya/tidak): ");
                    String member = sc03.nextLine();
                    break;

                case 3:
                    break;

                case 4:
                    break;
                
                case 5:
                    pilihan = false;
                    break;

                default:
                    System.out.println("Pilihan yang Anda masukkan tidak valid");
                    break;
            }
        }
    }
}
