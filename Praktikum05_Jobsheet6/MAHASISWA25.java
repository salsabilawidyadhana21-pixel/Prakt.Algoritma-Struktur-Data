public class MAHASISWA25 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    MAHASISWA25() {
    }

    MAHASISWA25(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
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