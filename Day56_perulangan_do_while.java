public class Day56_perulangan_do_while {
    public static void main(String[] args) {
        // Cetak angka 1 sampai 5
        System.out.println("=== CETAK ANGKA 1-5 ===");
        int i = 1;
        do {
            System.out.println("Angka: " + i);
            i++;
        } while(i <= 5);
        
        // Cetak angka mundur 5 sampai 1
        System.out.println("\n=== CETAK ANGKA 5-1 ===");
        int j = 5;
        do {
            System.out.println("Angka: " + j);
            j--;
        } while(j >= 1);
    }
}