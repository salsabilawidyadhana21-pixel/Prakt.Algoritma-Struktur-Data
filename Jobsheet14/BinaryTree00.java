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

    public boolean find(double ipk) {
        boolean result = false;
        Node00 current = root;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return result;
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

    public Node00 getSuccessor(Node00 del) {
        Node00 successor = del.right;
        Node00 successorParent = del;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Tree kosong!");
            return;
        }

        Node00 parent = root;
        Node00 current = root;
        boolean isLeftChild = false;

        while (current != null && current.mahasiswa.ipk != ipk) {
            parent = current;

            if (ipk < current.mahasiswa.ipk) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }

        if (current.left == null && current.right == null) {

            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }

        } else if (current.right == null) {

            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }

        } else if (current.left == null) {

            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }

        } else {

            Node00 successor = getSuccessor(current);

            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }

            successor.left = current.left;
        }
    }
}