
import java.util.Scanner; 

public class MainSum25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("=================================================");
        System.out.println("Program Menghitung Total Keuntungan (Satuan Juta)");
        System.out.print("Masukkan jumlah bulan: "); 
        int elm = sc.nextInt(); 

        // Instansiasi objek
        Sum25 sm = new Sum25(elm); 
        System.out.println("=================================================");
        
        // Input data keuntungan
        for (int i = 0; i < sm.elemen; i++) { 
            System.out.print("Masukkan keuntungan bulan ke-" + (i + 1) + " : "); 
            sm.keuntungan[i] = sc.nextDouble(); 
        }

        // Tampilkan hasil
        System.out.println("=================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan selama " + sm.elemen + " bulan adalah = " + 
                           sm.totalBF(sm.keuntungan)); 
        System.out.println("=================================================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total keuntungan selama " + sm.elemen + " bulan adalah = " + 
                           sm.totalDC(sm.keuntungan, 0, sm.elemen - 1)); 
        System.out.println("=================================================");
    }
}