public class Day57_NestedLoop {
    public static void main(String[] args) {
        System.out.println("=== NESTED LOOP SEDERHANA ===");
        
        for(int i = 1; i <= 3; i++) {
            System.out.println("Loop luar - i: " + i);
            
            for(int j = 1; j <= 2; j++) {
                System.out.println("  Loop dalam - j: " + j);
            }
            
            System.out.println(); // baris kosong
        }
    }
}