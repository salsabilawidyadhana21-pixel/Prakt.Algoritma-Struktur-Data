public class SingleLinkedList25 {
    Node25 head;
    Node25 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node25 tmp = head;
            System.out.println("---------------------------------");
            System.out.println("Isi Linked List Mahasiswa:");
            System.out.println("---------------------------------");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                System.out.println("---------------------------------");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Masih Kosong.");
        }
    }

    public void addFirst(mAHASISWA25 input) {
        Node25 ndInput = new Node25(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(mAHASISWA25 input) {
        Node25 ndInput = new Node25(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
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
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }
}