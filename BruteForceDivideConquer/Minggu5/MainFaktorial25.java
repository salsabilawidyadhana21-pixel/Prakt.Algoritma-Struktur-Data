

import java.util.Scanner;

public class MainFaktorial25 {
    public static void main(String[] args) {
        // 1. Inisialisasi Scanner untuk input
        Scanner input = new Scanner(System.in); 
        
        System.out.println("------------------");
        System.out.print("Masukkan nilai: ");
        
        // 2. Deklarasi variabel 'nilai' untuk menyimpan input user
        int nilai = input.nextInt(); 
        
        System.out.println("------------------");

        // 3. Membuat objek dari class Faktorial
        Faktorial25 fk = new Faktorial25(); 

        // 4. Menampilkan hasil dengan memasukkan 'nilai' sebagai parameter
        // Pastikan variabel 'nilai' ada di dalam kurung agar tidak error
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai)); 
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai)); 
        System.out.println("------------------");
    }
}