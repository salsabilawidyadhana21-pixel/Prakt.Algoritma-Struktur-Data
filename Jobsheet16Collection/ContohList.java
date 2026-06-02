import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList {
    public static void main(String[] args) {
        // =========================================================================
        // PERTANYAAN NO. 2: Modifikasi ArrayList agar spesifik satu tipe data (String)
        // =========================================================================
        List<String> l = new ArrayList<>(); // Diubah menjadi hanya menerima objek String
        
        // Data angka (1, 2, 3, 4) pada praktikum awal harus diubah menjadi String 
        // agar tidak terjadi compile-time error
        l.add("1"); 
        l.add("2");
        l.add("3");
        l.add("Cireng"); 

        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1)); 

        l.add("4"); // Diubah menjadi String
        l.remove(0);

        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1)); 
        
        System.out.println("-------------------------------------------------------");

        // =========================================================================
        // PERTANYAAN NO. 3 & 4: Modifikasi LinkedList dan penambahan method push()
        // =========================================================================
        // No. 3: Mengubah tipe referensi objek dari List menjadi LinkedList
        LinkedList<String> names = new LinkedList<>(); 
        names.add("Noureen"); 
        names.add("Akhleema"); 
        names.add("Shannum"); 
        names.add("Uwais"); 
        names.add("Al-Qarni"); 

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1)); 
        
        names.set(0, "My kid"); 
        
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1)); 
        
        System.out.println("Names Sebelum Push: " + names.toString());
        System.out.println();

        // No. 4: Menambahkan elemen baru "Mei-mei" menggunakan method push()
        names.push("Mei-mei"); 
        
        // No. 4: Menampilkan elemen menggunakan getFirst() dan getLast()
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.getFirst(), names.size(), names.getLast()); 
        
        System.out.println("Names Setelah Push: " + names.toString()); 
    }
}