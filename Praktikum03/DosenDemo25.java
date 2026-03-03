import java.util.Scanner;

public class DosenDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen25[] arrayOfDosen = new Dosen25[3];

        for (int i = 0; i < 3; i++) { // Menggunakan FOR untuk input 
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : "); String kode = sc.nextLine();
            System.out.print("Nama          : "); String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : "); String jk = sc.nextLine();
            
            // Konversi input ke Boolean 
            Boolean jenisKelamin = jk.equalsIgnoreCase("Pria");
            
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());
            
            // Instansiasi dengan constructor berparameter 
            arrayOfDosen[i] = new Dosen25(kode, nama, jenisKelamin, usia);
            System.out.println("--------------------------------");
        }

        DataDosen25 dataObj = new DataDosen25();
        dataObj.dataSemuaDosen(arrayOfDosen);
        dataObj.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataObj.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataObj.infoDosenPalingTua(arrayOfDosen);
        dataObj.infoDosenPalingMuda(arrayOfDosen);
    }
}