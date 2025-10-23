import java.util.Scanner;

public class Day46_menu_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng - Rp 15.000");
        System.out.println("2. Mie Ayam - Rp 12.000");
        System.out.println("3. Soto Ayam - Rp 10.000");
        System.out.println("4. Gado-gado - Rp 8.000");
        System.out.println("5. Keluar");
        System.out.print("\nPilih menu (1-5): ");
        
        int pilihan = sc.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.println("\nAnda memesan: Nasi Goreng");
                System.out.println("Harga: Rp 15.000");
                break;
            case 2:
                System.out.println("\nAnda memesan: Mie Ayam");
                System.out.println("Harga: Rp 12.000");
                break;
            case 3:
                System.out.println("\nAnda memesan: Soto Ayam");
                System.out.println("Harga: Rp 10.000");
                break;
            case 4:
                System.out.println("\nAnda memesan: Gado-gado");
                System.out.println("Harga: Rp 8.000");
                break;
            case 5:
                System.out.println("\nTerima kasih! Sampai jumpa!");
                break;
            default:
                System.out.println("\nPilihan tidak valid! Silakan pilih 1-5");
        }
        
        sc.close();
    }
}