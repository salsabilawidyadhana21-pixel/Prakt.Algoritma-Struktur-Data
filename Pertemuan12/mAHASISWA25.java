public class mAHASISWA25 {
    String nim, nama, kelas;
    double ipk;

    // Constructor tetap sama
    public mAHASISWA25(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    
    public void tampilData() {
        System.out.print("NIM: " + nim + " | Nama: " + nama + " | Kelas: " + kelas + " | IPK: " + ipk);
    }
}