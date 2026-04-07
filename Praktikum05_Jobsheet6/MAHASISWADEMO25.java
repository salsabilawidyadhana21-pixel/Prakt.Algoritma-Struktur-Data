public class MAHASISWADEMO25 {
    public static void main(String[] args) {
        MAHASISWABERPRESTASI25 list = new MAHASISWABERPRESTASI25();
        
        MAHASISWA25 m1 = new MAHASISWA25("123", "Zidan", "2A", 3.2);
        MAHASISWA25 m2 = new MAHASISWA25("124", "Ayu", "2A", 3.5);
        MAHASISWA25 m3 = new MAHASISWA25("125", "Sofi", "2A", 3.1);
        MAHASISWA25 m4 = new MAHASISWA25("126", "Sita", "2A", 3.9);
        MAHASISWA25 m5 = new MAHASISWA25("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting (Bubble Sort - DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting (Selection Sort - ASC): ");
        list.selectionSort();
        list.tampil();
    }
}
