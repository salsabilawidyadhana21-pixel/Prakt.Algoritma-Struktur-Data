
public class MainDataMahasiswa25 {

    // Algoritma Divide and Conquer untuk mencari UTS Tertinggi (Max) dan Terendah (Min)
    public static int[] cariMaxMinUTS(DataMahasiswa25[] dm, int l, int r) {
        if (l == r) {
            // Base Case: Jika elemen sisa satu, maka dialah max dan min-nya
            return new int[]{dm[l].nilaiUts, dm[l].nilaiUts};
        } else {
            // Divide: Bagi array menjadi dua bagian
            int mid = (l + r) / 2;
            
            // Conquer: Cari max-min di bagian kiri dan kanan secara rekursif
            int[] left = cariMaxMinUTS(dm, l, mid);
            int[] right = cariMaxMinUTS(dm, mid + 1, r);

            // Combine: Bandingkan hasil dari kedua bagian
            int max = (left[0] > right[0]) ? left[0] : right[0];
            int min = (left[1] < right[1]) ? left[1] : right[1];
            return new int[]{max, min};
        }
    }

    // Algoritma Brute Force untuk menghitung rata-rata nilai UAS
    public static double hitungRataUasBF(DataMahasiswa25[] dm) {
        double total = 0;
        for (int i = 0; i < dm.length; i++) {
            total += dm[i].nilaiUas;
        }
        return total / dm.length;
    }

    public static void main(String[] args) {
        // Data input berdasarkan tabel pada Jobsheet
        DataMahasiswa25[] daftarMhs = {
            new DataMahasiswa25("Ahmad", 220101001, 2022, 78, 82),
            new DataMahasiswa25("Budi", 220101002, 2022, 85, 88),
            new DataMahasiswa25("Cindy", 220101003, 2021, 90, 87),
            new DataMahasiswa25("Dian", 220101004, 2021, 76, 79),
            new DataMahasiswa25("Eko", 220101005, 2023, 92, 95),
            new DataMahasiswa25("Fajar", 220101006, 2020, 88, 85),
            new DataMahasiswa25("Gina", 220101007, 2023, 80, 83),
            new DataMahasiswa25("Hadi", 220101008, 2020, 82, 84)
        };

        // Memanggil fungsi pencarian dan perhitungan
        int[] hasilUts = cariMaxMinUTS(daftarMhs, 0, daftarMhs.length - 1);
        double rataUas = hitungRataUasBF(daftarMhs);

        // Menampilkan output laporan
        System.out.println("============================================");
        System.out.println("      LAPORAN DATA NILAI MAHASISWA          ");
        System.out.println("============================================");
        System.out.println("a) Nilai UTS Tertinggi (DC) : " + hasilUts[0]);
        System.out.println("b) Nilai UTS Terendah (DC)  : " + hasilUts[1]);
        System.out.println("c) Rata-rata Nilai UAS (BF) : " + rataUas);
        System.out.println("============================================");
    }
}
