public class BinaryTreeArrayMain00 {
    public static void main(String[] args) {

        BinaryTreeArray00 bta = new BinaryTreeArray00();

        Mahasiswa00 m1 = new Mahasiswa00("244160121", "Ali", "A", 3.57);
        Mahasiswa00 m2 = new Mahasiswa00("244160185", "Candra", "C", 3.41);
        Mahasiswa00 m3 = new Mahasiswa00("244160221", "Badar", "B", 3.75);
        Mahasiswa00 m4 = new Mahasiswa00("244160220", "Dewi", "B", 3.35);
        Mahasiswa00 m5 = new Mahasiswa00("244160131", "Devi", "A", 3.48);
        Mahasiswa00 m6 = new Mahasiswa00("244160205", "Ehsan", "D", 3.61);
        Mahasiswa00 m7 = new Mahasiswa00("244160170", "Fajar", "B", 3.86);

        Mahasiswa00[] dataMahasiswa = {
                m1, m2, m3, m4, m5, m6, m7
        };

        int idxLast = 6;

        bta.populateData(dataMahasiswa, idxLast);

        System.out.println("Traversal InOrder:");
        bta.traverseInOrder(0);
    }
}
