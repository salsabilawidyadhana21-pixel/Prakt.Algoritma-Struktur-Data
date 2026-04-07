public class SortingMain25 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {20, 10, 2, 7, 12};
        int c[] = {20, 10, 2, 7, 12};

        // Bubble Sort
        Sorting25 dataurut1 = new Sorting25(a, a.length);
        dataurut1.bubbleSort();
        System.out.println("Data diurutkan dengan BUBBLE SORT (ASC):");
        dataurut1.tampil();

        // Selection Sort
        Sorting25 dataurut2 = new Sorting25(b, b.length);
        dataurut2.selectionSort();
        System.out.println("Data diurutkan dengan SELECTION SORT (ASC):");
        dataurut2.tampil();

        // Insertion Sort (Bagian c)
        Sorting25 dataurut3 = new Sorting25(c, c.length);
        System.out.println("\nData awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC):");
        dataurut3.tampil();
    }
}