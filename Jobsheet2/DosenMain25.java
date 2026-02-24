public class DosenMain25 {
    public static void main(String[] args) {
        // Objek 1: Menggunakan Konstruktor Default
        Dosen25 d1 = new Dosen25();
        d1.idDosen = "D01";
        d1.nama = "Dr. Salsabila";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Kecerdasan Buatan";

        System.out.println("=== DATA DOSEN 1 ===");
        d1.tampilInformasi();
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2025) + " tahun");

        // Objek 2: Menggunakan Konstruktor Berparameter
        Dosen25 d2 = new Dosen25("D02", "Widyadhana, M.T.", false, 2020, "Jaringan Komputer");
        
        System.out.println("\n=== DATA DOSEN 2 ===");
        d2.tampilInformasi();

        // Menguji method manipulasi pada d2
        System.out.println("\n--- Melakukan Perubahan pada Dosen 2 ---");
        d2.setStatusAktif(true);
        d2.ubahKeahlian("Keamanan Siber");
        d2.tampilInformasi();
        System.out.println("Masa Kerja: " + d2.hitungMasaKerja(2025) + " tahun");
    }
}