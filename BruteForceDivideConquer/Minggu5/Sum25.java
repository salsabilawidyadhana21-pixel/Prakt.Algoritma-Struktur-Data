
public class Sum25 {
    public int elemen; 
    public double keuntungan[]; 

    // Konstruktor
    public Sum25(int el) {
        this.elemen = el; 
        this.keuntungan = new double[el]; 
    }

    // Method TotalBF() menggunakan Brute Force
    public double totalBF(double arr[]) {
        double total = 0; 
        for (int i = 0; i < arr.length; i++) { 
            total = total + arr[i]; 
        }
        return total; 
    }

    // Method TotalDC() menggunakan Divide and Conquer
    public double totalDC(double arr[], int l, int r) {
        if (l == r) { 
            return arr[l]; 
        } else if (l < r) {
            int mid = (l + r) / 2; 
            double lsum = totalDC(arr, l, mid); 
            double rsum = totalDC(arr, mid + 1, r); 
            return lsum + rsum; 
        }
        return 0;
    }
}