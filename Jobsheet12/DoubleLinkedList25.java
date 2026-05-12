public class DoubleLinkedList25 {
    NODE25 head;
    NODE25 tail;

    public DoubleLinkedList25() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(mahasiswa25 data) {
        NODE25 newNode = new NODE25(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(mahasiswa25 data) {
        NODE25 newNode = new NODE25(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, mahasiswa25 data) {
        NODE25 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        NODE25 newNode = new NODE25(data);
        if (current == tail) {
            addLast(data);
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    // Fitur No. 6: Menampilkan seluruh isi list
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        NODE25 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
}