import java.util.Scanner; 

public class MataKuliahDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        MataKuliahh25[] arrayOfMatakuliah = new MataKuliahh25[3]; 
        String kode, nama, dummy; 
        int sks, jumlahJam; 

        // --- PROSES INPUT (Langkah 2) ---
        for (int i = 0; i < 3; i++) { 
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1)); 
            System.out.print("Kode       : "); 
            kode = sc.nextLine(); 
            System.out.print("Nama       : "); 
            nama = sc.nextLine(); 
            System.out.print("Sks        : "); 
            dummy = sc.nextLine(); 
            sks = Integer.parseInt(dummy); 
            System.out.print("Jumlah Jam : "); 
            dummy = sc.nextLine(); 
            jumlahJam = Integer.parseInt(dummy); 
            System.out.println("--------------------------------"); 

            // Instansiasi menggunakan constructor berparameter
            arrayOfMatakuliah[i] = new MataKuliahh25(kode, nama, sks, jumlahJam); 
        }

        // --- PROSES MENAMPILKAN DATA (Langkah 4) ---
        System.out.println("\n--- Hasil Input Data ---"); 
        for (int i = 0; i < 3; i++) { 
            System.out.println("Data Matakuliah ke-" + (i + 1)); 
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode); 
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama); 
            System.out.println("Sks        : " + arrayOfMatakuliah[i].sks); 
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam); 
            System.out.println("--------------------------------"); 
        }
    }
}