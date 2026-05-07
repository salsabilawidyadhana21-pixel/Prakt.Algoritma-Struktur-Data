public class AntrianKRS {
    MahasiswaKRS[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahDiproses = 0;

    public AntrianKRS(int n) {
        max = n;
        data = new MahasiswaKRS[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void Enqueue(MahasiswaKRS mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh!");
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

            System.out.println("Mahasiswa berhasil masuk antrian");
        }
    }

    public void prosesKRS() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa yang diproses KRS:");

            int jumlah = 0;

            while (!IsEmpty() && jumlah < 2) {
                MahasiswaKRS mhs = Dequeue();
                mhs.tampilkanData();
                System.out.println("-------------------");

                jumlah++;
                jumlahDiproses++;
            }
        }
    }

    public MahasiswaKRS Dequeue() {
        MahasiswaKRS dt = data[front];
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

        return dt;
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            int i = front;

            while (i != rear) {
                data[i].tampilkanData();
                System.out.println("-------------------");
                i = (i + 1) % max;
            }

            data[i].tampilkanData();
            System.out.println("-------------------");
        }
    }

    public void tampilkanDepan() {
        if (!IsEmpty()) {
            System.out.println("2 Antrian Terdepan:");

            int i = front;
            int jumlah = 0;

            while (jumlah < 2 && jumlah < size) {
                data[i].tampilkanData();
                System.out.println("-------------------");

                i = (i + 1) % max;
                jumlah++;
            }
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void tampilkanBelakang() {
        if (!IsEmpty()) {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + size);
    }

    public void jumlahDiproses() {
        System.out.println("Jumlah mahasiswa sudah proses KRS: "
                + jumlahDiproses);
    }

    public void belumProses() {
        int belum = 30 - jumlahDiproses;

        System.out.println("Jumlah mahasiswa belum proses KRS: "
                + belum);
    }
}