public class MahasiswaMain25 {
    public static void main(String[] args) {
        
        // --- DATA MAHASISWA 1 (Konstruktor Default) ---
        Mahasiswa25 mhs1 = new Mahasiswa25(); 
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;
        
        System.out.println("=== DATA MAHASISWA 1 ===");
        mhs1.tampilkanInformasi();

        // --- DATA MAHASISWA 2 (Konstruktor Berparameter) ---
        Mahasiswa25 mhs2 = new Mahasiswa25("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        
        System.out.println("\n=== DATA MAHASISWA 2 ===");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        // --- JAWABAN NOMOR 5 (Objek Salsabila Widyadhana) ---
        // Menggunakan konstruktor berparameter
        Mahasiswa25 mhsSalsabila = new Mahasiswa25("Salsabila Widyadhana", "2441720025", 3.95, "TI 1H");
        
        System.out.println("\n=== DATA MAHASISWA SALSABILA WIDYADHANA ===");
        mhsSalsabila.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhsSalsabila.nilaiKinerja());
    }
}