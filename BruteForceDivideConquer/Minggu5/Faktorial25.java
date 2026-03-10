

public class Faktorial25 {

    // Method Brute Force menggunakan perulangan WHILE (Jawaban Pertanyaan No. 2)
    public int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }

    // Method Divide and Conquer tetap menggunakan Rekursif
    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * faktorialDC(n - 1);
        }
    }
}