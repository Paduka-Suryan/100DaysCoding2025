import java.util.Scanner;

public class Day61_kelipatan_M_1N{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        System.out.print("Masukkan nilai M (kelipatan): ");
        int M = input.nextInt();
        
        System.out.println("\n=== BILANGAN KELIPATAN " + M + " DARI 1-" + N + " ===");
        
        for(int i = 1; i <= N; i++) {
            if(i % M == 0) {
                System.out.print(i + " ");
            }
        }
        
        input.close();
    }
}