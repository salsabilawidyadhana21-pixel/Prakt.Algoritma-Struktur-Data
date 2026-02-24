public class MataKuliahMain25 {
    public static void main(String[] args) {
        // Objek 1: Menggunakan Konstruktor Default [cite: 207]
        MataKuliah25 mk1 = new MataKuliah25();
        mk1.kodeMK = "ALSD25";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 6;

        System.out.println("=== DATA MATA KULIAH 1 ===");
        mk1.tampilInformasi();

        // Objek 2: Menggunakan Konstruktor Berparameter [cite: 207]
        MataKuliah25 mk2 = new MataKuliah25("PBO25", "Pemrograman Berorientasi Objek", 3, 4);
        
        System.out.println("\n=== DATA MATA KULIAH 2 ===");
        mk2.tampilInformasi();

        // Memanggil method manipulasi [cite: 208]
        System.out.println("\n--- Menguji Method pada Mata Kuliah 2 ---");
        mk2.ubahSKS(4);
        mk2.tambahJam(2);
        mk2.kurangiJam(3); // Berhasil
        mk2.kurangiJam(10); // Gagal karena jam tidak cukup
        
        System.out.println("\n--- Informasi Akhir MK 2 ---");
        mk2.tampilInformasi();
    }
}