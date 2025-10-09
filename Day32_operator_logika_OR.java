public class main {
    public static void main(String[] args) {
        // Operator OR (||) - hasilnya true jika salah satu true
        System.out.println("true  || true  = " + (true || true));
        System.out.println("true  || false = " + (true || false));
        System.out.println("false || true  = " + (false || true));
        System.out.println("false || false = " + (false || false));
        
        // Contoh sederhana
        boolean punyaKartu = true;
        boolean usiaTua = false;
        boolean dapatDiskon = punyaKartu || usiaTua;
        
        System.out.println("\nDapat diskon: " + dapatDiskon);
    }
}
