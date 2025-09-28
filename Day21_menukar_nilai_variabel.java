public class Day21_menukar_nilai_variabel {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Sebelum ditukar:");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);

        a = a+b; // 30
        b = a-b; // 30-20=10
        a = a-b; // 30-10=20
        
        System.out.println("Setelah ditukar:");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
    }
    
}


