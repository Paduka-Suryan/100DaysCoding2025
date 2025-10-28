public class ForKelipatan {
    public static void main(String[] args) {
        // Cetak bilangan genap 2-20
        System.out.println("=== BILANGAN GENAP 2-20 ===");
        for(int i = 2; i <= 20; i += 2) {
            System.out.print(i+",");
        }
        
        System.out.println("\n\n=== BILANGAN GANJIL 1-19 ===");
        for(int i = 1; i <= 19; i += 2) {
            System.out.print(i + ",");
        }
    }
}