public class Day87_CariElemenPadaArray {
    public static void main(String[] args) {
        
        // nama teman
        String[] teman = {"Paduka", "Arul", "Likaaa", "Rizal", "Abdal"};
        String cari = "Likaaa";
        boolean ketemu = false;
        
        for(int i = 0; i < teman.length; i++) {
            if(teman[i].equals(cari)) {
                System.out.println(cari + " ditemukan di posisi ke-" + (i+1));
                ketemu = true;
                break;
            }
        }
        
        if(!ketemu) {
            System.out.println(cari + " tidak ditemukan");
        }
    }
}