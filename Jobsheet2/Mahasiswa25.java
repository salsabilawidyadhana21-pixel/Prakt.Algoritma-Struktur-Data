public class Mahasiswa25 {
    // Atribut 
    String nama;
    String nim;
    String kelas;
    double ipk;

    // Konstruktor Default 
    public Mahasiswa25() {
    }

    // Konstruktor Berparameter 
    public Mahasiswa25(String nm, String nim, double ipk, String kls) {
        this.nama = nm;  // Menggunakan 'this' jika nama parameter sama dengan atribut 
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kls;
    }

    // Method untuk menampilkan informasi lengkap mahasiswa 
    void tampilkanInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("IPK   : " + ipk);
        System.out.println("Kelas : " + kelas);
    }

    // Method untuk mengubah kelas 
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    // Method updateIpk dengan MODIFIKASI VALIDASI (0.0 - 4.0) 
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    // Method untuk mengevaluasi kinerja berdasarkan rentang IPK 
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    // Fungsi main untuk menjalankan seluruh percobaan 
    public static void main(String[] args) {
        // Instansiasi menggunakan Konstruktor Default (Percobaan 2) 
        Mahasiswa25 mhs1 = new Mahasiswa25();
        mhs1.nama = "Muhammad Ali Farhan"; 
        mhs1.nim = "2241720171"; 
        mhs1.kelas = "SI 2J"; 
        mhs1.ipk = 3.55; 

        System.out.println("--- Data Mahasiswa 1 ---");
        mhs1.tampilkanInformasi(); 
        
        // Menguji Method Update
        mhs1.ubahKelas("SI 2K"); 
        mhs1.updateIpk(3.60); 
        mhs1.tampilkanInformasi(); 

        System.out.println("\n--- Data Mahasiswa 2 ---");
        // Instansiasi menggunakan Konstruktor Berparameter (Percobaan 3) 
        Mahasiswa25 mhs2 = new Mahasiswa25("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30); 
        mhs2.tampilkanInformasi(); 
        System.out.println("Hasil Evaluasi: " + mhs2.nilaiKinerja());
    }
}
