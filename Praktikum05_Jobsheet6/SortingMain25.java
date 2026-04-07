public class SortingMain25 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {20, 10, 2, 7, 12}; 

        // Eksekusi Bubble Sort
        Sorting25 dataurut1 = new Sorting25(a, a.length);
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        // Eksekusi Selection Sort (Bagian b)
        Sorting25 dataurut2 = new Sorting25(b, b.length);
        System.out.println("\nData awal 2");
        dataurut2.tampil();
        dataurut2.selectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
    }
}