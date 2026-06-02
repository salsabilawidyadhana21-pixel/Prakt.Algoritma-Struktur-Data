import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class SistemPengolahanNilai {
    // List Collection untuk menampung data master mahasiswa dan mata kuliah
    List<MahasiswaTugas> listMahasiswa = new ArrayList<>();
    List<MataKuliahTugas> listMataKuliah = new ArrayList<>();
    
    // List Collection untuk menampung transaksi data Nilai
    List<NilaiTugas> listNilai = new ArrayList<>();
    
    // Queue Collection (menggunakan LinkedList) untuk implementasi antrean hapus data mahasiswa (Tugas No. 2)
    Queue<MahasiswaTugas> antreanHapusMhs = new LinkedList<>();

    // Method untuk mengisi data awal (hardcoded) sesuai dengan ilustrasi dokumen jobsheet
    public void initData() {
        // Mengisi data mahasiswa sesuai tabel halaman 6
        listMahasiswa.add(new MahasiswaTugas("20001", "Thalhah", "021xxx"));
        listMahasiswa.add(new MahasiswaTugas("20002", "Zubair", "021xxx"));
        listMahasiswa.add(new MahasiswaTugas("20003", "Abdur-Rahman", "021xxx"));
        listMahasiswa.add(new MahasiswaTugas("20004", "Sa'ad", "021xxx"));
        listMahasiswa.add(new MahasiswaTugas("20005", "Sa'id", "021xxx"));
        listMahasiswa.add(new MahasiswaTugas("20006", "Ubaidah", "021xxx"));

        // Mengisi data mata kuliah sesuai tabel halaman 6
        listMataKuliah.add(new MataKuliahTugas("00001", "Internet of Things", 3));
        listMataKuliah.add(new MataKuliahTugas("00002", "Algoritma dan Struktur Data", 3));
        listMataKuliah.add(new MataKuliahTugas("00003", "Algoritma dan Pemrograman", 3));
        listMataKuliah.add(new MataKuliahTugas("00004", "Praktikum Algoritma dan Struktur Data", 3));
        listMataKuliah.add(new MataKuliahTugas("00005", "Praktikum Algoritma dan Pemrograman", 3));
        
        // Memasukkan satu data transaksi awal agar langsung sinkron dengan contoh running halaman 7
        listNilai.add(new NilaiTugas(listMahasiswa.get(0), listMataKuliah.get(0), 90.00));
    }

    public static void main(String[] args) {
        SistemPengolahanNilai app = new SistemPengolahanNilai();
        app.initData(); // Memanggil data awal
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            // Tampilan Menu Utama Sistem
            System.out.println("*************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("*************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Masukkan Mahasiswa ke Antrean Hapus (Queue)");
            System.out.println("6. Eksekusi Hapus Mahasiswa Terdepan (Queue)");
            System.out.println("7. Keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine(); // Membersihkan sisa buffer dari Scanner

            switch (pilih) {
                case 1:
                    // MENU 1: Proses Input Nilai Baru ke Sistem
                    System.out.println("Masukan data");
                    System.out.print("Kode  : ");
                    String kodeNilai = sc.nextLine();
                    System.out.print("Nilai : ");
                    double skor = sc.nextDouble();
                    sc.nextLine();

                    // Menampilkan daftar mahasiswa yang tersedia untuk dipilih
                    System.out.println("\nDAFTAR MAHASISWA");
                    System.out.printf("%-10s %-20s %-10s\n", "NIM", "Nama", "Telf");
                    for (MahasiswaTugas m : app.listMahasiswa) {
                        System.out.printf("%-10s %-20s %-10s\n", m.nim, m.nama, m.telf);
                    }
                    System.out.print("Pilih mahasiswa by nim: ");
                    String selectedNim = sc.nextLine();
                    
                    // Mencari objek mahasiswa berdasarkan NIM yang diinputkan
                    MahasiswaTugas mhsPilih = null;
                    for (MahasiswaTugas m : app.listMahasiswa) {
                        if (m.nim.equals(selectedNim)) {
                            mhsPilih = m;
                            break;
                        }
                    }

                    // Menampilkan daftar mata kuliah yang tersedia untuk dipilih
                    System.out.println("\nDAFTAR MATA KULIAH");
                    System.out.printf("%-10s %-40s %-5s\n", "Kode", "Mata Kuliah", "SKS");
                    for (MataKuliahTugas mk : app.listMataKuliah) {
                        System.out.printf("%-10s %-40s %-5d\n", mk.kode, mk.namaMk, mk.sks);
                    }
                    System.out.print("Pilih MK by kode: ");
                    String selectedKode = sc.nextLine();
                    
                    // Mencari objek mata kuliah berdasarkan kode yang diinputkan
                    MataKuliahTugas mkPilih = null;
                    for (MataKuliahTugas mk : app.listMataKuliah) {
                        if (mk.kode.equals(selectedKode)) {
                            mkPilih = mk;
                            break;
                        }
                    }

                    // Jika mahasiswa dan mata kuliah valid/ditemukan, masukkan ke listNilai
                    if (mhsPilih != null && mkPilih != null) {
                        app.listNilai.add(new NilaiTugas(mhsPilih, mkPilih, skor));
                        System.out.println("Data nilai berhasil disimpan.");
                    } else {
                        System.out.println("Gagal menyimpan! NIM Mahasiswa atau Kode MK tidak ditemukan.");
                    }
                    System.out.println("");
                    break;

                case 2:
                    // MENU 2: Menampilkan Seluruh Data Transaksi Nilai saat ini
                    System.out.println("\nDAFTAR NILAI MAHASISWA");
                    System.out.printf("%-10s %-15s %-40s %-5s %-6s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    for (NilaiTugas n : app.listNilai) {
                        System.out.printf("%-10s %-15s %-40s %-5d %-6.2f\n", 
                                          n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.mk.sks, n.nilai);
                    }
                    System.out.println("");
                    break;

                case 3:
                    // MENU 3: Mencari Nilai Berdasarkan NIM Mahasiswa dan Menghitung Total SKS
                    System.out.println("\nDAFTAR NILAI MAHASISWA");
                    System.out.printf("%-10s %-15s %-40s %-5s %-6s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    for (NilaiTugas n : app.listNilai) {
                        System.out.printf("%-10s %-15s %-40s %-5d %-6.2f\n", 
                                          n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.mk.sks, n.nilai);
                    }
                    
                    System.out.print("Masukkan data mahasiswa [nim]: ");
                    String searchNim = sc.nextLine();
                    
                    // Mencetak data yang sesuai beserta akumulasi SKS
                    System.out.printf("\n%-10s %-15s %-40s %-5s %-6s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    int totalSksCount = 0;
                    for (NilaiTugas n : app.listNilai) {
                        if (n.mhs.nim.equals(searchNim)) {
                            System.out.printf("%-10s %-15s %-40s %-5d %-6.2f\n", 
                                              n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.mk.sks, n.nilai);
                            totalSksCount += n.mk.sks;
                        }
                    }
                    System.out.println("Total SKS " + totalSksCount + " telah diambil.\n");
                    break;

                case 4:
                    // MENU 4: Mengurutkan Data Nilai Berdasarkan Nilai secara Ascending menggunakan Lambda Expression
                    Collections.sort(app.listNilai, (n1, n2) -> Double.compare(n1.nilai, n2.nilai));
                    
                    System.out.println("\nDAFTAR NILAI MAHASISWA (URUTAN ASCENDING)");
                    System.out.printf("%-10s %-15s %-40s %-6s %-5s\n", "Nim", "Nama", "Mata Kuliah", "Nilai", "SKS");
                    for (NilaiTugas n : app.listNilai) {
                        System.out.printf("%-10s %-15s %-40s %-6.2f %-5d\n", 
                                          n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.nilai, n.mk.sks);
                    }
                    System.out.println("");
                    break;

                case 5:
                    // TUGAS NO. 2: Memasukkan objek mahasiswa ke dalam antrean Hapus (Queue)
                    System.out.print("Masukkan NIM Mahasiswa untuk dimasukkan ke antrean hapus: ");
                    String nimQ = sc.nextLine();
                    MahasiswaTugas mhsQ = null;
                    
                    // Cari mahasiswa di list utama
                    for (MahasiswaTugas m : app.listMahasiswa) {
                        if (m.nim.equals(nimQ)) {
                            mhsQ = m;
                            break;
                        }
                    }
                    
                    if (mhsQ != null) {
                        app.antreanHapusMhs.add(mhsQ); // Memasukkan ke dalam Queue menggunakan method .add()
                        System.out.println("Mahasiswa " + mhsQ.nama + " berhasil dimasukkan ke antrean Queue.");
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    System.out.println("");
                    break;

                case 6:
                    // TUGAS NO. 2: Mengeksekusi/Menghapus mahasiswa urutan pertama/terdepan dari Queue (FIFO)
                    if (!app.antreanHapusMhs.isEmpty()) {
                        // Mengambil dan mengeluarkan elemen terdepan Queue menggunakan method .poll()
                        MahasiswaTugas mhsHapus = app.antreanHapusMhs.poll(); 
                        
                        // Menghapus mahasiswa tersebut dari list master mahasiswa
                        app.listMahasiswa.remove(mhsHapus);
                        
                        // Menghapus seluruh riwayat data transaksi nilai milik mahasiswa tersebut agar sinkron
                        app.listNilai.removeIf(n -> n.mhs.nim.equals(mhsHapus.nim));
                        
                        System.out.println("Data mahasiswa " + mhsHapus.nama + " [NIM: " + mhsHapus.nim + "] resmi dihapus dari sistem.");
                    } else {
                        System.out.println("Antrean Queue kosong, tidak ada mahasiswa yang dieksekusi.");
                    }
                    System.out.println("");
                    break;

                case 7:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.\n");
            }
        } while (pilih != 7);
        sc.close(); // Menutup Scanner
    }
}