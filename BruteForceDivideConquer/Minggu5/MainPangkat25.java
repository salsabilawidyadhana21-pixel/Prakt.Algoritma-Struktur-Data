
import java.util.Scanner;

public class MainPangkat25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Pangkat25[] png = new Pangkat25[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat25(basis, pangkat);
        }

        System.out.println("------------------");
        System.out.println("HASIL PANGKAT BRUTEFORCE (Tanpa Parameter):");
        for (int i = 0; i < elemen; i++) {
            // Pemanggilan method tanpa memasukkan argumen di dalam kurung
            System.out.println("Hasil dari " + png[i].nilai + "^" + png[i].pangkat + " adalah: " 
                               + png[i].pangkatBF()); 
        }

        System.out.println("------------------");
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + "^" + png[i].pangkat + " adalah: " 
                               + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}