import java.util.Scanner;

public class Day58_N-1_1-N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        System.out.println("\n=== ANGKA 1 SAMPAI " + N + " ===");
        // Cetak 1 sampai N
        for(int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n\n=== ANGKA " + N + " SAMPAI 1 ===");
        // Cetak N sampai 1
        for(int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        
        input.close();
    }
}