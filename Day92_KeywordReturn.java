public class Da92_KeywordReturn {
    
    static int angkaDelapan() {
        return 8;
    }
    
    static boolean benar() {
        return true;
    }
    
    public static void main(String[] args) {
        int a = angkaDelapan();
        boolean status = benar();
        
        System.out.println("Angka: " + a);
        System.out.println("Status: " + status);
    }
}