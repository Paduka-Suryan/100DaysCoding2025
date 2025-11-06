import java.util.Scanner;

public class Day59_GanjilGenap_1N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        System.out.println("\n=== ANGKA " + N + " SAMPAI 1 ===");
        // Cetak 1 sampai N
        
        System.out.println("Angka ganjil: ");
        for(int i = N; i >= 1; i-=2) {
            if(N%2==0){
                System.out.print((i - 1)+" ");
            }else{
                System.out.print(i + " ");
            }
        }
        System.out.println("\nAngka genap: ");
        for(int i = N; i >= 2; i-=2){
            if(N%2!=0){
                System.out.print((i - 1)+" ");
            }else{
                System.out.print(i + " ");
            }
        }
        
        input.close();
    }
}