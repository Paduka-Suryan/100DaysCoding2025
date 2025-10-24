import java.util.Scanner;

public class Day47_program_jadwal_harian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("PROGRAM JADWAL HARIAN");
        System.out.println("=====================");
        
        // Input jadwal untuk setiap hari
        System.out.print("Masukkan jadwal SENIN: ");
        String senin = input.nextLine();
        
        System.out.print("Masukkan jadwal SELASA: ");
        String selasa = input.nextLine();
        
        System.out.print("Masukkan jadwal RABU: ");
        String rabu = input.nextLine();
        
        System.out.print("Masukkan jadwal KAMIS: ");
        String kamis = input.nextLine();
        
        System.out.print("Masukkan jadwal JUMAT: ");
        String jumat = input.nextLine();
        
        System.out.print("Masukkan jadwal SABTU: ");
        String sabtu = input.nextLine();
        
        System.out.print("Masukkan jadwal MINGGU: ");
        String minggu = input.nextLine();
        
        System.out.println("\nJadwal berhasil disimpan!");
        
        // Tanya hari yang ingin dilihat
        System.out.print("\nSekarang hari apa? ");
        String hari = input.nextLine();
        
        // Gunakan switch case untuk menampilkan jadwal
        switch(hari.toLowerCase()) {
            case "senin":
                System.out.println("\nJadwal SENIN:");
                System.out.println(senin);
                break;
                
            case "selasa":
                System.out.println("\nJadwal SELASA:");
                System.out.println(selasa);
                break;
                
            case "rabu":
                System.out.println("\nJadwal RABU:");
                System.out.println(rabu);
                break;
                
            case "kamis":
                System.out.println("\nJadwal KAMIS:");
                System.out.println(kamis);
                break;
                
            case "jumat":
                System.out.println("\nJadwal JUMAT:");
                System.out.println(jumat);
                break;
                
            case "sabtu":
                System.out.println("\nJadwal SABTU:");
                System.out.println(sabtu);
                break;
                
            case "minggu":
                System.out.println("\nJadwal MINGGU:");
                System.out.println(minggu);
                break;
                
            default:
                System.out.println("Hari tidak dikenali!");
        }
        
        System.out.println("\nProgram selesai.");
        input.close();
    }
}
