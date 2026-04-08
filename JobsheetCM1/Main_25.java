import java.util.Scanner;

// Class Mahasiswa sesuai diagram 
class MAhasiswa_25 {
    public String nim, nama, prodi;

    public MAhasiswa_25(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}

// Class Buku sesuai diagram
class Buku_25 {
    public String kodeBuku, judul;
    public int tahunTerbit;

    public Buku_25(String kode, String judul, int tahun) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }

    public void tampilBuku() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}

// Class Peminjaman dengan logika denda 
class Peminjaman_25 {
    public MAhasiswa_25 mhs;
    public Buku_25 buku;
    public int lamaPinjam, terlambat, denda;
    public int batasPinjam = 5; // Batas maksimal 5 hari 

    public Peminjaman_25(MAhasiswa_25 mhs, Buku_25 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    // Hitung denda Rp 2.000/hari jika lebih dari 5 hari 
    public void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    public void tampilPeminjaman() {
        System.out.printf("%-8s %-12s | Lama: %-2d | Terlambat: %-2d | Denda: %d\n", 
            mhs.nama, buku.judul, lamaPinjam, terlambat, denda);
    }
}

public class Main_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inisialisasi Data Awal 
        MAhasiswa_25[] daftarMhs = {
            new MAhasiswa_25("22001", "Andi", "Teknik Informatika"),
            new MAhasiswa_25("22002", "Budi", "Teknik Informatika"),
            new MAhasiswa_25("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku_25[] daftarBuku = {
            new Buku_25("B001", "Algoritma", 2020),
            new Buku_25("B002", "Basis Data", 2019),
            new Buku_25("B003", "Pemrograman", 2021),
            new Buku_25("B004", "Fisika", 2024)
        };

        Peminjaman_25[] daftarPinjam = {
            new Peminjaman_25(daftarMhs[0], daftarBuku[0], 7),
            new Peminjaman_25(daftarMhs[1], daftarBuku[1], 3),
            new Peminjaman_25(daftarMhs[2], daftarBuku[2], 10),
            new Peminjaman_25(daftarMhs[2], daftarBuku[3], 6),
            new Peminjaman_25(daftarMhs[0], daftarBuku[1], 4)
        };

        int pilihan;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa\n2. Tampilkan Buku\n3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda\n5. Cari Berdasarkan NIM\n0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    for (MAhasiswa_25 m : daftarMhs) m.tampilMahasiswa();
                    break;
                case 2:
                    for (Buku_25 b : daftarBuku) b.tampilBuku();
                    break;
                case 3:
                    for (Peminjaman_25 p : daftarPinjam) p.tampilPeminjaman();
                    break;
                case 4:
                    // Implementasi Insertion Sort (Denda Terbesar) 
                    for (int i = 1; i < daftarPinjam.length; i++) {
                        Peminjaman_25 key = daftarPinjam[i];
                        int j = i - 1;
                        while (j >= 0 && daftarPinjam[j].denda < key.denda) {
                            daftarPinjam[j + 1] = daftarPinjam[j];
                            j--;
                        }
                        daftarPinjam[j + 1] = key;
                    }
                    System.out.println("Data Terurut (Denda Terbesar):");
                    for (Peminjaman_25 p : daftarPinjam) p.tampilPeminjaman();
                    break;
                case 5:
                    // Implementasi Binary Search berdasarkan NIM
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.nextLine();
                    
                    // Sort dulu berdasarkan NIM agar Binary Search bekerja
                    for (int i = 0; i < daftarPinjam.length - 1; i++) {
                        for (int j = 0; j < daftarPinjam.length - i - 1; j++) {
                            if (daftarPinjam[j].mhs.nim.compareTo(daftarPinjam[j+1].mhs.nim) > 0) {
                                Peminjaman_25 temp = daftarPinjam[j];
                                daftarPinjam[j] = daftarPinjam[j+1];
                                daftarPinjam[j+1] = temp;
                            }
                        }
                    }

                    int low = 0, high = daftarPinjam.length - 1;
                    boolean found = false;
                    while (low <= high) {
                        int mid = (low + high) / 2;
                        if (daftarPinjam[mid].mhs.nim.equals(cari)) {
                            found = true;
                            // Tampilkan semua data jika NIM meminjam lebih dari 1 buku
                            int left = mid;
                            while(left >= 0 && daftarPinjam[left].mhs.nim.equals(cari)) left--;
                            for(int k = left + 1; k < daftarPinjam.length && daftarPinjam[k].mhs.nim.equals(cari); k++) {
                                daftarPinjam[k].tampilPeminjaman();
                            }
                            break;
                        } else if (daftarPinjam[mid].mhs.nim.compareTo(cari) < 0) low = mid + 1;
                        else high = mid - 1;
                    }
                    if (!found) System.out.println("NIM tidak ditemukan.");
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}