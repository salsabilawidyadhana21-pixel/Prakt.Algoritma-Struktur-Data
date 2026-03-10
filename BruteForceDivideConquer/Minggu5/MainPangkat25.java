
import java.util.Scanner; 

public class MainPangkat25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("------------------");
        System.out.print("Masukkan jumlah elemen: "); 
        int elemen = input.nextInt(); 

        // Instansiasi array of object 
        Pangkat25[] png = new Pangkat25[elemen];

        // Input data basis dan pangkat 
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": "); 
            int basis = input.nextInt(); 
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ": "); 
            int pangkat = input.nextInt(); 
            png[i] = new Pangkat25(basis, pangkat); 
        }

        // Output hasil Brute Force 
        System.out.println("------------------");
        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + "^" + png[i].pangkat + " adalah: " 
                               + png[i].pangkatBF(png[i].nilai, png[i].pangkat)); 
        }

        // Output hasil Divide and Conquer 
        System.out.println("------------------");
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + "^" + png[i].pangkat + " adalah: " 
                               + png[i].pangkatDC(png[i].nilai, png[i].pangkat)); 
        }
        System.out.println("------------------");
    }
}