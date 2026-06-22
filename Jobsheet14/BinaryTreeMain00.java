public class BinaryTreeMain00 {
    public static void main(String[] args) {

        BinaryTree00 bst = new BinaryTree00();

        Mahasiswa00 m1 = new Mahasiswa00("22001", "Andi", "TI-1A", 3.75);
        Mahasiswa00 m2 = new Mahasiswa00("22002", "Budi", "TI-1A", 3.50);
        Mahasiswa00 m3 = new Mahasiswa00("22003", "Citra", "TI-1A", 3.90);
        Mahasiswa00 m4 = new Mahasiswa00("22004", "Dina", "TI-1A", 3.25);
        Mahasiswa00 m5 = new Mahasiswa00("22005", "Eko", "TI-1A", 3.60);

        bst.add(m1);
        bst.add(m2);
        bst.add(m3);
        bst.add(m4);
        bst.add(m5);

        System.out.println("=== Pre Order ===");
        bst.traversePreOrder(bst.root);

        System.out.println("\n=== In Order ===");
        bst.traverseInOrder(bst.root);

        System.out.println("\n=== Post Order ===");
        bst.traversePostOrder(bst.root);

        System.out.println("\nCari IPK 3.50");
        System.out.println(bst.find(3.50));

        System.out.println("\nHapus IPK 3.50");
        bst.delete(3.50);

        System.out.println("\nData setelah dihapus");
        bst.traverseInOrder(bst.root);
    }
}