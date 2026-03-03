public class Dosen25 {
    public String kode;
    public String nama;
    public Boolean jenisKelamin; // Sesuai instruksi menggunakan Boolean 
    public int usia;

    // Constructor harus memiliki urutan parameter yang tepat [cite: 413]
    public Dosen25(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
}