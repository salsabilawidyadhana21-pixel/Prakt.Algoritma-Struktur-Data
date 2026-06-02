import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList {
    public static void main(String[] args) {
        // ==========================================
        // BAGIAN 1: Penggunaan ArrayList awal
        // ==========================================
        List l = new ArrayList(); 
        l.add(1); 
        l.add(2); 
        l.add(3); 
        l.add("Cireng"); 

        // Mengubah %d menjadi %s agar aman dari ClassCastException
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1)); 

        l.add(4); 
        l.remove(0); 

        // Mengubah %d menjadi %s agar aman dari ClassCastException
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1)); 
        
        System.out.println(); // Baris baru pemisah

        // ==========================================
        // BAGIAN 2: Penggunaan LinkedList dengan Generic <String>
        // ==========================================
        List<String> names = new LinkedList<>(); 
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
        
        System.out.println("Names: " + names.toString()); 
    }
}