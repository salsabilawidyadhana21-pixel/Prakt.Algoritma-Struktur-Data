public class BinaryTreeArray00 {
    Mahasiswa00[] data;
    int idxLast;

    public BinaryTreeArray00() {
        data = new Mahasiswa00[10];
    }

    public void populateData(Mahasiswa00[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {

            if (data[idxStart] != null) {

                traverseInOrder(2 * idxStart + 1);

                data[idxStart].tampilInformasi();

                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}