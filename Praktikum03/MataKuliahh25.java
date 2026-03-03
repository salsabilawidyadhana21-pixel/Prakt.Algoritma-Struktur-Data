public class MataKuliahh25 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    // Jawaban No 1 (Contoh): Menambahkan lebih dari 1 constructor (Overloading) 
    public MataKuliahh25() {
    }

    public MataKuliahh25(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Jawaban No 2: Menambahkan method tambahData() 
    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Jawaban No 3: Menambahkan method cetakInfo() 
    public void cetakInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("Sks        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("--------------------------------");
    }
}