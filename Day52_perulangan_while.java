public class Day52_perulangan_while {
    public static void main(String[] args) {
        // Cetak angka 1 sampai 5
        System.out.println("=== CETAK ANGKA 1-5 ===");
        int i = 1;
        while(i <= 5) {
            System.out.println("Angka: " + i);
            i++;
        }
        
        // Cetak angka mundur 10 sampai 1
        System.out.println("\n=== CETAK ANGKA 10-1 ===");
        int j = 10;
        while(j >= 1) {
            System.out.println("Angka: " + j);
            j--;
        }
    }
}