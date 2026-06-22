public class BinaryTreeMain00 {

    public static void main(String[] args) {

        BinaryTree00 bst = new BinaryTree00();

        bst.addRekursif(new Mahasiswa00("001", "Ali", "TI-1A", 3.57));
        bst.addRekursif(new Mahasiswa00("002", "Budi", "TI-1A", 3.41));
        bst.addRekursif(new Mahasiswa00("003", "Citra", "TI-1A", 3.75));
        bst.addRekursif(new Mahasiswa00("004", "Dina", "TI-1A", 3.20));
        bst.addRekursif(new Mahasiswa00("005", "Eko", "TI-1A", 3.90));
        bst.addRekursif(new Mahasiswa00("006", "Fajar", "TI-1A", 3.60));
        bst.addRekursif(new Mahasiswa00("007", "Gina", "TI-1A", 3.80));

        System.out.println("=== INORDER ===");
        bst.traverseInOrder(bst.root);

        System.out.println("\n=== PREORDER ===");
        bst.traversePreOrder(bst.root);

        System.out.println("\n=== POSTORDER ===");
        bst.traversePostOrder(bst.root);

        System.out.println("\n=== IPK TERKECIL ===");
        bst.cariMinIPK();

        System.out.println("\n=== IPK TERBESAR ===");
        bst.cariMaxIPK();

        System.out.println("\n=== IPK DI ATAS 3.50 ===");
        bst.tampilMahasiswaIPKdiAtas(3.50);
    }
}