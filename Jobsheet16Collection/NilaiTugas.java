// Class untuk merepresentasikan transaksi Nilai Mahasiswa
public class NilaiTugas {
    MahasiswaTugas mhs;
    MataKuliahTugas mk;
    double nilai;

    // Konstruktor untuk menghubungkan Mahasiswa, Mata Kuliah, dan nilai yang diperoleh
    public NilaiTugas(MahasiswaTugas mhs, MataKuliahTugas mk, double nilai) {
        this.mhs = mhs;
        this.mk = mk;
        this.nilai = nilai;
    }
}