public class QueueMahasiswa25 {
    NodeAntrian25 front;
    NodeAntrian25 rear;

    public boolean isEmpty() {
        return front == null;
    }

    // Menambah antrian (Enqueue)
    public void enqueue(mAHASISWA25 data) {
        NodeAntrian25 newNode = new NodeAntrian25(data, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Mahasiswa berhasil masuk antrian.");
    }

    // Mengurangi antrian / Layani (Dequeue)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Melayani Mahasiswa: ");
            front.data.tampilData();
            System.out.println();
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
    }

    // Melihat semua antrian
    public void printAntrian() {
        if (isEmpty()) {
            System.out.println("Tidak ada antrian.");
        } else {
            NodeAntrian25 temp = front;
            int i = 1;
            System.out.println("\n--- DAFTAR ANTRIAN SAAT INI ---");
            while (temp != null) {
                System.out.print(i + ". ");
                temp.data.tampilData();
                System.out.println();
                temp = temp.next;
                i++;
            }
            System.out.println("-------------------------------\n");
        }
    }
}