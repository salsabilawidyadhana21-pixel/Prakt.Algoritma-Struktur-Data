
public class MahasiswaMain25 {
    public static void main(String[] args) {
        // 1. Instansiasi objek mhs1 menggunakan konstruktor default 
        Mahasiswa25 mhs1 = new Mahasiswa25();

        // 2. Mengisi atribut mhs1 
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        // 3. Memanggil method tampilkanInformasi pertama kali 
        mhs1.tampilkanInformasi();

        // 4. Mengubah data menggunakan method ubahKelas dan updateIpk 
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);

        // 5. Menampilkan informasi kembali untuk melihat perubahan 
        mhs1.tampilkanInformasi();
    }
}
