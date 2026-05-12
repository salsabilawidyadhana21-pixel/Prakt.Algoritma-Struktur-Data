public class DoubleLinkedList25 {
    NODE25 head, tail;

    public DoubleLinkedList25() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // --- OPERASI PENAMBAHAN (PERCOBAAN 1) ---
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

        if (current == tail) {
            addLast(data);
        } else {
            NODE25 newNode = new NODE25(data);
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    // --- OPERASI PENGHAPUSAN (PERCOBAAN 2 + MODIFIKASI) ---
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        
        // MODIFIKASI: Menampilkan data yang dihapus
        System.out.println("Data yang berhasil dihapus:");
        head.data.tampil(); 

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        // MODIFIKASI: Menampilkan data yang dihapus
        System.out.println("Data yang berhasil dihapus:");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

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