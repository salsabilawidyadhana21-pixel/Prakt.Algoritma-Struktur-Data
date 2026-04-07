import java.util.Scanner;

public class MAHASISWADEMO25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Modifikasi No. 7: Input jumlah mahasiswa dari keyboard 
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine(); // Clear buffer

        MAHASISWABERPRESTASI25 list = new MAHASISWABERPRESTASI25(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // Clear buffer
            
            list.tambah(new MAHASISWA25(nim, nama, kelas, ipk));
            System.out.println("-------------------------");
        }

        System.out.println("Pencarian Data (Urutan Descending)");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari = sc.nextDouble();

        // Menggunakan Binary Search yang sudah dimodifikasi
        int posisi = list.findBinarySearch(cari, 0, jumMhs - 1);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}