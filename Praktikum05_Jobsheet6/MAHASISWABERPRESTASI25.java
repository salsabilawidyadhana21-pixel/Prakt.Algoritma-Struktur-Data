public class MAHASISWABERPRESTASI25 {
    MAHASISWA25[] listMhs = new MAHASISWA25[5];
    int idx; // Menghitung jumlah data yang benar-benar terisi

    // Menambahkan data mahasiswa ke array
    void tambah(MAHASISWA25 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // Menampilkan data mahasiswa yang terisi saja
    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampil();
            System.out.println("-----------------------------");
        }
    }

    // 5.4 insertionSort - Mengurutkan IPK dari Terkecil ke Terbesar (ASC)
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            MAHASISWA25 temp = listMhs[i];
            int j = i;
            
            // Proses pergeseran (Shifting)
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            // Sisipkan data temp ke posisi yang tepat
            listMhs[j] = temp;
        }
    }
}