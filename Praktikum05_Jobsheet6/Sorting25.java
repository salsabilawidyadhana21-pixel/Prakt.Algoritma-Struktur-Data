public class Sorting25 {
    int[] data;
    int jumData;

    // Konstruktor
    Sorting25(int Data[], int jmlDat) {
        jumData = jmlDat;
        data = new int[jmlDat];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    // Method Bubble Sort (dari bagian a)
    void bubbleSort() {
        int temp = 0;
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 1; j < jumData - i; j++) {
                if (data[j - 1] > data[j]) {
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

    // --- Method Selection Sort (Praktikum 1 bagian b) ---
    void selectionSort() {
        for (int i = 0; i < jumData - 1; i++) {
            int minId = i;
            for (int j = i + 1; j < jumData; j++) {
                if (data[j] < data[minId]) {
                    minId = j;
                }
            }
            // Swap elemen terkecil dengan elemen di posisi i
            int temp = data[minId];
            data[minId] = data[i];
            data[i] = temp;
        }
    }

    // Method tampil data
    void tampil() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
