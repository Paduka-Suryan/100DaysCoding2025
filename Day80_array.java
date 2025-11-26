public class Day80_array {
    public static void main(String[] args) {
        String[] belanjaan = {"Telur", "Susu", "Roti", "Keju", "Buah"};
        
        System.out.println("Daftar Belanja:");
        for(int i = 0; i < belanjaan.length; i++) {
            System.out.println((i+1) + ". " + belanjaan[i]);
        }
        
        // Total barang
        System.out.println("\nTotal barang: " + belanjaan.length);
    }
}