public class DLL25 {
    Node_25 headAntrean, tailAntrean;
    Node_25 headPesanan, tailPesanan;
    int counterAntrean = 0;

    public void tambahAntrean(Pembeli25 p) {
        counterAntrean++;
        if (headAntrean == null) {
            headAntrean = tailAntrean = new Node_25(null, counterAntrean, p, null);
        } else {
            Node_25 newNode = new Node_25(tailAntrean, counterAntrean, p, null);
            tailAntrean.next = newNode;
            tailAntrean = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counterAntrean);
    }

    public void cetakAntrean() {
        if (headAntrean == null) {
            System.out.println("Antrean Kosong");
            return;
        }
        System.out.println("-------------------------------------------");
        System.out.printf("%-12s | %-10s | %-12s\n", "No Antrian", "Nama", "No HP");
        Node_25 tmp = headAntrean;
        while (tmp != null) {
            System.out.printf("%-12d | %-10s | %-12s\n", tmp.noAntrean, tmp.pembeli.namaPembeli, tmp.pembeli.NoHp);
            tmp = tmp.next;
        }
    }

    public void hapusAntrean(int kode, String menu, int harga) {
        if (headAntrean == null) {
            System.out.println("Tidak ada antrean untuk diproses.");
            return;
        }
        
        Node_25 diproses = headAntrean;
        headAntrean = headAntrean.next;
        if (headAntrean != null) headAntrean.prev = null;

        Pesanan25 newPesan = new Pesanan25(kode, menu, harga);
        if (headPesanan == null) {
            headPesanan = tailPesanan = new Node_25(null, newPesan, null);
        } else {
            Node_25 newNode = new Node_25(tailPesanan, newPesan, null);
            tailPesanan.next = newNode;
            tailPesanan = newNode;
        }
        System.out.println(diproses.pembeli.namaPembeli + " telah memesan " + menu);
    }

    public void laporanPesanan() {
        if (headPesanan == null) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        // Sorting Manual (Bubble Sort) berdasarkan Nama Pesanan
        for (Node_25 i = headPesanan; i != null; i = i.next) {
            for (Node_25 j = i.next; j != null; j = j.next) {
                if (i.pesanan.namaPesanan.compareToIgnoreCase(j.pesanan.namaPesanan) > 0) {
                    Pesanan25 temp = i.pesanan;
                    i.pesanan = j.pesanan;
                    j.pesanan = temp;
                }
            }
        }
        
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.printf("%-15s | %-15s | %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        Node_25 tmp = headPesanan;
        while (tmp != null) {
            System.out.printf("%-15d | %-15s | %-10d\n", tmp.pesanan.kodePesanan, tmp.pesanan.namaPesanan, tmp.pesanan.harga);
            tmp = tmp.next;
        }
    }
}