public class MAHASISWABERPRESTASI25 {
    MAHASISWA25[] listMhs = new MAHASISWA25[5];
    int idx; 

    void tambah(MAHASISWA25 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampil();
            System.out.println("-----------------------------");
        }
    }

    // 5.4.3 insertionSort - Mengurutkan IPK dari Terbesar ke Terkecil (DESC)
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            MAHASISWA25 temp = listMhs[i];
            int j = i;
            
            // PERUBAHAN: Tanda '<' membuat data yang lebih besar bergeser ke depan
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}