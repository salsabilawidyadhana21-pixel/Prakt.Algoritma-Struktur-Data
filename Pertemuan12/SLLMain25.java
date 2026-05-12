import java.util.Scanner;

public class SLLMain25 {
    public static void main(String[] args) {
        // Membuat scanner dengan nama sc25 (sesuai nomor absen)
        Scanner sc25 = new Scanner(System.in);
        SingleLinkedList25 singLL = new SingleLinkedList25();

        System.out.println("======= INPUT DATA LINKED LIST MAHASISWA =======");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc25.nextInt();
        sc25.nextLine(); // Penting: Membersihkan enter dari memory

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n--- Data Mahasiswa Ke-" + (i + 1) + " ---");
            System.out.print("Masukkan NIM   : ");
            String nim = sc25.nextLine();
            System.out.print("Masukkan Nama  : ");
            String nama = sc25.nextLine();
            System.out.print("Masukkan Kelas : ");
            String kelas = sc25.nextLine();
            System.out.print("Masukkan IPK   : ");
            double ipk = sc25.nextDouble();
            sc25.nextLine(); // Membersihkan enter lagi sebelum loop berikutnya

            // Membuat objek baru dari hasil input
            mAHASISWA25 mhsBaru = new mAHASISWA25(nim, nama, kelas, ipk);

            // Menambahkan objek tersebut ke dalam list (contoh menggunakan addLast)
            singLL.addLast(mhsBaru);
        }

        // Menampilkan semua data yang sudah dimasukkan
        System.out.println("\n===============================================");
        System.out.println("HASIL DATA DALAM LINKED LIST:");
        singLL.print();
        
        sc25.close();
    }
}