public class KombinasiOperator {
    public static void main(String[] args) {
        // Data input
        int usia = 25;
        boolean punyaKartu = true;
        boolean hariLibur = false;
        int jumlahBarang = 3;
        
        // Kombinasi AND dan OR
        boolean dapatDiskon = (usia < 18 || usia > 60) && punyaKartu;
        System.out.println("Dapat diskon: " + dapatDiskon);
        
        // Kombinasi NOT dan AND
        boolean bukaToko = !hariLibur && (jumlahBarang > 0);
        System.out.println("Buka toko: " + bukaToko);
        
        // Kombinasi kompleks
        boolean gratisOngkir = (jumlahBarang >= 5) || (punyaKartu && !hariLibur);
        System.out.println("Gratis ongkir: " + gratisOngkir);
    }
}