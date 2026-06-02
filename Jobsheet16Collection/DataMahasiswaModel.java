public class DataMahasiswaModel implements Comparable<DataMahasiswaModel> {
    String nim;
    String nama;
    String notelp;

    public DataMahasiswaModel() {
    }

    public DataMahasiswaModel(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    // Modifikasi No. 2 & 3: Untuk mendukung pencarian binary dan sorting otomatis
    @Override
    public int compareTo(DataMahasiswaModel mhs) {
        return this.nim.compareTo(mhs.nim);
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
}