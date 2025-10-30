public class Day53_keyword_break {
    public static void main(String[] args) {
        
        // Cari angka 5, lalu berhenti
        System.out.println("=== CARI ANGKA 5 ===");
        for(int i = 1; i <= 10; i++) {
            System.out.println("Checking: " + i);
            if(i == 5) {
                System.out.println("✓ Angka 5 ditemukan! Berhenti.");
                break;
            }
        }
        
        // Cari nama dalam daftar
        System.out.println("\n=== CARI NAMA ===");
        String[] names = {"Budi", "Siti", "Andi", "Dewi", "Rudi"};
        String cari = "Andi";
        
        for(int i = 0; i < names.length; i++) {
            System.out.println("Cek: " + names[i]);
            if(names[i].equals(cari)) {
                System.out.println("✓ " + cari + " ditemukan di posisi " + (i+1));
                break;
            }
        }
    }
}