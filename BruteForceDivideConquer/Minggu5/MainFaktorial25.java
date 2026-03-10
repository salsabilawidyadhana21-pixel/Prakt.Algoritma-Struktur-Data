

import java.util.Scanner;

public class MainFaktorial25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------------");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int jml = sc.nextInt();

        // Membuat array of object untuk menampung beberapa objek Faktorial25
        Faktorial25[] fk = new Faktorial25[jml];

        // Mengisi nilai untuk setiap elemen array
        for (int i = 0; i < jml; i++) {
            fk[i] = new Faktorial25();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
            int nilai = sc.nextInt();
            // Menyimpan nilai ke dalam method faktorialBF (while) atau faktorialDC
            // Note: Karena di class Faktorial25 method-nya menerima parameter, 
            // langsung panggil di bagian cetak.
            
        }

        // Menampilkan Hasil Brute Force (Menggunakan perulangan WHILE yang baru)
        System.out.println("------------------");
        System.out.println("HASIL - BRUTE FORCE (WHILE)");
        for (int i = 0; i < jml; i++) {
            
        }
        
        System.out.println("Contoh pemanggilan untuk satu nilai:");
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        Faktorial25 faktorial = new Faktorial25();
        
        System.out.println("Hasil BF (While): " + faktorial.faktorialBF(angka));
        System.out.println("Hasil DC: " + faktorial.faktorialDC(angka));
        System.out.println("------------------");
    }
}