
public class Pangkat25 {
    public int nilai, pangkat;

    // Konstruktor berparameter 
    public Pangkat25(int n, int p) {
        nilai = n; 
        pangkat = p; 
    }

    // Method menggunakan Brute Force 
    public int pangkatBF(int a, int n) {
        int hasil = 1; 
        for (int i = 0; i < n; i++) { 
            hasil = hasil * a; 
        }
        return hasil; 
    }

    // Method menggunakan Divide and Conquer 
    public int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) { 
            return a; 
        } else {
            if (n % 2 == 1) { 
                // Kondisi Ganjil 
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else {
                // Kondisi Genap
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
    }
}