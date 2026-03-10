

public class Faktorial25 {
    public int faktorialBF(int n) {
        int fakto = 1; 
        for (int i = 1; i <= n; i++) { 
            fakto = fakto * i; 
        }
        return fakto; 
    }

    public int faktorialDC(int n) {
        if (n == 1) { 
            return 1; 
        } else {
            return n * faktorialDC(n - 1); 
        }
    }
}