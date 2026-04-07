public class MAHASISWABERPRESTASI25 {
    // Kapasitas maksimal array adalah 5
    MAHASISWA25[] listMhs = new MAHASISWA25[5];
    int idx; // Variabel ini untuk menghitung jumlah data yang masuk

    // Menambahkan mahasiswa ke dalam array
    void tambah(MAHASISWA25 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // Menampilkan data yang sudah terisi saja
    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampil(); // Memanggil method tampil di class MAHASISWA25
            System.out.println("-----------------------------");
        }
    }

    // Logika Selection Sort (Mencari nilai terkecil/ASC)
    void selectionSort() {
        // Gunakan 'idx' agar tidak mengecek laci yang kosong (null)
        for (int i = 0; i < idx - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < idx; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            // Proses penukaran (Swapping)
            MAHASISWA25 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
}