import java.util.Scanner;

public class JadwalHarian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Array untuk menyimpan jadwal
        String[] jadwal = new String[7];
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        
        System.out.println("=== PROGRAM JADWAL HARIAN ===");
        System.out.println("Silakan masukkan jadwal Anda untuk seminggu ke depan:\n");
        
        // Input jadwal untuk setiap hari
        for (int i = 0; i < hari.length; i++) {
            System.out.print("Masukkan jadwal untuk " + hari[i] + ": ");
            jadwal[i] = input.nextLine();
        }
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Selamat! Jadwal Anda telah disimpan.");
        System.out.println("=".repeat(50));
        
        // Menu untuk melihat jadwal
        boolean lihatLagi = true;
        
        while (lihatLagi) {
            System.out.println("\n=== PILIH HARI UNTUK MELIHAT JADWAL ===");
            System.out.println("1. Senin");
            System.out.println("2. Selasa");
            System.out.println("3. Rabu");
            System.out.println("4. Kamis");
            System.out.println("5. Jumat");
            System.out.println("6. Sabtu");
            System.out.println("7. Minggu");
            System.out.println("8. Lihat Semua Jadwal");
            System.out.println("9. Keluar");
            System.out.print("Pilih opsi (1-9): ");
            
            int pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer
            
            switch (pilihan) {
                case 1: case 2: case 3: case 4: case 5: case 6: case 7:
                    System.out.println("\n JADWAL " + hari[pilihan-1].toUpperCase() + ":");
                    System.out.println("» " + jadwal[pilihan-1]);
                    break;
                    
                case 8:
                    System.out.println("\n" + "=".repeat(50));
                    System.out.println("JADWAL LENGKAP SEMINGGU");
                    System.out.println("=".repeat(50));
                    for (int i = 0; i < hari.length; i++) {
                        System.out.println(hari[i] + ":\t" + jadwal[i]);
                    }
                    break;
                    
                case 9:
                    System.out.println("\nTerima kasih telah menggunakan program jadwal!");
                    System.out.println("Selamat beraktivitas!");
                    lihatLagi = false;
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 1-9");
            }
            
            // Jika bukan keluar, tanya apakah ingin melihat lagi
            if (lihatLagi && pilihan >= 1 && pilihan <= 8) {
                System.out.print("\nLihat jadwal hari lain? (ya/tidak): ");
                String jawaban = input.nextLine().toLowerCase();
                
                if (jawaban.equals("tidak") || jawaban.equals("t") || jawaban.equals("no") || jawaban.equals("n")) {
                    System.out.println("\nTerima kasih! Program diakhiri.");
                    lihatLagi = false;
                }
            }
        }
        
        input.close();
    }
}