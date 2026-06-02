import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class LoopCollection {
    public static void main(String[] args) {
        // --------------------------------------------------------------------
        // MODIFIKASI NO. 4: Menggunakan Stack<String> agar method tumpukan 
        // seperti pop(), push(), dan empty() tetap bisa berjalan dengan lancar.
        // --------------------------------------------------------------------
        Stack<String> fruits = new Stack<>(); 
        fruits.push("Banana"); 
        fruits.add("Orange"); 
        fruits.add("Watermelon"); 
        fruits.add("Leci"); 
        fruits.push("Salak"); 

        for (String fruit : fruits) { 
            System.out.printf("%s ", fruit); 
        }
        
        System.out.println("\n" + fruits.toString()); 

        while (!fruits.empty()) { 
            System.out.printf("%s ", fruits.pop()); 
        }
        System.out.println(""); 

        // --------------------------------------------------------------------
        // MODIFIKASI NO. 2: Menghilangkan baris fruits.push("Melon") 
        // dan fruits.push("Durian") dari instruksi awal praktikum.
        // --------------------------------------------------------------------
        // Baris 43 & 44 dihapus sesuai instruksi nomor 2. 
        // Akibatnya, Stack fruits saat ini dalam kondisi kosong total.
        
        System.out.println("--- Loop Menggunakan Iterator (Kondisi Stack Kosong) ---"); 
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) { 
            String fruit = it.next(); 
            System.out.printf("%s ", fruit); 
        }
        System.out.println(""); 

        System.out.println("--- Loop Menggunakan Stream API (Kondisi Stack Kosong) ---"); 
        fruits.stream().forEach(e -> { 
            System.out.printf("%s ", e); 
        });
        System.out.println(""); 

        System.out.println("--- Loop Menggunakan For Indeks (Kondisi Stack Kosong) ---"); 
        for (int i = 0; i < fruits.size(); i++) { 
            System.out.printf("%s ", fruits.get(i));
        }
        System.out.println("\n------------------------------------------------");

        // --------------------------------------------------------------------
        // UNTUK MELANJUTKAN KE NO. 5 & 6: 
        // isi ulang datanya terlebih dahulu karena di atas sudah kosong dikuras pop().
        // --------------------------------------------------------------------
        fruits.push("Melon"); 
        fruits.push("Durian"); 
        System.out.println("Isi Stack setelah diisi ulang: " + fruits.toString());

        // --------------------------------------------------------------------
        // MODIFIKASI NO. 5: Mengubah elemen terakhir menjadi "Strawberry"
        // --------------------------------------------------------------------
        if (!fruits.isEmpty()) { 
            fruits.set(fruits.size() - 1, "Strawberry"); 
        }
        System.out.println("Setelah elemen terakhir diubah menjadi Strawberry:"); 
        System.out.println(fruits.toString());
        System.out.println("");

        // --------------------------------------------------------------------
        // MODIFIKASI NO. 6: Menambahkan 3 buah baru dan melakukan sorting
        // --------------------------------------------------------------------
        fruits.push("Mango"); 
        fruits.push("guava"); 
        fruits.push("avocado"); 
        System.out.println("Setelah ditambahkan Mango, guava, dan avocado:"); 
        System.out.println(fruits.toString()); 
        System.out.println("");

        // Melakukan sorting (Ascending) menggunakan Collections
        Collections.sort(fruits);
        System.out.println("Setelah dilakukan sorting (Collections.sort):");
        System.out.println(fruits.toString()); 
    }
}