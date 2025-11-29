public class Day83_menjumlahkan_array {
    public static void main(String[] args) {
        
        int[] angka = {10, 20, 30, 40, 50};
        
        // Cara 1: Pakai for loop biasa
        int total1 = 0;
        for(int i = 0; i < angka.length; i++) {
            total1 = total1 + angka[i];
        }
        System.out.println("Total (cara 1): " + total1);
        
        // Cara 2: Pakai for-each
        int total2 = 0;
        for(int nilai : angka) {
            total2 += nilai;
        }
        System.out.println("Total (cara 2): " + total2);
    }
}