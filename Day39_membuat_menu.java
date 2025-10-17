import java.util.Scanner;

public class Day39_membuat_menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== MENU RESTORAN ===");
        System.out.println("1. Nasi Goreng - Rp 15.000");
        System.out.println("2. Mie Ayam - Rp 12.000");
        System.out.println("3. Es Teh - Rp 5.000");
        System.out.println("4. Keluar");
        System.out.print("\n\nPilih menu (1-4): ");
        
        int pilihan = input.nextInt();
        
        if (pilihan == 1) {
            System.out.println("Anda memesan: Nasi Goreng - Rp 15.000");
        } else if (pilihan == 2) {
            System.out.println("Anda memesan: Mie Ayam - Rp 12.000");
        } else if (pilihan == 3) {
            System.out.println("Anda memesan: Es Teh - Rp 5.000");
        } else if (pilihan == 4) {
            System.out.println("Terima kasih! Sampai jumpa!");
        } else {
            System.out.println("Pilihan tidak valid!");
        }
        
        input.close();
    }
}