import java.util.Scanner;

public class AntrianMain25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        QueueMahasiswa25 antrian = new QueueMahasiswa25();
        int menu;

        do {
            System.out.println("\n=== LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian (Enqueue)");
            System.out.println("2. Layani Mahasiswa (Dequeue)");
            System.out.println("3. Lihat Daftar Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            menu = sc25.nextInt();
            sc25.nextLine(); // Clear buffer

            switch (menu) {
                case 1:
                    System.out.print("Masukkan NIM   : ");
                    String nim = sc25.nextLine();
                    System.out.print("Masukkan Nama  : ");
                    String nama = sc25.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    String kelas = sc25.nextLine();
                    System.out.print("Masukkan IPK   : ");
                    double ipk = sc25.nextDouble();
                    antrian.enqueue(new mAHASISWA25(nim, nama, kelas, ipk));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.printAntrian();
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menu != 4);
        
        sc25.close();
    }
}