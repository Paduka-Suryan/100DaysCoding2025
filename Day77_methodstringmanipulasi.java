public class Day77_methodstringmanipulasi {
    public static void main(String[] args) {
        
        String teks = "   Hello World! Welcome to Java Programming   ";
        
        System.out.println("String asli: '" + teks + "'");
        System.out.println("Panjang asli: " + teks.length());
        
        String hasil = teks.trim()
                          .substring(6, 18)
                          .replace("World", "Java");
        
        System.out.println("\n=== HASIL MANIPULASI ===");
        System.out.println("Hasil akhir: '" + hasil + "'");
        System.out.println("Panjang hasil: " + hasil.length());
    }
}