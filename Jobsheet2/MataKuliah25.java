public class MataKuliah25 {
    // Atribut [cite: 195-198, 210-213]
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    // Konstruktor Default [cite: 207]
    public MataKuliah25() {
    }

    // Konstruktor Berparameter [cite: 207]
    public MataKuliah25(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Method menampilkan informasi [cite: 200, 216]
    void tampilInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    // Method mengubah SKS dengan notifikasi [cite: 201, 223-224]
    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    // Method menambah jam [cite: 202, 225]
    void tambahJam(int jam) {
        this.jumlahJam += jam;
    }

    // Method mengurangi jam dengan pengecekan [cite: 203, 226-229]
    void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Pengurangan berhasil. Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan! Jumlah jam tidak mencukupi.");
        }
    }
}