
public class Pangkat25 {
    public int nilai, pangkat;

    public Pangkat25(int n, int p) {
        nilai = n;
        pangkat = p;
    }

    // Method PangkatBF tanpa parameter (Jawaban Pertanyaan No. 3)
    public int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil = hasil * nilai;
        }
        return hasil;
    }

    // Method PangkatDC tetap menggunakan parameter karena rekursif
    public int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return a;
        } else {
            if (n % 2 == 1) {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
    }
}