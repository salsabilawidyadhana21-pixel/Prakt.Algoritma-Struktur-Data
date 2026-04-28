import java.util.Scanner;

// 1. Class Surat 
class Surat {
    String noSurat, tanggal, perihal, pengirim;

    Surat(String no, String tgl, String hal, String dari) {
        this.noSurat = no;
        this.tanggal = tgl;
        this.perihal = hal;
        this.pengirim = dari;
    }
}

// 2. Class StackSurat 
class StackSurat_25 {
    int size, top;
    Surat[] tumpukan;

    public StackSurat_25(int capacity) {
        this.size = capacity;
        this.tumpukan = new Surat[size];
        this.top = -1;
    }

    // Menu 1: Terima Surat (Push)
    public void push(Surat s) {
        if (top < size - 1) {
            tumpukan[++top] = s;
            System.out.println("Surat dari " + s.pengirim + " berhasil diterima.");
        } else {
            System.out.println("Tumpukan penuh!");
        }
    }

    // Menu 2: Proses Surat (Pop)
    public Surat pop() {
        if (top > -1) {
            return tumpukan[top--];
        }
        return null;
    }

    // Menu 3: Lihat Surat Terakhir (Peek)
    public void peek() {
        if (top > -1) {
            Surat s = tumpukan[top];
            System.out.println("\n--- Surat Teratas ---");
            System.out.println("Pengirim: " + s.pengirim + "\nPerihal : " + s.perihal);
        } else {
            System.out.println("Tumpukan kosong.");
        }
    }

    // Menu 4: Cari Surat berdasarkan nama mahasiswa
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        if (top == -1) {
            System.out.println("Tumpukan masih kosong.");
            return;
        }
        
        // Menelusuri stack dari atas ke bawah
        for (int i = top; i >= 0; i--) {
            if (tumpukan[i].pengirim.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan pada posisi ke-" + (top - i + 1) + " dari atas.");
                System.out.println("No Surat: " + tumpukan[i].noSurat + " | Perihal: " + tumpukan[i].perihal);
                ditemukan = true;
                break; 
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama '" + nama + "' tidak ditemukan.");
        }
    }
}

// 3. Main Class 
public class SistemSurat_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat_25 st = new StackSurat_25(10);
        int pilih;

        do {
            System.out.println("\n=== SISTEM PENGELOLAAN SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin (Push)");
            System.out.println("2. Proses Surat Izin (Pop)");
            System.out.println("3. Lihat Surat Izin Terakhir (Peek)");
            System.out.println("4. Cari Surat (Berdasarkan Nama)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer

            switch (pilih) {
                case 1:
                    System.out.print("No Surat: "); String no = sc.nextLine();
                    System.out.print("Tanggal : "); String tgl = sc.nextLine();
                    System.out.print("Perihal : "); String hal = sc.nextLine();
                    System.out.print("Nama Mhs: "); String nama = sc.nextLine();
                    st.push(new Surat(no, tgl, hal, nama));
                    break;
                case 2:
                    Surat s = st.pop();
                    if (s != null) System.out.println("Surat " + s.pengirim + " diproses/diverifikasi.");
                    else System.out.println("Tidak ada surat.");
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    st.cariSurat(cari);
                    break;
            }
        } while (pilih != 5);
    }
}