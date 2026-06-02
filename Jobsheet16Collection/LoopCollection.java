import java.util.Iterator;
import java.util.Stack;

public class LoopCollection {
    public static void main(String[] args) {
        // 1. Membuat objek Stack dan menambahkan data awal
        Stack<String> fruits = new Stack<>(); 
        fruits.add("Orange"); 
        fruits.add("Watermelon"); 
        fruits.add("Leci"); 
        fruits.push("Salak");

        // Menampilkan elemen menggunakan For-Each loop
        for (String fruit : fruits) { 
            System.out.printf("%s ", fruit); // Ditambahkan spasi agar rapi 
        } 
        
        // Menampilkan representasi string dari Stack
        System.out.println("\n" + fruits.toString()); 

        // Menampilkan elemen sekaligus mengosongkan Stack menggunakan pop()
        while (!fruits.empty()) { 
            System.out.printf("%s ", fruits.pop()); 
        } 
        System.out.println(""); 

        // ====================================================================
        // 2. Tambahan potongan kode agar proses menampilkan bervariasi
        // ====================================================================
        // Mengisi ulang Stack karena baris pop() di atas telah mengosongkan isi Stack
        fruits.push("Melon"); 
        fruits.push("Durian"); 
        
        // Variasi A: Menggunakan Iterator
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) { 
            String fruit = it.next(); 
            System.out.printf("%s ", fruit); 
        } 
        System.out.println(""); 

        // Variasi B: Menggunakan Stream API (forEach lambda)
        fruits.stream().forEach(e -> { 
            System.out.printf("%s ", e); 
        }); 
        System.out.println(""); 

        // Variasi C: Menggunakan For Loop Konvensional (index)
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i)); 
        } 
        System.out.println("");
    }
}