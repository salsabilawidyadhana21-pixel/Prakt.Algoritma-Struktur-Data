public class Node00 {
    Mahasiswa00 mahasiswa;
    Node00 left;
    Node00 right;

    public Node00() {

    }

    public Node00(Node00 left, Mahasiswa00 mahasiswa, Node00 right) {
        this.left = left;
        this.mahasiswa = mahasiswa;
        this.right = right;
    }
}