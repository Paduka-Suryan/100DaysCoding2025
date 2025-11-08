import java.util.Scanner;

public class Day58_N1_1N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        int total = 0;
        
        System.out.println("\n=== ANGKA 1 SAMPAI " + N + " ===");
        // Cetak 1 sampai N
        for(int i = 1; i <= N; i++) {
            System.out.print(i);
            if(i<N){
                System.out.print(" + ");
            }
            total += i;
        }
        System.out.println(" = " + total);
        input.close();
    }
}
