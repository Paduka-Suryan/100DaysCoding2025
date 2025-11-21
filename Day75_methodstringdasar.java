import java.util.Scanner;

public class Day75_methodstringdasar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama kamu: ");
        String nama = scanner.nextLine();
        
        System.out.println("\n=== Analisis Nama ===");
        System.out.println("Nama asli: " + nama);
        System.out.println("Panjang nama: " + nama.length() + " karakter");
        System.out.println("Versi formal: " + nama.toUpperCase());
        System.out.println("Versi casual: " + nama.toLowerCase());
        
        scanner.close();
    }
}