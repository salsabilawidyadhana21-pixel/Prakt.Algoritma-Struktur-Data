import java.util.Scanner;

public class MAHASISWADEMO25 {
    public static void main(String[] args) {
        MAHASISWABERPRESTASI25 list = new MAHASISWABERPRESTASI25(); 
        Scanner sc = new Scanner(System.in); 
        int jumMhs = 5; 

        // Proses input data mahasiswa 
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
        // Bagian pencarian sequential 
        System.out.println("-------------------------");
        System.out.println("Pencarian data");
        System.out.println("masukkan ipk mahasiswa yang dicari: "); 
        System.out.print("IPK: ");
        double cari = sc.nextDouble(); 
        
        System.out.println("menggunakan sequential searching"); 
        int posisi = list.sequentialSearching(cari);
        
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi); 
    }
}