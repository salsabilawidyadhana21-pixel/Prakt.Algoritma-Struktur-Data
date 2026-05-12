public class SingleLinkedList25 {
    Node25 head;
    Node25 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node25 tmp = head;
            while (tmp != null) {
                tmp.data.tampilInformasi();
                System.out.println("-----------------");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(mAHASISWA25 input) {
        Node25 ndInput = new Node25(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(mAHASISWA25 input) {
        Node25 ndInput = new Node25(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, mAHASISWA25 input) {
        Node25 ndInput = new Node25(input, null);
        Node25 temp = head;
        while (temp != null) {
            if (temp.data.nim.equals(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        }
    }

    // Method Modifikasi 1: Ambil data berdasarkan indeks
    public void getData(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else {
            Node25 tmp = head;
            for (int i = 0; i < index; i++) {
                if (tmp.next == null) break;
                tmp = tmp.next;
            }
            tmp.data.tampilInformasi();
        }
    }

    // Method Modifikasi 2: Cari indeks berdasarkan NIM (key)
    public int indexOf(String key) {
        Node25 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nim.equals(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) return -1;
        else return index;
    }

    // Method Modifikasi 3: Hapus data pertama
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    // Method Modifikasi 4: Hapus data berdasarkan NIM
    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List Kosong!");
        } else {
            Node25 temp = head;
            if (temp.data.nim.equals(key)) {
                removeFirst();
            } else {
                while (temp.next != null) {
                    if (temp.next.data.nim.equals(key)) {
                        temp.next = temp.next.next;
                        if (temp.next == null) tail = temp;
                        break;
                    }
                    temp = temp.next;
                }
            }
        }
    }
}