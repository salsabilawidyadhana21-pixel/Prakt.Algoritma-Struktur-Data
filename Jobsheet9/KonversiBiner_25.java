import java.util.Scanner;

// 1. Class Stack 
class StackBiner_25 {
    int size, top;
    int[] stack;

    public StackBiner_25(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1; 
    }

    public void push(int data) {
        if (top < size - 1) {
            stack[++top] = data; 
        }
    }

    public int pop() {
        if (top > -1) {
            return stack[top--]; 
        }
        return -1; 
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

// 2. Class Main
public class KonversiBiner_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackBiner_25 st = new StackBiner_25(32); 

        System.out.print("Masukkan bilangan desimal: ");
        int desimal = sc.nextInt(); 
        int temp = desimal;         

        System.out.println("\nProses pembagian (PUSH ke Stack):");
        if (temp == 0) {
            st.push(0);
        }
        
        // MODIFIKASI: Menampilkan alur pembagian No.2
        while (temp > 0) {
            int sisa = temp % 2; // Operasi Modulo untuk mendapatkan angka biner (0 atau 1)
            System.out.println(temp + " / 2 = " + (temp/2) + " sisa " + sisa);
            
            st.push(sisa); // Memasukkan sisa bagi ke stack (LIFO)
            temp /= 2;     // Membagi angka desimal dengan 2 untuk iterasi berikutnya
        }

        // Menampilkan hasil akhir dengan operasi POP
        System.out.print("\nHasil konversi biner dari " + desimal + " adalah: ");
        while (!st.isEmpty()) {
            // Data yang terakhir masuk (sisa terakhir) akan keluar duluan
            System.out.print(st.pop()); 
        }
        System.out.println(); // Baris baru agar tampilan terminal rapi
    }
}