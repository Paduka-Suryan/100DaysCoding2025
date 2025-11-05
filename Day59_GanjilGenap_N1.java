import java.util.Scanner;

public class Day59_GanjilGenap_N1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        System.out.println("\n=== ANGKA 1 SAMPAI " + N + " ===");
        // Cetak 1 sampai N
        
        System.out.println("Angka ganjil: ");
        for(int i = 1; i <= N; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println("\nAngka genap: ");
        for(int i = 2; i <= N; i+=2){
            System.out.print(i + " ");
        }
        
        input.close();
    }
}
