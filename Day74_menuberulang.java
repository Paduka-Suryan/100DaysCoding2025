import java.util.Scanner;

public class Day74_menuberulang{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tampilkan Nama");
            System.out.println("2. Tampilkan Umur");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            
            pilihan = sc.nextInt();
            
            switch(pilihan) {
                case 1:
                    System.out.println("Nama saya: PaduLikaaa");
                    break;
                case 2:
                    System.out.println("Umur: Nd tau, kami lupa");
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }
            
        } while(pilihan != 3);
    }
}