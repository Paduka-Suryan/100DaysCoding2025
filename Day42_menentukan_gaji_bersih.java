import java.util.Scanner;

public class Day42_menentukan_gaji_bersih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PROGRAM HITUNG GAJI BERSIH ===");
        
        System.out.print("Masukkan gaji pokok: Rp ");
        double gajiPokok = input.nextDouble();
        
        System.out.print("Masukkan tunjangan: Rp ");
        double tunjangan = input.nextDouble();
        
        System.out.print("Masukkan bonus: Rp ");
        double bonus = input.nextDouble();
        
        double gajiKotor = gajiPokok + tunjangan + bonus;
        
        double pajak = gajiKotor * 0.05;  // Pajak 5%
        double bpjs = gajiKotor * 0.03;   // BPJS 3%
        
        double totalPotongan = pajak + bpjs;
        
        double gajiBersih = gajiKotor - totalPotongan;
        
        System.out.println("\n=== RINCIAN GAJI ===");
        System.out.println("Gaji Pokok    : Rp " + gajiPokok);
        System.out.println("Tunjangan     : Rp " + tunjangan);
        System.out.println("Bonus         : Rp " + bonus);
        System.out.println("Gaji Kotor    : Rp " + gajiKotor);
        System.out.println("-----------------------------");
        System.out.println("Pajak (5%)    : Rp " + pajak);
        System.out.println("BPJS (3%)     : Rp " + bpjs);
        System.out.println("Total Potongan: Rp " + totalPotongan);
        System.out.println("-----------------------------");
        System.out.println("GAJI BERSIH   : Rp " + gajiBersih);
        
        input.close();
    }
}