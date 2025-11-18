public class Day72_segitigasiku_terbalik {
    public static void main(String[]args) {
        int tinggi = 5;
        
        System.out.println("=== SEGITIGA SIKU TERBALIK ===");
        
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
