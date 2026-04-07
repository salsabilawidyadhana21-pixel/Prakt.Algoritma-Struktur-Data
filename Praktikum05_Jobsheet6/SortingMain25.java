public class SortingMain25 {
    public static void main(String[] args) {
        // Deklarasi dan pengisian array
        int a[] = {20, 10, 2, 7, 12};

        // Instansiasi objek menggunakan class Sorting25
        Sorting25 dataurut1 = new Sorting25(a, a.length);

        // Menampilkan data sebelum diurutkan
        System.out.println("Data awal 1");
        dataurut1.tampil();

        // Melakukan sorting dan menampilkan hasil
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
    }
}