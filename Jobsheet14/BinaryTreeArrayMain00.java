public class BinaryTreeArrayMain00 {

    public static void main(String[] args) {

        BinaryTreeArray00 tree = new BinaryTreeArray00();

        tree.add(new Mahasiswa00("001", "Ali", "TI-1A", 3.57));
        tree.add(new Mahasiswa00("002", "Budi", "TI-1A", 3.41));
        tree.add(new Mahasiswa00("003", "Citra", "TI-1A", 3.75));
        tree.add(new Mahasiswa00("004", "Dina", "TI-1A", 3.20));
        tree.add(new Mahasiswa00("005", "Eko", "TI-1A", 3.90));
        tree.add(new Mahasiswa00("006", "Fajar", "TI-1A", 3.60));
        tree.add(new Mahasiswa00("007", "Gina", "TI-1A", 3.80));

        System.out.println("=== INORDER ===");
        tree.traverseInOrder(0);

        System.out.println("\n=== PREORDER ===");
        tree.traversePreOrder(0);
    }
}