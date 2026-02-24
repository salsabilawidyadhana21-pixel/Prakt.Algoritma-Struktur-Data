public class MahasiswaMain25 {
    public static void main(String[] args) {
        // Objek mhs1 menggunakan konstruktor default (Percobaan 2)
        Mahasiswa25 mhs1 = new Mahasiswa25();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        // [Percobaan 3 - Langkah 2] 
        // Membuat objek mhs2 menggunakan konstruktor berparameter
        Mahasiswa25 mhs2 = new Mahasiswa25("Annisa Nabila", "2141720160", 3.25, "TI 2L"); 
        
        // Memanggil method updateIpk dan tampilkanInformasi untuk mhs2
        mhs2.updateIpk(3.30); 
        mhs2.tampilkanInformasi(); 
    }
}