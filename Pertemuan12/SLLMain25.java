public class SLLMain25 {
    public static void main(String[] args) {
        SingleLinkedList25 singLL = new SingleLinkedList25();

        // Menambahkan data awal
        singLL.addFirst(new mAHASISWA25("23417201", "Salsabila", "TI-1H", 3.8));
        singLL.addLast(new mAHASISWA25("23417205", "Widyadhana", "TI-1H", 3.7));
        singLL.insertAfter("23417201", new mAHASISWA25("23417210", "Andi", "TI-1H", 3.5));

        System.out.println("--- Isi Linked List Awal ---");
        singLL.print();

        // Mencari Index
        System.out.println("Data 'Widyadhana' berada pada index: " + singLL.indexOf("23417205"));

        // Mengambil Data pada Index tertentu
        System.out.println("\nData pada index 1:");
        singLL.getData(1);

        // Menghapus data
        System.out.println("\n--- Setelah Menghapus NIM 23417210 ---");
        singLL.remove("23417210");
        singLL.print();
    }
}