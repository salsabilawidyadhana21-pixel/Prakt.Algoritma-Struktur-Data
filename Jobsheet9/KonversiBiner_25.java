import java.util.Scanner;

// 1. Class Stack 
class StackBiner_25 {
    int size;
    int top;
    int[] stack;

    public StackBiner_25(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int data) {
        if (!isFull()) {
            top++;
            stack[top] = data;
        } else {
            System.out.println("Stack Penuh!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = stack[top];
            top--;
            return data;
        } else {
            return -1;
        }
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

        // Proses pembagian dan Push 
        System.out.println("\nProses pembagian:");
        while (temp > 0) {
            int sisa = temp % 2;
            System.out.println(temp + " / 2 = " + (temp/2) + " sisa " + sisa);
            st.push(sisa);
            temp = temp / 2;
        }

        // Tampilan Hasil (Pop)
        System.out.print("\nHasil konversi biner dari " + desimal + " adalah: ");
        if (desimal == 0) {
            System.out.print(0);
        } else {
            while (!st.isEmpty()) {
                System.out.print(st.pop());
            }
        }
        System.out.println();
    }
}