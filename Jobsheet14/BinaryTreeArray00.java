public class BinaryTreeArray00 {

    Mahasiswa00[] data;
    int idxLast;

    public BinaryTreeArray00() {
        data = new Mahasiswa00[20];
        idxLast = -1;
    }

    public void add(Mahasiswa00 mhs) {

        idxLast++;

        if (idxLast < data.length) {
            data[idxLast] = mhs;
        } else {
            System.out.println("Array penuh!");
        }
    }

    public void traverseInOrder(int idxStart) {

        if (idxStart <= idxLast && data[idxStart] != null) {

            traverseInOrder(2 * idxStart + 1);

            data[idxStart].tampilInformasi();

            traverseInOrder(2 * idxStart + 2);
        }
    }

    public void traversePreOrder(int idxStart) {

        if (idxStart <= idxLast && data[idxStart] != null) {

            data[idxStart].tampilInformasi();

            traversePreOrder(2 * idxStart + 1);

            traversePreOrder(2 * idxStart + 2);
        }
    }
}