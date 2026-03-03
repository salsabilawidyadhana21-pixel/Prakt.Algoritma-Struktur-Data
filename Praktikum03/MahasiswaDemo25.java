public class MahasiswaDemo25 {
    public static void main(String[] args) {
        // Deklarasi array of objects dengan kapasitas 3 elemen
        Mahasiswaa25[] arrayOfMahasiswa = new Mahasiswaa25[3];

        // Mengisi data mahasiswa ke-1 (indeks 0)
        arrayOfMahasiswa[0] = new Mahasiswaa25();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        // Mengisi data mahasiswa ke-2 (indeks 1)
        arrayOfMahasiswa[1] = new Mahasiswaa25();
        arrayOfMahasiswa[1].nim = "2341720172";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = (float) 3.36;

        // Mengisi data mahasiswa ke-3 (indeks 2)
        arrayOfMahasiswa[2] = new Mahasiswaa25();
        arrayOfMahasiswa[2].nim = "244107023006";
        arrayOfMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa[2].kelas = "TI-2E";
        arrayOfMahasiswa[2].ipk = (float) 3.80;

        // Menampilkan semua atribut dari objek dalam array ke layar
        System.out.println("NIM    : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa[0].ipk);
        System.out.println("---------------------------");

        System.out.println("NIM    : " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa[1].ipk);
        System.out.println("---------------------------");

        System.out.println("NIM    : " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa[2].ipk);
        System.out.println("---------------------------");
    }
}