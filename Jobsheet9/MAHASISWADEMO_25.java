// Class Mahasiswa
class Mahasiswa_25 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa_25(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}

// Class Stack
class StackTugasMahasiswa_25 {
    Mahasiswa_25[] stack;
    int size;
    int top;

    StackTugasMahasiswa_25(int size) {
        this.size = size;
        stack = new Mahasiswa_25[size];
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Mahasiswa_25 mhs) {
        if (!isFull()) {
            stack[++top] = mhs;
            System.out.println("Tugas " + mhs.nama + " berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    Mahasiswa_25 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    Mahasiswa_25 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    void print() {
        System.out.println("\n--- Isi Tumpukan Tugas (Teratas ke Terbawah) ---");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nim + " - " + stack[i].nama + " [" + stack[i].kelas + "]");
        }
    }
}

// Class Main
public class MAHASISWADEMO_25 {
    public static void main(String[] args) {

        StackTugasMahasiswa_25 stm = new StackTugasMahasiswa_25(5);

        // Tambah data
        stm.push(new Mahasiswa_25("2341720001", "Andi", "TI-1A"));
        stm.push(new Mahasiswa_25("2341720002", "Budi", "TI-1A"));
        stm.push(new Mahasiswa_25("2341720003", "Citra", "TI-1A"));

        // Tampilkan
        stm.print();

        // Peek
        Mahasiswa_25 atas = stm.peek();
        System.out.println("\nTugas teratas: " + atas.nama + " (" + atas.nim + ")");

        // Pop + nilai
        System.out.println("\n--- Proses Penilaian oleh Dosen ---");
        Mahasiswa_25 dinilai = stm.pop();
        if (dinilai != null) {
            System.out.println("Dosen mengambil tugas milik: " + dinilai.nama);
            dinilai.tugasDinilai(95);
            System.out.println("Nilai yang diberikan: " + dinilai.nilai);
        }

        // Kondisi akhir
        System.out.println("\n--- Kondisi Akhir Tumpukan ---");
        stm.print();
    }
}