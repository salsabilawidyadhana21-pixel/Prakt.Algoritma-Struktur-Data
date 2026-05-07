import java.util.Scanner;

public class LayananAkademikSIAKAD {

    static void menu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Panggil Antrian");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Jumlah Antrian");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianLayanan antrian = new AntrianLayanan(5);

        int pilihan;

        do {
            menu();
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    MAHASISWA_25 mhs = new MAHASISWA_25(
                            nim, nama, prodi, kelas);

                    antrian.Enqueue(mhs);
                    System.out.println("Mahasiswa berhasil masuk antrian");
                    break;

                case 2:
                    MAHASISWA_25 data = antrian.Dequeue();

                    if (data != null) {
                        System.out.println("Mahasiswa yang dipanggil:");
                        data.tampilkanData();
                    }
                    break;

                case 3:
                    antrian.peek();
                    break;

                case 4:
                    antrian.print();
                    break;

                case 5:
                    antrian.getJumlahAntrian();
                    break;
            }
        } while (pilihan >= 1 && pilihan <= 5);
    }
}