public class MAHASISWA25 {
    String nim, nama, kelas;
    double ipk;

    // Constructor 
    MAHASISWA25(String ni, String na, String k, double i) {
        nim = ni;
        nama = na;
        kelas = k;
        ipk = i;
    }

    // TAMBAHKAN METHOD INI:
    void tampil() {
        System.out.println("NIM   = " + nim);
        System.out.println("Nama  = " + nama);
        System.out.println("Kelas = " + kelas);
        System.out.println("IPK   = " + ipk);
    }
}