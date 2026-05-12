import java.util.Scanner;

public class MainRoyalDelish25 {
    public static void main(String[] args) {
        DLL25 sistem = new DLL25();
        Scanner sc = new Scanner(System.in);
        int pilih;

        // Data awal otomatis agar tidak capek input manual
        sistem.tambahAntrean(new Pembeli25("Ainra", "08224500000"));
        sistem.tambahAntrean(new Pembeli25("Danra", "08224511111"));
        sistem.tambahAntrean(new Pembeli25("Sanri", "08224522222"));

        do {
            System.out.println("\nSISTEM ANTRIAN ROYAL DELISH");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    sistem.tambahAntrean(new Pembeli25(nama, hp));
                    break;
                case 2:
                    sistem.cetakAntrean();
                    break;
                case 3:
                    System.out.print("Kode Pesanan : ");
                    int kode = sc.nextInt(); sc.nextLine();
                    System.out.print("Nama Pesanan : ");
                    String menu = sc.nextLine();
                    System.out.print("Harga        : ");
                    int harga = sc.nextInt();
                    sistem.hapusAntrean(kode, menu, harga);
                    break;
                case 4:
                    sistem.laporanPesanan();
                    break;
            }
        } while (pilih != 0);
        
        sc.close();
    }
}