public class MAHASISWABERPRESTASI25 {
    MAHASISWA25 listMhs[]; // Deklarasi array tanpa ukuran tetap 
    int idx;

    // Konstruktor untuk menentukan ukuran array secara dinamis 
    MAHASISWABERPRESTASI25(int jumlah) {
        listMhs = new MAHASISWA25[jumlah];
    }

    void tambah(MAHASISWA25 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        }
    }

    void tampil() {
        for (MAHASISWA25 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("-------------------------");
            }
        }
    }

    // Binary Search Modifikasi (Untuk data Descending: 3.8 -> 3.2) [cite: 302]
    int findBinarySearch(double cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return mid;
            } 
            // Logika dibalik untuk urutan Menurun (Descending)
            else if (listMhs[mid].ipk < cari) { 
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data IPK " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t: " + listMhs[pos].nim);
            System.out.println("Nama\t: " + listMhs[pos].nama);
            System.out.println("Kelas\t: " + listMhs[pos].kelas);
            System.out.println("IPK\t: " + x);
        }
    }
}