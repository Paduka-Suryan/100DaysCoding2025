public class Day91_PaeameterMethod {
    
    // Method dengan 1 parameter
    static void sapa(String nama) {
        System.out.println("Halo, " + nama + "!");
    }
    
    // Method dengan 2 parameter
    static void perkenalan(String nama, int umur) {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
    
    public static void main(String[] args) {
        // Panggil method dengan parameter
        sapa("Padukaaa");
        sapa("Likaaa");
        
        System.out.println();
        
        perkenalan("Padukaaa", 19);
        perkenalan("Likaaa", 20);
    }
}