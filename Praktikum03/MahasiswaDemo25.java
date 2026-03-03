import java.util.Scanner;

public class MahasiswaDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswaa25[] arrayOfMahasiswa = new Mahasiswaa25[3];
        String dummy;

        // Proses Input menggunakan Looping
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswaa25(); // Instansiasi objek di setiap indeks 
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM    : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama   : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas  : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK    : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy); // Mengonversi input String ke Float 
            System.out.println("---------------------------");
        }

        // Proses Menampilkan Data menggunakan Looping
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM    : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama   : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas  : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK    : " + arrayOfMahasiswa[i].ipk);
            System.out.println("---------------------------");
        }
    }
}