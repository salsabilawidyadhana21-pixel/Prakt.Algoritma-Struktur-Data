public class MAHASISWA25 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    MAHASISWA25(String ni, String nm, String kls, double ip) {
        nim = ni;
        nama = nm;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}