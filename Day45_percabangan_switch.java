import java.util.Scanner;

public class Day45_percabangan_switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PROGRAM KATEGORI NILAI ===");
        System.out.print("Masukkan nilai (0-100): ");
        int nilai = input.nextInt();
        
        // Konversi nilai ke kategori
        int kategori = nilai / 10;
        
        switch (kategori) {
            case 10:
            case 9:
                System.out.println("Nilai " + nilai + " = A (Excellent)");
                break;
            case 8:
                System.out.println("Nilai " + nilai + " = B (Very Good)");
                break;
            case 7:
                System.out.println("Nilai " + nilai + " = C (Good)");
                break;
            case 6:
                System.out.println("Nilai " + nilai + " = D (Fair)");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Nilai " + nilai + " = E (Failed)");
                break;
            default:
                System.out.println("Nilai tidak valid!");
        }
        
        input.close();
    }
}