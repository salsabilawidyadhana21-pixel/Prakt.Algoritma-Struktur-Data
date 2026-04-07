import java.util.Scanner;

public class MAHASISWADEMO25 {
    public static void main(String[] args) {
        MAHASISWABERPRESTASI25 list = new MAHASISWABERPRESTASI25();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        // Input data mahasiswa
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            
            MAHASISWA25 m = new MAHASISWA25(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println("-------------------------");
        }

        System.out.println("Seluruh Data Mahasiswa:");
        list.tampil();

        // Operasi Pencarian
        System.out.println("-------------------------");
        System.out.println("Pencarian data");
        System.out.print("masukkan ipk mahasiswa yang dicari: ");
        double cari = sc.nextDouble();
        
        // Menjalankan Binary Search
        System.out.println("-------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-------------------------");
        int posisi = list.findBinarySearch(cari, 0, jumMhs - 1);
        
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}