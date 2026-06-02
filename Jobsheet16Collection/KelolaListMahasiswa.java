import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KelolaListMahasiswa {
    // Membuat collection ArrayList untuk menampung objek mahasiswa
    List<DataMahasiswaModel> mahasiswas = new ArrayList<>();

    // 1. Method untuk menambahkan objek mahasiswa menggunakan varargs
    public void tambah(DataMahasiswaModel... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    // 2. Method untuk menghapus mahasiswa berdasarkan indeks
    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    // 3. Method untuk mengubah data mahasiswa berdasarkan indeks
    public void update(int index, DataMahasiswaModel mhs) {
        mahasiswas.set(index, mhs);
    }

    // 4. Method untuk menampilkan seluruh list mahasiswa menggunakan Stream API
    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    // 5. Method fungsi pencarian indeks berdasarkan NIM (Linear Search)
    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        KelolaListMahasiswa klm = new KelolaListMahasiswa();
        
        // Membuat instansiasi objek data mahasiswa awal
        DataMahasiswaModel m = new DataMahasiswaModel("201234", "Noureen", "021xx1");
        DataMahasiswaModel m1 = new DataMahasiswaModel("201235", "Akhleema", "021xx2");
        DataMahasiswaModel m2 = new DataMahasiswaModel("201236", "Shannum", "021xx3");

        // Menambahkan objek-objek mahasiswa ke dalam list
        klm.tambah(m, m1, m2);

        // Menampilkan daftar mahasiswa mula-mula
        System.out.println("--- Daftar Mahasiswa Awal Percobaan ---");
        klm.tampil();

        // Melakukan pembaruan (update) data mahasiswa
        // Mencari indeks mahasiswa dengan NIM "201235" terlebih dahulu menggunakan linearSearch
        int indeksKetemu = klm.linearSearch("201235");
        if (indeksKetemu != -1) {
            klm.update(indeksKetemu, new DataMahasiswaModel("201235", "Akhleema Lela", "021xx2"));
        }

        // Menampilkan daftar mahasiswa setelah proses pembaruan data
        System.out.println("\n--- Daftar Mahasiswa Setelah Di-update ---");
        klm.tampil();
    }
}