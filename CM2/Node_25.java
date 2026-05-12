public class Node_25 {
    Pembeli25 pembeli;
    Pesanan25 pesanan;
    int noAntrean;
    Node_25 prev, next;

    // Konstruktor untuk node antrean pembeli
    public Node_25(Node_25 prev, int no, Pembeli25 p, Node_25 next) {
        this.prev = prev;
        this.noAntrean = no;
        this.pembeli = p;
        this.next = next;
    }

    // Konstruktor untuk node laporan pesanan
    public Node_25(Node_25 prev, Pesanan25 ps, Node_25 next) {
        this.prev = prev;
        this.pesanan = ps;
        this.next = next;
    }
}