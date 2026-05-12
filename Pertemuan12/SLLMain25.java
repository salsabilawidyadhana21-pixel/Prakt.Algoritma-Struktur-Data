public class SLLMain25 {
    public static void main(String[] args) {
        SingleLinkedList25 singLL = new SingleLinkedList25();

        // Contoh input data menggunakan identitas Saya
        mAHASISWA25 m1 = new mAHASISWA25("2341720125", "Salsabila Widyadhana", "TI-1H", 3.8);
        mAHASISWA25 m2 = new mAHASISWA25("2341720100", "Mahasiswa A", "TI-1H", 3.5);
        mAHASISWA25 m3 = new mAHASISWA25("2341720200", "Mahasiswa B", "TI-1H", 3.7);

        // Menjalankan operasi dasar
        singLL.addFirst(m1);
        singLL.addLast(m2);
        singLL.insertAfter("2341720125", m3);

        // Cetak Hasil untuk verifikasi
        singLL.print();
    }
}
