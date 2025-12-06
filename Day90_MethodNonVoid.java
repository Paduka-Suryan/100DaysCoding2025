public class Day90_MethodNonVoid {
    
    static String sapa() {
        return "Halo!";
    }
    
    static int angkaLima() {
        return 5;
    }
    
    public static void main(String[] args) {
        
        String salam = sapa();
        int angka = angkaLima();
        
        System.out.println(salam);
        System.out.println("Angka: " + angka);
    }
}