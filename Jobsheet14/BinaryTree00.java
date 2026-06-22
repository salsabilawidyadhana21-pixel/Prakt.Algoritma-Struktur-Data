public class BinaryTree00 {

    Node00 root;

    public BinaryTree00() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa00 mahasiswa) {
        Node00 newNode = new Node00(null, mahasiswa, null);

        if (isEmpty()) {
            root = newNode;
        } else {
            Node00 current = root;
            Node00 parent = null;

            while (true) {
                parent = current;

                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;

                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;

                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void addRekursif(Mahasiswa00 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }

    private Node00 addRekursif(Node00 current, Mahasiswa00 mahasiswa) {

        if (current == null) {
            return new Node00(null, mahasiswa, null);
        }

        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else {
            current.right = addRekursif(current.right, mahasiswa);
        }

        return current;
    }

    public boolean find(double ipk) {

        Node00 current = root;

        while (current != null) {

            if (current.mahasiswa.ipk == ipk) {
                return true;
            } else if (ipk < current.mahasiswa.ipk) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    public void traversePreOrder(Node00 node) {

        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node00 node) {

        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node00 node) {

        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    public void cariMinIPK() {

        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }

        Node00 current = root;

        while (current.left != null) {
            current = current.left;
        }

        System.out.println("Mahasiswa dengan IPK terkecil:");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {

        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }

        Node00 current = root;

        while (current.right != null) {
            current = current.right;
        }

        System.out.println("Mahasiswa dengan IPK terbesar:");
        current.mahasiswa.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    private void tampilMahasiswaIPKdiAtas(Node00 node, double ipkBatas) {

        if (node != null) {

            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);

            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }

            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }
}