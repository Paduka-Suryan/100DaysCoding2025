import java.util.Scanner;

public class Day73_penjumlahan_sampainegatif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== PROGRAM PENJUMLAHAN ANGKA ===");
        
        int total = 0;
        
        while(true) {
            System.out.print("Masukkan angka: ");
            int angka = sc.nextInt();
            
            if(angka < 0) {
                break;
            }
            
            total += angka;
            System.out.println("Total sementara: " + total);
        }
        
        System.out.println("Program dihentikan.");
        System.out.println("Total akhir: " + total);
    }
}