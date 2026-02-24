public class Mahasiswa25 {
    // Atribut 
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Method untuk menampilkan informasi mahasiswa 
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama); 
        System.out.println("NIM: " + nim); 
        System.out.println("IPK: " + ipk); 
        System.out.println("Kelas: " + kelas); 
    }

    // Method untuk mengubah kelas 
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru; 
    }

    // Method untuk memperbarui nilai IPK 
    void updateIpk(double ipkBaru) {
        ipk = ipkBaru; 
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
}