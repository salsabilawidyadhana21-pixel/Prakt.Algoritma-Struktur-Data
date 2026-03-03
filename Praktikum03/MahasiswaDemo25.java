import java.util.Scanner;

public class MahasiswaDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswaa25[] arrayOfMahasiswa = new Mahasiswaa25[3];
        String dummy;

        // Proses Input Data menggunakan Looping (Percobaan 3.3)
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswaa25();
            
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM    : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            
            System.out.print("Nama   : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            
            System.out.print("Kelas  : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            
            System.out.print("IPK    : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------");
        }

        // Proses Menampilkan Data menggunakan method cetakInfo() (Pertanyaan 3.3)
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo(); // Memanggil method dari class Mahasiswaa25
            System.out.println("---------------------------");
        }
    }
}