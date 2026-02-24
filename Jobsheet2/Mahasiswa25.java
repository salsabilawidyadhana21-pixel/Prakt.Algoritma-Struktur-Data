
public class Mahasiswa25 {
    // Atribut 
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Method untuk menampilkan informasi mahasiswa 
    void tampilkanInformasi() {
        System.out.println("Nama  : " + nama); 
        System.out.println("NIM   : " + nim); 
        System.out.println("IPK   : " + ipk); 
        System.out.println("Kelas : " + kelas); 
    }

    // Method untuk mengubah kelas [cite: 49]
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru; 
    }

    // Method update Ipk dengan MODIFIKASI VALIDASI (Pertanyaan No. 4) 
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) { 
            ipk = ipkBaru; 
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0"); 
        }
    }

    // Method untuk mengevaluasi kinerja berdasarkan IPK 
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

    // Fungsi main untuk menjalankan program
    public static void main(String[] args) {
        // Instansiasi objek mhs 
        Mahasiswa25 mhs = new Mahasiswa25(); 
        
        // Mengisi atribut objek 
        mhs.nama = "Salsa"; 
        mhs.nim = "254107020200"; 
        
        // Memanggil method untuk menampilkan informasi 
        mhs.tampilkanInformasi(); 
    }
}