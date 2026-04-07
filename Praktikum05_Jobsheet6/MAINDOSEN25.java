import java.util.Scanner;

public class MAINDOSEN25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DATADOSEN25 data = new DATADOSEN25();
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN 2026 ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data Dosen");
            System.out.println("3. Urutkan Usia Termuda (Bubble Sort)");
            System.out.println("4. Urutkan Usia Tertua (Selection Sort)");
            System.out.println("5. Urutkan Usia Termuda (Insertion Sort)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Kode: "); String kd = sc.nextLine();
                    System.out.print("Nama: "); String nm = sc.nextLine();
                    System.out.print("Laki-laki (true) / Perempuan (false): "); 
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: "); int us = sc.nextInt();
                    data.tambah(new DOSEN25(kd, nm, jk, us));
                    break;
                case 2:
                    System.out.println("\nDaftar Dosen:");
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Data berhasil diurutkan dengan Bubble Sort.");
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data berhasil diurutkan dengan Selection Sort.");
                    break;
                case 5:
                    data.insertionSort();
                    System.out.println("Data berhasil diurutkan dengan Insertion Sort.");
                    break;
            }
        } while (pilih != 0);

        System.out.println("Program selesai. Semangat praktikumnya!");
        sc.close();
    }
}