public class AntrianLayanan {
    MAHASISWA_25[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan(int n) {
        max = n;
        data = new MAHASISWA_25[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(MAHASISWA_25 mhs) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = mhs;
            size++;
        }
    }

    public MAHASISWA_25 Dequeue() {
        MAHASISWA_25 dt = null;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (size == 0) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Antrian terdepan:");
            data[front].tampilkanData();
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                data[i].tampilkanData();
                System.out.println("-------------------");
                i = (i + 1) % max;
            }
            data[i].tampilkanData();
            System.out.println("-------------------");
            System.out.println("Jumlah antrian = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void getJumlahAntrian() {
        System.out.println("Jumlah antrian saat ini = " + size);
    }

    // ================= MODIFIKASI =================
    public void LihatAkhir() {
        if (!IsEmpty()) {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    // =================================================
}