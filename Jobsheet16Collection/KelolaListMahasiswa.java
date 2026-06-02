import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KelolaListMahasiswa {
    List<DataMahasiswaModel> mahasiswas = new ArrayList<>();

    public void tambah(DataMahasiswaModel... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void update(int index, DataMahasiswaModel mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> System.out.println(mhs.toString()));
    }

    // Modifikasi Pertanyaan No. 2: Menggunakan Binary Search dari Collections
    int binarySearch(String nim) {
        sortingAscending(); // Wajib di-sorting dulu sebelum binary search dilakukan
        DataMahasiswaModel dummy = new DataMahasiswaModel(nim, "", "");
        return Collections.binarySearch(mahasiswas, dummy);
    }

    // Modifikasi Pertanyaan No. 3: Fungsi Sorting Ascending
    public void sortingAscending() {
        Collections.sort(mahasiswas);
    }

    // Modifikasi Pertanyaan No. 3: Fungsi Sorting Descending
    public void sortingDescending() {
        Collections.sort(mahasiswas, Collections.reverseOrder());
    }

    public static void main(String[] args) {
        KelolaListMahasiswa klm = new KelolaListMahasiswa();
        
        // Memasukkan data awal mahasiswa
        klm.tambah(
            new DataMahasiswaModel("201235", "Akhleema", "021xx2"),
            new DataMahasiswaModel("201234", "Noureen", "021xx1"),
            new DataMahasiswaModel("201236", "Shannum", "021xx3")
        );

        System.out.println("--- Data Awal ---");
        klm.tampil();

        // Implementasi Modifikasi No. 2: Cari dan update menggunakan Binary Search
        int indeksKetemu = klm.binarySearch("201235");
        if (indeksKetemu >= 0) {
            klm.update(indeksKetemu, new DataMahasiswaModel("201235", "Akhleema Lela", "021xx2"));
        }

        System.out.println("\n--- Hasil Modifikasi No. 2 (Update via Binary Search) ---");
        klm.tampil();

        // Implementasi Modifikasi No. 3: Hasil Sorting Ascending
        klm.sortingAscending();
        System.out.println("\n--- Hasil Modifikasi No. 3 (Sorting Ascending) ---");
        klm.tampil();

        // Implementasi Modifikasi No. 3: Hasil Sorting Descending
        klm.sortingDescending();
        System.out.println("\n--- Hasil Modifikasi No. 3 (Sorting Descending) ---");
        klm.tampil();
    }
}