import java.util.Scanner; 

public class MataKuliahDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        MataKuliahh25[] arrayOfMatakuliah = new MataKuliahh25[3]; 
        String kode, nama, dummy; 
        int sks, jumlahJam; 

        // Perulangan untuk input data sesuai langkah 2 
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

            // Instansiasi objek dengan constructor berparameter 
            arrayOfMatakuliah[i] = new MataKuliahh25(kode, nama, sks, jumlahJam);
        }
    }
}