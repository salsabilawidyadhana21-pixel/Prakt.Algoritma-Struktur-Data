public class MAHASISWABERPRESTASI25 {
    MAHASISWA25 listMhs[] = new MAHASISWA25[5]; 
    int idx;

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
    // Method Sequential Search sesuai langkah 2 
    int sequentialSearching(double cari) {
        int posisi = -1; 
        for (int j = 0; j < listMhs.length; j++) { 
            if (listMhs[j].ipk == cari) { 
                posisi = j; 
                break; 
            }
        }
        return posisi; 
    }

    // Method tampilPosisi sesuai langkah 3 
    void tampilPosisi(double x, int pos) {
        if (pos != -1) { 
            System.out.println("data mahasiswa dengan IPK: " + x + " ditemukan pada indeks " + pos); 
        } else {
            System.out.println("data " + x + " tidak ditemukan"); 
        }
    }

    // Method tampilDataSearch sesuai langkah 4 
    void tampilDataSearch(double x, int pos) {
        if (pos != -1) { 
            System.out.println("nim\t: " + listMhs[pos].nim); 
            System.out.println("nama\t: " + listMhs[pos].nama); 
            System.out.println("kelas\t: " + listMhs[pos].kelas); 
            System.out.println("ipk\t: " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}