import java.util.Scanner;

public class MAHASISWADEMO25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MAHASISWABERPRESTASI25 list = new MAHASISWABERPRESTASI25();
        int jmlMhs = 5;

        // Proses input data mahasiswa
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // Membersihkan buffer

            MAHASISWA25 m = new MAHASISWA25(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        System.out.println("Data sebelum sorting:");
        list.tampil();

        // Memanggil Insertion Sort
        System.out.println("Data setelah Insertion Sort (IPK ASC):");
        list.insertionSort();
        list.tampil();

        sc.close();
    }
}