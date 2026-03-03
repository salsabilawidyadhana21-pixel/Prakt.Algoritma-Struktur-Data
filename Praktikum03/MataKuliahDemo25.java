import java.util.Scanner;

public class MataKuliahDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Jawaban No 4: Panjang array ditentukan oleh user melalui input Scanner 
        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlahEksperimen = Integer.parseInt(sc.nextLine());
        MataKuliahh25[] arrayOfMatakuliah = new MataKuliahh25[jumlahEksperimen];

        String kode, nama, dummy;
        int sks, jumlahJam;

        // Proses Input menggunakan perulangan sesuai panjang array 
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
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

        // Jawaban No 3: Menampilkan data menggunakan method cetakInfo() 
        System.out.println("\n--- DATA MATAKULIAH (HASIL CETAK INFO) ---");
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo(); // Pemanggilan method dari class MataKuliahh25
        }
    }
}